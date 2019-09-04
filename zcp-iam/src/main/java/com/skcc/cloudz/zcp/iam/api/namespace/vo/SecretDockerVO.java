package com.skcc.cloudz.zcp.iam.api.namespace.vo;

import javax.validation.constraints.NotNull;

public class SecretDockerVO implements SecretVO {
	@NotNull
	private String name;

	private String type = "kubernetes.io/dockerconfigjson";
	
	private String description;

	@NotNull
	private String server;
	@NotNull
	private String username;
	@NotNull
	private String email;
	@NotNull
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
