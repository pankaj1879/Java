package Array;
import java.util.Scanner;
public class averageMarks {
    public static void main(String[] args) {
        System.out.print("Enter Number of Students ");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int [] marks=new int[num];
        System.out.print("Enter Marks now ");
        for(int i=0;i<num;i++){
            marks[i]=sc.nextInt();
        }
            int avg=0;
            for(int i=0;i<num;i++){
                avg=avg+marks[i];
            }
            avg=avg/num;
            System.out.println("Students average marks "+avg);
            sc.close();
    }
}
