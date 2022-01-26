package Basic;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter a Number ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
            sc.close();
        }
    }
    
}
