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

    public TextString() {
        new TextString(ENGLISH);
    }
    /**
     * @param language
     */
    public TextString(int language) {
        if (language == ENGLISH) {
            felter = new String[] { "", "", "Tower", "Crater", "Palace gates", "Cold Desert",
                    "Walled city", "Monastery", "Black cave", "Huts in the mountain",
                    "The Werewall (werewolf-wall)", "The pit", "Goldmine"
            };
        } else if (language == DANISH) {
            felter = new String[] { "", "", "Tower", "Crater", "Palace gates", "Cold Desert",
                    "Walled city", "Monastery", "Black cave", "Huts in the mountain",
                    "The Werewall (werewolf-wall)", "The pit", "Goldmine"
            };
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
        if (Values.values[sum] == 0)
            return "Player " + name + " has arrived at " + TextString.felter[sum] + " where they stay for an evening for free.";
        else if (Values.values[sum] > 0)
            return "Player " + name + " has arrived at " + TextString.felter[sum] + " and received " + Values.values[sum] + ".";
        else
            return "Player " + name + " has arrived at " + TextString.felter[sum] + " and has paid " + Values.values[sum] + " to escape.";
    }

    public void setKonto(Konto konto) {
        ownKonto = konto;
    }

    public Konto getKonto() {
        return ownKonto;
    }

    public void getBalance() {
        System.out.println("Player " + name + " has got " + ownKonto.getBalance());
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
        this.balance = balance;
        this.spiller = spiller;
    }

    public void updateBalance(int amount) {
        this.balance += amount;
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
            return "The balance has exceeded 3000, " + spiller.getName() + " won!";
        else
            return "The balance for " + spiller.getName() + " is " + getBalance();
    }
}
