package com.Excercise3Hibernate.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Excercise3Hibernate.model.Libro;

@WebServlet("/AltasLibrosServlet")
public class AltasLibrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //configuracion de hibernate
		
		
	   //creacion de objetos
		Libro miObjetoLibro = new Libro();
		
	   //cachar datos de jsp
	   String nombreLibro = request.getParameter("txtNombreLibro");
       String autorLibro = request.getParameter("txtAutor");
       String IsbnLibro = request.getParameter("txtISBN");
       
       //pueba de llegada de datos 
       System.out.println("Nombre del libro " + nombreLibro);
       System.out.println("Autor del libro " + autorLibro);
       System.out.println("ISBN del libro " + IsbnLibro);
       
       //lenar mi objeto con datos camputaros
       miObjetoLibro.setNombreLibro(nombreLibro);
       miObjetoLibro.setAutorLibro(autorLibro);
       miObjetoLibro.setIsbnLibro(IsbnLibro);
       
       response.getWriter().append("Nombre: " + miObjetoLibro.getNombreLibro() + " , Autor: " + miObjetoLibro.getAutorLibro() + ", ISBN: " + miObjetoLibro.getIsbnLibro());
      
	}

}
