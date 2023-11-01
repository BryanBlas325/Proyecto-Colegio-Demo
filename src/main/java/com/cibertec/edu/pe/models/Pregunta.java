package com.cibertec.edu.pe.models;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Pregunta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Pregunta_id")
	Long id;
	String descripcion;
	double puntaje;
	String orden;
	
	@Column(name="RespuProf")
	String respProfe;
	
	@Column(name="RespuEstu")
	String resEstu;
	
	String validacion;
}
