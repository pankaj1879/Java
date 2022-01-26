package Array;
import java.util.*;
public class desimalToBInary {
    public static void main(String[] args) {
        System.out.println("Enter a number for find Binary ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[1000];
        int i=0;
        while(num>0){
            arr[i]=num%2;
            num=num/2;
            i++;
        }
        System.out.println("Binary number is ");
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        sc.close();
    }
}
