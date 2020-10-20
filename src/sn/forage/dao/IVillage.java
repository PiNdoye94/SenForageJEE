package sn.forage.dao;

import java.util.List;

import sn.forage.entities.Village;

public interface IVillage {
	
	public Village save(Village v);
	public List<Village> findAll();
	public Village findByDesignation(String mc);
	public Village update(Village v);
	public void delete(Integer id);
	
}
