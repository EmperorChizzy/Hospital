package org.example.medical.services;
import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.entities.Patient;

public interface MedicalServices {

    void discharge();
    void admit(Patient patient);
    void diagnosePatient(Patient patient, MedicalPersonnel doctor);
}
