package br.com.lucas.escola.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.persistencia.AlunoDaoImpl;
import br.com.lucas.escola.services.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService{

	@Autowired
	AlunoDaoImpl dao;
	
	public void persist(Aluno t) {
		dao.persist(t);
	}

	public void merge(Aluno t) {
		dao.merge(t);
	}

	public void delete(Aluno t) {
		dao.delete(t);
	}

	public List<Aluno> getAll() {
		return dao.getAll();
	}

	public Aluno getPorId(Integer id) {
		return dao.getPorId(id);
	}

	public Aluno findAlunoByNome(String nome) {
		return dao.findAlunoByNome(nome);
	}

	public Aluno findAlunoById(Integer id) {
		return dao.findAlunoById(id);
	}

	public List<Aluno> findAlunoByIdSala(Integer id) {
		return dao.findAlunoByIdSala(id);
	}

	public List<Aluno> getAlunosNaoEnsaladosByNome(String nome) {
		return getAlunosNaoEnsaladosByNome(nome);
	}

	public List<Aluno> findAlunosByIdSala(Integer id) {
		return dao.findAlunosByIdSala(id);
	}
	
	


}
