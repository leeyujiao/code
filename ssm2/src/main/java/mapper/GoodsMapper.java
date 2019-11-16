package mapper;

import bean.GoodsInfo;

import java.util.List;

public interface GoodsMapper {
    List<GoodsInfo> findAllGoods();
}
