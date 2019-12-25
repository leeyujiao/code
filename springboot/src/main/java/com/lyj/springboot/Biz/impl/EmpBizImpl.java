package com.lyj.springboot.Biz.impl;

import com.lyj.springboot.Biz.EmpBiz;
import com.lyj.springboot.bean.EmpInfo;
import com.lyj.springboot.mapper.EmpMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpBizImpl implements EmpBiz {
    @Autowired
    private EmpMapper em;
    public List<EmpInfo> findAllEmp() {
        return em.findAllEmp();
    }

    @Override
    public void saveEmp(EmpInfo ei) {
        em.saveEmp(ei);
    }
}
