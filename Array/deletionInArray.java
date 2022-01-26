package Array;

import java.util.Scanner;

public class deletionInArray {
    public static void main(String[] args) {
        System.out.println("Enter array Size ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int newarr[]=new int[num-1];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter location where you want to delet elemnt");
        int loc=sc.nextInt();
        for(int i=0;i<num-1;i++){
            if(i<loc-1){
                newarr[i]=arr[i];
            }else{
                newarr[i]=arr[i+1];
            }
        }
        System.out.print("After deletion ");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        sc.close();
    }
}
