package org.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.model.Address;
import org.hibernate.model.Student;
import org.hibernate.model.StudentPK;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAttributeAnnotation {
	private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    
    @Before
    public void before() {
        sessionFactory = new Configuration().configure().buildSessionFactory();// 创建SessionFactory对象
        session = sessionFactory.openSession();// 获取Session对象
        transaction = session.beginTransaction();// 开启事务
    }
     
    @After
    public void after() {
        transaction.commit();// 提交事务
        session.clear();// 关闭Session
        sessionFactory.close();// 关闭SessionFactory
    }
    
    @Test
    public void testAnnotation() {
        Address address = new Address("100000", "北京市", "15812345678");
        StudentPK pk = new StudentPK(1L, "123456780123456789");
        Student student = new Student(pk, "张三", "男", new Date(), address, "李四");
        session.save(student);
    }
    
}
