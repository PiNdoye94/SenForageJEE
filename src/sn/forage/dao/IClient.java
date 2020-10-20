package sn.forage.dao;

import java.util.List;
import sn.forage.entities.Client;

public interface IClient {
	
	public Client save(Client c);
	public List<Client> findAll();
	public Client findByDesignation(String mc);
	public Client update(Client c);
	public void delete(Integer id);
}
