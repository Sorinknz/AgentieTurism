import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Loto {

    private static Set TicketOfSix() {

        // 1 prepare the lotto machine and init it
        Random lottoMachine = new Random();
        lottoMachine.setSeed(System.currentTimeMillis());
        // 2 generate the lotto numbers
        Set setofSix = null;
        setofSix = new HashSet<Integer>();
        int counter = 0;

        do {
            int nr = lottoMachine.nextInt(49) + 1;
            boolean success = setofSix.add(nr);
            if (success) { // nr not already in the set
                counter++;
                System.out.print(nr + " ");
            }
        }
        while (counter < 6);

        return setofSix;

    }
    public static void main(String[] a) {

        int x= 0;


        Set t = TicketOfSix();
        System.out.println();

        Set myOwnTicketOfSix = TicketOfSix();

        if (myOwnTicketOfSix.contains(x)){
            x++;

        }
        System.out.println();

        switch (x) {

            case 3:
                System.out.println("Ati castigat la categoria a IV-a cu " + x + " numere. ");
                break;
            case 4:
                System.out.println("Ati castigat la categoria a III-a cu " + x + " numere. ");
                break;
            case 5:
                System.out.println("Ati castigat la categoria a II-a cu " + x + " numere. ");
                break;
            case 6:
                System.out.println("Felicitari! Ati castigat la categoria I! ");
                break;
            default:
                System.out.println("Tichet necastigator!");
                break;
        }


    }
}






