package iit.com;

import java.util.Scanner;

public class modulemarkscalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ict marks : ");
        double ictmarks = input.nextDouble();
        System.out.println("Enter your cw marks");
        double cwmarks =  input.nextDouble();
        double Average = (ictmarks+cwmarks)/2;
        if (Average<=30) {
            System.out.println("Sorry you were fail");
        }
        else if (Average>=30) {
            System.out.println("Congrats you are passed");
            System.out.println("your final marks were :" + Average);

        }



    }
}


