package com.globallogic.MedicalHistory.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.MedicalHistory.Repository.MedicalHistoryRepo;
import com.globallogic.MedicalHistory.entity.MedicalHistory;
import com.globallogic.MedicalHistory.exception.ResourceNotFoundException;
import com.globallogic.MedicalHistory.service.MedicalHistoryService;


@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService{

	
	@Autowired
	MedicalHistoryRepo  medicalHistoryRepo;

	@Override
	public List<MedicalHistory> showMedicalRecord() {
		return medicalHistoryRepo.findAll();
	}

	@Override
	public MedicalHistory showMedicalRecordById(int recordId) {
		return medicalHistoryRepo.findById(recordId).orElseThrow(()-> new ResourceNotFoundException("Patient not found with id :" + recordId));
		
	}

	@Override
	public MedicalHistory addMedicalRecord(MedicalHistory medicalhistory) {
		return medicalHistoryRepo.save(medicalhistory);
	}

	
	


}
