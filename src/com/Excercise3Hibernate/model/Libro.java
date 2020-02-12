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
  @Column(name="id_Libro")
  private int idLibro;
  
  @Column(name="nombre_Libro")
  private String nombreLibro;
  
  @Column(name ="autor_Libro")
  private String autorLibro;
  
  @Column(name = "ISBN")
  private String IsbnLibro;
  
  
  
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

public String getAutorLibro() {
	return autorLibro;
}

public void setAutorLibro(String autorLibro) {
	this.autorLibro = autorLibro;
}

public String getIsbnLibro() {
	return IsbnLibro;
}

public void setIsbnLibro(String isbnLibro) {
	IsbnLibro = isbnLibro;
}
  
  
}
