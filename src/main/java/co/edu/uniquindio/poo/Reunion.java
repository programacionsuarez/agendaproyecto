package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private Collection<Contacto> contactos;

    // Metodos principales
    // Constructor
    public Reunion(String descripcion, LocalDate fecha, LocalTime hora) {
        //set para verificar que el usuario introduzca los datos correspodientes
        setDescripcion(descripcion);;
        setFecha(fecha);
        setHora(hora);
        contactos = new LinkedList<>();
    }
     //Metodo para motrar la lista de contactos de reunion
     public static void mostrarListaReunion(Reunion reunion){
        System.out.println(reunion);
        for (Contacto i : reunion.getContactos()) {
            System.out.println(i);
            
        }
    }

    // Metodos get, set, toString
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        assert descripcion != null && !descripcion.isBlank(): "La descripción no puede ser nula o vacio";
        this.descripcion = descripcion;
        
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        assert fecha != null: "La fecha no puede ser nula";
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        assert hora != null: "La hora no puede ser nula";
        this.hora = hora;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;

    }

    @Override
    public String toString() {
        return "Reunion: " + descripcion + ", fecha " + fecha + ", hora " + hora + ".";
    }

}