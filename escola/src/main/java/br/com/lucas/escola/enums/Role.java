package br.com.lucas.escola.enums;

import java.util.EnumSet;

/**
 * 
 * @author Lucas Moreira
 *
 */

public enum Role {
	
	ROLE_ADMIN("1", "ADMINISTRADOR"),
	ROLE_USER("2", "USUARIO");
	
	private Role (String id, String role) {
		this.id = id;
		this.role = role;
	}
	
	private String id;
	private String role;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	EnumSet<Role> getRoles() {
		return EnumSet.of(ROLE_ADMIN, ROLE_USER);
	}
}
