package Basic;

import java.util.Scanner;
public class sumofNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev,result=0;
        while(num>0){
            rev=num%10;
            num=num/10;
            result=result+rev;
        }
        System.out.println("Sum of Number is "+result);
        sc.close();
    }
    
}
