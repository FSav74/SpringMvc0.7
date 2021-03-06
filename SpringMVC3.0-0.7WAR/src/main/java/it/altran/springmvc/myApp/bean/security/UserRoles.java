package it.altran.springmvc.myApp.bean.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;



@Entity
@Table(name = "user_roles")
public class UserRoles implements GrantedAuthority{
	
	
	@Id
	@Column(name="USER_ROLE_ID")
	private int enabled;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="ROLE")
	private String role;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "USERNAME", referencedColumnName ="USERNAME",unique=true,insertable=false,updatable=false)
	})
	private User user;

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}


	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	
	

}
