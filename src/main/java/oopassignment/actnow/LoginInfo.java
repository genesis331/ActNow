
package oopassignment.actnow;

import java.util.HashMap;


public class LoginInfo {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    LoginInfo(){
        logininfo.put("ADMINISTRATOR","admin123");
        logininfo.put("GUEST","guest123");
        
    }
    HashMap getlogininfo(){
        return logininfo;
    }
}
