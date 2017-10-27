package JavaAssign2_4;

// import Date and Scanner class
import java.util.Date;
import java.util.Scanner;

/**
 * Timer class is to test the typing speed, it uses Date object to record the
 * time of typing in the correct String; When the String is correct, it prints
 * out the time user used, when the String is incorrect, it prints out that user
 * typed in the wrong String.
 *
 * @author xuanhu
 */
public class Timer {

    /**
     * When the String is correct, it prints out the time user used, when the
     * String is incorrect, it prints out that user typed in the wrong String.
     *
     * @param correctString indicated the correct String the user should type in
     */
    public void speedTest(String correctString) {
        // Create a Scanner Object
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        // Create a Date object when the user first press enter.
        Date date1 = new Date();
        // get the time when first data object was created.
        long millis1 = date1.getTime();
        // get the String user typed in and check if that was right. 
        String s = keyboard.nextLine();
        if (s.equals(correctString)) {
            // if the user typed in the correct sentence, create another Date object.
            Date date2 = new Date();
            // get the time when second data object was created.
            long millis2 = date2.getTime();
            // get the time between two objects were created
            int time = (int) (millis2 - millis1);
            System.out.println("You typed a right sentence, and time you took is " + time + " milliseconds");
        } else {
            // Display the following message if the user typed in the wrong sentence.
            System.out.println("Sorry, you typed a wrong sentence.");
        }
    }

}
