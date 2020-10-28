package sn.forage.dao;

import java.util.List;


public interface IGenerique<T> {
	public T save(T c);
	public List<T> list();
	public T findByDesignation(String mc);
	public T update(T c);
	public void delete(Integer id);
	public T getVillageById(int id);
}
