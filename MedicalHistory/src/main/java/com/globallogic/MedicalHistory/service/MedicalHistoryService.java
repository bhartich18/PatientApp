package com.globallogic.MedicalHistory.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.globallogic.MedicalHistory.entity.MedicalHistory;



@Repository
public interface MedicalHistoryService {

	// GET -> SHOW ALL RECORDS
	public List<MedicalHistory> showMedicalRecord();

	// GET -> SHOW RECORD BY ID
    public MedicalHistory showMedicalRecordById(int recordId);

	// POST -> ADD RECORD
	public MedicalHistory addMedicalRecord(MedicalHistory  medicalhistory);

	 
	

}