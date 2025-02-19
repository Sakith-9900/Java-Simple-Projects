package iit.com;

import java.util.Scanner;

public class Age {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("over 18");
        }
        else if (age < 18) {
            System.out.println("Lower 18");

        }
        else{
            System.out.println("invalid numbers");
        }
    }

}


