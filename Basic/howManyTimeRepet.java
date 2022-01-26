package Basic;

import java.util.Scanner;
public class howManyTimeRepet{
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number ");
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        System.out.println("Enter a Number for Repeate Check ");
        int chk=sc.nextInt();
        int rev,count=0;
        while(num>0)
        {
        rev=num%10;
        num=num/10;
        if(rev==chk)
        {
            count++;
        }
    }
    System.out.print(chk+" is Repeate "+count +" times");
    sc.close();
}
}