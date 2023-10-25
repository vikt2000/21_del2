package main;

public class Player {
    private Account account;

    public Player(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Player [account=" + account + "]";
    }

    

}
