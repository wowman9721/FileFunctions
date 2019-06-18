package com.epam.copyOfFile;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        FileService service = new FileService();
        service.copyFile();
        service.deleteFile();
        service.moveFile();
    }
}
