package sn.senforage.test;

import sn.forage.dao.ClientIpml;
import sn.forage.dao.IGenerique;
import sn.forage.dao.IUser;
import sn.forage.dao.UserImpl;
import sn.forage.entities.Client;
import sn.forage.entities.User;

public class Test {

	public static void main(String[] args) {
//		IUser userdao = new UserImpl();
//		User u = new User();
//		u.setNom("Ndoye");
//		u.setPrenom("Papis");
//		u.setEmail("papisndoye218@gmail.com");
//		u.setPassword("forage123");
//		u.setEtat(1);
//		System.out.println(userdao.add(u));
		
		Client c = new Client();
		c.setNom("Sow");
		c.setPrenom("Fama");
		c.setTelephone("771254632");
		c.setAdresse("Ndar");
		c.setVillage(null);
		
		IGenerique clientdao = new ClientIpml();
		System.out.println(clientdao.save(c));
		

	}

}
