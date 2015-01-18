package br.com.lucas.escola.dao;

import java.util.List;

import br.com.lucas.escola.model.Aluno;

public interface AlunoDao {
	
	void salvar(Aluno aluno);
	
	void atualizar(Aluno aluno);
	
	void excluir(Aluno aluno);
	
	List<Aluno> findAll();
	
	Aluno findAlunoByNome(String nome);
	
	Aluno findAlunoById(Integer id);
	
	List<Aluno> findAlunoByIdSala(Integer id);
	
	List<Aluno> getAlunosNaoEnsaladosByNome(String nome);
	
	List<Aluno> findAlunosByIdSala(Integer id);
	
}
