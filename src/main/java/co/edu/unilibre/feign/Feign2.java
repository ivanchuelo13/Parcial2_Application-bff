package co.edu.unilibre.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.dto.*;

@FeignClient(name = "country", url = "localhost:10020")
public interface Feign2 {
	
	@GetMapping("/list")
	public List<Country> getList();
	
	@GetMapping("/{id}")
	public Country getById(@PathVariable Long id);
}
