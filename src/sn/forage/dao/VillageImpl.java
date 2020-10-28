package sn.forage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.forage.entities.Client;
import sn.forage.entities.Village;

public class VillageImpl implements IVillage {
	
	private static final Client Client = null;
	private EntityManager em;
	
	public VillageImpl() {	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sen-ForagePU");
		em = emf.createEntityManager();
	}

	@Override
	public Village save(Village v) {
		try {
	        em.getTransaction().begin();
	        em.persist(v);
	        em.getTransaction().commit();
	    } catch (Exception e) {
	        if (em != null) {
	            em.getTransaction().rollback();
	        }
	        e.printStackTrace();
	    }
	    return v;
	}

	@Override
	public List<Village> findAll() {
		List <Village> villages = null;	
		villages = em.createQuery("SELECT v FROM Village v ORDER BY").getResultList();
//    	if (clients != null && clients.size() > 0) {           
//            return clients;
//        } else {
//            return null;
//        }
    return villages;
	}

	@Override
	public void delete(Integer id) {
		
	}

	@Override
	public Village getVillageById(int id) {
		return (Village) em.createQuery("SELECT v FROM Village v WHERE v.id=:id").setParameter("id", id).getSingleResult();
	}
	
	
}
