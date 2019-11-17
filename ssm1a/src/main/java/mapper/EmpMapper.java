package mapper;

import bean.EmpInfo;
import bean.EmpPageInfo;

import java.util.List;

public interface EmpMapper {
    List<EmpInfo>  findAllEmp();
    List<EmpInfo> findEmpByPage(EmpPageInfo ep);
    int findEmpCount();
    void deleteEmp(int empNo);
}
