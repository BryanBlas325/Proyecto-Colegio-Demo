package com.cibertec.edu.pe.models;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Usuario_id")
	Long id;
	
	@Column(name="Usuario_nombre")
	String nombre;
	
	@Column(name="Usuario_nombre2")
	String nombre2;
	
	@Column(name="fec_nac")
	String fecha;
	
}
