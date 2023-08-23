package com.lango.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lango.project.model.entity.InterfaceInfo;

/**
* @author 26449
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-20 15:16:48
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
