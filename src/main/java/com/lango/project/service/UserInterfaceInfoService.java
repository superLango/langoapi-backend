package com.lango.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lango.project.model.entity.UserInterfaceInfo;

/**
 * @author Lango
 * @version 1.0
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

    long invokeNum(long userId);
}
