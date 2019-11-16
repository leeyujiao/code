package biz.impl;

import bean.GoodsInfo;
import biz.GoodsBiz;
import mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsBizImpl implements GoodsBiz {
    @Autowired
    private GoodsMapper gm;
    public List<GoodsInfo> findAllGoods() {
        return gm.findAllGoods();
    }
}
