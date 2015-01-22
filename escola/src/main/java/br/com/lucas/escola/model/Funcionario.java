package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 5263373649614510147L;
	
    private String cargo;
    private String funcao; //TODO normalizar e deixar apenas o cargo
    private String pis;
    private Date dataadmin;
    private Date datademis;

}
