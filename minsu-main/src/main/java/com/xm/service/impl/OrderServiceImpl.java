package com.xm.service.impl;

import com.xm.pojo.entity.Order;
import com.xm.mapper.OrderMapper;
import com.xm.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hskBeginner
 * @since 2023-01-13
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
