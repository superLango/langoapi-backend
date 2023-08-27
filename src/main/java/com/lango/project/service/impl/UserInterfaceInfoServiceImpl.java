package com.lango.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lango.project.common.ErrorCode;
import com.lango.project.exception.BusinessException;
import com.lango.project.mapper.UserInterfaceInfoMapper;
import com.lango.project.model.entity.UserInterfaceInfo;
import com.lango.project.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;

/**
 * @author 26449
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
 * @createDate 2023-08-23 20:24:21
 */
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
        implements UserInterfaceInfoService {
    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userinterfaceInfo, boolean add) {

        if (userinterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建时，所有参数必须非空
        if (add) {
            if (userinterfaceInfo.getInterfaceInfoId() <= 0 || userinterfaceInfo.getUserId() <= 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口或用户不存在");
            }
        }
        if (userinterfaceInfo.getLeftNum() < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于 0");
        }
    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        // 校验
        if (interfaceInfoId <= 0 || userId <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建 UpdateWrapper 对象，对数据库进行更新
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        // where interfaceInfoId = interfaceInfoId
        updateWrapper.eq("interfaceInfoId", interfaceInfoId);
        // where userId = userId
        updateWrapper.eq("userId", userId);
//         where leftNum > 0
        updateWrapper.gt("leftNum", 0);
        // set leftNum = leftNum - 1,totalNum = totalNum + 1
        updateWrapper.setSql("leftNum = leftNum - 1,totalNum = totalNum + 1");
        return this.update(updateWrapper);
    }

    @Override
    public long invokeNum(long userId) {
        QueryWrapper<UserInterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId",userId);
        UserInterfaceInfo userInterfaceInfo = this.getOne(queryWrapper);
        return userInterfaceInfo.getLeftNum();
    }
}




