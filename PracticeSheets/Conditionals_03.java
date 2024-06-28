package PracticeSheets;
import java.util.*;

public class Conditionals_03 {

    public static void time_conversion(int day, int hour, int min){
        hour += 5;
        min += 30;
        if(min > 60){
            min = (min - 60);
            hour += 1;
        }
        if(hour > 24){
            hour = (hour - 24);
            day += 1;
        }
        System.out.println("Date in GMT format : " + day + " : " + hour + " : " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1
        // int a = sc.nextInt();
        // String ans = (a<0)?"Negative":"Positive";
        // System.out.println(ans);

        // Q2
        // double temp = 103.5;
        // boolean fev = (temp > 100) ? true : false;
        // if(fev) System.out.println("You have a fever");
        // else System.out.println("You have a normal body temperature");

        // Q3
        // System.out.print("Enter week number (1-7): ");
        // int week = sc.nextInt();
        // switch(week){
        //     case 1: System.out.println("Monday");
        //             break;
        //     case 2: System.out.println("Tuesday");
        //             break;
        //     case 3: System.out.println("Wednesday");
        //             break;
        //     case 4: System.out.println("Thursday");
        //             break;
        //     case 5: System.out.println("Friday");
        //             break;
        //     case 6: System.out.println("Saturday");
        //             break;
        //     case 7: System.out.println("Sunday");
        //             break;
        //     default: System.out.println("Enter a valid week number");
        // }
        // switch(week){
        //     case 1,2,3,4,5 : {System.out.println("weekday"); break;}
        //     case 6,7 : {System.out.println("Weekend"); break;}
        //     default : {System.out.println("Invalid day");}
        // }


        // Q4
        // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // int y= (a>b)?a:b;
        // System.out.println(x + " " + y);

        // Q5
        // int year = sc.nextInt();
        // boolean leap = false;
        // if(year % 4 == 0){
        //     if(year % 100 == 0){
        //         if(year % 400 == 0){
        //             leap = true;
        //         }else{
        //             leap = false;
        //         }
        //     }else{
        //         leap = true;
        //     }
        // }else{
        //     leap = false;
        // }
        // if(leap) System.out.println(year + " is a leap year");
        // else System.out.println(year + " is not a leap year");


        // FizzBuzz Problem
        // int n = sc.nextInt();
        // if(n%15 == 0){
        //     System.out.println("FizzBuzz");
        // }else if(n%3 == 0){
        //     System.out.println("Fizz");
        // }else if(n%5 == 0){
        //     System.out.println("Bizz");
        // }else{
        //     System.out.println(n);
        // }

        time_conversion(12, 8, 31);



        sc.close();
    }
}
