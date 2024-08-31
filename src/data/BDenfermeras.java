package data;

import personaMedico.Enfermera;

import java.util.ArrayList;

public class BDenfermeras {
    public  static ArrayList listaEnfermeras (){
        ArrayList<Enfermera> enfermeras = new ArrayList<>();
        enfermeras.add(new Enfermera("Carla Fernández", "Enfermera", 38, "carla.fernandez@example.com", "securepass", 345678986));
        return enfermeras;
    }
}
