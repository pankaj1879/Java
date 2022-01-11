package Basic;
import java.util.Scanner;
public class FindxPower {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number ");
        int x=sc.nextInt();
        int result=1;
        System.out.print("Enter the Power for Find ");
        int y=sc.nextInt();
        for(int i=1;i<=y;i++){
          result=result*x;
        }
        System.out.println("Result is "+result);
        sc.close();
    }
    
}
