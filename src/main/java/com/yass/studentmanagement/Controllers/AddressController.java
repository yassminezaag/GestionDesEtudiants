package com.yass.studentmanagement.Controllers;

import com.yass.studentmanagement.dto.AddressRequest;
import com.yass.studentmanagement.dto.AddressResponse;
import com.yass.studentmanagement.entities.Address;
import com.yass.studentmanagement.services.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/add" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createAddress(@RequestBody @Valid AddressRequest addressdto){
        addressService.createAddress(addressdto);
    }

    @GetMapping("/getall")
    public List<AddressResponse> getAll(){
        return addressService.findAll();
    }
}
