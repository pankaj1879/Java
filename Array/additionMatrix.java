package Array;

import java.util.Scanner;
public class additionMatrix{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter row ");
    int num=sc.nextInt();
    System.out.print("Enter column ");
    int num2=sc.nextInt();
    int arr[][]=new int[num][num2];
    int arr2[][]=new int[num][num2];
    System.out.println("Enter first matrix data ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Second matrix data ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num2;j++){
                arr2[i][j]=sc.nextInt();
            }
        } 
        int arr3[][]=new int[num][num2];
        for(int i=0;i<num;i++){
            for(int j=0;j<num2;j++){
                arr3[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println("After Addition of matrix ");
        for(int i=0;i<num;i++){
            for(int j=0;j<num2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}
