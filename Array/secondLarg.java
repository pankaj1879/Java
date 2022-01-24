package Array;
import java.util.*;
public class secondLarg {
    public static void main(String[] args) {
        System.out.print("Enter Array Size ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Second largest element is "+arr[num-2]+ " ");
        sc.close();
    }
}
