package model;
public abstract class Estudiante {
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected int serial;

    // Constructor
    public Estudiante(String cedula, String nombre, String apellido, String telefono, int serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.serial = serial;
    }

    // Getters
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getSerial() {
        return serial;
    }

    // Setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }

    // toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", serial=" + serial +
                '}';
    }
}