package com.dao;


import com.model.Tools;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

/**
 * Created by Administrator on 2017/1/16.
 */
@Repository
public class ToolDao {
//    private SessionFactory sessionFactory;
//    public Session getSession(){
//        ApplicationContext ct=new ClassPathXmlApplicationContext("spring-hibernate.xml");
//        sessionFactory= (SessionFactory) ct.getBean("sessionFactory");
//       return  sessionFactory.getCurrentSession();
//    }

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    public Session getSession() {
        //需要开启事物，才能得到CurrentSession
        return sessionFactory.getCurrentSession();
    }
    public void AddTools(){
        Tools tools=new Tools();
        tools.setUsername("brave");
        tools.setTool("tool2");
        Session session=getSession();
        session.save(tools);
    }
}
