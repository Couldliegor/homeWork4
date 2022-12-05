package HomeWork4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age!");
        Scanner s1 = new Scanner( System.in);
        int yourAge = s1.nextInt();
            if(yourAge >= 18){
                System.out.println("if your age is " + yourAge + " Than you're an Adult");
            }else {
                System.out.println("if your age is " + yourAge + " Than you're not an Adult yet, wait a bit ;)");
            }
    }
}