package co.edu.unilibre.dto;

public class App {
	private User user;
	private Country country;
	
	public App(User user, Country country) {
		super();
		this.user = user;
		this.country = country;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	} 
}
