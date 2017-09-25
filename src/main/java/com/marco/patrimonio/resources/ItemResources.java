package com.marco.patrimonio.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marco.patrimonio.ItemRepository;
import com.marco.patrimonio.model.Item;

@RestController
//@CrossOrigin("${origem-permitida}")
public class ItemResources {
	
	@Autowired
	private ItemRepository itemRepository;

	@GetMapping("/itens")
	public List<Item> listar(){
		return itemRepository.findAll();
	}
	
	@PostMapping("/itens")
	public Item adcionar(@RequestBody @Valid Item item){
		return itemRepository.save(item);
	}
	
}
