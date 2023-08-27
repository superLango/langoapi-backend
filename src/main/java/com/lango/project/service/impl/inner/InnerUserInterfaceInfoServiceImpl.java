package com.lango.project.service.impl.inner;

import com.lango.project.service.InnerUserInterfaceInfoService;
import com.lango.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author Lango
 * @version 1.0
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    @Override
    public long invokeNum(long userId) {
        return userInterfaceInfoService.invokeNum(userId);
    }


}
