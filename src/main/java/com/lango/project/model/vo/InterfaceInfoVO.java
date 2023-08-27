package com.lango.project.model.vo;

import com.lango.project.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口调用视图
 *
 * @author lango
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends Post {

    /**
     * 调用次数
     */
    private Integer totalNum;

    private String name;

    private static final long serialVersionUID = 1L;
}