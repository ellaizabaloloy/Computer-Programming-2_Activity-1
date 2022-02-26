package Removingwhitespacefromastring;

public class Removingwhitespacefromastring {


  public static void main(String[] args)
  
  {
  
    String str = " G O O D A F T E R N O O N";
    
   
    str = str.replaceAll("\\s", ""); 

       

        System.out.println(str); 

 
  }
}