<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/Proyecto-Final-Java/css/modificarPersonas.css">
        <title>Modificar Persona</title>
    </head>
    <body>
        <h1 id="titulo">Modificar Persona</h1>
        <div class="contenedor-formulario">
            <form name="form1" action="${pageContext.request.contextPath}/ServletModificar" method="post">
                <input type="hidden" name="idPersona" value="${persona.id_persona}"/>
                <div>
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" id="nombre" value="${persona.nombre}"/>
                </div>
                <div>
                    <label for="apellido">Apellido</label>
                    <input type="text" name="apellido" id="apellido" value="${persona.apellido}"/>
                </div>
                <div>
                    <label for="email">Email</label>
                    <input type="email" name="email" id="email" value="${persona.email}"/>
                </div>
                <div>
                    <label for="cantidad_personas">Cantidad Personas</label>
                    <input type="number" name="cantidad_personas" id="cantidad_personas" value="${persona.cantidad_personas}"/>
                </div>
                <input class="botoncito" type="submit" name="Modificar" value="Modificar"/>
                <input class="botoncito" type="submit" name="Eliminar" value="Eliminar"/>
            </form>
        </div>
    </body>
</html>