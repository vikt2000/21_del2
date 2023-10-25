import java.util.Random;

public class Spiller {
   
    private String name;

    public Spiller(String name) {
        this.name = name;
    }

    private int d1;
    private int d2;
    private int sum;


    public void rollDice() {
        Random ran = new Random();

        d1 = ran.nextInt(6) + 1;
        d2 = ran.nextInt(6) + 1;
        sum = d1 + d2;
        
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }

    public int getSum() {
        return sum;
    }
} 

