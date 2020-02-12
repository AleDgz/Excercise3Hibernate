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
          <label for = "txtNombreLibro">Nombre de libro </label>
          <input type = "text" id="txtNombreLibro" name="txtNombreLibro">
          </p>
          <p>
          <input type = "submit" value ="Alta de Libro">
          </p>
        </form>
</body>
</html>