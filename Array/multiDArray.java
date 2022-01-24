package Array;
import java.util.Scanner;
public class multiDArray {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Row number" );
    int num=sc.nextInt();
    System.out.print("Enter column number" );
    int num2=sc.nextInt();
        int arr[][]=new int[num][num2];
        System.out.println("Enter matrix number" );
        for(int i=0;i<num;i++){
            for(int j=0;j<num2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is" );
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        sc.close();
    }
}
}
