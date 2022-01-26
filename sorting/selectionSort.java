package sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        System.out.println("Enter array size ");
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("Sorted array is ");
        for(int result:arr){
            System.out.print(result+" ");
        }
    }
    
}
