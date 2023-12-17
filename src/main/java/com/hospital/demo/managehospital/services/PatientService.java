package com.hospital.demo.managehospital.services;

import com.hospital.demo.managehospital.model.Patient;

public interface PatientService {

    public Patient addPatient(Patient p);

    public void removePatient(int patient_id);

    public Patient updatePatient(Patient p);



}
