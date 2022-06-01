package assignments;

import java.io.Console;

public class ConsoleRead {
	public static void main(String args[]) {
		// Create the console reference var
        Console cnsl = System.console();
        
        if (cnsl == null) {
            System.out.println("No console available");
            return;
        }

        // Read line
        String str = cnsl.readLine("Enter string : ");

        // Print
        System.out.println( "You entered : " + str);
    }
}