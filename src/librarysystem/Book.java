
package librarysystem;

import java.util.Calendar;
import java.util.TimeZone; 

/**
 *
 * @author Mohamed Farid
 */ 
public class Book {
    private String bookName;
    private int bookQuantity;
    private String bookPublisher; 
    private String bookAuthorName;
    private String bookCallNumber; 
    private int index;
    private int day;
    private int month;
    private int year;
    public Calendar calender=Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
    private int QuantityIssued;

    
    public void incrementQuantityIssued(){
        
        this.QuantityIssued++;
        
        
    }
     public void decrementQuantityIssued(){
        
        this.QuantityIssued--;
        
        
    }
    
    public int getQuantityIssued() {
        return QuantityIssued;
    }

    public void setQuantityIssued(int QuantityIssued) {
        this.QuantityIssued = QuantityIssued;
    }
    public void decrementQuantity(){
        
       this.bookQuantity--; 
        
    }
     public void incrementQuantity(){
        
       this.bookQuantity++; 
        
    }
    
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
   
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
   
    
    public void decrementQuantity(Book book){
     book.bookQuantity--;        
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
 
    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookCallNumber() {
        return bookCallNumber;
    }

    public void setBookCallNumber(String bookCallNumber) {
        this.bookCallNumber = bookCallNumber;
    }
     
}
