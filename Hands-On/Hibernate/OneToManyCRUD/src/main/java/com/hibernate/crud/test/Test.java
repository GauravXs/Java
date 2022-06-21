package com.hibernate.crud.test;

import org.hibernate.Session;

import com.hibernate.crud.dao.SchoolDao;
import com.hibernate.crud.entity.School;
import com.hibernate.crud.entity.Students;
import com.hibernate.crud.util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        // Create an scool
        School scool = new School();
        scool.setCname("PVG");
        scool.setCity("Mumbai");
        
        School scool2 = new School();
        scool2.setCname("KJ.Somaiya");
        scool2.setCity("Mumbai");
       
        // Create students
        Students std = new Students();
        std.setSname("Suraj");
        std.setCname("PES");
        std.setEmail("suraj@gmail.com");
        
        // Create students2
        Students std1 = new Students();
        std1.setSname("Priya");
        std1.setCname("YSKV");
        std1.setEmail("priya@gmail.com");
        // employee can work on two projects, Add project references in the employee
        scool.getStds().add(std1);
        scool.getStds().add(std);
        
        session.save(std1);
        session.save(scool);

       session.getTransaction().commit();
       
       SchoolDao scoold =new SchoolDao();
       scoold.deleteSchool(1);
       HibernateUtil.shutdown();
    }
}