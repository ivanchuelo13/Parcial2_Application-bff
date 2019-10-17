package co.edu.unilibre.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.dto.*;

@FeignClient(name = "users", url = "localhost:10010")
public interface Feign {
	
	@GetMapping("/list")
	public List<User> getList();
	
	@GetMapping("/{id}")
	public User getById(@PathVariable Long id);
}
