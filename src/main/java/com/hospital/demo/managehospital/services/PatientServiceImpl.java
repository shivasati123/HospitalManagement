package com.hospital.demo.managehospital.services;

import com.hospital.demo.managehospital.model.Patient;
import com.hospital.demo.managehospital.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    UserRepository patient;
    @Override
    public Patient addPatient(Patient p) {
        return patient.save(p);
    }

    @Override
    public void removePatient(int patient_id) {
         patient.deleteById(patient_id);
    }

    @Override
    public Patient updatePatient(Patient p) {
        return patient.save(p);
    }
}
