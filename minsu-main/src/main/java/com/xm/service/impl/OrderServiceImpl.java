package com.xm.service.impl;

import com.xm.pojo.entity.Order;
import com.xm.mapper.OrderMapper;
import com.xm.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
