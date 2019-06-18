package com.epam.copyOfFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileService {
    private FileInputStream input;
    private FileOutputStream output;

    public void copyFile() throws IOException {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter path and name for copying file:");
        File fileForCopy = new File(enter.nextLine());
        System.out.println("Enter path and name for copied file:");
        File coppiedFile = new File(enter.nextLine());
        input = new FileInputStream(fileForCopy);
        output = new FileOutputStream(coppiedFile);
        byte buffer[] = new byte[1024];
        int length;
        while ((length = input.read(buffer)) > 0) {
            output.write(buffer, 0, length);
        }
        input.close();
        output.close();


    }

    public void deleteFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory of file to delete: ");
        File file = new File(scanner.nextLine());
        file.delete();

    }

    public void moveFile() throws IOException {
        copyFile();
        deleteFile();
    }


}
