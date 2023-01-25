package com.globallogic.MedicalHistory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.MedicalHistory.entity.MedicalHistory;



@Repository
public interface MedicalHistoryRepo extends JpaRepository<MedicalHistory, Integer> {
}
