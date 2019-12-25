package com.lyj.springboot.Biz;

import com.lyj.springboot.bean.EmpInfo;

import java.util.List;

public interface EmpBiz {
    List<EmpInfo> findAllEmp();
    void saveEmp(EmpInfo ei);
}
