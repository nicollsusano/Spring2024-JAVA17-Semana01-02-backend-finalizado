package com.empresa.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "modalidad")
public class Modalidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idModalidad;	
	
	public String nombre;
	public int numHombres;
	public int numMujeres;
	public int edadMaxima;
	public int edadMinima;
	public String sede;
	
	@ManyToOne
	@JoinColumn(name= "idDeporte")
	public Deporte deporte;
	
	private int estado;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima")
	private Date fechaRegistro;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima")
	private Date fechaActualizacion;
	

}
