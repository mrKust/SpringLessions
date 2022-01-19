package com.example.Hibernate.OneToOne;

import com.example.Hibernate.OneToOne.Entity.Details;
import com.example.Hibernate.OneToOne.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainOneToOne {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.Hibernate.OneToOne.Entity.Employee.class)
                .addAnnotatedClass(com.example.Hibernate.OneToOne.Entity.Details.class)
                .buildSessionFactory();

        Session session = null;

        try {

            //add user and details for him
            /*Session session = factory.getCurrentSession();
            Employee employee = new Employee("Dmitry", "Vasilyev",
                    "KeK", 250);
            Details details = new Details("Che", "8800555535", "rofl@lmao.com");
            session.beginTransaction();
            employee.setEmployeeDetails(details);

            session.save(employee);
            session.getTransaction().commit();*/

            //get user and details for him
            /*session = factory.getCurrentSession();
            session.beginTransaction();
            Employee tmp = session.get(Employee.class, 5);
            System.out.println(tmp.getEmployeeDetails().toString());

            session.getTransaction().commit();*/

            //delete user and details for him
            /*session = factory.getCurrentSession();
            session.beginTransaction();
            Employee tmp = session.get(Employee.class, 5);
            session.remove(tmp);

            session.getTransaction().commit();*/

            //BiDirectional part
            //add user and details for him

            session = factory.getCurrentSession();
            Employee employee = new Employee("Dmitry", "Vasilyev",
                    "KeK", 250);
            Details details = new Details("Che", "8800555535", "rofl@lmao.com");

            session.beginTransaction();
            details.setEmployee(employee);
            employee.setEmployeeDetails(details);
            session.save(details);
            session.getTransaction().commit();


        } finally {
            session.close();
            factory.close();
        }
    }
}
