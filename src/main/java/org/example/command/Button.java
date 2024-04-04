package org.example.command;

public class Button {

    private String label;

    public void click() {
        // at time of developing this class, we don't know what to do here. command pattern aims to solve this problem.
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
