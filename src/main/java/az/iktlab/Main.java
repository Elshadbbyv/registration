package az.iktlab;

import az.iktlab.controller.UserController;
import az.iktlab.dao.repo.UserDao;
import az.iktlab.service.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        final Scanner scan = new Scanner(System.in);
        UserDao userDao = new UserDao();
        UserService userService = new UserService(userDao);
        UserController userController = new UserController(userService);
        System.out.println("login or register to perform any action:");
        System.out.println("Comands:\n" +
                "1 - for login\n" +
                "2 - for registration\n" +
                "3 - for close program\n");
        System.out.print("Select command:");
        String command = scan.nextLine();
        while (true){
            switch (command){
                case "1":
                    break;
                case "2":
                    userController.registerUser();
                    break;
                case "3":
                    System.out.println("thanks, see you again");
                    return;
            }
        }
    }
}