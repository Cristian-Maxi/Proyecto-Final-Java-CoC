<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/Proyecto-Final-Java/css/listarPersonas.css">
        <title>Listado de Personas</title>
    </head>
    <body>
        <h2>Lista de Personas</h2>
        <br/>
        <table border="1">
            <tr>
                <th>Persona ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Cantidad Personas</th>
                <th>Modificar</th>
            </tr>
            <c:forEach var="persona" items="${personas}">
                <tr>

                    <td>${persona.id_persona}</td>
                    <td>${persona.nombre}</td>
                    <td>${persona.apellido}</td>
                    <td>${persona.email}</td>
                    <td>${persona.cantidad_personas}</td>
                    <td>
                        <a class="boton-editar" href="${pageContext.request.contextPath}/ServletModificar?idPersona=${persona.id_persona}">
                            Editar
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <!-- <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a> -->
        <a id="regreso" href="/Proyecto-Final-Java/">Regresar</a>
    </body>
</html>
