package com.th.partnermatchcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.th.partnermatchcloud.core.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/** @author ninelock-ai */
@Data
@TableName("user")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {
  private static final long serialVersionUID = 1L;
  /** 用户id */
  @TableId(type = IdType.AUTO)
  private Long id;
  /** 用户名称 */
  private String username;
  /** 用户账号 */
  private String userAccount;
  /** 用户头像 */
  private String avataUrl;
  /** 性别（0-男，1-女） */
  private Byte gender;
  /** 密码 */
  private String userPassword;
  /** 手机号 */
  private String phone;
  /** 邮箱 */
  private String email;
  /** 用户状态（0-启用，1-禁用） */
  private Integer userStatus;
  /** 用户角色（0-普通用户，1-管理员） */
  private Integer userRole;
  /** 标签列表 */
  private String tags;
}
