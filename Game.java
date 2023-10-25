import java.util.Random;
import java.util.Scanner;

class Values {
    public static final int[] values = {
            0,
            0,
            250,
            -100,
            100,
            -20,
            180,
            0,
            -70,
            60,
            -80,
            -50,
            650
    };
}

class TextString {
    final int ENGLISH = 0;
    final int DANISH = 1;
    public static String[] felter;
    public static String BALANCE_TEXT;
    public static String WIN_TEXT;
    public static String ENTER_FIRST_PLAYER_NAME;
    public static String ENTER_SECOND_PLAYER_NAME;
    public TextString() {
        new TextString(ENGLISH);
    }

    /**
     * @param language
     */
    public TextString(int language) {
        if (language == ENGLISH) {
            felter = new String[] { "", "",
                    " has arrived at a Tower and found silver worth 250.",
                    " has arrived at a Crater and spent 100 on rope.",
                    " has arrived at the Palace gates and received 100 from a generous passerby.",
                    " has arrived at a Cold Desert and spent 20 on a hot coat",
                    " has arrived at Walled city and received 180 from the mayor.",
                    " has arrived at the Monastery and stays one night for free.",
                    " has arrived at a Black cave and spent 70 on torches.",
                    " has arrived at some Huts in the mountain and found spare wood worth 60.",
                    " has arrived at The Werewall (werewolf-wall) and spent 80 on meat, so he could bribe them",
                    " has arrived at The pit and spent 50 on a ladder to escape",
                    " has arrived at Goldmine and found gold worth 650, he's rich!"
            };
            BALANCE_TEXT = " balance in total : ";
            WIN_TEXT =" has balance over 3000 and won the game";
            ENTER_FIRST_PLAYER_NAME = "Enter the first player's name : ";
            ENTER_SECOND_PLAYER_NAME = "Enter the second player's name : ";
        } else if (language == DANISH) {
            felter = new String[] { "", "",
                    " er ankommet til en tårn og har fundet sølv til en værdi af 250.",
                    " er ankommet til en krater og har brugt 100 på reb.",
                    " er ankommet til paladsgitteret og har modtaget 100 fra en gavmild forbipasserende.",
                    " er ankommet til en kold ørken og har brugt 20 på en varm frakke.",
                    " er ankommet til en befæstet by og har modtaget 180 fra borgmesteren.",
                    " er ankommet til et kloster og overnatter gratis.",
                    " er ankommet til en sort hule og har brugt 70 på fakler.",
                    " er ankommet til nogle hytter i bjergene og har fundet reservedele af træ til en værdi af 60.",
                    " er ankommet til Ulvevæggen og har brugt 80 på kød for at kunne bestikke dem.",
                    " er ankommet til afgrunden og har brugt 50 på en stige for at undslippe.",
                    " er ankommet til en guldmine og har fundet guld til en værdi af 650. Han er rig!"
            };
            BALANCE_TEXT = " balance in total : ";
            WIN_TEXT =" has a balance over 3000 and won the game.";
            ENTER_FIRST_PLAYER_NAME = "Enter the first player's name : ";
            ENTER_SECOND_PLAYER_NAME = "Enter the second player's name : ";
        }

    }

}

class Spiller {
    private String name;
    private int d1;
    private int d2;
    private int sum;
    private Konto ownKonto;

    public String toString() {
        return name + TextString.felter[sum];
    }

    public void setKonto(Konto konto) {
        ownKonto = konto;
    }

    public Konto getKonto() {
        return ownKonto;
    }

    public void getBalance() {
        System.out.println(name + "'s" + TextString.BALANCE_TEXT + ownKonto.getBalance() + ".");
    }

    public Spiller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void DiceRoll() {
        sum = 0;
    }

    public void rollDice() {
        Random ran = new Random();

        d1 = ran.nextInt(6) + 1;
        d2 = ran.nextInt(6) + 1;
        System.out.println(d1);
        System.out.println(d2);
        sum = d1 + d2;

    }

    public int getd1() {
        return d1;
    }

    public int getd2() {
        return d2;
    }

    public int getSum() {
        return sum;
    }
}

class Konto {
    private boolean isWinner = false;
    private int balance = 1000;
    private Spiller spiller;

    public Konto(int balance, Spiller spiller) {
        this.balance = Math.max(balance,0);
        this.spiller = spiller;
    }

    public boolean updateBalance(int amount) {
        if (amount >= 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
        
    }

    public int getBalance() {
        return balance;
    }

    public boolean checkWinner() {
        if (balance >= 3000)
            isWinner = true;
        else
            isWinner = false;
        return isWinner;
    }

    public String toString() {
        if (checkWinner())
            return spiller.getName() + " : " + TextString.WIN_TEXT;
        else
            return spiller.getName() + " : " + TextString.BALANCE_TEXT + getBalance();
    }
}

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