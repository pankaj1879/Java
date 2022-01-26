package Array;
import java.util.Scanner;
public class findDuplicateNum {
    public static void main(String[] args) {
     System.out.print("Enter Array Size ");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int arr[]=new int[num];
     System.out.print("Enter array elements ");
     for(int i=0;i<num;i++){
         arr[i]=sc.nextInt();
     }   
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elements is "+arr[i]);
                }
                sc.close();
         }
     }
    }
}
