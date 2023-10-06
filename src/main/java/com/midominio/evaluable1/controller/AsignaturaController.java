package com.midominio.evaluable1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.evaluable1.model.Asignatura;

@Controller
@RequestMapping("/asignatura/listado")
public class AsignaturaController {
	
	@ModelAttribute("titulo")
	public String titulo() {
		return "Listado de asignaturas";
	}
	
	@GetMapping("/con")
	public String listadoConAlumnos(@RequestParam(required = false) String tipo,
			Model m) {
		List<Asignatura> listaFiltrada = new ArrayList<>();
		
		if (tipo == null) {
			listaFiltrada = Asignatura.dameListaAsignaturas();
		} else {
			for (int i = 0; i < Asignatura.asignaturaPorTipo(tipo).size(); i++) {
				listaFiltrada.add(Asignatura.asignaturaPorTipo(tipo).get(i));
			}
		}
		
		m.addAttribute("listaAsignaturas", listaFiltrada);
		return "asignatura/listado-con";
	}
	
	@GetMapping("/sin")
	public String listadoSinAlumnos(@RequestParam(required = false) String tipo,
			Model m) {
		List<Asignatura> listaFiltrada = new ArrayList<>();
		
		if (tipo == null) {
			listaFiltrada = Asignatura.dameListaAsignaturas();
		} else {
			for (int i = 0; i < Asignatura.asignaturaPorTipo(tipo).size(); i++) {
				listaFiltrada.add(Asignatura.asignaturaPorTipo(tipo).get(i));
			}
		}
		
		m.addAttribute("listaAsignaturas", listaFiltrada);
		return "asignatura/listado-sin";
	}
}
