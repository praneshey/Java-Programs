package Strings;
import java.util.*;
public class ConsecutiveVowelsCount {
    private static boolean isVowel(char x)
    {
        if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='i'||x=='o'||x=='e')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        sc.close();
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char c1=s.charAt(i),c2=s.charAt(i+1);
            if(isVowel(c1) && isVowel(c2)) count++;

        }
        // For last tow characters 
        if(isVowel(s.charAt(s.length()-2)) && isVowel(s.charAt(s.length()-1))) count++;
        System.out.println("The no. of consecutive vowels in the string : "+count);
    }
}
