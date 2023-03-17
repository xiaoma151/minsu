package com.xm.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(value = "房源表")
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_house")
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    @ApiModelProperty(value = "名称")
    private String houseName;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "房东主键")
    private String landlordId;
    @ApiModelProperty(value = "是否已出租  0：未租赁   1：已租赁")
    private Integer status;
    @ApiModelProperty(value = "价格")
    private Double price;
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;
    @ApiModelProperty(value = "更改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;


}
