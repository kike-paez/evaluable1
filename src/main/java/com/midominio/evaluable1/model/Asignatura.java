package com.midominio.evaluable1.model;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	
	// Propiedades
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numeroCreditos;
	private int numeroAlumnosMatriculados;
	
	
	// Constructor
	public Asignatura(int id, String nombre, String tipo,
			int numeroCreditos) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = "Asignatura de " + tipo;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.numeroAlumnosMatriculados = 0;
	}
	
	// Getters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumeroCreditos() {
		return numeroCreditos;
	}

	public int getNumeroAlumnosMatriculados() {
		return numeroAlumnosMatriculados;
	}
	
	// Método para devolver la lista completa de asignaturas
	public static List<Asignatura> dameListaAsignaturas() {
		List<Asignatura> listaAsignaturas = new ArrayList<>();

        listaAsignaturas.add(new Asignatura(1, "Matemáticas", "ciencias", 11));
        listaAsignaturas.add(new Asignatura(2, "Lengua Española", "letras", 6));
        listaAsignaturas.add(new Asignatura(3, "Historia", "sociales", 10));
        listaAsignaturas.add(new Asignatura(4, "Biología", "ciencias", 3));
        listaAsignaturas.add(new Asignatura(5, "Física", "ciencias", 9));
        listaAsignaturas.add(new Asignatura(6, "Química", "ciencias", 5));
        listaAsignaturas.add(new Asignatura(7, "Literatura", "letras", 4));
        listaAsignaturas.add(new Asignatura(8, "Educación Física", "mixto", 1));
        listaAsignaturas.add(new Asignatura(9, "Música", "artístico", 2));
        listaAsignaturas.add(new Asignatura(10, "Arte", "artístico", 9));
        listaAsignaturas.add(new Asignatura(11, "Geografía", "sociales", 4));
        listaAsignaturas.add(new Asignatura(12, "Inglés", "mixto", 12));
        listaAsignaturas.add(new Asignatura(13, "Filosofía", "letras", 3));
        listaAsignaturas.add(new Asignatura(14, "Economía", "mixto", 4));
        listaAsignaturas.add(new Asignatura(15, "Programación", "mixto", 5));
        listaAsignaturas.add(new Asignatura(16, "Dibujo Técnico", "artístico", 8));
        listaAsignaturas.add(new Asignatura(17, "Educación Cívica", "sociales", 3));
        listaAsignaturas.add(new Asignatura(18, "Religión", "mixto", 8));
        listaAsignaturas.add(new Asignatura(19, "Psicología", "ciencias", 5));
        listaAsignaturas.add(new Asignatura(20, "Otra Asignatura", "mixto", 4));
        
        return listaAsignaturas;
	}
	
	// Método para devolver una lista de asignaturas filtrada por tipo
		public static List<Asignatura> asignaturaPorTipo(String tipo) {
			List<Asignatura> listaAsignaturasFiltrada = new ArrayList<>();
			
			for (Asignatura a: Asignatura.dameListaAsignaturas()) {
				if (tipo.equals(a.getTipo())) {
					listaAsignaturasFiltrada.add(a);
				};
			}
			return listaAsignaturasFiltrada;
		}
}
