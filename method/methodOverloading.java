package method;

public class methodOverloading {
    public static void main(String[] args) {
        int num=22;
        int num2=33;
        float num3=2;

        int result=addOf(num,num2);
        float result1=addOf(num,num3);
       
        System.out.println(result);
        System.out.println(result1);
    }
    public static int addOf(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static float addOf(int a,float b){
        float sum1=a/b;
        return sum1;
    }
    
}
