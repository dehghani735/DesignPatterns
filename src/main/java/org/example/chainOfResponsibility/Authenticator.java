package org.example.chainOfResponsibility;

public class Authenticator {

    public boolean authenticate(HttpRequest request) {
        var isValid = (request.getUserName() == "admin" && request.getPassword() == "1234");

        System.out.println("Authentication");
        return isValid;
    }
}
