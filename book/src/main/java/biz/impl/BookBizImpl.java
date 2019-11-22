package biz.impl;

import bean.BookInfo;
import biz.BookBiz;
import com.alibaba.fastjson.JSONArray;
import mapper.BookMapper;
import util.SessionUtil;

public class BookBizImpl implements BookBiz {
    private BookMapper bm = SessionUtil.getSqlSession()
            .getMapper(BookMapper.class);
    public String searchBook(BookInfo bi) {
        return JSONArray.toJSONString(bm.searchBook(bi));
    }

    public static void main(String[] args) {
        System.out.println(new BookBizImpl().searchBook(null));
    }
}
