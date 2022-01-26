package Basic;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num+1-i;j++){
                System.out.print(num+1-i);
            }
            System.out.println();
            sc.close();
        }
    }
    
}
