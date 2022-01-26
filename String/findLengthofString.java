package String;
import java.util.Scanner;
public class findLengthofString {
    public static void main(String[] args) {
        System.out.print("How many string you want to Enter ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int totLength=0;
        String [] arr=new String[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.next();
            totLength=totLength+arr[i].length();
        }
        System.out.println(totLength);
        sc.close();
    }
}
