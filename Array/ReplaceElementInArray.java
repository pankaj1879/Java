package Array;
import java.util.Scanner;
public class ReplaceElementInArray {
    //is program me position ki jangh insert krega or us 
    //position ka element delet ho jayega
    public static void main(String[] args) {
        System.out.print("Enter array size");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter Array Elements ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Position where you want to Replace new Element ");
        int pos=sc.nextInt();
        System.out.print("Enter New Element ");
        int x=sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==pos){
                arr[i]=x;
            }
        }
        System.out.println("Afre Replace new Array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
