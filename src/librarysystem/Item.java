
package librarysystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.swing.*;


 
public class Item {
    
   public static Librarian librarians[]= new Librarian[400]; 
   public static Student students[]= new Student[400]; 
   public static Book books[]= new Book[400];
   public static IssuedBook issuedBooks[]= new IssuedBook[400];
   public static int countLibrarians=0;
   public static int countStudents=0;
   public static int countBooks=0;
   public static int countIssuedBooks=0;
   public static boolean stateOfStudent;
   public static boolean stateOfLibrarian;
   public static int realCountLibrarians;
   public static int realCountStudents;
   public static int realCountBooks;
   public static int realCountIssuedBooks;
   public static int currentLibrarian;
   public static int currentStudent;
   public static int currentBook;
    
 public Item()   
 { 
     //students
  try{
    BufferedReader br =new BufferedReader(
    new FileReader("students.txt"));
    String temp;
    while((temp= br.readLine()) != null){
   
       students[countStudents]=new Student();
        StringTokenizer st=new StringTokenizer(temp,",");
        while(st.hasMoreTokens()){
         students[countStudents].setIndex(Integer.parseInt(st.nextToken()));    
         students[countStudents].setName(st.nextToken());
         students[countStudents].setPassword(st.nextToken());
         students[countStudents].setEmail(st.nextToken());
         students[countStudents].setAddress(st.nextToken());
         students[countStudents].setCity(st.nextToken());
         students[countStudents].setContactNumber(st.nextToken());
         students[countStudents].setNumberOfBooks(Integer.parseInt(st.nextToken()));    
             countStudents++;
      
           
        }
       
    }
    realCountStudents=countStudents;
   countStudents=0;
    br.close();
    }catch (Exception ex){
          ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure students.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
        return;
    }    
  //////////////////////////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////////////////////////
  //librarians 
  try{
    BufferedReader br2 =new BufferedReader(
    new FileReader("librarians.txt"));
    String temp2;
    while((temp2= br2.readLine()) != null){
       
        librarians[countLibrarians]=new Librarian();
        StringTokenizer st2=new StringTokenizer(temp2,",");
        while(st2.hasMoreTokens()){
        librarians [countLibrarians].setIndex(Integer.parseInt(st2.nextToken()));    
        librarians [countLibrarians].setName(st2.nextToken());
        librarians [countLibrarians].setPassword(st2.nextToken());
        librarians [countLibrarians].setEmail(st2.nextToken());
        librarians [countLibrarians].setAddress(st2.nextToken());
        librarians [countLibrarians].setCity(st2.nextToken());
        librarians [countLibrarians].setContactNumber(st2.nextToken());
          countLibrarians++;
         // System.out.println(countLibrarians);
        }  
    }
    realCountLibrarians=countLibrarians;
    countLibrarians=0;
    br2.close();
    }catch (Exception ex){
           ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure librarians.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
        return;
    }    
        
 /////////////////////////////////////////////////////////////////////////////// 
 ///////////////////////////////////////////////////////////////////////////////
 //books
 try{ 
    BufferedReader br3 =new BufferedReader(
    new FileReader("books.txt"));
    String temp3;
    while((temp3= br3.readLine()) != null){
    
       books[countBooks]=new Book();
        StringTokenizer st3=new StringTokenizer(temp3,",");
        while(st3.hasMoreTokens()){
         Date date5=new Date();
         Calendar calender1 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
         books[countBooks].setIndex(Integer.parseInt(st3.nextToken()));
         books [countBooks].setBookCallNumber(st3.nextToken());
         books[countBooks].setBookName(st3.nextToken());
         books[countBooks].setBookAuthorName(st3.nextToken());
         books[countBooks].setBookPublisher(st3.nextToken());
         books[countBooks].setBookQuantity(Integer.parseInt(st3.nextToken()));
         books[countBooks].setQuantityIssued(Integer.parseInt(st3.nextToken()));
         int q=Integer.parseInt(st3.nextToken());
         int a=Integer.parseInt(st3.nextToken());
         int z=Integer.parseInt(st3.nextToken());
         books[countBooks].setDay(q);
         books[countBooks].setMonth(a);
         books[countBooks].setYear(z);
         calender1.set(z,a-1,q);
         books[countBooks].calender=calender1;
         
         countBooks++;
        }
        
    }
    realCountBooks=countBooks;
     countBooks=0;
    br3.close();
    }catch (Exception ex){
           ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure books.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
        return;
    }    
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
try{ 
    BufferedReader br5 =new BufferedReader(
    new FileReader("issuedbooks.txt"));
    String temp5;
    while((temp5= br5.readLine()) != null){
       
       issuedBooks[countIssuedBooks]=new IssuedBook();
        StringTokenizer st5=new StringTokenizer(temp5,",");
        while(st5.hasMoreTokens()){
         Date date=new Date();
         Date date2=new Date();
         Date tempdate1=new Date();
         Date tempdate2=new Date();
         Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
          Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));       
        issuedBooks[countIssuedBooks].setIndex(Integer.parseInt(st5.nextToken()));
        issuedBooks[countIssuedBooks].setCallNumber(st5.nextToken());
        issuedBooks[countIssuedBooks].setStudentId(Integer.parseInt(st5.nextToken()));
        issuedBooks[countIssuedBooks].setStudentName(st5.nextToken());
        issuedBooks[countIssuedBooks].setStudentContact(st5.nextToken());
         int p=Integer.parseInt(st5.nextToken());
        int l=Integer.parseInt(st5.nextToken());
        int m=Integer.parseInt(st5.nextToken()); 
        issuedBooks[countIssuedBooks].setDay(p) ;
        issuedBooks[countIssuedBooks].setMonth(l) ;
        issuedBooks[countIssuedBooks].setYear(m) ;
        cal.set(m,l-1, p);
        issuedBooks[countIssuedBooks].calender=  cal;
         int o=Integer.parseInt(st5.nextToken());
        int k=Integer.parseInt(st5.nextToken());
        int n=Integer.parseInt(st5.nextToken());
        //issuedBooks[countIssuedBooks].setIssueDate(date);
        issuedBooks[countIssuedBooks].setReturnDay(o) ;
        issuedBooks[countIssuedBooks].setReturnMonth(k) ;
        issuedBooks[countIssuedBooks].setReturnYear(n) ;
         cal2.set(n,k-1, o);
         issuedBooks[countIssuedBooks].ReturnCalender=cal2;
         countIssuedBooks++; 
        }
    
    }
    realCountIssuedBooks=countIssuedBooks;
     countIssuedBooks=0;
    br5.close();
    }catch (Exception ex){
     ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure issuedbooks.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
    }    


 
 }
    
public static void writeBooks(String one, String two,String three ,String four,int five,int six,int seven ,int eight,int nine){
    
    
 
int x;      
 try{
    BufferedWriter bw=new BufferedWriter( new FileWriter ("books.txt"));
for(x=0;x<Item.realCountBooks;x++){
    
 bw.write(Integer.toString(x+1)+","+books[x].getBookCallNumber()+","+books[x].getBookName()+","+books[x].getBookAuthorName()+","+books[x].getBookPublisher()+","+Integer.toString(books[x].getBookQuantity())+","+
      Integer.toString(books[x].getQuantityIssued())+","+Integer.toString(books[x].getDay())+","+ Integer.toString(books[x].getMonth())+","+     
      Integer.toString(books[x].getYear())+"\n")   ;
 
 }    
    
 bw.write(Integer.toString(Item.realCountBooks+1)+","+one+","+two+","+three+","+four+","+Integer.toString(five)+","+Integer.toString(six)+","+Integer.toString(seven)+","+Integer.toString(eight)+","+Integer.toString(nine)+"\n");   
    bw.close();
}catch(Exception ex){

 ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure books.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);

    
}   

 
    
    
} 
public static void writeCurrentBooks(){
   
int x;      
 try{
    BufferedWriter bw=new BufferedWriter( new FileWriter ("books.txt"));
for(x=0;x<Item.realCountBooks;x++){
    
 bw.write(Integer.toString(x+1)+","+books[x].getBookCallNumber()+","+books[x].getBookName()+","+books[x].getBookAuthorName()+","+books[x].getBookPublisher()+","+Integer.toString(books[x].getBookQuantity())+","+
      Integer.toString(books[x].getQuantityIssued())+","+Integer.toString(books[x].getDay())+","+ Integer.toString(books[x].getMonth())+","+     
      Integer.toString(books[x].getYear())+"\n")   ;
 }    
       
    bw.close();
}catch(Exception ex){

ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure books.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);


    
}   

 
    
    
} 
public static void writeStudents(String one, String two,String three ,String four,String five ,String six,int seven){
int x;      
try{
    BufferedWriter bw=new BufferedWriter( new FileWriter ("students.txt"));
for(x=0;x<Item.realCountStudents;x++){
    
 bw.write(Integer.toString(x+1)+","+students[x].getName()+","+students[x].getPassword()+","+students[x].getEmail()+","+students[x].getAddress()+","+students[x].getCity()+","+students[x].getContactNumber()+","+Integer.toString(students[x].getNumberOfBooks())+"\n")   ;
 
 }    
    
 bw.write(Integer.toString(Item.realCountStudents+1)+","+one+","+two+","+three+","+four+","+five+","+six+","+Integer.toString(seven)+"\n");   
    bw.close();
}catch(Exception ex){

ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure students.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
  
}    
    
}    
public static void writeLibrarians(String one, String two,String three ,String four,String five ,String six){
int x;      
try{
    BufferedWriter bw=new BufferedWriter( new FileWriter ("librarians.txt"));
for(x=0;x<Item.realCountLibrarians;x++){
    
 bw.write(Integer.toString(x+1)+","+librarians[x].getName()+","+librarians[x].getPassword()+","+librarians[x].getEmail()+","+librarians[x].getAddress()+","+librarians[x].getCity()+","+librarians[x].getContactNumber()+"\n")   ;
 
 }    
    
 bw.write(Integer.toString(Item.realCountLibrarians+1)+","+one+","+two+","+three+","+four+","+five+","+six+"\n");   
    bw.close();
}catch(Exception ex){
ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure libarrians.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
    
} 
       
}    
public static void writeAfterDeleteLibrarian(){
  int x;      
try{
    BufferedWriter bw=new BufferedWriter( new FileWriter ("librarians.txt"));
for(x=0;x<Item.realCountLibrarians;x++){    
 bw.write(Integer.toString(x+1)+","+librarians[x].getName()+","+librarians[x].getPassword()+","+librarians[x].getEmail()+","+librarians[x].getAddress()+","+librarians[x].getCity()+","+librarians[x].getContactNumber()+"\n")   ;
 }    
    bw.close();
}catch(Exception ex){
   ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure librarians.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
 
}  
     
    
    
    
    
    
 }
public static void deleteLibrarian(int k){
    
for(;k<Item.realCountLibrarians;k++){
   
  librarians[k]=librarians[k+1];  
     
    
}    
Item.realCountLibrarians--;    
    
Item.writeAfterDeleteLibrarian();   
}

public static void writeAfterReturnBook(){

int x;      
 try{
    BufferedWriter bw=new BufferedWriter( new FileWriter ("issuedbooks.txt"));
for(x=0;x<Item.realCountIssuedBooks;x++){
    
 bw.write(Integer.toString(x+1)+","+issuedBooks[x].getCallNumber()+","+Integer.toString(issuedBooks[x].getStudentId())+","+issuedBooks[x].getStudentName()+","+issuedBooks[x].getStudentContact()
 +","+Integer.toString(issuedBooks[x].getDay())+","+Integer.toString(issuedBooks[x].getMonth())+","+Integer.toString(issuedBooks[x].getYear())+","+Integer.toString(issuedBooks[x].getReturnDay())+","
  +Integer.toString(issuedBooks[x].getReturnMonth())+","+Integer.toString(issuedBooks[x].getReturnYear())+"\n")   ;
 
 }     
   
    bw.close();
}catch(Exception ex){ 
    ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure issuedbooks.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);

}
  
}
public static void returnBook(int k){

for(;k<Item.realCountIssuedBooks;k++){
   
  issuedBooks[k]=issuedBooks[k+1];  
    
    
}    
Item.realCountIssuedBooks--;    
    
Item.writeAfterReturnBook(); 



}

public static void writeIssuedBooks(String tCallNumber,int tStudentId,String tStudentName,String tStudentContact,int one,int two,int three,int four,int five ,int six){
    
      
 int x;      
 try{ 
       
    BufferedWriter bw=new BufferedWriter( new FileWriter ("issuedbooks.txt"));
    for(x=0;x<Item.realCountIssuedBooks;x++){
    bw.write(Integer.toString(x+1)+","+issuedBooks[x].getCallNumber()+","+Integer.toString(issuedBooks[x].getStudentId())+","+issuedBooks[x].getStudentName()+","+issuedBooks[x].getStudentContact()+","+
    Integer.toString(issuedBooks[x].getDay())+","+Integer.toString(issuedBooks[x].getMonth())+","+ Integer.toString(issuedBooks[x].getYear())+","+ Integer.toString(issuedBooks[x].getReturnDay())+","+ 
    Integer.toString(issuedBooks[x].getReturnMonth())+","+ Integer.toString(issuedBooks[x].getReturnYear())+"\n")   ;
 }       
    bw.write(Integer.toString(Item.realCountIssuedBooks+1)+","+tCallNumber+","+Integer.toString(tStudentId)+","+tStudentName+","+tStudentContact+","+Integer.toString(one)+","+Integer.toString(two)+","+Integer.toString(three)+","+
     Integer.toString(four)+","+Integer.toString(five)+","+Integer.toString(six)+"\n");   
    bw.close();
}catch(Exception ex){
    ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure issuedbooks.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);

    
}      
    
 
}
public static void writeCurrentStudents(){
    
    
    int x;      
try{
    BufferedWriter bw=new BufferedWriter( new FileWriter ("students.txt"));
for(x=0;x<Item.realCountStudents;x++){
    
 bw.write(Integer.toString(x+1)+","+students[x].getName()+","+students[x].getPassword()+","+students[x].getEmail()+","+students[x].getAddress()+","+students[x].getCity()+","+students[x].getContactNumber()+","+Integer.toString(students[x].getNumberOfBooks())+"\n")   ;
 
 }    
    bw.close();
}catch(Exception ex){

   ImageIcon xMark = new ImageIcon("xMark50.png");
         JOptionPane.showMessageDialog(null,"File not found!\nplease make sure students.txt is in program folder and restart the application","Operation failed",JOptionPane.INFORMATION_MESSAGE,xMark);
 
}


    
}
}