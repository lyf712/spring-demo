package com.lyf.assembly.annotation.dao.impl;

import com.lyf.assembly.annotation.dao.GoodsDao;
import org.springframework.stereotype.Repository;

@Repository("goodsDao")
public class GoodsImpl implements GoodsDao {
    @Override
    public void addGoods() {
        System.out.println("Dao层执行add()");
    }

    @Override
    public void deleteGoods() {

    }
}
