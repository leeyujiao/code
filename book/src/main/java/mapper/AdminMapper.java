package mapper;

import bean.AdminInfo;

public interface AdminMapper {
    AdminInfo checkAdminLogin(AdminInfo ai);
    AdminInfo checkAdminPowerLogin(String adminName);
}
