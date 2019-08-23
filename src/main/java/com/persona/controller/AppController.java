package com.persona.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.persona.dao.PersonaDao;

import Entidades.Datos;
import Entidades.Genero;

@Controller
@RequestMapping("/")
public class AppController {
	PersonaDao perDao = new PersonaDao();
	List<Datos> listDatos = new ArrayList<>();
	List<Genero> listGenero = new ArrayList<>();

	@RequestMapping(method = RequestMethod.GET)
	public String datos(Model model) {
//    	  Datos d = new Datos();   //Desde aquí 
//    	  d.setNombre("Nombre");
//	      d.setApellido("apellido");
//	      d.setCorreo("asda@yahoo.com");
//	      d.setIdGenero(2);
//	      d.setNacimiento("1990-01-01");
//    	  perDao.guardarDato(d);  //Hasta aquí es para probar el metodo de guardar y sí guarda
		listDatos = perDao.getAllDatos();
		model.addAttribute("datos", listDatos);

		return "persona";
	}

	@RequestMapping(value="/addDato",method = RequestMethod.POST)    
    public String save(@ModelAttribute("datos") Datos datos, Model model){    
		perDao.guardarDato(datos);
		System.out.println("Non sonno nemenno arrivato qui");
		listDatos = perDao.getAllDatos();
		model.addAttribute("datos", listDatos);
        return "redirect:/";
	}
}
