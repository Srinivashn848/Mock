package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dto.Details;

public class Detailsdao {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();

		public void save(Details s){
			t.begin();
			m.persist(s);
			t.commit();
			
		}
		public Details find(int empid)
		{
			return m.find(Details.class, empid);
		}
		public List<Details> fetchall()
		{
			return m.createQuery("select x from Details x").getResultList();	
		}
		public void delete(int id)
		{
			t.begin();
			m.remove(m.find(Details.class,id));
			t.commit();
		}
		public void update(Details s){
			t.begin();
			m.merge(s);
			t.commit();
		}
		public Details find(String name) {
			
			return m.find(Details.class, name);
		}
		
	}

