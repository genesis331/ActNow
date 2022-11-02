/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.informationcode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;



/**
 *
 * @author Hey
 */
public class InformationCode {

            

    
        public class Information {
    Scanner inner =  new Scanner (System.in);
    String InfoAdd;
    String InfoView;
    String InfoEdit;
    
    
    public Information(String InfoAdd, String InfoView, String InfoEdit ) {
        this.InfoAdd = InfoAdd;
        this.InfoView = InfoView;
        this.InfoEdit = InfoEdit;
        
    }
    
    public void setInfoAdd(String add) throws IOException {
        InfoAdd= add;
        InfoAdd = InfoAdd.trim();
        System.out.println("Enter new info");
  String text = inner.nextLine();
  try {
        FileWriter fWriter = new FileWriter(); // add file link here i try add mine but got weird error 
        fWriter.write(text);
        System.out.println(text);
        fWriter.close();
        System.out.println("File is created successfully with info");
  }
  catch (IOException e){
      System.out.print(e.getMessage());
       
    }
           
    }
    
    public void setInfoView(String view) throws Exception{
       InfoView = view;
       InfoView = InfoView.trim();
       File infofile = new File (); // add file link here i try mine got weird error
       Scanner sc = new Scanner(infofile);
       
       while (sc.hasNextLine())
           System.out.println(sc.nextLine());
       
    }
    
    public void setInfoEdit(String edit) {
        InfoEdit = edit;
        InfoEdit = InfoEdit.trim();
        Scanner Editorial = new Scanner(System.in);
        String DM = Editorial.nextLine();
        
        FileWriter Fst = null;
        BufferedWriter Snd = null;
        PrintWriter Trd = null;
        System.out.println("Edit file?");
        
        try{
            Fst = new FileWriter("",true); // file name here
            Snd = new BufferedWriter(Fst);
            Trd = new PrintWriter(Snd);
            Trd.println("DM");
            
            System.out.println("Info is succefully edited into file");
            Trd.flush();
        }finally {
            try{
                Trd.close();
                Snd.close();
                Fst.close();
            }catch (IOException io) {
                       
            }
        }
            
            
            
            
            
        }
    }   
  
};
    }

