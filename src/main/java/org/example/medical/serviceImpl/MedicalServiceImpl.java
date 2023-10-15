package org.example.medical.serviceImpl;

import org.example.medical.entities.Patient;
import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.services.MedicalServices;

public class MedicalServiceImpl implements MedicalServices {
    @Override
    public void discharge() {
        System.out.println("You are discharged!!");
    }

    @Override
    public void admit(Patient patient) {

    }

    @Override
    public void diagnosePatient(Patient patient, MedicalPersonnel doctor) {

    }
}
