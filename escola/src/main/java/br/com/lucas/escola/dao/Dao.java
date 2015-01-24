package br.com.lucas.escola.dao;

import java.util.List;

/**
 * Inteface genérica de persistência.
 * @author Lucas Moreira
 *
 * @param <t>
 * @param <T>
 */

public interface Dao<T> {

	/**
	 * Persiste a entidade passada.
	 * @param t
	 */
	 void persist(T t);
	
	/**
	 * Atualiza a entidade passada.
	 * @param t
	 */
	 void merge(T t);

	/**
	 * Deleta a entidade passada.
	 * @param t
	 */
	 void delete(T t);
	
	
	/**
	 * Retorona todos os registros da entidade passada.
	 * @return List
	 */
	List<T> getAll();
	
	/**
	 * Retorna uma entidade por id
	 * @param id
	 * @return t
	 */
	T getPorId(Integer id);
	
}
