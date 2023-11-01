package com.cibertec.edu.pe.models;

import java.io.Serializable;

import jakarta.persistence.*;

public class Examen implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Examen_id")
	Long id;
	
	int curso;//Relacionar con curso
	int seccion; //Relacionar con seccion
	int usuario; //Relacionar con usuario
	@Column(name="FechInic")
	String fechaIn;
	
	@Column(name="FechFin")
	String fechaFin;
	
	String notaEx;
	String tiempoEx;
}
