/*
ITN 262 - Programming 3
Starter Code for Assignment 1
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoList itn262assignments = new ToDoList();
        itn262assignments.setTitle("Programming 3 To Do List");


        Scanner keyboard = new Scanner(System.in);

        int userChoice;
        try {
            do {

                mainMenu();
                userChoice = keyboard.nextInt();
                keyboard.nextLine();
                String task;


                switch (userChoice) {
                    case 1:

                        System.out.println("Enter task name:");
                        task = keyboard.nextLine();
                        itn262assignments.addTask(task);
                        break;


                    case 2:
                        // remove
                        System.out.println("Enter task name:");
                        task = keyboard.nextLine();
                        itn262assignments.removeTask(task);
                        break;
                    case 3:
                        // view list
                        System.out.println(itn262assignments);
                        break;
                    case 4:
                        itn262assignments.clearAllTasks();
                        break;
                }

                if(userChoice == 5){
                    System.out.println("Exiting....");
                }
            } while (userChoice != 5);
        } catch (InputMismatchException e){
            System.out.println("You have to enter a number");

        }




    }

    static void mainMenu() {
        System.out.println("1: Add Task");
        System.out.println("2: Remove Task");
        System.out.println("3: View All Tasks");
        System.out.println("4: Clear All Tasks");

        System.out.println("5: Exit Program");
        System.out.println("What do you want to do? (Enter number): ");
    }
}