package com.rookie.stack.api.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* rookie-学生表
* @TableName r_student
*/
@Data
public class StudentEntity implements Serializable {

    /**
    * 主键自增id
    */
    @NotNull(message="[主键自增id]不能为空")
    @ApiModelProperty("主键自增id")
    private Integer id;
    /**
    * 用户ID
    */
    @NotBlank(message="[用户ID]不能为空")
    @Size(max= 64,message="编码长度不能超过64")
    @ApiModelProperty("用户ID")
    @Length(max= 64,message="编码长度不能超过64")
    private String uid;
    /**
    * 用户名
    */
    @Size(max= 64,message="编码长度不能超过64")
    @ApiModelProperty("用户名")
    @Length(max= 64,message="编码长度不能超过64")
    private String name;
    /**
    * 用户邮箱
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户邮箱")
    @Length(max= 255,message="编码长度不能超过255")
    private String email;
    /**
    * 用户联系电话
    */
    @ApiModelProperty("用户联系电话")
    private Integer phone;
    /**
    * 用户密码
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户密码")
    @Length(max= 255,message="编码长度不能超过255")
    private String password;
    /**
    * 用户微信唯一识别ID
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户微信唯一识别ID")
    @Length(max= 255,message="编码长度不能超过255")
    private String wxid;
    /**
    * 学校Id,关联院校表
    */
    @ApiModelProperty("学校Id,关联院校表")
    private Integer schoolId;
    /**
    * 年级
    */
    @ApiModelProperty("年级")
    private Integer grade;
    /**
    * 专业
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("专业")
    @Length(max= 255,message="编码长度不能超过255")
    private String subject;
    /**
    * 职业方向ID
    */
    @ApiModelProperty("职业方向ID")
    private Integer professionId;
    /**
    * 个人简介
    */
    @Size(max= 900,message="编码长度不能超过900")
    @ApiModelProperty("个人简介")
    @Length(max= 900,message="编码长度不能超过900")
    private String desc;
    /**
    * 所在城市
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("所在城市")
    @Length(max= 255,message="编码长度不能超过255")
    private String location;
    /**
    * 用户状态（0为正常，1为删除，2为冻结）
    */
    @ApiModelProperty("用户状态（0为正常，1为删除，2为冻结）")
    private Integer type;
    /**
    * 创建时间-时间戳
    */
    @ApiModelProperty("创建时间-时间戳")
    private Integer createTime;
    /**
    * 更新时间-时间戳
    */
    @ApiModelProperty("更新时间-时间戳")
    private Integer updateTime;
}
