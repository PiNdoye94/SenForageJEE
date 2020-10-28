package sn.forage.dao;

import java.util.List;

import sn.forage.entities.Village;

public interface IVillage {
	
	public Village save(Village v);
	public List<Village> findAll();
	public Village getVillageById(int id);
	public void delete(Integer id);
	
}
