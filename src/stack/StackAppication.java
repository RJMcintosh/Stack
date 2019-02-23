/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author Rossspc
 */
public class StackAppication {
    
     
        public static void main(String[] args) {
        Stack<String> s;
Scanner stdin = new Scanner(System.in);
          int numb;
      
       
        System.out.println("Select what option you want to select");
        System.out.println("1 = Get Number, 2 = First Number, 3 = Find the biggest Number, 4 = Are they equal?, 5 = add new numbers, 6 = GCD,  7 = display all 0 = Exit");
   for (int choice = 1; choice <= 2; choice++) {
            if (choice == 1) {
                s = new ArrayStack<>();
            } else {
                s = new LinkedStack<>();
            }
        
  
        do {
            

        
            System.out.print("Next action: ");
            numb = stdin.nextInt();
            if (choice == 1) {
                s.push("First");
                System.out.println(s);
                s.pop();
            } else if (choice == 2) {
                s.push("Second");
                System.out.println(s);
                s.pop();
            }   else if (choice == 3) {
                s.push("Three");
                System.out.println(s);
                s.pop();
            }   else if (choice == 4) {
                s.push("Four");
                System.out.println(s);
                s.pop();
            } 
             else if (choice != 0) {
                System.out.println("Error: Valid choices are 0, 1 or 2");
            }
        } while (numb != 0);
        System.out.println("Goodbye");
    }

        }
}