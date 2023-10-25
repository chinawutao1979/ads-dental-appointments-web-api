package edu.miu.cs485.adsdentalappointmentswebapi.repository;


import edu.miu.cs485.adsdentalappointmentswebapi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
