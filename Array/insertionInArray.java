package Array;
import java.util.Scanner;
public class insertionInArray {
    public static void main(String[] args) {
        System.out.print("Enter array size");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int newarr[]=new int[num+1];
        System.out.print("Enter Array Elements ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Position where you want to Replace new Element ");
        int pos=sc.nextInt();
        System.out.print("Enter New Element ");
        int x=sc.nextInt();
        for(int i =0;i<num+1;i++){
            if(i<pos-1){
                newarr[i]=arr[i]; 
            }else if(i==pos-1){
                newarr[i]=x;
            }else{
                newarr[i]=arr[i-1];
            }
        }
        // System.out.println("Afre Replace new Array ");
        // for(int i=0;i<newarr.length;i++){
        //     System.out.print(newarr[i]+" ");
        // }
        for(int item : newarr){    //for each loop
            System.out.print(item+" ");
        }
        sc.close();
    }
}
