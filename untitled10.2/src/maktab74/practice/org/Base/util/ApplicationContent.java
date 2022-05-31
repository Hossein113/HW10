package maktab74.practice.org.Base.util;

import maktab74.practice.org.repository.Imple.UserRepositoryImple;
import maktab74.practice.org.repository.UserRepository;
import maktab74.practice.org.service.Imple.UserServiceImple;
import maktab74.practice.org.service.UserService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationContent {


    private UserRepository userRepository;
    private UserService userService;
    private FileWriter fileWriter;
    private Scanner stringScanner;

    public Scanner getStringScanner() {
        if (stringScanner == null) {
            stringScanner = new Scanner(System.in);
        }
        return stringScanner;
    }

    public FileWriter getFileWriter() throws IOException {
        if (fileWriter == null) {
            fileWriter = new FileWriter("hotel.txt", true);
        }
        return fileWriter;
    }


    public UserRepository getUserRepository() {
        if (userRepository == null) {
            userRepository = new UserRepositoryImple(fileWriter);
        }
        return userRepository;
    }

    public UserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImple(userRepository);
        }
        return userService;
    }
}
