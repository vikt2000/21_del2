class Spiller {
    private String name;

    public Spiller(String name) {
        this.name = name;
    }

    private int d1;
    private int d2;
    private int sum;

    public DiceRoll() {
        sum = 0;
    }

    public void rollDice() {
        Random ran = new Random();

        d1 = ran.nextInt(6) + 1;
        d2 = ran.nextInt(6) + 1;
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
    
    public Konto(int balance) {
        this.balance = balance;
    }

    updateBalance(amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    if (balance >= 3000) {
        isWinner = true;
    }


}