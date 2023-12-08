package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer id_persona;
    private String nombre;
    private String apellido;
    private String email;
    private String cantidad_personas;

    public Persona() {
    }

    public Persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public Persona(String nombre, String apellido, String email, String cantidad_personas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cantidad_personas = cantidad_personas;
    }

    public Persona(Integer id_persona, String nombre, String apellido, String email, String cantidad_personas) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cantidad_personas = cantidad_personas;
    }
  
    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCantidad_personas() {
        return cantidad_personas;
    }

    public void setCantidad_personas(String cantidad_personas) {
        this.cantidad_personas = cantidad_personas;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", cantidad_personas=" + cantidad_personas + '}';
    }

}
