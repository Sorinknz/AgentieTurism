import java.util.*;

public class test {

    public static void main(String[] args) {
        Set<Integer> s1 = createWinningNumber();
        Set<Integer> s2 = getUserNumber();

        System.out.println("Your ticket was: " + s2);
        System.out.println("Winning numbers: " + s1);

    }//End of main

    public static Set<Integer> getUserNumber() {

        int set = 0;
        Set<Integer> number = new TreeSet<Integer>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pick your Lucky Lotto Numbers");
        System.out.print("Type 6 lotto numbers: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("");
            set = keyboard.nextInt();
            number.add(set);
        }
        return number;
    }//End of getUserNumber

    public static Set<Integer> createWinningNumber() {
        Set<Integer> winning = new TreeSet<Integer>();
        Random generator = new Random();
        for (int i = 0; i < 6; i++) {
            winning.add(generator.nextInt(40));
        }
        return winning;
    }//End of createWinningNumber
}