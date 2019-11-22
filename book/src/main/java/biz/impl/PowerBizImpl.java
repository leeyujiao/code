package biz.impl;

import bean.PowerInfo;
import biz.PowerBiz;
import mapper.PowerMapper;
import util.SessionUtil;

import java.util.Set;

public class PowerBizImpl implements PowerBiz {
    private PowerMapper pm = SessionUtil.getSqlSession().getMapper(PowerMapper.class);
    public Set<PowerInfo> findPowerByAdminId(int adminId) {
        return pm.findPowerByAdminId(adminId);
    }
}
