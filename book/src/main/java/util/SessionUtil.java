package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SessionUtil {
    private static InputStream in = SessionUtil.class.getClassLoader().getResourceAsStream("config.xml");
    private static SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);

    public static SqlSession getSqlSession(){
        return ssf.openSession();
    }
}
