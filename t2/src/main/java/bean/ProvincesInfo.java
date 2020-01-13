package bean;

import java.util.Set;

public class ProvincesInfo  {

    private Integer id;       //主键
    private String provinceId;
    private String province ;

    public ProvincesInfo() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return "ProvincesInfo{" +
                "id=" + id +
                ", provinceId='" + provinceId + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
