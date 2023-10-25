

class Konto {
    private boolean isWinner = false;
    private int balance = 1000;
    private Spiller spiller;

    public Konto(int balance, Spiller spiller) {
        this.balance = Math.max(balance, 0);
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