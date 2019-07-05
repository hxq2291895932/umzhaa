package sample;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mybatis {
    public List<User> findAll() throws IOException {
        String resource = "sample/SqlMapConfig.xml";
        InputStream inputstream =  Resources.getResourceAsStream(resource);
        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);

        //通过工厂得到sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //通过sqlsession操作数据库
        //List中的User

        return sqlSession.selectList("test.findAll");
    }
}
