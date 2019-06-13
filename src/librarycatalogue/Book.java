package librarycatalogue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martinhilary
 */
public class Book {
//    Properties, Fields,Global Variables
    String title; 
    int pageCount;
    int ISBN; 
    boolean isCheckedOut; //whether or not it is checked out
    int dayCheckedOut =-1;
    
//    Create instances of the book by using a constructor --> what to initialize the book with
    //inside book we add parameters 
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount= bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut= false;
    }
//    Getters --> Instance methods : Getting you certain properties in the instance
    public String getTitle(){
        return this.title;
    }
    public int getPageCount(){
        return this.pageCount;
    }
    public int getISBN(){
        return this.ISBN;
    }
    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }
    
    public int getDayCheckedOut(){
        return this.dayCheckedOut;
    }
//      Setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayCheckedOut= day;
    }
    
}
