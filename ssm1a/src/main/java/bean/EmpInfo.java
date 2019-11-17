package bean;

public class EmpInfo {
    private Integer empNo;
    private Integer mgr;
    private Integer sal;
    private Integer comm;
    private Integer deptNo;
    private String eName;
    private String job;
    private String hireDate;

    public EmpInfo() {
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "empNo=" + empNo +
                ", mgr=" + mgr +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptNo=" + deptNo +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
