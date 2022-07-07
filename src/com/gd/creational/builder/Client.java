package com.gd.creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthdate(user.getBirthdate())
                .build();
    }

    public static User createUser() {

        Address address = new Address();
        address.setHouseNumber("65");
        address.setStreet("Bidhan Pally");
        address.setCity("Kolkata");
        address.setZipCode("700084");
        address.setState("West Bengal");

        User user = new User();
        user.setBirthdate(LocalDate.of(1996, 10, 19));
        user.setFirstName("Gourav");
        user.setLastName("Dey");
        user.setAddress(address);

        return user;
    }
}
