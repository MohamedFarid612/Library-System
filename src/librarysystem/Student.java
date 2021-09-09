/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author Mohamed Farid
 */
public class Student extends User{
  private int numberOfBooks=0;

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void incrementNumberOfBooks() {
        this.numberOfBooks++;
    }
    public void decrementNumberOfBooks() {
        this.numberOfBooks--;
    }
  
  
  
}
