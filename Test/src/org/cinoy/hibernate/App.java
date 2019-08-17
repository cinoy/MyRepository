package org.cinoy.hibernate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.cinoy.hibernate.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App {
	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		try {
			
			//Create
			/*
			Users user = new Users("rahul", "rahul123", "Rahul", "Thomas");
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Row added");
			*/
			
			//Select
			/*
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 3);//3 is PK
			session.getTransaction().commit();
			System.out.println(user.toString());
			*/
			
			//Update
			/*
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 4);//4 is PK
			user.setLastName("ThomasAlwa");
			session.getTransaction().commit();
			System.out.println(user.toString());
			*/
			
			//Delete
			/*
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 4);//4 is PK
			session.delete(user);
			session.getTransaction().commit();
			System.out.println("Deleted");
			*/
			
			//HQL List
			/*
			session.beginTransaction();
			List<Users> users = session.createQuery("from users").getResultList();
			
			for (Users temp : users) {
				System.out.println(temp.toString());
			}
			//session.getTransaction().commit();//no need
			*/
			
			//HQL Where
			/*
			session.beginTransaction();
			//List<Users> users2 = session.createQuery("from users where first_name = 'Anu'").getResultList();
			//Or
			List<Users> users2 = session.createQuery("from users where firstName = 'Anu'").getResultList();
			
			for (Users temp : users2) {
				System.out.println(temp.toString());
			}
			*/
			
			//HQL Update
			/*
			session.beginTransaction();
			session.createQuery("update users set password = '123456' where firstName = 'Anu'").executeUpdate();
			session.getTransaction().commit();
			*/
			
			//HQL Delete
			session.beginTransaction();
			session.createQuery("delete users where firstName = 'Anu'").executeUpdate();
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			sessionFactory.close();
		}

	}
}
