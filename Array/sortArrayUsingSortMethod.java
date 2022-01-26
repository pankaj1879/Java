package Array;
import java.util.*;
public class sortArrayUsingSortMethod {
    public static void main(String[] args) {
        System.out.print("Enter Array size ");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr=new int [num];
        System.out.print("Enter Array Element ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array is ");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}
