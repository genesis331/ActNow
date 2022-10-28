/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment.actnow;

/**
 *
 * @author ALDRICH
 */
public class Feedback {
    String feedTitle;
    String feedContent;
    String feedAuthor;
    String feedReply;
    
    public Feedback(String feedTitle, String feedContent, String feedAuthor, String feedReply) {
        this.feedTitle = feedTitle;
        this.feedContent = feedContent;
        this.feedAuthor = feedAuthor;
        this.feedReply = feedReply;
    }
    
    public void setFeedTitle(String title) {
        feedTitle = title;
    }
    
    public void setFeedContent(String content) {
        feedContent = content;
    }
    
    public void setFeedAuthor(String author) {
        feedAuthor = author;
    }
    
    public void setFeedReply(String reply) {
        feedReply = reply;
    }
}