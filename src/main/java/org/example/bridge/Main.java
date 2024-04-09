package org.example.bridge;

public class Main {
    public static void main(String[] args) {
//        var remoteControl = new RemoteControl(new SonyTV());
//        remoteControl.turnOn();

        var remoteControl = new AdvancedRemoteControl(new SonyTV());
        remoteControl.turnOn();
    }
}
