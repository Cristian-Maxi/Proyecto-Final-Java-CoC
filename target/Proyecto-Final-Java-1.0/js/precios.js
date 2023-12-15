function BotonCalular() {
    let cantidad_personas = document.getElementById("Cantidad").value;
    let numero_personas = document.getElementById("numero").value;
    let nombre = document.getElementById("Nombre").value;
    let apellido = document.getElementById("Apellido").value;
    let email = document.getElementById("Email").value;

    if(nombre == "") {
        alert("Debe ingresar un nombre")
    } else if (apellido == "") {
        alert("Debe ingresar un apellido")
    } else if (email == "") {
        alert("Debe ingresar un email")
    } else {

        let precio = 5000;

        if (cantidad_personas == 1 && numero_personas == 1) {
            document.getElementById("precio-final").innerHTML = `$${precio} Total`
    
        } else if (cantidad_personas == 2 && numero_personas == 2){
            precio *= cantidad_personas;
            let descuento = (precio * 10) / 100;
            let resultado = precio - descuento;
            document.getElementById("precio-final").innerHTML = `$${resultado} Total`
    
        } else if (cantidad_personas == 3 && numero_personas == 3){
            precio *= cantidad_personas;
            let descuento = (precio * 20) / 100;
            let resultado = precio - descuento;
            document.getElementById("precio-final").innerHTML = `$${resultado} Total`
    
        } else if (cantidad_personas >= 4 && numero_personas == 4){
            precio *= cantidad_personas;
            let descuento = (precio * 30) / 100;
            let resultado = precio - descuento;
            document.getElementById("precio-final").innerHTML = `$${resultado} Total`
    
        } else {
            alert("Cantidad de personas y Número de personas no coinciden")
        }
    
        document.getElementById("Cantidad").value = "";
    }
}