package com.example.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PersonaEntity;
import com.example.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	public boolean save(PersonaEntity persona) {
		try {
			persona.setFecha_registro(new Date());
			return personaRepository.existsById(personaRepository.save(persona).getIdpersona());
		} catch (Error err) {
			System.out.println(err);
			return false;
		}

	}

	public boolean delete(int idpersona) {

		try {
			personaRepository.deleteById(idpersona);
			return true;
		} catch (Exception ex) {
			System.out.println(ex);
			return false;

		}
	}
	
	public PersonaEntity getUser(int idpersona) {
			return personaRepository.getById(idpersona);
	}
	
	
	public List<PersonaEntity> getUsers(){
		return personaRepository.findAll();
	}

}
