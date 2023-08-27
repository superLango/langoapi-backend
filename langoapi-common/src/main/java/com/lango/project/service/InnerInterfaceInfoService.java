package com.lango.project.service;


import com.lango.project.model.entity.InterfaceInfo;

/**
* @author 26449
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-20 15:16:48
*/
public interface InnerInterfaceInfoService {
    /**
     * 从数据库中查询模拟接口受否存在（请求路径、请求方法、请求参数、布尔）
     *
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
