package Array;
import java.util.*;
public class findMaxinArray {
    public static void main(String[] args) {
        System.out.println("Enter Array Size ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int big=0;
        int arr []=new int [num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            if(big<arr[j]){
                big=arr[j];
            }
        }
        System.out.println("Biggest Number is "+big);
        sc.close();
    }
    
}
