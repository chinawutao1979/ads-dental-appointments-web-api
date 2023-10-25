package edu.miu.cs485.adsdentalappointmentswebapi.service.impl;


import edu.miu.cs485.adsdentalappointmentswebapi.model.Address;
import edu.miu.cs485.adsdentalappointmentswebapi.repository.AddressRepository;
import edu.miu.cs485.adsdentalappointmentswebapi.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address addNewAddress(Address address) {
        return addressRepository.save(address);
    }
}
