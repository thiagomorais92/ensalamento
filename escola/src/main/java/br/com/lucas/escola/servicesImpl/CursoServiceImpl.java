package br.com.lucas.escola.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucas.escola.model.Curso;
import br.com.lucas.escola.model.Funcionario;
import br.com.lucas.escola.persistencia.CursoDaoImpl;
import br.com.lucas.escola.persistencia.FuncionarioDaoImpl;
import br.com.lucas.escola.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	CursoDaoImpl dao;
	
	public void persist(Curso t) {
		dao.persist(t);
	}

	public void merge(Curso t) {
		dao.merge(t);
	}

	public void delete(Curso t) {
		dao.delete(t);
	}

	public List<Curso> getAll() {
		return dao.getAll();
	}

	public Curso getPorId(Integer id) {
		return dao.getPorId(id);
	}

}
