package org.example.chainOfResponsibility;

public class WebServer {
    public void handle(HttpRequest request) {
        // Authentication
        var authenticator = new Authenticator(); // new keyword is problematic: Webserver is tightly coupled to this implementation
        authenticator.authenticate(request);
        // Logging
        // Compression
    }
}
