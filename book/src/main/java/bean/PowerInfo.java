package bean;

import java.util.Set;

public class PowerInfo {
    private Integer powerId;
    private String powerName;
    private String powerUrl;
    private Integer powerState;
    private Set<AdminInfo> adminSet;

    public PowerInfo() {
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl;
    }

    public Integer getPowerState() {
        return powerState;
    }

    public void setPowerState(Integer powerState) {
        this.powerState = powerState;
    }

    public Set<AdminInfo> getAdminSet() {
        return adminSet;
    }

    public void setAdminSet(Set<AdminInfo> adminSet) {
        this.adminSet = adminSet;
    }

    @Override
    public String toString() {
        return "PowerInfo{" +
                "powerId=" + powerId +
                ", powerName='" + powerName + '\'' +
                ", powerUrl='" + powerUrl + '\'' +
                ", powerState=" + powerState +
                '}';
    }
}
