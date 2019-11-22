package biz.impl;

import bean.AuthorInfo;
import biz.AuthorBiz;
import com.alibaba.fastjson.JSONArray;
import mapper.AuthorMapper;
import org.apache.ibatis.session.SqlSession;
import util.SessionUtil;

import java.util.List;

public class AuthorBizImpl implements AuthorBiz {
    private SqlSession session = SessionUtil.getSqlSession();
    private AuthorMapper am = session.getMapper(AuthorMapper.class);
    public String findAllAuthor() {
        List<AuthorInfo> list = am.findAllAuthor();
        String jsonStr = JSONArray.toJSONString(list);
        return jsonStr;
    }
    public void saveAuthor(String authorName) {
        am.saveAuthor(authorName);
        session.commit();
    }
}
