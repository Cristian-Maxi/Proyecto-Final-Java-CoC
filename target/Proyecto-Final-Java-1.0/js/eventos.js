// Variable para almacenar el id del contenedor que se ha clicado
var clicked = null;

// Función para mostrar el párrafo y ocultar los otros contenedores cuando se hace clic en la imagen de un contenedor
$(".container img").click(function(event) {
  event.stopPropagation();
  var id = $(this).parent().attr("id"); // Obtiene el id del contenedor que se ha clicado
  if (clicked !== id) {
    $(".container > *").css("display", "none"); // Oculta todos los elementos de todos los contenedores
    $(this).siblings().css("display", "block"); // Muestra el párrafo del contenedor que se ha clicado
    $(".container").not("#" + id).css("display", "none"); // Oculta los otros contenedores
    clicked = id; // Guarda el id del contenedor que se ha clicado
  } else {
    $(".container > *").css("display", "none"); // Oculta todos los elementos de todos los contenedores
    $(".container").css("display", "block"); // Muestra todos los contenedores
    clicked = null; // Restablece la variable
  }
});

// Función para ocultar los párrafos y mostrar todos los contenedores cuando se hace clic en cualquier parte de la página
$(document).click(function() {
  $(".container > *").css("display", "none"); // Oculta todos los elementos de todos los contenedores
  $(".container").css("display", "block"); // Muestra todos los contenedores
  clicked = null; // Restablece la variable
});
