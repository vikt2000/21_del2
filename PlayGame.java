
import java.util.Random;
import java.util.Scanner;

class PlayGame {

    public static void main(String[] argv) {
        TextString textString = new TextString();
        Scanner input = new Scanner(System.in);
        System.out.print(TextString.ENTER_FIRST_PLAYER_NAME);
        String fname = input.nextLine();
        Spiller p1 = new Spiller(fname);
        Konto k1 = new Konto(1000, p1);
        p1.setKonto(k1);
        System.out.print(TextString.ENTER_SECOND_PLAYER_NAME);
        String sname = input.nextLine();
        Spiller p2 = new Spiller(sname);
        Konto k2 = new Konto(1000, p2);
        p2.setKonto(k2);
        p1.getBalance();
        p2.getBalance();

        p1.rollDice();
        System.out.println(p1.toString());
        k1.updateBalance(Values.values[p1.getSum()]);
        p1.getBalance();
        p2.rollDice();
        System.out.println(p2.toString());
        k2.updateBalance(Values.values[p2.getSum()]);
        p2.getBalance();

        input.close();

    }

}