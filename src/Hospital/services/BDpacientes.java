package Hospital.services;

import Hospital.model.Pacientes;

import java.util.ArrayList;

public class BDpacientes {

    public static ArrayList<Pacientes> listapacientes() {
        ArrayList<Pacientes> pacientes = new ArrayList<>();
        pacientes.add(new Pacientes("Juan Pérez", "juan.perez@gmail.com", 55512345, "Calle Falsa 123, Ciudad", "15/03/1985", 39, 10, "Chequeo General", 101, "Dr. Rodríguez"));
        pacientes.add(new Pacientes("María López", "maria.lopez@gmail.com", 55567890, "Avenida Siempre Viva 456, Ciudad", "22/07/1990", 34, 11, "Consulta por Dolor", 102, "Dr. Gómez"));
        pacientes.add(new Pacientes("Carlos García", "carlos.garcia@gmail.com", 55523456, "Calle Luna 789, Ciudad", "10/11/1978", 45, 12, "Chequeo General", 103, "Dr. Martínez"));
        pacientes.add(new Pacientes("Ana Torres", "ana.torres@gmail.com", 55598765, "Boulevard del Sol 101, Ciudad", "05/02/1989", 35, 9, "Consulta por Dolor", 104, "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Luis Morales", "luis.morales@gmail.com", 55554321, "Plaza Mayor 205, Ciudad", "15/05/1980", 44, 13, "Consulta por Resultados", 105, "Dr. Gómez"));
        pacientes.add(new Pacientes("Laura Díaz", "laura.diaz@gmail.com", 55511122, "Carrera Central 300, Ciudad", "29/09/1995", 29, 10, "Chequeo General", 106, "Dr. Martínez"));
        pacientes.add(new Pacientes("Jorge Ramírez", "jorge.ramirez@gmail.com", 55533221, "Pasaje Flor 401, Ciudad", "18/12/1982", 41, 11, "Consulta por Dolor", 107, "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Sofía Castillo", "sofia.castillo@gmail.com", 55544567, "Avenida del Mar 567, Ciudad", "12/01/1994", 30, 12, "Chequeo General", 108, "Dr. Gómez"));
        pacientes.add(new Pacientes("Pedro Vargas", "pedro.vargas@gmail.com", 55587654, "Callejón del Sol 678, Ciudad", "07/08/1977", 47, 13, "Consulta por Resultados", 109, "Dr. Martínez"));
        pacientes.add(new Pacientes("Carmen Reyes", "carmen.reyes@gmail.com", 55599988, "Calle Rosa 789, Ciudad", "26/03/1986", 38, 9, "Chequeo General", 110, "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Ricardo Guzmán", "ricardo.guzman@gmail.com", 55545454, "Pasaje del Norte 800, Ciudad", "14/04/1988", 36, 10, "Consulta por Dolor", 111, "Dr. Gómez"));
        pacientes.add(new Pacientes("Paola Mendoza", "paola.mendoza@gmail.com", 55532145, "Camino del Valle 901, Ciudad", "23/10/1991", 32, 11, "Chequeo General", 112, "Dr. Martínez"));
        pacientes.add(new Pacientes("Miguel Flores", "miguel.flores@gmail.com", 55567899, "Callejón del Águila 123, Ciudad", "11/07/1983", 41, 12, "Consulta por Resultados", 113, "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Fernanda Suárez", "fernanda.suarez@gmail.com", 55599900, "Avenida de las Flores 234, Ciudad", "17/09/1992", 31, 13, "Chequeo General", 114, "Dr. Gómez"));
        pacientes.add(new Pacientes("Daniel Ortiz", "daniel.ortiz@gmail.com", 55566778, "Boulevard Verde 345, Ciudad", "02/06/1979", 45, 9, "Consulta por Dolor", 115, "Dr. Martínez"));
        pacientes.add(new Pacientes("Valeria Herrera", "valeria.herrera@gmail.com", 55512321, "Plaza del Norte 456, Ciudad", "28/02/1987", 37, 10, "Consulta por Resultados", 116, "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Francisco Soto", "francisco.soto@gmail.com", 55544433, "Pasaje del Río 567, Ciudad", "04/12/1981", 42, 11, "Chequeo General", 117, "Dr. Gómez"));
        pacientes.add(new Pacientes("Lorena Vega", "lorena.vega@gmail.com", 55598777, "Calle del Sol 678, Ciudad", "20/05/1990", 34, 12, "Consulta por Dolor", 118, "Dr. Martínez"));
        pacientes.add(new Pacientes("Tomás Rivas", "tomas.rivas@gmail.com", 55522233, "Callejón del Lago 789, Ciudad", "09/11/1984", 39, 13, "Consulta por Resultados", 119, "Dr. Rodríguez"));
        pacientes.add(new Pacientes("Gloria Peña", "gloria.pena@gmail.com", 55555566, "Avenida del Parque 101, Ciudad", "16/01/1993", 31, 9, "Chequeo General", 120, "Dr. Gómez"));

        return pacientes;
    }
}
