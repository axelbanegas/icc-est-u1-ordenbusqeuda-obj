package models;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    public int getCodigoDireccion() {
        return direccion.getCodigo();
    }

    public boolean compareCodigoDireccion(Persona persona) {
        //boolean condicion = direccion.getCode() > persona.getCodigoDireccion();
        return getCodigoDireccion() > persona.getCodigoDireccion();
    }

    public boolean equalsByCodigoDireccion(int codigo) {
        return getCodigoDireccion() == codigo;
    }

    public boolean equalsByCodigoDireccion2(int codigo) {
        return getCodigoDireccion() < codigo;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion=" + direccion +
                '}';
    }
}

