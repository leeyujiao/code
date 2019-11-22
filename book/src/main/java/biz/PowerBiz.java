package biz;

import bean.PowerInfo;

import java.util.Set;

public interface PowerBiz {

    Set<PowerInfo> findPowerByAdminId(int adminId);
}
