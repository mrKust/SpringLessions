package com.example.Hibernate.OneToMany.UniDirectional;


import com.example.Hibernate.OneToMany.UniDirectional.Entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.Hibernate.OneToMany.UniDirectional.Entity.Employee.class)
                .addAnnotatedClass(com.example.Hibernate.OneToMany.UniDirectional.Entity.Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

            session = factory.getCurrentSession();
            session.beginTransaction();

            Department dept = session.get(Department.class, 1);

            session.remove(dept);
            session.getTransaction().commit();


        } finally {
            session.close();
            factory.close();
        }
    }
}
