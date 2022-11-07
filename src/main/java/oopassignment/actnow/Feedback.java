package oopassignment.actnow;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Feedback extends JFrame implements ActionListener {
    
    JButton submit;
    JButton reset;
    JTextField feedAuthor;
    JTextField feedTitle;
    JTextField feedContent;
    Container cp;
    JFrame f;
    
    public Feedback() {
        
        this.setTitle("Feedback Submission");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(540, 550);
        cp = getContentPane();
        this.setLayout(null);
        this.cp.setBackground(new java.awt.Color(0xE8DAEF));
        
        JLabel labelhead = new JLabel();
        labelhead.setText("FEEDBACK FORM");
        labelhead.setFont(new Font("Arial", Font.BOLD, 40));
        labelhead.setBounds(80,0,440,45);
        this.cp.add(labelhead);
        
        JLabel labelauthor = new JLabel();
        labelauthor.setText("Name: ");
        labelauthor.setFont(new Font("Arial", Font.PLAIN, 18));
        labelauthor.setBounds(50,60,80,28);
        this.cp.add(labelauthor);
        
        feedAuthor = new JTextField();
        feedAuthor.setFont(new Font("Arial", Font.PLAIN, 16));
        feedAuthor.setBounds(230, 60, 240, 28);
        this.cp.add(feedAuthor);
        
        JLabel labeltitle = new JLabel();
        labeltitle.setText("Title: ");
        labeltitle.setFont(new Font("Arial", Font.PLAIN, 18));
        labeltitle.setBounds(50,110, 150, 28);
        this.cp.add(labeltitle);
        
        feedTitle = new JTextField();
        feedTitle.setFont(new Font("Arial", Font.PLAIN, 16));
        feedTitle.setBounds(230, 110, 240, 28);
        this.cp.add(feedTitle);

        JLabel labelcontent = new JLabel();
        labelcontent.setText("Content: ");
        labelcontent.setFont(new Font("Arial", Font.PLAIN, 18));
        labelcontent.setBounds(50,160,170,28);
        this.cp.add(labelcontent);

        feedContent = new JTextField();
        feedContent.setFont(new Font("Arial", Font.PLAIN, 16));
        feedContent.setBounds(230, 160, 240, 226);
        this.cp.add(feedContent);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.BOLD, 18));
        submit.setBounds(165, 450, 100, 28);
        submit.addActionListener(this);
        this.cp.add(submit);
        
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.BOLD, 18));
        reset.setBounds(275, 450, 100, 28);
        reset.addActionListener(this);
        this.cp.add(reset);

        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        boolean flag = false;
        f = new JFrame();
        
        if(e.getSource() == submit) {
            
            if((feedAuthor.getText().isEmpty()) || (feedAuthor.getText() == null)) {
                JOptionPane.showMessageDialog(f, "Name must be filled.");
            }
            
            else if((feedTitle.getText().isEmpty()) || (feedTitle.getText() == null)) {
                JOptionPane.showMessageDialog(f, "Title must be filled.");
            }
            
            else if((feedContent.getText().isEmpty()) || (feedContent.getText() == null)) {
                JOptionPane.showMessageDialog(f, "Content must be filled.");
            }
            
            else
                flag = true; 
                
            if(flag) {
                String text1 = "Thank You for Your Feedback!\n";
                String text2 = "We Really Appreciate Your Opinions!\n\n";
                String text3 = "Name: " + feedAuthor.getText() + "\nTitle: " + feedTitle.getText() + "\nFeedback: " + feedContent.getText();
                String display = text1 + text2 + text3;
                JOptionPane.showMessageDialog(f, display);
            }
        }

        else if( e.getSource() == reset) {
            feedAuthor.setText(null);
            feedTitle.setText(null);
            feedContent.setText(null);
        }
    }

    public static int getFeedbackCount() throws FileNotFoundException {
        File folder = new File("feedbacks");
        File[] listOfFiles = folder.listFiles();
        return Objects.requireNonNull(listOfFiles).length;
    }
    public static String getFeedbackFilename(int index) throws FileNotFoundException {
        File folder = new File("feedbacks");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        return listOfFiles[index].getName();
    }

    public static String getFeedbackTitle(int index) throws FileNotFoundException {
        File folder = new File("feedbacks");
        File[] listOfFiles = folder.listFiles();

        assert listOfFiles != null;
        if (listOfFiles[index].isFile()) {
            String filename = listOfFiles[index].getName();
            Scanner scanner = new Scanner(new File("feedbacks/" + filename));
            return scanner.nextLine();
        } else {
            return null;
        }
    }
}