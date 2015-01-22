package br.com.lucas.escola.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Turma;

@Repository
public class SalaDaoImpl implements SalaDao {
	
	@PersistenceContext
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	public List<Turma> getAll() {
		return (List<Turma>) manager.createQuery("select s from Sala s")
				.getResultList();
	}

	public void salvar(Turma sala) {
		manager.persist(sala);
	}
	
	public Turma findSalaById(Integer id){
		return manager.find(Turma.class, id);
	}

}
