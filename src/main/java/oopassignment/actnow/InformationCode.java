///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
// */
//
//package com.mycompany.informationcode;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Scanner;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.BufferedReader;
//import java.io.PrintWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.InputStreamReader;
//import java.io.FileNotFoundException;
//
//
//
//
///**
// *
// * @author Hey
// */
//public class InformationCode {
//
//
//
//
//        public class Information {
//    Scanner inner =  new Scanner (System.in);
//    String InfoAdd;
//    String InfoView;
//    String InfoEdit;
//
//
//    public Information(String InfoAdd, String InfoView, String InfoEdit ) {
//        this.InfoAdd = InfoAdd;
//        this.InfoView = InfoView;
//        this.InfoEdit = InfoEdit;
//
//    }
//
//
//
//
//    public void setInfoAdd(String add) throws IOException {
//        InfoAdd= add;
//        InfoAdd = InfoAdd.trim();
//        System.out.println("Enter new info");
//  String text = inner.nextLine();
//  try {
//        FileWriter fWriter = new FileWriter(); // add file link here i try add mine but got weird error
//        fWriter.write(text);
//        System.out.println(text);
//        fWriter.close();
//        System.out.println("File is created successfully with info");
//  }
//  catch (IOException e){
//      System.out.print(e.getMessage());
//
//    }
//
//    }
//
//
//
//
//    public void setInfoView(String view) throws Exception{
//       InfoView = view;
//       InfoView = InfoView.trim();
//       File infofile = new File (); // add file link here i try mine got weird error
//       Scanner sc = new Scanner(infofile);
//
//       while (sc.hasNextLine())
//           System.out.println(sc.nextLine());
//
//    }
//
//
//
//
//
//
//    public String setInfoEdit(String edit) throws IOException {
//        InfoEdit = edit;
//        InfoEdit = InfoEdit.trim();
//        Scanner Editorial = new Scanner(System.in);
//        String DM = Editorial.nextLine();
//
//        FileWriter Fst = null;
//        BufferedWriter Snd = null;
//        PrintWriter Trd = null;
//        System.out.println("Edit file here");
//
//        try{
//            Fst = new FileWriter("",true); // file name here
//            Snd = new BufferedWriter(Fst);
//            Trd = new PrintWriter(Snd);
//            Trd.println("DM");
//
//            System.out.println("Info is succefully edited into file");
//            Trd.flush();
//        }finally {
//            try{
//                Trd.close();
//                Snd.close();
//                Fst.close();
//            }catch (IOException io) {
//
//            }
//        }
//
//// THIS BELOW HERE IS SIMILAR TO THE TOP EDIT FUNCTION. THE BOTTOM ONE SHOULD WORK BETTER IF IM NOT MISTAKEN.
//public String setInfoEdit(String edit) throws IOException {
//        InfoEdit = edit;
//        InfoEdit = InfoEdit.trim();
//        String Pathfinder = "txt.file" // add file here
//        Scanner sc = new Scanner(new File(Pathfinder));
//        StringBuffer buffer = new StringBuffer();
//        while(sc.hasNextLine()){
//            buffer.append(sc,nextLine()+System.lineSeparator());
//        }
//        String fileCont = buffer.toString();
//        System.out.println("Contents" +fileCont);
//        sc.close();
//        System.out.println("Type which line you want to replace ");
//        String Replacement = inner.nextLine();
//        String Old = Replacement;
//        System.out.println("Write what you want to add here");
//        String Replacer = inner.nextLine();
//        String New = Replacer;
//        fileContents = fileContents.replaceAll(Old,New);
//        FileWriter writer = new FileWriter(Pathfinder);
//        System.out.println("");
//        System.out.println("new info : "+fileContents);
//        writer.append(fileContents);
//        writer.flush();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
