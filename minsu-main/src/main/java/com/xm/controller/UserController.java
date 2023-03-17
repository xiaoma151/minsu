package com.xm.controller;


import com.xm.pojo.entity.User;
import com.xm.utils.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/xm/user")
@CrossOrigin
public class UserController {

    @PostMapping("login")
    public Result login(@RequestBody User user) {
        HashMap<String, String> map = new HashMap<>();
        map.put("token","admin");
        return Result.success(map);
    }

    @GetMapping("info")
    public Result info() {
        HashMap<String, String> map = new HashMap<>();
        map.put("roles","[admin]");
        map.put("name","admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.success(map);
    }

}

