package com.lango.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lango.project.common.ErrorCode;
import com.lango.project.exception.BusinessException;
import com.lango.project.mapper.InterfaceInfoMapper;
import com.lango.project.model.entity.InterfaceInfo;
import com.lango.project.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author 26449
 * @description 针对表【interface_info(接口信息)】的数据库操作Service实现
 * @createDate 2023-08-20 15:16:48
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {

        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        String description = interfaceInfo.getDescription();
        String url = interfaceInfo.getUrl();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();
        String method = interfaceInfo.getMethod();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name, description, url, requestHeader, responseHeader,method)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR,"表单尚有空项");
            }
        }
        if (StringUtils.isNotBlank(description) && description.length() > 8192) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "内容过长");
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




