<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Altas</h2>
        <form action="AltasLibrosServlet" method ="post">
          <p>
          <label for = "txtNombreLibro">Nombre del libro </label>
          <input type = "text" id="txtNombreLibro" name="txtNombreLibro">
          </p>
          <p>
          <label for = "txtAutor">Autor del libro </label>
          <input type = "text" id="txtAutor" name="txtAutor">
          </p>
          <p>
          <label for = "txtISBN">ISBN del libro </label>
          <input type = "text" id="txtISBN" name="txtISBN">
          </p>
          <p>
          
          <p>
          <input type = "submit" value ="Alta de Libro">
          </p>
        </form>
</body>
</html>