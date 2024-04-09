package org.example.bridge;

// Basic Remote Control (turnOn, turnOff)
// Advanced Remote Control (setChannel)
// Movie Remote Control (play, pause, rewind)

// RemoteControl
//   SonyRemoteControl
//   AdvancedRemoteControl
//     SonyAdvancedRemoteControl

// 2 types of remote controls -> 2 new classes
public abstract class RemoteControl {
    public abstract void turnOn();

    public abstract void turnOff();

}
