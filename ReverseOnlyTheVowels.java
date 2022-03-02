package Strings;

import java.util.ArrayList;
import java.util.Scanner;

class Vishwa
{
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
        String s= sc.nextLine();
        sc.close();
        ArrayList<Character> al = new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(isVowel(c)) al.add(c);

        }
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            if(isVowel(c1)) System.out.print(al.get(k++));
            else System.out.print(c1);
        }

    }
}