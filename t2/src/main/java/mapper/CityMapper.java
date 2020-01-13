package mapper;

import bean.CityInfo;

import java.util.List;

public interface CityMapper {
    List<CityInfo> findCityByProvincesId();
}
