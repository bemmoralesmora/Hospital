package Hospital.model;

public class Pacientes {

    private String nombre;
    private String correo;
    private int telefono;
    private String direccion;
    private String fechaNacimiento;
    private int edad;
    private int horarioCita;
    private String motivoCita;
    private int numeroConsulta;
    private String doctor;

    public Pacientes(String nombre, String correo, int telefono, String direccion, String fechaNacimiento, int edad, int horarioCita, String motivoCita, int numeroConsulta, String doctor) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.horarioCita = horarioCita;
        this.motivoCita = motivoCita;
        this.numeroConsulta = numeroConsulta;
        this.doctor = doctor;
    }

    // Métodos GET
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public int getHorarioCita() {
        return horarioCita;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public int getNumeroConsulta() {
        return numeroConsulta;
    }

    public String getDoctor() {
        return doctor;
    }

    // Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHorarioCita(int horarioCita) {
        this.horarioCita = horarioCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public void setNumeroConsulta(int numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", edad=" + edad +
                ", horarioCita=" + horarioCita +
                ", motivoCita='" + motivoCita + '\'' +
                ", numeroConsulta=" + numeroConsulta +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}
