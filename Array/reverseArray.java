package Array;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        System.out.print("Enter array size ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int [num];
        int newarr[]=new int[num];
        System.out.print("Enter Array Elements ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int j=num;
        for(int i=0;i<arr.length;i++){
            newarr[j-i-1]=arr[i];
        }
       System.out.println("After Reverse ");
       for(int i=0;i<newarr.length;i++){
           System.out.print(newarr[i]+" ");
       }
    }
    
}
