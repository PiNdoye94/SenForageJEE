package sn.forage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.forage.entities.Client;

public class ClientIpml implements IGenerique<Client> {
	
	private static final Client Client = null;
	private EntityManager em;
	
	
	
	public ClientIpml() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sen-ForagePU");
		em = emf.createEntityManager();

	}

	@Override
	public Client save(Client c) {
		try {
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Client> findAll() {
		List<Client> clients = em.createQuery("select c from Client c").getResultList();
				
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clients;
	}

	@Override
	public Client findByDesignation(String mc) {
		return null;
//		try {
//			
//             List<Client> clients =em.createQuery( "select c from Client c where c.nom like :pnom").setParameter("pnom","%"+mc+"%").getResultList();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return clients;
	}

	@Override
	public Client update(Client c) {
		try {
			em.getTransaction().begin();
			em.merge(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
			
	}

	@Override
	public void delete(Integer id) {
		try {
			Client c = new Client();
			c = this.getById(id);
			em.getTransaction().begin();
			em.remove(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private Client getById(Integer id) {
		try {
			Client c = new Client();
			c = this.getById(id);
			em.getTransaction().begin();
			em.find(c.getClass(), id);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Client;
	}
	
}
