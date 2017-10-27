package JavaAssign2_4;

/**
 * Printer class is designed to display game instructions on screen.
 *
 * @author xuanhu
 */
public class Printer {

    /**
     * print method is used to display game instructions on screen.
     *
     * @param correctString indicated the correct String that should be typed
     * in.
     */
    public void print(String correctString) {
        // Display on screen the following instructions.
        System.out.println("--Your job is to type the following paragraph as fast as you can;");
        System.out.println(correctString);
        System.out.println("--When you are ready, press enter, type the lines, and press enter again;");
        System.out.println("--Now press enter...");
    }

}
