/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.informationcode;

/**
 *
 * @author Hey
 */
public class InformationCode {

    
        public class Information {
    String InfoAdd;
    String InfoView;
    String InfoEdit;
    
    
    public Information(String InfoAdd, String InfoView, String InfoEdit ) {
        this.InfoAdd = InfoAdd;
        this.InfoView = InfoView;
        this.InfoEdit = InfoEdit;
        
    }
    
    public void setInfoAdd(String add) {
        InfoAdd= add;
    }
    
    public void setInfoView(String view) {
       InfoView = view;
    }
    
    public void setInfoEdit(String edit) {
        InfoEdit = edit;
    }
    
  
};
    }

