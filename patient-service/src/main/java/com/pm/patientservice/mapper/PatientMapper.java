package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setId(patient.getName());
        patientResponseDTO.setId(patient.getEmail());
        patientResponseDTO.setId(patient.getAddress());
        patientResponseDTO.setId(patient.getDateOfBirth().toString());

        return patientResponseDTO;
    }
}
