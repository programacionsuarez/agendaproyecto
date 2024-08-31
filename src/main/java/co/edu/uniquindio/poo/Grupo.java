package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo{
    private String nombre;
    private Enum<Categoria> categoria;
    private Collection<Contacto> contactos;

    public Grupo(String nombre, Enum<Categoria> categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        contactos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(Enum<Categoria> categoria) {
        this.categoria = categoria;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    
    
    
}