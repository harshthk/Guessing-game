package com.company;
import java.util.*;

public class Main {
    public static void guessingame(){
        Scanner scan = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(100
                * Math.random());
        System.out.println("You will get only 5 chances for guessing.");
        // Given K trials
        int trials = 5;
        int guess = 0,i;
        for(i =1; i<=trials; i++){
            System.out.println("Chance "+i);
            System.out.print("Guess the Number:- ");
            guess = scan.nextInt();
            System.out.println(number);
            if (number == guess){
                System.out.println("Congratulations you win the game.");
                break;
            }
            else if (number<guess){
                System.out.println("Your guess is greater.");
            }
            else if(number>guess){
                System.out.println("Your guess is lower");
            }
        }
        if(i == trials && guess !=number){
            System.out.println("You enter wrong answer.\nLet me show number "+number);
        }
    }
    public static void main(String[] args) {
        // write your code here
        guessingame();
    }
}
