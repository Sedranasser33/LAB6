import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word;
        System.out.print("enter a word:");
        word=in.next();
        for (int i=0; i<word.length();i++){
            char ch= word.charAt(i);
            if( ch=='a'|| ch=='A'
             || ch=='e'|| ch=='E'
              || ch=='o'|| ch=='O'
               || ch=='u'|| ch=='U'
               || ch=='i'|| ch=='I'
            ) {
                System.out.println('_');
            }
            else{
                System.out.println(ch);
            }



    }
}}
