package biz.impl;

import biz.PubBiz;
import com.alibaba.fastjson.JSONArray;
import mapper.PubMapper;
import org.apache.ibatis.session.SqlSession;
import util.SessionUtil;

public class PubBizImpl implements PubBiz {
    private SqlSession session = SessionUtil.getSqlSession();
    private PubMapper pm = session.getMapper(PubMapper.class);

    public String findAllPub() {
        return JSONArray.toJSONString(pm.findAllPub());
    }
}
