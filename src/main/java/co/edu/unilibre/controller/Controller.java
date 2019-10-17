package co.edu.unilibre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.parcial.controller;
import com.parcial.service.*;

@RestController
public class Controller {
	
	@Autowired(required = true)
	@Qualifier("itemServiceFeign")
	private IItemService itemService;
	
	@GetMapping("/list")
	public List<Item> getAll(){
		return itemService.getAll();
	}
	
	@GetMapping("/{id}/{quantity}")
	public Item getById(@PathVariable Long id, @PathVariable Integer quantity) {
		return itemService.findById(id, quantity);
	}
}
