package com.Excercise3Hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Libro")
public class Libro {
	
  @Id	
  @GeneratedValue
  @Column(name="idLibro")
  private int idLibro;
  
  @Column(name="nombreLibro")
  private String nombreLibro;
  
  
  
//agregar los demas atributos
  
  public int getIdLibro() {
	  return idLibro;
  }

  public void setIdLibro(int idLibro) {
	  this.idLibro = idLibro;
  }

public String getNombreLibro() {
	return nombreLibro;
}

public void setNombreLibro(String nombreLibro) {
	this.nombreLibro = nombreLibro;
}
  
  
}
