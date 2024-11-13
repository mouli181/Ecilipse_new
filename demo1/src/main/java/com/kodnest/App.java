package com.kodnest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Customer;
import com.kodnest.entity.Product;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction tr = session.beginTransaction();
        
        //Student s = new Student(1,"ranjith");
        //Bike b = new Bike(1,"R15");
        //Bike b = session.get(Bike.class, 2  );  
        //System.out.println(b.getId()+" "+ b.getName());
       // System.out.println(" ");
        //System.out.println(b);
        
//        List<Bike> l = session.createQuery("from Bike").list();
//        
//        for(Bike b : l) {
//        	System.out.println(b);
//        }
//        Bike b = new Bike("KTM",3);
//        session.save(b);
//        Student s = new Student(1,"Mouli",b);
//        session.save(s);
        
//        Product p = new Product();
//        
//        Customer c = new Customer(1,"Mouli",p);
//        p.setPid(1);
//        p.setPname("M2 Pro");
        Product p1 = new Product();
        p1.setPid(1);
        p1.setPname("mobile");
        session.save(p1);
        
        Product p2 = new Product();
        p2.setPid(2);
        p2.setPname("Laptop");
        session.save(p2);
        
        Product p3 = new Product();
        p3.setPid(3);
        p3.setPname("Air Buds");
        session.save(p3);
        
        Product p4 = new Product();
        p4.setPid(4);
        p4.setPname("Smart Watch");
        session.save(p4);

        
        ArrayList<Product> al = new ArrayList<Product>();
        al.add(p1);
        al.add(p2);

        ArrayList<Product> a2 = new ArrayList<Product>();
        a2.add(p3);
        a2.add(p4);
        
        Customer c1= new Customer(1,"Mouli",al);
        session.save(c1);
        Customer c2 = new Customer(2,"Ranjith",al);
        session.save(c2);
        Customer c3 = new Customer(3,"Pavan",a2);
        session.save(c3);
        Customer c4 = new Customer(4,"Sachin",a2);
        session.save(c4);
        
        tr.commit(); 
        session.close();
        factory.close();
    }
}
