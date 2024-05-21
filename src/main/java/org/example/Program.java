package org.example;

import java.io.IOException;

import static org.example.backupFunction.createBackup;

public class Program {
    public static void main(String[] args) throws IOException {
        String fn="tic tac toe.txt";
        byte[]arr={2, 1, 0, 2, 0, 2, 0, 1, 3};
        new WriteToFile(arr,fn);
        createBackup();
    }
}
