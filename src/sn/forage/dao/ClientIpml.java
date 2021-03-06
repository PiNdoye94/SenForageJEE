package sn.forage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.forage.entities.Client;
import sn.forage.entities.Village;

public class ClientIpml implements IClient {
	
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
            if (em != null) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return c;
    }

	@Override
	public List<Client> findAll() {
		List <Client> clients = null;	
        	clients = em.createQuery("SELECT c FROM Client c").getResultList();
//        	if (clients != null && clients.size() > 0) {           
//                return clients;
//            } else {
//                return null;
//            }
        return clients;
	}

	@Override
	public Client findByDesignation(String mc) {
		return null;
	}

	@Override
	public Client getClientById(int id) {
		return (Client) em.createQuery("SELECT c FROM Client c WHERE c.id=:id").setParameter("id", id).getSingleResult();
        
	}

	@Override
	public Client update(Client c) {
		try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return c;
	}

	@Override
	public void delete(Integer id) {
		try {
            Client c = new Client();
            c = this.getClientById(id);
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
		
	}

	
}
