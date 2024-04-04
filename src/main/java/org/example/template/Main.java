package org.example.template;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute(); // the only way to execute the task is through execute method.
    }
}
