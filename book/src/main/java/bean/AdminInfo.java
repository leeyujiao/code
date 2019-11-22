package bean;

import java.util.Set;

public class AdminInfo {
    private Integer adminId;
    private String adminName;
    private String adminPass;
    private String adminImg;
    private Integer adminState;
    // 描述多对多情况
    private Set<PowerInfo> powerSet;

    public AdminInfo() {
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String getAdminImg() {
        return adminImg;
    }

    public void setAdminImg(String adminImg) {
        this.adminImg = adminImg;
    }

    public Integer getAdminState() {
        return adminState;
    }

    public void setAdminState(Integer adminState) {
        this.adminState = adminState;
    }

    public Set<PowerInfo> getPowerSet() {
        return powerSet;
    }

    public void setPowerSet(Set<PowerInfo> powerSet) {
        this.powerSet = powerSet;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminPass='" + adminPass + '\'' +
                ", adminImg='" + adminImg + '\'' +
                ", adminState=" + adminState +
                '}';
    }
}
