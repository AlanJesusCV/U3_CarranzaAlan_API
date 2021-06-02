package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PersonaEntity;
import com.example.service.PersonaService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@RequestMapping("/resto")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT},allowedHeaders = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/persona/getAll")
	public List<PersonaEntity> getAll() {
		return personaService.getUsers();
	}
	
	@GetMapping("/persona/getOne/{id}")
	public PersonaEntity getOne(@PathVariable("id") int idpersona) {
		return personaService.getUser(idpersona);
	}
	
	@PostMapping("persona/save")
	public boolean save(@RequestBody PersonaEntity persona) {
		System.out.println("entra");
		return personaService.save(persona);
	}
	
	@PutMapping("/persona/update")
    public boolean update(@RequestBody PersonaEntity person){
        return personaService.save(person);
    }
	@DeleteMapping("persona/delete/{idpersona}")
	public boolean delete(@PathVariable("idpersona") int idpersona) {
		return personaService.delete(idpersona);
	}
	
	
}
