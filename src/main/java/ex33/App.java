/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex33;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your question? ");
        String question = input.nextLine();

        System.out.println("\n" + pickRandomAnswer());
    }

    public static String pickRandomAnswer() {
        String[] choices = {"Yes.", "No.", "Maybe.", "Ask again later."};

        Random random_num = new Random();

        return(choices[random_num.nextInt(3)]);
    }
}