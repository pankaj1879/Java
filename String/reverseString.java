package String;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        System.out.println("Enter your Character ");
        Scanner sc=new Scanner(System.in);
        char [] arr=sc.next().toCharArray();
        char temp=0;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[(arr.length-i-1)];
            arr[(arr.length-i-1)]=temp;
        }
      System.out.println("Reverse string is ");
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
      }
      sc.close();
    }
}
