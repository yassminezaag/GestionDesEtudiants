package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.AddressRequest;
import com.yass.studentmanagement.dto.AddressResponse;
import com.yass.studentmanagement.entities.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressMapper {

    public AddressResponse toaddressResponse(Address address){
        var dto = AddressResponse
                .builder()
                .id(address.getId())
                .street(address.getStreet())
                .city(address.getCity())
                .build();
        return dto;
    }

    public Address toAddress(AddressRequest addressRequest){
        Address address = new Address();
        address.setStreet(addressRequest.getStreet());
        address.setCity(addressRequest.getCity());
        return address;
    }
}
