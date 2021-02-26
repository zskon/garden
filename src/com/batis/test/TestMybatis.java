package com.batis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: TestMybatis
 * @Description:
 * @Author: zskon
 * @Creat: 2021/2/17 23:41
 * @Version: 1.0
 */
public class TestMybatis {
    InputStream inputStream;

    {
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = factory.openSession();
    @Test
    public void test01() throws IOException {

        List<Object> list = sqlSession.selectList("com.batis.mapper.selAll");
        System.out.println(list);
    }
    @Test
    public void test02() throws IOException {

        Object one = sqlSession.selectOne("com.batis.mapper.selOne");
        System.out.println(one);
    }

}
