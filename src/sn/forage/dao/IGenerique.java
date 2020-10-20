package sn.forage.dao;

import java.util.List;


public interface IGenerique<T> {
	public T save(T c);
	public List<T> findAll();
	public T findByDesignation(String mc);
	public T update(T c);
	public void delete(Integer id);
}
