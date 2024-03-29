package com.xm.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(value = "房源详情信息表")
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_house_details")
public class HouseDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    @ApiModelProperty(value = "房源主键")
    private String houseId;
    @ApiModelProperty(value = "简介")
    private String describe;
    @ApiModelProperty(value = "图片")
    private String images;
    @ApiModelProperty(value = "最早入住时间")
    private String liveTime;
    @ApiModelProperty(value = "最晚退房时间")
    private String leaveTime;
    @ApiModelProperty(value = "房间数量")
    private Integer houseNum;
    @ApiModelProperty(value = "床数")
    private Integer bedNum;
    @ApiModelProperty(value = "可住人数")
    private Integer peopleNum;
    @ApiModelProperty(value = "是否有wifi")
    private Integer wifi;
    @ApiModelProperty(value = "是否有厨房")
    private Integer kitchen;
    @ApiModelProperty(value = "是否有吹风机")
    private Integer hairdrier;
    @ApiModelProperty(value = "是否有空调")
    private Integer aircondition;
    @ApiModelProperty(value = "是否有暖气")
    private Integer heating;
    @ApiModelProperty(value = "是否有电视")
    private Integer television;
    @ApiModelProperty(value = "是否有洗衣机")
    private Integer washer;
    @ApiModelProperty(value = "生活必需品")
    private Integer necessaries;
    @ApiModelProperty(value = "周边设施简介")
    private String facilities;
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;
    @ApiModelProperty(value = "更改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

}
