package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.AddressRequest;
import com.yass.studentmanagement.dto.AddressResponse;
import com.yass.studentmanagement.entities.Address;
import com.yass.studentmanagement.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImp implements AddressService{
    @Autowired
    private AddressRepository  addressRepository;
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public void createAddress(AddressRequest addressdto) {
        Address address = addressMapper.toAddress(addressdto);
            addressRepository.save(address);
    }

    @Override
    public List<AddressResponse> findAll() {
        return addressRepository.findAll().stream()
                .map(addressMapper::toaddressResponse)
                .collect(Collectors.toList());


    }

    @Override
    public void deleteAddressById(Long id) {
            addressRepository.deleteById(id);
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }
}
