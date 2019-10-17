package co.edu.unilibre.service;

import java.util.List;

import co.edu.unilibre.dto.App;

public interface Service {
	public List<App> getAll();
	public App findById(Long id, Integer quantity);
}
