package Basic;
import java.util.Scanner;
public class prime 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number ");
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int i,count=0;
        sc.close();
        for(i=2;i<num;i++)
        {
            if (num%i==0)
                count++;
        }
        if(count==0)
        {
            System.out.print("Number is Prime");
        }
        else
        {
            System.out.print("Number is Not Prime");
        }
        
    }   
}


