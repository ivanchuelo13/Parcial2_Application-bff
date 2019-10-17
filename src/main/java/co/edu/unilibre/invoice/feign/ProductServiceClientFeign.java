package co.edu.unilibre.invoice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.invoice.model.Product;

@FeignClient(name = "product-service", url = "localhost:10010")
public interface ProductServiceClientFeign {
	
	@GetMapping("/list")
	public List<contry-api> getList();
	
	@GetMapping("/{id}")
	public contry-api getById(@PathVariable Long id);
	
	@GetMapping("/list")
	public List<user-api> getList();
	
	@GetMapping("/{id}")
	public user-api getById(@PathVariable Long id);
}
