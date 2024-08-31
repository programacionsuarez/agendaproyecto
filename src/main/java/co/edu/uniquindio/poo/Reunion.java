package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.LinkedList;

public class Reunion{
    private String descripción;
    private LocalDate fecha;
    private LocalTime hora;
    private Collection<Contacto> contactos;

    public Reunion(String descripción, LocalDate fecha, LocalTime hora) {
        this.descripción = descripción;
        this.fecha = fecha;
        this.hora = hora;
        contactos = new LinkedList<>();
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }
    
    

}