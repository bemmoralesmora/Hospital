package Hospital.model;

public class Pacientes {

        private String nombre;
        private int identificacion;
        private String fechaNacimiento;
        private int edad;
        private String genero;
        private String direccion;
        private int numeroContacto;
        private String correo;
        private String historialMedico;
        private String grupoSanguineo;
        private String nombreContactoEmergencia;
        private int numeroContactoEmergencia;
        private String seguroMedico;

        public Pacientes(String nombre, int identificacion, String fechaNacimiento, int edad, String genero, String direccion, int numeroContacto, String correo, String historialMedico, String grupoSanguineo, String nombreContactoEmergencia, int numeroContactoEmergencia, String seguroMedico) {
            this.nombre = nombre;
            this.identificacion = identificacion;
            this.fechaNacimiento = fechaNacimiento;
            this.edad = edad;
            this.genero = genero;
            this.direccion = direccion;
            this.numeroContacto = numeroContacto;
            this.correo = correo;
            this.historialMedico = historialMedico;
            this.grupoSanguineo = grupoSanguineo;
            this.nombreContactoEmergencia = nombreContactoEmergencia;
            this.numeroContactoEmergencia = numeroContactoEmergencia;
            this.seguroMedico = seguroMedico;
        }

        // METODOS GET


    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public String getNombreContactoEmergencia() {
        return nombreContactoEmergencia;
    }

    public int getNumeroContactoEmergencia() {
        return numeroContactoEmergencia;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    // METODOS DET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public void setNombreContactoEmergencia(String nombreContactoEmergencia) {
        this.nombreContactoEmergencia = nombreContactoEmergencia;
    }

    public void setNumeroContactoEmergencia(int numeroContactoEmergencia) {
        this.numeroContactoEmergencia = numeroContactoEmergencia;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }
}

