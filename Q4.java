import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word;
        System.out.print("enter a word:");
        word=in.next();
        for (int i=word.length()-1; i>0;i--){
            char ch= word.charAt(i);
            System.out.println(ch);
    }
}}
