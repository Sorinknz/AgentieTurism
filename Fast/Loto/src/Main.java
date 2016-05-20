import java.util.*;
public class Main {
    Main() {
        LotoNumber ln = new LotoNumber(1, 49);
        int drawing[] = new int[6]; // array of frequency counters
//      pick 6 numbers
        for (int number = 0; number < drawing.length; number++)
            drawing[number] = ln.getNextNumber();
//      output each array value
        System.out.printf("Numbers: ");
        for (int number = 0; number < drawing.length; number++)
            System.out.printf(" " + drawing[number]);
        System.out.println();
    }

    public static void main(String args[]) {
        new Main();
    } // end main

    class LotoNumber {
        // ArrayList to hold the possible numbers
        private ArrayList<Integer> al;
        // Random number generator
        private Random ran;

        // constructor you specify as parameters the range of numbers 1 36
        public LotoNumber(int from, int to) {
            // random number generator
            ran = new Random();
            // the arraylist for the values
            al = new ArrayList<Integer>();
            // fill the array list with all the permitted values
            for (int i = from; i <= to; i++)
                al.add(i);
        }

        // returns a randomly selected number
        public int getNextNumber() {
            if (al.size() == 0)
                throw new IllegalStateException("All the Loto numbers have already been picked up");
            return al.remove(ran.nextInt(al.size()));
        }
    }

}