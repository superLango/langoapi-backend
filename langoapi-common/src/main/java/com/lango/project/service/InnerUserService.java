package com.lango.project.service;


import com.lango.project.model.entity.User;

/**
 * 用户服务
 *
 * @author lango
 */
public interface InnerUserService {

    /**
     * 数据库中是否已分配给用户密钥（ak、布尔）
     *
     * @param accessKey
     * @return
     */
    User getInvokerUser(String accessKey);
}
