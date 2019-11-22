package biz;

import bean.AdminInfo;

public interface AdminBiz {
    AdminInfo checkAdminLogin(AdminInfo ai);
    AdminInfo checkAdminPowerLogin(String adminName);
}
