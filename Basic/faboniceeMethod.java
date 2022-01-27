package Basic;

import java.util.Scanner;

public class faboniceeMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fab(num);
        sc.close();
    }
    public static void fab(int num){
       
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<num;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
