package ui;

import java.util.Scanner;

/**
 Utility class for console input/output. Centralizes all reading and writing
  operations to keep UI code clean and consistent.
 */
public class Console {
    public Console(){
        this.scanner= new Scanner(System.in);
    }

    //Shared Scanner instance used for all console input.
    private Scanner scanner;
    
    /**
     Writes a message followed by a newline.
     */
    public  void writeLine(Object message) {
        System.out.println(message);
    }
    
    /**
     Writes a message without adding a newline.
     */
    public  void write(Object message) {
        System.out.print(message);
    }
    
    /**
    Displays a prompt and reads a full line of text from the user.
     */
    public  String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    /**
    Displays a prompt and reads an integer. Repeats until valid input is entered.
     */
    public  int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a valid number");
            }
        }
    }
    
    /**
    Displays a prompt and reads a double. Repeats until valid input is entered.
     */
    public  double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter a valid number");
            }
        }
    }
    /**
    Reads a string line from the console using the provided message.
     */
    public  String readString(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }
}
