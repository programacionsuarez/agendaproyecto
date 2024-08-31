package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {
    private String nombre;
    private Enum<Categoria> categoria;
    private Collection<Contacto> contactos;

    // Metodos Principales
    // Constructor
    public Grupo(String nombre, Enum<Categoria> categoria) {
        //set para verificar que el usuario introduzca los datos correspodientes
        setNombre(nombre);
        this.categoria = categoria;
        contactos = new LinkedList<>();
    }

    // Metodo para motrar la lista de contactos de grupo
    public static void mostrarListaGrupo(Grupo grupo) {
        System.out.println(grupo);
        for (Contacto i : grupo.getContactos()) {
            System.out.println(i);

        }
    }
    //Metodos set, get y toString
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        assert nombre != null && !nombre.isBlank(): "El nombre no puede ser nulo o vacio";
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

    @Override
    public String toString() {
        return "Grupo: " + nombre + ", categoria " + categoria + ".";
    }

}