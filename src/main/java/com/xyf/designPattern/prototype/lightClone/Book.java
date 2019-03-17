package com.xyf.designPattern.prototype.lightClone;

import java.io.Serializable;

import com.xyf.designPattern.prototype.Author;

public class Book implements Cloneable,Serializable{
	private String title;
	private int pageNum;
	private Author author;
	  
    public Book clone() {
          Book book = null;
          try {
             book = (Book) super.clone();
         } catch (CloneNotSupportedException e) {
             e.printStackTrace();
         }
         return book;
     }
 
     public String getTitle() {
         return title;
     }
 
     public void setTitle(String title) {
         this.title = title;
     }
 
     public int getPageNum() {
         return pageNum;
     }
 
     public void setPageNum(int pageNum) {
         this.pageNum = pageNum;
     }
 
    public Author getAuthor() {
         return author;
     }
 
     public void setAuthor(Author author) {
         this.author = author;
     }
	 
	 }
