package com.xm.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_house_details")
public class HouseDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    private String houseId;

    private String describe;

    private String liveTime;

    private String leaveTime;

    private Integer houseNum;

    private Integer bedNum;

    private Integer peopleNum;

    private Boolean wifi;

    private Boolean kitchen;

    private Boolean hairdrier;

    private Boolean aircondition;

    private Boolean heating;

    private Boolean television;

    private Boolean washer;

    private String facilities;

    private Date createDate;

    private Date updateDate;


}
