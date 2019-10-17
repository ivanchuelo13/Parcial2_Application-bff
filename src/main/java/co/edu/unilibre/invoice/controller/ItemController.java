package co.edu.unilibre.invoice.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import co.edu.unilibre.invoice.service.IItemService;

@RestController
public class ItemController {
	
	@Autowired(required = true)
	@Qualifier("itemServiceFeign")
	private IItemService itemService;
	
	
}
