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
                 int numbers[] = {2,3,4,5};
          
                
            Scanner stdin = new Scanner(System.in);
                
        ArrayStack a1 = new ArrayStack(numbers);
        LinkedStack l1 = new LinkedStack();
      
        int choice;
       
        System.out.println("Select what option you want to select");
        System.out.println("1 = Get Number, 2 = First Number, 3 = Find the biggest Number, 4 = Are they equal?, 5 = add new numbers, 6 = GCD,  7 = display all 0 = Exit");
 
        
        
        do {
            System.out.print("Next action: ");
            choice = stdin.nextInt();
            if (choice == 1) {
                a1.push(1);
                a1.pop();
            } else if (choice == 2) {
                l1.push(1);
                l1.pop();
            } 
             else if (choice != 0) {
                System.out.println("Error: Valid choices are 0, 1 or 2");
            }
        } while (choice != 0);
        System.out.println("Goodbye");
    }
}
