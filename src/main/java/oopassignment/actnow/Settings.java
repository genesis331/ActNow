package oopassignment.actnow;

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
