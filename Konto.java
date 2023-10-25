public class Konto {
        private boolean isWinner = false;
        private int balance = 1000;

        public Konto(int balance) {
            this.balance = balance;
        }
    
        void updateBalance(int amount) {
            this.balance += amount;
        }
    
        public int getBalance() {
            return balance;
        }
    {
        if (balance >= 3000) {
            isWinner = true;
        }
    }
}
