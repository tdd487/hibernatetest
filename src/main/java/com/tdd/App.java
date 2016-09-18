package com.tdd;

import com.tdd.model.CountryEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = null;

        session = factory.openSession();

        session.beginTransaction();
        System.out.println(cfg);
        String sql = "FROM CountryEntity";
        Query query = session.createQuery(sql);
        System.out.println( query.list());
        System.out.println(query.list().getClass().getName());

    }
}
