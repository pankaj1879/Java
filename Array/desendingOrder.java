package Array;
import java.util.Scanner;
public class desendingOrder {
    public static void main(String[] args) {
        System.out.print("Enter array Size ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter Elements ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        } int sort=0;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                sort=arr[i];
                arr[i]=arr[j];
                arr[j]=sort;
                }
            }
        }
        System.out.print("Dsending order of Array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
