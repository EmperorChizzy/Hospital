package org.example;

import org.example.medical.enums.Role;
import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.entities.Patient;
//import org.example.medical.entities.User;

//import javax.swing.text.html.HTMLDocument;
import java.math.BigDecimal;
import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(200000.00);    //assignment
        MedicalPersonnel doctor1 = new MedicalPersonnel("surgeon", "day", "A", decimal, Role.Doctor);
        doctor1.setName("Chimene");
        doctor1.setPhoneNumber(2348076776989L);
        System.out.println("Name of Personnel is " + doctor1.getName() + ":"
                + doctor1.getRole() + "," + " " + " " + doctor1.getSpecialization()
                + "," + " " + "Contact " + doctor1.getPhoneNumber()
                + " " + doctor1.getSalary());

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("20/08/2023", dateFormat);
        LocalDate date2 = LocalDate.parse("20/12/2023", dateFormat);
        //dateFormat=dateFormat.parse(LocalDate);
        Patient patient = new Patient("Syphilis", "Ahmed", "Typhoid and Malaria",
                date, date2);
        System.out.println(patient);
    }
}
