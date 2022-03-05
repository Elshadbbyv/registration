package az.iktlab.controller;

import az.iktlab.model.User;
import az.iktlab.service.UserService;
import az.iktlab.util.Validator;

import java.util.Scanner;

public class UserController {
    private static final Scanner sc = new Scanner(System.in);
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public void registerUser(){
        User user = new User();

        System.out.print("Enter username:");
        String username = sc.nextLine();
        user.setUsername(username);

        System.out.print("Enter password: ");
        String password = sc.nextLine();
        user.setPassword(Validator.doHashPassword(password));

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        user.setFirstName(firstName);

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        user.setLastName(lastName);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        user.setAge(age);

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        user.setGender(Validator.validateGender(gender));

        service.registerUser(user);


    }
}
