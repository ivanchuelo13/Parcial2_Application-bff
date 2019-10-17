package co.edu.unilibre.dto;

import java.util.Date;

public class User {
	private Long id;
	private String name;
	private String country_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountryId( ) {
		return country_id;
	}
	
	public void setCountryId(String country_id) {
		this.country_id = country_id;
	}
}
