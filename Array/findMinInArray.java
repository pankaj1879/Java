package Array;
import java.util.*;

public class findMinInArray {
    public static void main(String[] args) {
    System.out.print("Enter Array Size ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int [num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println("Minimum number is "+min);
        sc.close();
    }
}
