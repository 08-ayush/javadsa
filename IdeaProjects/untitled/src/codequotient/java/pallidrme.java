package codequotient.java;
import java.util.Scanner;

//import static java.lang.System.*;

public class pallidrme {

      public   static int countWords(String str) {
            int count = 0;
            int inWord = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ')
                    inWord = 0;
                else if (inWord == 0) {
                    count++;
                    inWord = 1;
                }
            }
            return count;
        }
   // }
    //class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           String str=sc.nextLine();
            //String str = "CodeQuotient get better  at coding";
           int  pallidrome=countWords(str);
            System.out.println(pallidrome);
          //  System.out.println(pallidrme.countWords(str));
        }
    }

