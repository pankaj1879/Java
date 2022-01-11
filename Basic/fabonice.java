package Basic;

import java.util.Scanner;

public class fabonice {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1,fab;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<num-2;i++){
            fab=a+b;
            System.out.print(fab+" ");
            a=b;
            b=fab;
            sc.close();
        }
    }
}
