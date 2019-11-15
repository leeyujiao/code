package mapper;

import bean.PageInfo;
import bean.UserInfo;

import java.util.List;

public interface UserMapper {
    List<UserInfo> findAllUser();
    List<UserInfo> findUserByPage(PageInfo pi);
    int findUserCount();
    void deleteUser(int userId);
    List<UserInfo> searchUser(String name);

}
