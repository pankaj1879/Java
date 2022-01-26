package Basic;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        int alpha=65;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print((char)alpha++);
            }for(int k=1;k<=i*2+1-num;k++)
            {
                System.out.print(" ");
            }
            alpha='A';
            for(int l=num-i+1;l>=1;l--)
            {
                System.out.print((char)(alpha+num-l));
            }
            System.out.println();     
        }
        sc.close();
    }
}
