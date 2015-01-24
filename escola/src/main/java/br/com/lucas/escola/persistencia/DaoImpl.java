package br.com.lucas.escola.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.lucas.escola.dao.Dao;

/**
 * 
 * @author Lucas Moreira
 *
 * @param <T>
 * @param <t>
 */

public class DaoImpl<T> implements Dao<T>{

	@PersistenceContext
	private EntityManager manager;
	
	public void persist(T t) {
		manager.persist(t);
	}

	public void merge(T t) {
		manager.merge(t);
	}

	public void delete(T t) {
		manager.remove(t);
	}

	public List<T> getAll() {
		return (List<T>) manager.createQuery("FROM " + getClass().getName());
	}

	public T getPorId(Integer id) {
		return (T) manager.find(getClass(), id);
	}

}
