package sn.forage.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import sn.forage.entities.User;

public class UserImpl implements IUser{
	
	private EntityManager em;
	
	public UserImpl() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sen-ForagePU");
		em = emf.createEntityManager();
	}

	@Override
	public User checkLogin(String username, String password) {
		try {
			//clients = (User) em.createQuery("SELECT u FROM user u WHERE u.username = ? and u.password = ?");
			Query query = (Query) em.createQuery("SELECT u FROM User u WHERE u.userName =:username AND u.password =:password");
			query.setParameter("username", username);
			query.setParameter("password", password);
			return (User) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
