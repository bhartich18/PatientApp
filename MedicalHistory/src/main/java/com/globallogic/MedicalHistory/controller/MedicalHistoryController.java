package com.globallogic.MedicalHistory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.MedicalHistory.entity.MedicalHistory;
import com.globallogic.MedicalHistory.service.MedicalHistoryService;



@RestController
@RequestMapping("/medicalHistory")
public class MedicalHistoryController {

	@Autowired
	MedicalHistoryService medicalHistoryService;

	@GetMapping
	public ResponseEntity<Object> getAllRecords() {
		List<MedicalHistory> patientList = medicalHistoryService.showMedicalRecord();
		return new ResponseEntity<>(patientList, HttpStatus.OK);
	}

	@GetMapping("/{recordId}")
	public ResponseEntity<Object> showPatientById(@PathVariable("recordId") int recordId) {

		MedicalHistory medicalHistory = medicalHistoryService.showMedicalRecordById(recordId);
		return new ResponseEntity<>(medicalHistory, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Object> addPatient(@RequestBody  MedicalHistory medicalHistory) {
		medicalHistory = medicalHistoryService.addMedicalRecord(medicalHistory);
		return new ResponseEntity<>("Patient is created successfully with Id = " + medicalHistory.getRecordId(), HttpStatus.CREATED);
	}
}