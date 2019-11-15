package biz.impl;

import bean.PageInfo;
import bean.UserInfo;
import biz.UserBiz;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserMapper um;
    public List<UserInfo> findAllUser() {
        return um.findAllUser();
    }
    public List<UserInfo> findUserByPage(PageInfo pi) {
        pi.setStart((pi.getPage()-1)*pi.getSize());
        return um.findUserByPage(pi);
    }

    @Override
    public List<String> findUserPageNum() {
        List<String> list = new ArrayList<>();
        int count = um.findUserCount();
        int size = 10;
        int pageNum = count%size==0?(count/size):(count/size+1);
        for(int i=0;i<pageNum;i++){
            list.add("aa");
        }
        return list;
    }

    public void deleteUser(int userId) {
        um.deleteUser(userId);
    }

    public List<UserInfo> searchUser(String name) {
        return um.searchUser("%"+name+"%");
    }
}
