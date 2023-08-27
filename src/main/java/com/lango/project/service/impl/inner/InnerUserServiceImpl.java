package com.lango.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lango.project.common.ErrorCode;
import com.lango.project.exception.BusinessException;
import com.lango.project.mapper.UserMapper;
import com.lango.project.model.entity.User;
import com.lango.project.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author Lango
 * @version 1.0
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokerUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
