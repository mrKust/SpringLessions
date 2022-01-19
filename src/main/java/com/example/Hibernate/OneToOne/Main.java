package com.example.Hibernate.OneToOne;

import com.example.Hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.Hibernate.Entity.Employee.class)
                .buildSessionFactory();

        try {
            //add new employee
            /*Employee employee = new Employee("Vova", "Lisov",
                    "sales", 0);
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();*/

            //get employee by id
            /*Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee back = session.get(Employee.class, 1);
            System.out.println(back);
            session.getTransaction().commit();*/

            //get employee by query
            /*Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> workers = session.createQuery("from Employee " +
                            "where name = 'Dimas'")
                            .getResultList();

            for (Employee tmp: workers) {
                System.out.println(tmp);
            }
            session.getTransaction().commit();*/

            //update employee info by id
            /*Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee back = session.get(Employee.class, 1);
            back.setDepartment("kek");
            session.getTransaction().commit();*/

            //update employee by query
            /*Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("update Employee set salary = 1000" +
                    "where name = 'Dimas'").executeUpdate();
            session.getTransaction().commit();*/

            //delete employee by id
            /*Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee back = session.get(Employee.class, 1);
            session.delete(back);
            session.getTransaction().commit();*/

            //delete employee by query
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete Employee " +
                    "where name = 'Dimas'").executeUpdate();
            session.getTransaction().commit();


        } finally {
            factory.close();
        }
    }
}
