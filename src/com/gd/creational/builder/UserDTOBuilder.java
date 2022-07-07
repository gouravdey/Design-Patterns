package com.gd.creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

    // Methods to build parts of "product" at a time
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String firstName);
    UserDTOBuilder withBirthdate(LocalDate birthdate);
    UserDTOBuilder withAddress(Address address);

    // Method to "assemble" the final product
    UserDTO build();

    // Method to fetch already built object (optional)
    UserDTO getUserDTO();
}
