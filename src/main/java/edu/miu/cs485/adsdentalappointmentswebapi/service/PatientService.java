package edu.miu.cs485.adsdentalappointmentswebapi.service;



import edu.miu.cs485.adsdentalappointmentswebapi.dto.PatientResponse;
import edu.miu.cs485.adsdentalappointmentswebapi.model.Patient;

import java.util.List;

public interface PatientService {
    Patient registerNewPatient(Patient newPatient);
    List<PatientResponse> getAllPatients();
    Patient findPatientById(Integer patientId);
}
