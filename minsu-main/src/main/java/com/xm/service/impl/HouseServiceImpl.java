package com.xm.service.impl;

import com.xm.pojo.entity.House;
import com.xm.mapper.HouseMapper;
import com.xm.service.HouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {

}
