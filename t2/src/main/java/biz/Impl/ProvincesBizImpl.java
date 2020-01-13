package biz.Impl;

import bean.ProvincesInfo;
import biz.ProvincesBiz;
import mapper.ProvincesMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class ProvincesBizImpl implements ProvincesBiz {
    private ProvincesMapper pm;

    public ProvincesBizImpl() {
        InputStream in = ProvincesBizImpl.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = ssf.openSession();
        pm = session.getMapper(ProvincesMapper.class);
    }
    public String findAllProvinces() {
        String jsonStr = "[";
        List<ProvincesInfo> list = pm.findAllProvinces();
        for(ProvincesInfo pi:list){
            jsonStr+="{";
            jsonStr+="\"id\":\""+pi.getId()+"\",";
            jsonStr+="\"provinceId\":\""+pi.getProvinceId()+"\",";
            jsonStr+="\"province\":\""+pi.getProvince()+"\"";
            jsonStr+="},";
        }
        jsonStr = jsonStr.substring(0,jsonStr.length()-1);
        jsonStr+="]";
        return jsonStr;
    }
}
