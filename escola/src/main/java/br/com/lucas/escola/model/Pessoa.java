package br.com.lucas.escola.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable{

	private static final long serialVersionUID = -7029900198268704996L;
	
	@Id
	@GeneratedValue
	private Integer idPessoa;
	private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private String nomepai;
    private String nomemae;
    private String estadocivil;
    private Date dtnasc;
    private String nacionalidade;
    private String naturalidade;
    private String telefone;
    private String email;
    private String grauesc;
    private String tipoLogradouro;
    private String logradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;	
	
}
