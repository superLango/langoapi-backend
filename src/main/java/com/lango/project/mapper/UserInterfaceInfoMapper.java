package com.lango.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lango.project.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author 26449
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-08-23 20:24:21
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




