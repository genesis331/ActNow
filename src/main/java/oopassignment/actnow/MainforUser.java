package oopassignment.actnow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author billytaslim
 */

    
/**
 *
 * @author billytaslim
 */
public class MainforUser {

    public static void main(String[] args) throws FileNotFoundException {

        File folder = new File("guides");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < Objects.requireNonNull(listOfFiles).length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println(listOfFiles[i].getName());
            }
        }
        
    }

    public static boolean checkGuides() {
        File folder = new File("guides");
        return folder.exists();
    }

    public static int getGuideCount() throws FileNotFoundException {
        File folder = new File("guides");
        File[] listOfFiles = folder.listFiles();
        return Objects.requireNonNull(listOfFiles).length;
    }

    public static String getGuideFilename(int index) throws FileNotFoundException {
        File folder = new File("guides");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        return listOfFiles[index].getName();
    }
    
    public static String getGuideTitle(int index) throws FileNotFoundException {
        File folder = new File("guides");
        File[] listOfFiles = folder.listFiles();

        assert listOfFiles != null;
        if (listOfFiles[index].isFile()) {
            String filename = listOfFiles[index].getName();
            Scanner scanner = new Scanner(new File("guides/" + filename));
            String firstLine = scanner.nextLine();
            return firstLine.substring(2);
        } else {
            return null;
        }
    }

    public static String getGuideType(int index) throws FileNotFoundException {
        File folder = new File("guides");
        File[] listOfFiles = folder.listFiles();

        assert listOfFiles != null;
        if (listOfFiles[index].isFile()) {
            String filename = listOfFiles[index].getName();
            Scanner scanner = new Scanner(new File("guides/" + filename));
            scanner.nextLine();
            return scanner.nextLine();
        } else {
            return null;
        }
    }
}    

