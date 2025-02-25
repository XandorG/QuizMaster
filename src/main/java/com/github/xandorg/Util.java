package com.github.xandorg;

import java.io.File;
import java.util.List;

public class Util {
    public static void listAllFiles(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if(fList != null)
            for (File file : fList) {
                if (file.isFile()) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    listAllFiles(file.getAbsolutePath(), files);
                }
            }
    }

    public static void listClassDirectories(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if(fList != null)
            for (File file : fList) {
                if (file.isDirectory() && Character.isDigit(file.getName().charAt(0))) {
                    files.add(file);
                }
            }
    }

    public static void listAllQuiz(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if(fList != null)
            for (File file : fList) {
                if (file.isFile() && file.getName().contains("quiz")) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    listAllQuiz(file.getAbsolutePath(), files);
                }
            }
    }
}
