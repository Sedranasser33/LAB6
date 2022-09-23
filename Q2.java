
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0,sum2=0,sum3=0,j ,oddnum1,oddnum2,num;
        for(int i=2;i<100;i+=2){
            sum=sum+i;
        }   System.out.println("sum of even number is : "+ sum);
        System.out.print("enter the first odd number = ");
        oddnum1=in.nextInt();
        System.out.print("enter the second odd number = ");
        oddnum2=in.nextInt();

        for(  j=  oddnum1; oddnum1< oddnum2;  oddnum1 +=2){
            sum2=sum2+oddnum1;
        }   System.out.println("sum of odd number is: "+ sum2);

        System.out.println("enter number to sum all its digit: ");
        num= in.nextInt();
        while(num>0){
            int rem = num%10;
            if(rem%2 !=0){
                sum3=sum3+rem;
            }

        } System.out.println("sum of digit:"+sum3);}










    }

