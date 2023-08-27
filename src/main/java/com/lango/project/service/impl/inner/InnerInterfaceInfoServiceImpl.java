package com.lango.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lango.project.common.ErrorCode;
import com.lango.project.exception.BusinessException;
import com.lango.project.mapper.InterfaceInfoMapper;
import com.lango.project.model.entity.InterfaceInfo;
import com.lango.project.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author Lango
 * @version 1.0
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {
@Resource
private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url",url);
        queryWrapper.eq("method",method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
