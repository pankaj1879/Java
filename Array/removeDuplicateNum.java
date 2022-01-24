package Array;
import java.util.Scanner;
public class removeDuplicateNum {
    public static void main(String[] args) {
        System.out.println("Enter array size ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int n=arr.length;
        int temp[]=new int [n];
        int k=0;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] != arr[j]){
                    temp[k++]=arr[i];
                }
            }
        }
        for(int i=0;i<temp.length;i++)
            System.out.println(temp[i]);
    }
}
