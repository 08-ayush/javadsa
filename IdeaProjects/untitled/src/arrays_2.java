
import java.util.*;
public class arrays_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
      String[] str=new String[size];

        for(int i=0;i<str.length;i++){
            str[i]=sc.next();

        }
        System.out.println(Arrays.toString(str));
        //modify the original value
        str[1]="aayush";
        System.out.print(Arrays.toString(str));
    }
}
