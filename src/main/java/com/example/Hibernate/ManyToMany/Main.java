package com.example.Hibernate.ManyToMany;

import com.example.Hibernate.ManyToMany.Entity.Child;
import com.example.Hibernate.ManyToMany.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.example.Hibernate.ManyToMany.Entity.Child.class)
                .addAnnotatedClass(com.example.Hibernate.ManyToMany.Entity.Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
            /*session = factory.getCurrentSession();
            Section section1 = new Section("Football");

            Child child1 = new Child("Vova", 6);
            Child child2 = new Child("Masha", 6);
            Child child3 = new Child("Vitya", 7);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.save(section1);
            session.getTransaction().commit();*/

            //add many sections to one child
            /*session = factory.getCurrentSession();
            Section section1 = new Section("Volleyball");
            Section section2 = new Section("Poker");
            Section section3 = new Section("Math");

            Child child1 = new Child("Igor", 12);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();

            session.save(child1);
            session.getTransaction().commit();*/

            //get info about many children from one section
            /*session = factory.getCurrentSession();


            session.beginTransaction();
            Section section1 = session.get(Section.class, 1);
            System.out.println(section1.getChildList());

            session.getTransaction().commit();*/

            //get info about many sections of one child
            /*session = factory.getCurrentSession();


            session.beginTransaction();
            Child child1 = session.get(Child.class, 4);
            System.out.println(child1.getSections());

            session.getTransaction().commit();*/

            //delete section
            session = factory.getCurrentSession();


            session.beginTransaction();
            Section section1 = session.get(Section.class, 1);
            session.delete(section1);

            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
