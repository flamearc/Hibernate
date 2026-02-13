package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SessionFactory sf  = new Configuration()
                                .addAnnotatedClass(Alien.class)
                                .addAnnotatedClass(Laptop.class)
                                .configure()
                                .buildSessionFactory();
        Session session  = sf.openSession();

        // Sql  = select * from laptop where lid = 3;
        // Hql = from laptop where lid = 3;

        String brand = "Dell";

        Query query = session.createQuery("select brand , model from Laptop where brand = ?1");
        query.setParameter(1, brand);
        List<Object[]> laptops = query.list();

        for (Object[] data : laptops) {
            System.out.println((String)data[0] + " " +(String)data[1] );
        }

//        Laptop laptop = session.byId(Laptop.class).load(3);
        System.out.println(laptops);

        session.close();

        sf.close();



    }
}