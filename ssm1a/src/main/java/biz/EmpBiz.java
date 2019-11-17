package biz;

import bean.EmpInfo;
import bean.EmpPageInfo;

import java.util.List;

public interface EmpBiz {
    List<EmpInfo> findAllEmp();
    List<EmpInfo> findEmpByPage(EmpPageInfo ep);
    List<String>findEmpPageNum();
    void deleteEmp(int empNo);
    List<EmpInfo> searchEmp(String name);
}
