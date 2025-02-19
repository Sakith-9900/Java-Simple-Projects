package iit.com;

import java.util.Scanner;

public class gradecassification {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks :");
        double marks = input.nextDouble();
        if (marks>100) {
            System.out.println("Invalid marks try again!");

        }
        else if (marks>100 || marks<0) {
            System.out.println("invalid value");


        } else if (marks>=70) {
            System.out.println("congrats you got 1st class honers");

        } else if (marks>=60 && marks<=69) {
            System.out.println("congrats you got 2nd class honors upper division");
        }
        else if (marks>=50 && marks<=59) {
            System.out.println("congrats you got 2nd class honors lower division");
        }
        else if (marks>=40 && marks<=49) {
            System.out.println("congrats you got 3rd class honors");

        }
        else{
            System.out.println("invalid value");
        }

    }
}





