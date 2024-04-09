package org.example.bridge;

// Basic Remote Control (turnOn, turnOff)
// Advanced Remote Control (setChannel)
// Movie Remote Control (play, pause, rewind)

// RemoteControl
//   SonyRemoteControl
//   AdvancedRemoteControl
//     SonyAdvancedRemoteControl

// 2 types of remote controls -> 2 new classes
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }

}
