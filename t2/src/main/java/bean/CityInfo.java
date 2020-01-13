package bean;

public class CityInfo {

    private Integer id;      //主键
    private String cityId;
    private String city;
    private String provinceId; //外键




    public CityInfo() {
    }

    public Integer getId() {
        return id;
    }

    public String getCityId() {
        return cityId;
    }

    public String getCity() {
        return city;
    }

    public String getProvinceId() {
        return provinceId;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }


    @Override
    public String toString() {
        return "CityInfo{" +
                "id=" + id +
                ", cityId='" + cityId + '\'' +
                ", city='" + city + '\'' +
                ", provinceId='" + provinceId + '\'' +
                '}';
    }
}
