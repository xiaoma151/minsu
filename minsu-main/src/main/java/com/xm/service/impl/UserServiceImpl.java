package com.xm.service.impl;

import com.xm.pojo.entity.User;
import com.xm.mapper.UserMapper;
import com.xm.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
