y/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavefuckingsucks;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
java -classpath .;yourjar.jar YourMainClass;





        


/**
 *
 * @author Hey
 */
public class Informationadd {

    public static void main(String[] args) {
         List<String> list = new ArrayList<>();
        try ( Scanner stdin = new Scanner(System.in)) {
            do {
                System.out.println("Current information " + list);
                System.out.println("Add more? (y/n)");
                if (stdin.next().startsWith("y")) {
                    System.out.println("Enter : ");
                    list.add(stdin.next());
                } else {
                    break;
                }
            } while (true);
        }
        System.out.println("List is " + list);
        String[] arr = list.toArray(new String[0]);
        System.out.println("Information is " + Arrays.toString(arr));
    }
}
