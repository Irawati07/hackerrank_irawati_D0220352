import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrom = false;
        StringBuilder sb = new StringBuilder(A);
        String balikan = sb.reverse().toString();
        if(A.equals(balikan)){
            isPalindrom = true;
           
        }
        if(isPalindrom){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
