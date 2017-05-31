package org.young.model;

import javax.persistence.Column;
import java.io.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdminInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "admin_info", catalog = "nba_players")

public class AdminInfo implements Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4018222495959416422L;
	
	private Integer id;
	private String name;
	private String password;
	private String email;

	// Constructors

	/** default constructor */
	public AdminInfo() {
	}

	/** minimal constructor */
	public AdminInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}

	/** full constructor */
	public AdminInfo(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 32)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false, length = 64)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", length = 64)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}