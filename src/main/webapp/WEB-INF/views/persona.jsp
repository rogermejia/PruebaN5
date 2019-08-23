<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Ingreo de datos</h3>

<form method="post" action="addDato">
<table>

<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"/></td>
</tr>

<tr>
<td>Apellido</td>
<td><input type="text" name="apellido"/></td>
</tr>

<tr>
<td>Fecha de Nacimiento</td>
<td><input type="text" name="nacimiento" placeholder="yyyy-MM-dd"/></td>
</tr>

<tr>
<td>Genero</td>
<td><input type="text" name="idGenero"/></td> 
</tr>


<tr>
<td>Correo</td>
<td><input type="text" name="correo"/></td>
</tr>


</table>
<input type="submit" name="b" value="Guardar"/>
</form>
<br></br>

<h3>Datos guardados</h3>
<form method="get" action="show">
	<table border=1 cellspacing=0 cellpadding=4 >
		<tr>
<!-- 			<th>Id</th> -->
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Fecha de Nacimiento</th>
			<th>Genero</th>
			<th>Correo</th>
		</tr>

		<c:forEach var="d" items="${datos}">
			<tr>
<%-- 				<td>${d.idPersona}</td> --%>
				<td>${d.nombre}</td>
				<td>${d.apellido}</td>
				<td>${d.nacimiento}</td>
				<td>${d.id_genero.genero}</td>
				<td>${d.correo}</td>
			</tr>
		</c:forEach>

	</table>
	</form>

</body>

</html>
