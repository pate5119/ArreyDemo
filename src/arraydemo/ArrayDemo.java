
package arraydemo;

import java.util.Scanner;


public class ArrayDemo {

    private static char[] myLetters;

    public static void main(String[] args)  {
        char[] myLetter;
        myLetter = new char[4];
        myLetters[0]='y';
         myLetters[0]='a';
          myLetters[0]='s';
          myLetters[0]='h';
                 
       for(int i=0; i<myLetter.length;i++)  
           System.out.println(myLetter[i]);
        
       System.out.println("Enter Word");
        Scanner input = new Scanner (System.in); 
        String myWord = input.nextLine();
        char[] myLetter = new char[myword.length()];
        
                
        
    }
    
}
