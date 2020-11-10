package com.lyf.assembly.annotation.service.impl;

import com.lyf.assembly.annotation.dao.GoodsDao;
import com.lyf.assembly.annotation.service.GoodsService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("goodService")
public class GoodsServiceImpl implements GoodsService {
    @Resource(name = "goodsDao")
    private GoodsDao goodsDao;


    @Override
    public void addGoods() {
        goodsDao.addGoods();
        System.out.println("service层执行add()..");
    }

    @Override
    public void deleteGoods() {

    }
}
