package biz.impl;

import bean.AdminInfo;
import biz.AdminBiz;
import mapper.AdminMapper;
import util.SessionUtil;

public class AdminBizImpl implements AdminBiz {
    private AdminMapper am = SessionUtil.getSqlSession()
            .getMapper(AdminMapper.class);
    public AdminInfo checkAdminLogin(AdminInfo ai) {
        return am.checkAdminLogin(ai);
    }

    public AdminInfo checkAdminPowerLogin(String adminName) {
        return am.checkAdminPowerLogin(adminName);
    }
}
