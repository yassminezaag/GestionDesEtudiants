package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.AddressRequest;
import com.yass.studentmanagement.dto.AddressResponse;
import com.yass.studentmanagement.entities.Address;

import java.util.List;

public interface AddressService {
    public void createAddress(AddressRequest addressdto);
    public List<AddressResponse> findAll();
    public void deleteAddressById(Long id);
    public Address updateAddress(Address address);

}
