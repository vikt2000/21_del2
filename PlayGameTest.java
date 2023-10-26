import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void testPlayerCreation() {
        Spiller player = new Spiller("TestPlayer");
        Assertions.assertNotNull(player);
        Assertions.assertEquals("TestPlayer", player.getName());
    }

    @Test
    public void testDiceRoll() {
        Spiller player = new Spiller("TestPlayer");
        player.rollDice();
        Assertions.assertEquals(0, player.getSum());
    }

    @Test
    public void testRollDice() {
        Spiller player = new Spiller("TestPlayer");
        player.rollDice();
        int sum = player.getSum();
        Assertions.assertTrue(sum >= 2 && sum <= 12);
    }

    @Test
    public void testAccountAssignment() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(1000, player);
        player.setKonto(account);
        Assertions.assertNotNull(player.getKonto());
    }

    @Test
    public void testAccountBalanceUpdate() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(1000, player);
        player.setKonto(account);
        account.updateBalance(500);
        Assertions.assertEquals(1500, account.getBalance());
    }


    @Test
    public void testAccountToString() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(1000, player);
        account.updateBalance(500);
        Assertions.assertEquals("TestPlayer har en balance på 1500.", account.toString());
    }

    @Test
    public void testWinnerDetermination() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(3001, player);
        player.setKonto(account);
        Assertions.assertTrue(account.checkWinner());
    }

    @Test
    public void testPlayerCreationWithoutName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Spiller(""));
    }

    @Test
    public void testPlayerCreationWithTooLongName() {
        String tooLongName = "TestPlayerTestPlayerTestPlayerTestPlayerTestPlayerTestPlayerTestPlayerTestPlayerTestPlayerTestPlayerTestPlayer";
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Spiller(tooLongName));
    }

    @Test
    public void testAccountBalanceUpdateWithNegativeAmount() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(1000, player);
        player.setKonto(account);
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.updateBalance(-100));
    }
}
