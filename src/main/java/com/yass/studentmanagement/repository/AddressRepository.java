package com.yass.studentmanagement.repository;

import com.yass.studentmanagement.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
