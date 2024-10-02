package Hospital.services;

import Hospital.model.Medicamentos;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDfarmacia {

    public static ArrayList<Medicamentos> listaMedicamentos() {
        ArrayList<Medicamentos> medicamentos = new ArrayList<>();

        medicamentos.add(new Medicamentos("Paracetamol", "Tableta", "500mg", "Paracetamol",
                LocalDate.of(2025, 10, 5), "Lote12345", 10.50, "Alivio del dolor", "Hipersensibilidad al paracetamol"));
        medicamentos.add(new Medicamentos("Ibuprofeno", "Cápsula", "400mg", "Ibuprofeno",
                LocalDate.of(2026, 2, 20), "Lote67890", 15.00, "Antiinflamatorio", "Problemas gástricos"));
        medicamentos.add(new Medicamentos("Amoxicilina", "Tableta", "250mg", "Amoxicilina",
                LocalDate.of(2027, 4, 15), "Lote23456", 20.00, "Antibiótico", "Alergia a penicilinas"));
        medicamentos.add(new Medicamentos("Omeprazol", "Cápsula", "20mg", "Omeprazol",
                LocalDate.of(2026, 9, 25), "Lote78901", 12.00, "Protector gástrico", "Insuficiencia hepática grave"));
        medicamentos.add(new Medicamentos("Aspirina", "Tableta", "100mg", "Ácido acetilsalicílico",
                LocalDate.of(2025, 12, 30), "Lote34567", 5.00, "Antipirético y analgésico", "Úlceras gástricas"));
        medicamentos.add(new Medicamentos("Metformina", "Tableta", "850mg", "Metformina",
                LocalDate.of(2026, 7, 10), "Lote45678", 8.50, "Control de la diabetes", "Insuficiencia renal"));
        medicamentos.add(new Medicamentos("Losartán", "Tableta", "50mg", "Losartán",
                LocalDate.of(2025, 11, 15), "Lote56789", 9.00, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamentos("Simvastatina", "Tableta", "20mg", "Simvastatina",
                LocalDate.of(2027, 1, 18), "Lote67890", 13.00, "Colesterol alto", "Enfermedad hepática"));
        medicamentos.add(new Medicamentos("Clopidogrel", "Tableta", "75mg", "Clopidogrel",
                LocalDate.of(2026, 3, 22), "Lote78901", 16.50, "Prevención de infarto", "Trastornos de sangrado"));
        medicamentos.add(new Medicamentos("Salbutamol", "Inhalador", "100mcg", "Salbutamol",
                LocalDate.of(2026, 12, 11), "Lote89012", 18.00, "Asma", "Cardiopatía"));

        medicamentos.add(new Medicamentos("Levotiroxina", "Tableta", "50mcg", "Levotiroxina",
                LocalDate.of(2026, 5, 9), "Lote90123", 7.50, "Hipotiroidismo", "Insuficiencia suprarrenal"));
        medicamentos.add(new Medicamentos("Pantoprazol", "Tableta", "40mg", "Pantoprazol",
                LocalDate.of(2027, 8, 15), "Lote01234", 11.50, "Reflujo gástrico", "Alergia a protones"));
        medicamentos.add(new Medicamentos("Enalapril", "Tableta", "10mg", "Enalapril",
                LocalDate.of(2025, 9, 25), "Lote12345", 6.00, "Hipertensión", "Angioedema"));
        medicamentos.add(new Medicamentos("Atorvastatina", "Tableta", "40mg", "Atorvastatina",
                LocalDate.of(2027, 2, 3), "Lote23456", 14.00, "Colesterol alto", "Enfermedad hepática"));
        medicamentos.add(new Medicamentos("Captopril", "Tableta", "25mg", "Captopril",
                LocalDate.of(2026, 6, 14), "Lote34567", 5.00, "Hipertensión", "Embarazo"));
        medicamentos.add(new Medicamentos("Diclofenaco", "Gel", "1%", "Diclofenaco",
                LocalDate.of(2025, 10, 20), "Lote45678", 8.00, "Dolor articular", "Hipersensibilidad al diclofenaco"));
        medicamentos.add(new Medicamentos("Furosemida", "Tableta", "40mg", "Furosemida",
                LocalDate.of(2026, 4, 12), "Lote56789", 4.50, "Edema", "Deshidratación"));
        medicamentos.add(new Medicamentos("Prednisona", "Tableta", "5mg", "Prednisona",
                LocalDate.of(2027, 3, 30), "Lote67890", 9.50, "Inflamación", "Infecciones activas"));
        medicamentos.add(new Medicamentos("Alprazolam", "Tableta", "0.5mg", "Alprazolam",
                LocalDate.of(2026, 11, 25), "Lote78901", 20.00, "Ansiedad", "Depresión respiratoria"));
        medicamentos.add(new Medicamentos("Insulina Glargina", "Inyección", "100U/mL", "Insulina Glargina",
                LocalDate.of(2025, 8, 5), "Lote89012", 50.00, "Diabetes", "Hipoglucemia"));

        medicamentos.add(new Medicamentos("Esomeprazol", "Cápsula", "40mg", "Esomeprazol",
                LocalDate.of(2026, 1, 10), "Lote90123", 10.00, "Reflujo gástrico", "Alergia a protones"));
        medicamentos.add(new Medicamentos("Bisoprolol", "Tableta", "5mg", "Bisoprolol",
                LocalDate.of(2027, 4, 17), "Lote01234", 12.50, "Hipertensión", "Bradicardia"));
        medicamentos.add(new Medicamentos("Cefalexina", "Cápsula", "500mg", "Cefalexina",
                LocalDate.of(2025, 11, 23), "Lote12345", 18.00, "Infecciones bacterianas", "Alergia a cefalosporinas"));
        medicamentos.add(new Medicamentos("Diazepam", "Tableta", "10mg", "Diazepam",
                LocalDate.of(2026, 7, 1), "Lote23456", 25.00, "Ansiedad", "Depresión respiratoria"));
        medicamentos.add(new Medicamentos("Levofloxacino", "Tableta", "500mg", "Levofloxacino",
                LocalDate.of(2027, 12, 20), "Lote34567", 22.00, "Infecciones bacterianas", "Tendinitis"));
        medicamentos.add(new Medicamentos("Tramadol", "Tableta", "50mg", "Tramadol",
                LocalDate.of(2026, 9, 11), "Lote45678", 28.00, "Dolor severo", "Adicción"));
        medicamentos.add(new Medicamentos("Ranitidina", "Tableta", "150mg", "Ranitidina",
                LocalDate.of(2025, 6, 30), "Lote56789", 6.50, "Reflujo ácido", "Insuficiencia renal"));
        medicamentos.add(new Medicamentos("Escitalopram", "Tableta", "10mg", "Escitalopram",
                LocalDate.of(2026, 8, 2), "Lote67890", 27.00, "Depresión", "Manía"));
        medicamentos.add(new Medicamentos("Fluconazol", "Cápsula", "150mg", "Fluconazol",
                LocalDate.of(2027, 5, 5), "Lote78901", 19.00, "Infecciones por hongos", "Insuficiencia hepática"));
        medicamentos.add(new Medicamentos("Carvedilol", "Tableta", "6.25mg", "Carvedilol",
                LocalDate.of(2025, 12, 18), "Lote89012", 15.00, "Hipertensión", "Bradicardia"));

        return medicamentos;
    }
}
