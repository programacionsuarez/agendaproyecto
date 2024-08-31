package co.edu.uniquindio.poo;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    // Metodos principales
    // Metodo Constructor
    public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
        //Los set verifican que el usuario ingrese los datos que corresponden 
        setNombre(nombre);
        setAlias(alias);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
    }

    // Metodos get, set, toString
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank() && nombre.matches("[a-zA-Z\\s]+")) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre solo puede contener letras y espacios.");
        }
        
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null && !alias.isBlank() && alias.matches("[a-zA-Z0-9]+")) {
            this.alias = alias;
        } else {
            throw new IllegalArgumentException("El alias solo puede contener letras y números.");
        }
        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
          assert direccion != null && !direccion.isBlank(): "La dirección no puede ser nula o vacia";
          this.direccion = direccion;
        
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.isBlank() && telefono.matches("[0-9]+")) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El teléfono solo puede contener números.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        assert email != null && !email.isBlank(): "El email no puede ser nulo o vacio";
        this.email = email;
        
    }

    @Override
    public String toString() {
        return "Contacto: nombre" + nombre + ", alias " + alias + ", direccion " + direccion + ", telefono " + telefono
                + ", email " + email + ".";
    }

}