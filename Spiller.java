
import java.util.Random;

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