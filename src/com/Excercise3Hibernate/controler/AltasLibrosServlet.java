package com.Excercise3Hibernate.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Excercise3Hibernate.model.Libro;

@WebServlet("/AltasLibrosServlet")
public class AltasLibrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //configuracion de hibernate
		
		
	   //creacion de objeto de la configuracion
		//y asociarlo al archivo de configuracion
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//creamos sesion Factory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//crear objeto session
		Session session = factory.openSession();
		
		//Iniciando transaction
		Transaction t = session.beginTransaction();
		
		
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
      
       
       
       session.persist(miObjetoLibro);
       System.out.println("objeto en persist");
       
       //ejecuta la transaccion
       t.commit();
       System.out.println("se hizo commit");
       
       //cerrar la session
       session.close();
       
       System.out.println("guardado exitosamente");
	}

}
