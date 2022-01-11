package Basic;
import java.util.Scanner;
public class factorialWithFunction {

    public static void fact(int num){
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+num +" is " +factorial);
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number for Factorial ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fact(num);
        sc.close();
    }
    
}
