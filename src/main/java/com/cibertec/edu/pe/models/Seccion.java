package com.cibertec.edu.pe.models;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Seccion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Seccion_id")
	Long id;
	
	@Column(name="Seccion_nombre")
	String nombre;
}
