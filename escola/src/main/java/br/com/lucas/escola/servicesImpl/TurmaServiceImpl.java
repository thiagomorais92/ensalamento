package br.com.lucas.escola.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucas.escola.model.Turma;
import br.com.lucas.escola.persistencia.TurmaDaoImpl;
import br.com.lucas.escola.services.TurmaService;

@Service
public class TurmaServiceImpl implements TurmaService {

	@Autowired
	TurmaDaoImpl dao;
	
	public void persist(Turma t) {
		dao.persist(t);
	}

	public void merge(Turma t) {
		dao.merge(t);
	}

	public void delete(Turma t) {
		dao.delete(t);
	}

	public List<Turma> getAll() {
		return dao.getAll();
	}

	public Turma getPorId(Integer id) {
		return dao.getPorId(id);
	}

}
