package com.hospital.demo.managehospital.controllers;


import com.hospital.demo.managehospital.model.Patient;
import com.hospital.demo.managehospital.responsehandlers.ResponseHandler;
import com.hospital.demo.managehospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HospitalController {

    @Autowired
    private PatientService patientService;
    @PostMapping("/patient")
    public ResponseEntity<Object> addPatient(@RequestBody Patient data){
       Patient patient = patientService.addPatient(data);
       return ResponseHandler.buildResponse("Patient Added Successfully", HttpStatus.CREATED,patient);
    }

    @PutMapping("/patient")
    public ResponseEntity<Object> updatePatient(@RequestBody Patient data){
        Patient patient = patientService.addPatient(data);
        return ResponseHandler.buildResponse("Patient Updated Successfully", HttpStatus.OK,patient);
    }

    @DeleteMapping("/{patient_id}")
    public ResponseEntity<Object> updatePatient(@PathVariable int data){
        patientService.removePatient(data);
        return ResponseHandler.buildResponse("Patient Deleted Successfully", HttpStatus.OK,"Success");
    }
}
