package br.com.lucas.escola.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.lucas.escola.model.Aluno;

@Repository
public class AlunoDaoImpl extends DaoImpl<Aluno>  {
	
	@PersistenceContext
	private EntityManager manager;

	public Aluno findAlunoByNome(String nome) {
		Aluno aluno = new Aluno();
		Query query = manager
				.createQuery("select a from Aluno a where nome = :nome");
		query.setParameter("nome", nome);
		if (!query.getResultList().isEmpty()) {
			aluno = (Aluno) query.getResultList().get(0);
		}
		return aluno;
	}

	public Aluno findAlunoById(Integer id) {
		return manager.find(Aluno.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> findAlunoByIdSala(Integer id) {
		Query query = manager.createQuery("select a from Aluno a where id_sala = :id");
		query.setParameter("id", id);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> getAlunosNaoEnsaladosByNome(String nome) {
		Query query = manager.createQuery("select a from Aluno a where a.nome like '%"+nome+"%'" + "and a.sala IS NULL");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> findAlunosByIdSala(Integer id) {
		Query query = manager.createQuery("select a from Aluno a where id_sala = :id");
		query.setParameter("id", id);
		return query.getResultList();
	}	

}
