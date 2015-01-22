package br.com.lucas.escola.dao;

import java.util.List;

import br.com.lucas.escola.model.Aluno;
import br.com.lucas.escola.model.Turma;

public interface SalaDao {

	void salvar(Turma sala);
	
	List<Turma> getAll();
	
	public Turma findSalaById(Integer id);
}
