$(document).ready(function() {
  // Variable para almacenar el id del contenedor que se ha clicado
  var clicked = null;

  // Función para mostrar el párrafo y ocultar los otros contenedores cuando se hace clic en la imagen de un contenedor
  $(".monumento img").click(function(event) {
    event.stopPropagation();
    var id = $(this).parent().attr("id"); // Obtiene el id del contenedor que se ha clicado
    if (clicked !== id) {
      $(".monumento").fadeOut(500); // Oculta todos los contenedores con un efecto de desvanecimiento
      $("#" + id).fadeIn(500); // Muestra el contenedor que se ha clicado con un efecto de aparición gradual
      $("#" + id + " img").show(); // Muestra la imagen del contenedor que se ha clicado
      $("#" + id + " p").show(); // Muestra el párrafo del contenedor que se ha clicado instantáneamente
      clicked = id; // Guarda el id del contenedor que se ha clicado
      if (window.matchMedia("(max-width: 420px)").matches) {
        $("#monumentos").css("margin-bottom", "10px"); // Reduce el margin-bottom del elemento h2 con id "monumentos" a 0
      }
    } else {
      $(".monumento").fadeIn(500); // Muestra todos los contenedores con un efecto de aparición gradual
      $(".monumento p").hide(); // Oculta todos los párrafos instantáneamente
      clicked = null; // Restablece la variable
      if (window.matchMedia("(max-width: 420px)").matches) {
        $("#monumentos").css("margin-bottom", "250px"); // Reestablece el margin-bottom del elemento h2 con id "monumentos" a 250px
      }
    }
  });

  // Función para ocultar los párrafos y mostrar todos los contenedores cuando se hace clic en cualquier parte de la página
  $(document).click(function() {
    if (clicked !== null) { // Solo se ejecuta si previamente se ha hecho clic en una imagen
      $(".monumento").fadeIn(500); // Muestra todos los contenedores con un efecto de aparición gradual
      $(".monumento p").hide(); // Oculta todos los párrafos instantáneamente
      clicked = null; // Restablece la variable
      if (window.matchMedia("(max-width: 420px)").matches) {
        $("#monumentos").css("margin-bottom", "250px"); // Reestablece el margin-bottom del elemento h2 con id "monumentos" a 250px
      }
	  else {
		  $("#monumentos").css("margin-bottom", "10px");
	  }
    }
  });
});
