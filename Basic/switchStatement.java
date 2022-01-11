package Basic;

import java.util.Scanner;
public class switchStatement {
    public static void main(String [] args){
        System.out.print("Enter the Number of day ");
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();
        switch(day)
        {
            case 1 -> System.out.println("Monday"); 
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }sc.close();
    }
}
// // Java program to demonstrate switch case
// // with primitive(int) data type
// public class Test {
// 	public static void main(String[] args)
// 	{
// 		int day = 5;
// 		String dayString;

// 		// switch statement with int data type
// 		switch (day) {
// 		case 1:
// 			dayString = "Monday";
// 			break;
// 		case 2:
// 			dayString = "Tuesday";
// 			break;
// 		case 3:
// 			dayString = "Wednesday";
// 			break;
// 		case 4:
// 			dayString = "Thursday";
// 			break;
// 		case 5:
// 			dayString = "Friday";
// 			break;
// 		case 6:
// 			dayString = "Saturday";
// 			break;
// 		case 7:
// 			dayString = "Sunday";
// 			break;
// 		default:
// 			dayString = "Invalid day";
// 		}
// 		System.out.println(dayString);
// 	}
// }
