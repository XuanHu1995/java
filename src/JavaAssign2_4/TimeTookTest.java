package JavaAssign2_4;

/**
 * TimeTookTest class is designed to run the test through the process.
 *
 * @author xuanhu
 */
public class TimeTookTest {

    /**
     * Main method create Printer and Timer object, and call the methods of
     * printer and speedTest to complete the whole process.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define and initialize the correct String that user should type in
        String correctString = "How much wood would a woodchuck chuck if a woodchuck "
                + "could chuck wood? He would chuck as much wood as a "
                + "woodchuck would if a woodchuck could chuck wood";
        // Create a Printer and a Timer object
        Printer printer = new Printer();
        Timer timer = new Timer();
        // Call the method of these two objects to print instructions on screen and give users a speed test.
        printer.print(correctString);
        timer.speedTest(correctString);
    }

}
