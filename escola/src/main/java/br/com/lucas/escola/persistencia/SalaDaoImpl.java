package br.com.lucas.escola.persistencia;


//@Repository
//public class SalaDaoImpl implements SalaDao {
//	
//	@PersistenceContext
//	private EntityManager manager;
//
//	@SuppressWarnings("unchecked")
//	public List<Turma> getAll() {
//		return (List<Turma>) manager.createQuery("select s from Sala s")
//				.getResultList();
//	}
//
//	public void salvar(Turma sala) {
//		manager.persist(sala);
//	}
//	
//	public Turma findSalaById(Integer id){
//		return manager.find(Turma.class, id);
//	}
//
//}
