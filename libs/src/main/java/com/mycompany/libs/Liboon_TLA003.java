
package com.mycompany.libs;

import java.util.Scanner;
import java.util.Stack;
public class Liboon_TLA003 {

    public static void main(String[] args) {
        Stack <String> stack = new Stack <> ();
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter a word to reverse: ");
        String sentence = input.nextLine();
        
        
        String [] words = sentence.split(" ");
        
        for(String word : words){
            stack.push(word);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }    
}
