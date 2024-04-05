package org.example.command.fx;

public class Button {

    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        // at time of developing this class, we don't know what to do here. command pattern aims to solve this problem.
        command.execute(); // we are delegating the actual work to another object
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
