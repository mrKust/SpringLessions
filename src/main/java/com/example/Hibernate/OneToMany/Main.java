package com.example.Hibernate.OneToMany;

import com.example.Hibernate.OneToMany.Entity.Department;
import com.example.Hibernate.OneToMany.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.Hibernate.OneToMany.Entity.Employee.class)
                .addAnnotatedClass(com.example.Hibernate.OneToMany.Entity.Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

            //add employees to department
            /*session = factory.getCurrentSession();
            session.beginTransaction();

            Department dep = new Department("Sales", 300, 3000);
            Employee tmp1 = new Employee("Vyacheslav", "Evgenevich", 2500);
            Employee tmp2 = new Employee("Aleksiy", "Silly", 1900);
            Employee tmp3 = new Employee("Vasiliiy", "Beglov", 350);

            dep.addEmployeeToDepartment(tmp1);
            dep.addEmployeeToDepartment(tmp2);
            dep.addEmployeeToDepartment(tmp3);

            session.save(dep);
            session.getTransaction().commit();*/

            //get department and employees from it
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get info about department");
            Department dept = session.get(Department.class, 2);

            System.out.println("Show department's info\n" + dept.toString());

            System.out.println("Show info about dept's employess\n" + dept.getEmployees().toString());
            session.getTransaction().commit();


        } finally {
            session.close();
            factory.close();
        }
    }
}
