package HomeWork4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        System.out.println("Enter celsius today");
        Scanner sc1 = new Scanner (System.in);
        int temperature = sc1.nextInt();
         if (temperature < 5 ){
                System.out.println("It's " + temperature + " celcium outside.");
                System.out.println("The weather is cold outside, you need to wear hat!");
         } else {
             System.out.println("It's " + temperature + " celcium outside");
             System.out.println("The weather is warm today, so there is no need to wear hat !");
         }
        }

    public static void task3(){
        //exercise 3
        System.out.println("\n ");
        System.out.println("What's your speed");
        Scanner s1 = new Scanner(System.in);
        int yourSpeed = s1.nextInt();
            if( yourSpeed > 60){
                System.out.println("If your speed is " + yourSpeed + ", than you'll have forfeit");
            }else{
                System.out.println("If your speed is " + yourSpeed + ", than you dont need to worry!)");
            }
    }
    public static void task4(){
    //exercise 4
        System.out.println("\n ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        boolean youngMan = age > 2 && age <6;
        boolean schoolMan = age >= 7 && age < 18;
        boolean universityMan = age >= 18 && age < 24;
        boolean adult = age >=  24;
        if(youngMan){
            System.out.println("If your age equals " + age + ", than you need to go to kindergarten ");
            }else if(schoolMan){
                System.out.println("If your age equals " + age + ", than you need to go to school ");
            }else if(universityMan){
            System.out.println("If your age equals " + age + ", than you need to go to university ");
        }else if(adult){
            System.out.println("If your age equals " + age + ", than you need to go to work! ");
        } else{
            System.out.println("You're so young boy!)");
        }
    }
    public static void task5(){
        //exercise 5
        System.out.println("\n ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        boolean tooYoung = age < 5;
        boolean onlyWithAdult = age >= 5 && age < 14;
        boolean oldEnough = age >= 14;
        if(tooYoung){
            System.out.println("If child age is: " + age + ", than he can't ride");
        } else if(onlyWithAdult){
            System.out.println("If child age is: " + age + ", than he can ride only with adult");
        } else if(oldEnough){
            System.out.println("If child age is: " + age + ", than he can ride!");
        }
    }
    public static void task6(){
        //exercise 6
        System.out.println("\n ");
        System.out.println("Enter how much places has been taken");
        Scanner scan = new Scanner(System.in);
        int places = scan.nextInt();
        if(places >= 102){
            System.out.println("All free places has been taken, sorry.");
        }else if(places < 102) {
            boolean sittingPlaces = places < 60;
            boolean standUpPlaces = places >= 60;
            if(sittingPlaces){
                int freePlaces = 60 - places;
                if(freePlaces == 1){
                    System.out.println("There is " + freePlaces + " free place for you!");
                }
                System.out.println("There are free " + freePlaces + " sitting places!");
            }
            if(standUpPlaces){
                int freePlaces = 102 - places;
               System.out.println("There are free " + freePlaces + " standing places!");
            }
        }
    }
}