package HomeWork4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        //exercise 1
        System.out.println("Enter your age!");
        Scanner s1 = new Scanner( System.in);
        int yourAge = s1.nextInt();
            if(yourAge >= 18){
                System.out.println("if your age is " + yourAge + " Than you're an Adult");
            }else {
                System.out.println("if your age is " + yourAge + " Than you're not an Adult yet, wait a bit ;)");
            }
    }

    public static void task2(){
        //exercise 2
        System.out.println("\n ");
        Scanner sc1 = new Scanner (System.in);
        int temperature = sc1.nextInt();
         if (temperature < 5 ){
                System.out.println("It's " + temperature + " celcium outside");
                System.out.println("The weather cold outside, you need to wear hat!");
         } else {
             System.out.println("It's " + temperature + " celcium outside");
             System.out.println("The weather is warm today, so there is no need to wear hat !");
         }
    }
}