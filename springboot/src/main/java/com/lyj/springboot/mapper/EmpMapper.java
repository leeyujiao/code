package com.lyj.springboot.mapper;

import com.lyj.springboot.bean.EmpInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper   //告诉IOC容器，将EmpMapper接口对象产生出来
@Repository //可不加
public interface EmpMapper {
    @Select("SELECT *FROM EMP")
    List<EmpInfo> findAllEmp();
    @Insert("insert into emp values(null,${ename},${job},${mgr},${hireDate},${sal},${comm},${deptNo})")
    void saveEmp(EmpInfo ei);
}
