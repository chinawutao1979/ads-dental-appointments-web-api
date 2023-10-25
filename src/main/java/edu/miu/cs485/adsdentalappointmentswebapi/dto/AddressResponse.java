package edu.miu.cs485.adsdentalappointmentswebapi.dto;

public record AddressResponse(
        Integer addressId,
        String street,
                String city,
                String state,
                String zipCode
) {
}
