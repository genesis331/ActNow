/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.actnow;

/**
 *
 * @author ZIXU
 */
public class Settings {
    boolean darkMode;
    boolean colorBlindMode;
    int fontSize;
    
    public Settings(boolean darkMode, boolean colorBlindMode, int fontSize){
        this.darkMode = darkMode;
        this.colorBlindMode = colorBlindMode;
        this.fontSize = fontSize;
    }
    
    public void toggleDarkMode(boolean toggle) {
        darkMode = toggle;
    }
    
    public void toggleColorBlindMode(boolean toggle) {
        colorBlindMode = toggle;
    }
    
    public void setFontSize(int size) {
        fontSize = size;
    }
}
