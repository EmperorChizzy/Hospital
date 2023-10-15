package org.example.medical.entities;

import java.time.LocalDate;

public class Patient extends User {
    private LocalDate LAST_APPOINTMENT;
    private LocalDate NEXT_APPOINTMENT;
    private String lastPrescription;
    private String doctorName;
    private String diagnosis;

    public Patient(String diagnosis, String doctorName, String lastPrescription, LocalDate LAST_APPOINTMENT, LocalDate NEXT_APPOINTMENT) {
        this.diagnosis= diagnosis;
        this.doctorName = doctorName;
        this.LAST_APPOINTMENT = LAST_APPOINTMENT;
        this.NEXT_APPOINTMENT = NEXT_APPOINTMENT;

    }


    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDate getLAST_APPOINTMENT() {
        return LAST_APPOINTMENT;
    }

    public void setLAST_APPOINTMENT(LocalDate LAST_APPOINTMENT) {
        this.LAST_APPOINTMENT = LAST_APPOINTMENT;
    }

    public LocalDate getNEXT_APPOINTMENT() {
        return NEXT_APPOINTMENT;
    }

    public void setNEXT_APPOINTMENT(LocalDate NEXT_APPOINTMENT) {
        this.NEXT_APPOINTMENT = NEXT_APPOINTMENT;
    }

    public String getLastPrescription() {
        return lastPrescription;
    }

    public void setLastPrescription(String lastPrescription) {
        this.lastPrescription = lastPrescription;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "LAST_APPOINTMENT=" + LAST_APPOINTMENT +
                ", NEXT_APPOINTMENT=" + NEXT_APPOINTMENT +
                ", lastPrescription='" + lastPrescription + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
