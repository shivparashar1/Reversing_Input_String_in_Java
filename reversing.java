
import java.util.Scanner;


public class reversing{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Strings:-");
        String str1 =obj.nextLine();
        String str2 = " ";
        for(int i=str1.length()-1; i>=0; i--)
        {
            str2= str2+str1.charAt(i);
        }

        System.out.println( "Before Reversing:- " + str1);
        System.out.println( "After Reversing:- " + str2);
        
    }
}
