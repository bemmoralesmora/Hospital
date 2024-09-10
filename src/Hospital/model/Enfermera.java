package Hospital.model;

public class Enfermera {
    private String nombre;
    private String especialidad;
    private int edad;
    private String correo;
    private String contraseña;
    private int noLicencia;

    public Enfermera(String nombre, String especialidad, int edad, String correo, String contraseña, int noLicencia) {
        this.nombre = nombre;
        this.especialidad= especialidad;
        this.edad = edad;
        this.correo= correo;
        this.contraseña = contraseña;
        this.noLicencia=noLicencia;
    }

    // METODO GET

    public String getNombre() {
        return this.nombre;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getNoLicencia() {
        return noLicencia;
    }

    // METODO SET

    public void setNombre(String    nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNoLicencia(int noLicencia) {
        this.noLicencia = noLicencia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + "|" + ", Especialidad=" + especialidad + "|" + ", edad=" + edad + "}";
    }
}
