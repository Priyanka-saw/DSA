package BsQuestion;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("value of first : " + first + " value of second : " + second);

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first + " " + second);


    }
}
