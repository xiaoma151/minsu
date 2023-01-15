package com.xm.controller;


import com.xm.pojo.entity.House;
import com.xm.service.HouseService;
import com.xm.utils.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@Api(tags = "房源管理")
@RestController
@RequestMapping("/xm/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @PostMapping("test")
    public Result test(@RequestBody House house) {
        houseService.save(house);
        return null;
    }

}

