package edu.miu.cs485.adsdentalappointmentswebapi.repository;


import edu.miu.cs485.adsdentalappointmentswebapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
