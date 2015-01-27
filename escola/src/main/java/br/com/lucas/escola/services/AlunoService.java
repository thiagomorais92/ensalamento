package br.com.lucas.escola.services;

import java.util.List;

import br.com.lucas.escola.dao.Dao;
import br.com.lucas.escola.model.Aluno;


public interface AlunoService extends Dao<Aluno>{

	Aluno findAlunoByNome(String nome);
	
	Aluno findAlunoById(Integer id);
	
	List<Aluno> findAlunoByIdSala(Integer id);
	
	List<Aluno> getAlunosNaoEnsaladosByNome(String nome);
	
	List<Aluno> findAlunosByIdSala(Integer id);
	
}
