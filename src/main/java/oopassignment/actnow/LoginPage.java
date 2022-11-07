
package oopassignment.actnow;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.*;


public class LoginPage implements ActionListener{
        JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("UserID:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	static HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal){
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(70,100,75,25);
               
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(150,250,250,35);
                
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
                
		userPasswordField.setBounds(125,150,200,25);
		
                
		loginButton.setBounds(125,200,100,25);
                
		loginButton.setFocusable(false);
                
		loginButton.addActionListener(this);
		
                
		resetButton.setBounds(225,200,100,25);
                
		resetButton.setFocusable(false);
                
		resetButton.addActionListener(this);
		
                
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
                                        if("ADMINISTRATOR".equals(userID)){
                                    adminpage();
                                    frame.dispose();
                                }
                                        if("GUEST".equals(userID)){
                                    guestpage();
                                    frame.dispose();
                                        }
                                else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password / Username");
				}

			}
			
                        
		}
                	
				
                                    
                                
                                    
	}	
}

        static void adminpage(){
            JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Ini!");
	
	
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello Admin");
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
        }
        static void guestpage(){
            JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello Guest");
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
        }

		public static void validateLogin(String userID, String password, Stage primaryStage) throws IOException {
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					if("ADMINISTRATOR".equals(userID)){
						FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("mainuser-view.fxml"));
						Scene scene = new Scene(fxmlLoader.load(), 800, 600);
						primaryStage.close();
						primaryStage.setTitle("Home Screen (User)");
						primaryStage.setScene(scene);
						primaryStage.show();
					}
					if("GUEST".equals(userID)){
						FXMLLoader fxmlLoader = new FXMLLoader(LoginUI.class.getResource("mainuser-view.fxml"));
						Scene scene = new Scene(fxmlLoader.load(), 800, 600);
						primaryStage.close();
						primaryStage.setTitle("Home Screen (User)");
						primaryStage.setScene(scene);
						primaryStage.show();
					}
					else {
						JFrame f = new JFrame();
        				JOptionPane.showMessageDialog(f,"Wrong password / Username");
					}
				}
			} else {
				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f,"Wrong password / Username");
			}
		}
}


