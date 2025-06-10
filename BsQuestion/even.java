package BsQuestion;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int a = sc.nextInt();

            if(a % 2 == 0){
                System.out.println("even number");
            }
            else {
                System.out.println("odd number");
            }
        }
    }

