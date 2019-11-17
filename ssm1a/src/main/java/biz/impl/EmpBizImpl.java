package biz.impl;

import bean.EmpInfo;
import bean.EmpPageInfo;
import biz.EmpBiz;
import mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpBizImpl implements EmpBiz {
    @Autowired
    private EmpMapper em;
    public List<EmpInfo> findAllEmp() {
        return em.findAllEmp();
    }

    @Override
    public List<EmpInfo> findEmpByPage(EmpPageInfo ep) {
        ep.setStart((ep.getPage()-1)*ep.getSize());
        return em.findEmpByPage(ep);
    }

    @Override
    public List<String> findEmpPageNum() {
        List<String>list  = new ArrayList<>();
        int count = em.findEmpCount();
        int pages;
        int size=5;
        pages= count%size==0?(count/size):(count/size+1);
        System.out.println(pages);
        for (int i = 0; i < pages; i++) {
            list.add("s");
            System.out.println(list.get(i));
        }
        return list;
    }

    @Override
    public void deleteEmp(int empNo) {
        em.deleteEmp(empNo);
    }

    @Override
    public List<EmpInfo> searchEmp(String name) {
        return em.searchEmp("%"+name+"%");
    }
}
