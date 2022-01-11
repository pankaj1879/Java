package Array;
import java.util.*;
public class findNumberIndex {
    public static void main(String[] args) {
        System.out.print("Enter Array size ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        int index []=new int [num];
        System.out.print("Enter array data ");
        for(i=0;i<num;i++){
            index[i]=sc.nextInt();
            }
        System.out.print("Enter a number for find Index in Array ");
        int key=sc.nextInt();
        for(i=0;i<num;i++){
            if(key==index[i])
            {
                System.out.print("Number index is "+ i);
            }   
        }
    }
}
