package Basic;
//import java.util.*;

import java.util.Scanner;

class methodorFunction{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Two Numbers ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result=bigOf(a,b);
    System.out.println("Big is "+result);

}
    public static int bigOf(int a,int b){
    if(a>b){
        return a;
    }else{
        return b;
    }
}
}