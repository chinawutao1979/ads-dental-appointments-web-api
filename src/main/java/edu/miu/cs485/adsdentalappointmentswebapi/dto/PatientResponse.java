package edu.miu.cs485.adsdentalappointmentswebapi.dto;

import java.time.LocalDate;

public record PatientResponse(
        Integer patientId,
        String patientNo,
        String firstName,
        String lastName,
        LocalDate dateOfBirth,
        AddressResponse primaryAddress
) {
}
