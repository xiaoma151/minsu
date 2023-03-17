package com.xm.controller;


import com.xm.pojo.entity.House;
import com.xm.pojo.entity.HouseDetails;
import com.xm.pojo.param.HouseInfo;
import com.xm.service.HouseService;
import com.xm.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "房源管理")
@RestController
@RequestMapping("/xm/house")
@CrossOrigin
public class HouseController {

    @Autowired
    private HouseService houseService;

    @ApiOperation(value = "房源信息上传")
    @PostMapping("saveHouse")
    public Result saveHouse(@RequestBody HouseInfo houseInfo) {
        System.out.println(houseInfo.toString());
        return Result.success();
    }

}

