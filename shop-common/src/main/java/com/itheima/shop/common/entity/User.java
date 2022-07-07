package com.itheima.shop.common.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户
 *
 * @author sy615
 * @date 2022/07/07
 */
@Entity(name = "shop_user")
@Data
public class User {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Integer uid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String telephone;
}
