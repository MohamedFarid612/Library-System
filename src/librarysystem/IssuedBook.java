/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * 
 * @author Mohamed Farid
 */ 
  
public class IssuedBook {

    private int index;
    private String callNumber;
    private int StudentId;
    private String studentName;
    private String studentContact;
    private Date issueDate=new Date();
    private Date ObligatoryReturnDate=new Date();    
    private int day;
    private int month;
    private int year;
    private int returnday;
    private int returnmonth;
    private int returnyear;
    public Calendar calender=Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
    public Calendar ReturnCalender=Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
    
    
    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getObligatoryReturnDate() {
        return ObligatoryReturnDate;
    }

    public void setObligatoryReturnDate(Date ObligatoryReturnDate) {
        this.ObligatoryReturnDate = ObligatoryReturnDate;
    }
    
    
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
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
     public int getReturnDay() {
        return returnday;
    }

    public void setReturnDay(int day) {
        this.returnday = day;
    }

    public int getReturnMonth() {
        return returnmonth;
    }

    public void setReturnMonth(int month) {
        this.returnmonth = month;
    }

    public int getReturnYear() {
        return returnyear;
    }

    public void setReturnYear(int year) {
        this.returnyear = year;
    }
    
   
    
}
