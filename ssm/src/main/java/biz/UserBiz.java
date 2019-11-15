package biz;

import bean.PageInfo;
import bean.UserInfo;

import java.util.List;

public interface UserBiz {
    List<UserInfo> findAllUser();

    List<UserInfo> findUserByPage(PageInfo pi);

    List<String> findUserPageNum();
    void deleteUser(int userId);

    List<UserInfo> searchUser(String name);
}
