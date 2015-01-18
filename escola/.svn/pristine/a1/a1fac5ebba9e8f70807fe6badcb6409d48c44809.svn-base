package br.com.lucas.escola.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Sala;

@Repository
public class SalaDaoImpl implements SalaDao {
	
	@PersistenceContext
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	public List<Sala> getAll() {
		return (List<Sala>) manager.createQuery("select s from Sala s")
				.getResultList();
	}

	public void salvar(Sala sala) {
		manager.persist(sala);
	}
	
	public Sala findSalaById(Integer id){
		return manager.find(Sala.class, id);
	}

}
