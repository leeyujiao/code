package biz;

import bean.GoodsInfo;

import java.util.List;

public interface GoodsBiz {
    List<GoodsInfo> findAllGoods();
}
