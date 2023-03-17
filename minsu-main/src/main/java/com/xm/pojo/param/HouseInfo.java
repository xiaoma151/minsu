package com.xm.pojo.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class HouseInfo {
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
    @ApiModelProperty(value = "简介")
    private String describe;
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
}
