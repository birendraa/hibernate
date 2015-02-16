package com.ann.javacodegeeks;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student student = new Student("bk", "bk@in.com", "2222");
        session.save(student);
        Address address = new Address("airpoart rd", "bangalore", "Karnataka");
        session.save(address);
        student.setAddress(address);
        tx.commit();
    }
}
