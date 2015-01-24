package br.com.lucas.escola.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucas.escola.model.Funcionario;
import br.com.lucas.escola.persistencia.FuncionarioDaoImpl;
import br.com.lucas.escola.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDaoImpl dao;
	
	public void persist(Funcionario t) {
		dao.persist(t);
	}

	public void merge(Funcionario t) {
		dao.merge(t);
	}

	public void delete(Funcionario t) {
		dao.delete(t);
	}

	public List<Funcionario> getAll() {
		return dao.getAll();
	}

	public Funcionario getPorId(Integer id) {
		return dao.getPorId(id);
	}

}
