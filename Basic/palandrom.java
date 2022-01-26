package Basic;

import java.util.Scanner;
public class palandrom {
    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int realNum=num;
        int rev,result=0;
        while(num>0){
            rev=num%10;
            num=num/10;
            result=result*10+rev;
        }
        if(realNum==result){
        System.out.println("Number is Palandrom ");
        }else{
        System.out.println("Number is not Palandrom ");
        }
        sc.close();
    }
    
}
