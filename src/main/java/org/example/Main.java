package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Person person = new Person("Igor", 25);
            Person person1 = new Person("Oleg", 18);
            session.save(person1);
            session.save(person);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }
    }
}