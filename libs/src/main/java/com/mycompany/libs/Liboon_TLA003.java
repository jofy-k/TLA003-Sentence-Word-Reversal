package com.mycompany.libs;

import java.util.Scanner;
import java.util.Stack;
public class Liboon_TLA003 {

    public static void main(String[] args) {
        Stack <String> stack = new Stack <> ();
        Scanner input = new Scanner (System.in);
        
        while (true) {
            System.out.println("Enter words to reverse (enter q to end sentence): ");
            String sentence = input.nextLine().trim(); // gets user input

            if (sentence.equalsIgnoreCase("q")) { //if q is input stops
                break;
            } else {
                stack.push(sentence); // pushes input into stack
            }
        }
        
        if (!stack.isEmpty() && stack.size() > 1) { //making sure stack is not empty
            for (String words : stack) { // each words in stack will be printed
                System.out.print(words + " "); 
            }
            System.out.println("\nReversed: "); //prints the reversed word
            while (!stack.isEmpty()) {
                String popped = stack.pop(); 
                System.out.print(popped + " "); 
            }
        }
    }
}
