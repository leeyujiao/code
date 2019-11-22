package mapper;

import bean.PowerInfo;

import java.util.Set;

public interface PowerMapper {
    Set<PowerInfo> findPowerByAdminId(int adminId);
}
