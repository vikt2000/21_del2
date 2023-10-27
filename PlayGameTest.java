import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayGameTest {

    @Test
    public void TestForeignCharacters() {
        String invalidName1 = "Μεγάλος Ντικ";
        String invalidName2 = "דיק גדול";

        Spiller player1 = new Spiller(invalidName1);
        Spiller player2 = new Spiller(invalidName2);

        assertEquals(invalidName1, player1.getName());
        assertEquals(invalidName2, player2.getName());
    }

    @Test
    public void TestLongPlayerName() {
        String longName = "JJJjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
        Spiller player = new Spiller(longName);

        assertEquals(longName, player.getName());
    }

    @Test
    public void testPlayerBalanceAfterWinning() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(2800, player); 
        player.setKonto(account);

        player.DiceRoll();
        player.rollDice();
        int fieldIndex = player.getSum();
        account.updateBalance(Values.values[fieldIndex]);

        assertEquals(3100, player.getKonto().getBalance()); 
        assertEquals(true, player.getKonto().checkWinner());
    }

    @Test
    public void testInvalidWithdrawal() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(500, player); 
        player.setKonto(account);
        assertThrows(IllegalArgumentException.class, () -> {
            account.updateBalance(-600);
        });
}

    @Test
    public void testRandomizedPlayerMoves() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(1000, player);
        player.setKonto(account);

        for (int i = 0; i < 1000; i++) {
            player.DiceRoll(); 
            player.rollDice();
            int fieldIndex = player.getSum();
            account.updateBalance(Values.values[fieldIndex]);
            assertTrue(player.getKonto().getBalance() >= 0);
        }
    }

    @Test
    public void testPlayerBalanceAfterMove() {
        Spiller player = new Spiller("TestPlayer");
        Konto account = new Konto(1000, player);
        player.setKonto(account);

        player.DiceRoll();
        player.rollDice();
        int fieldIndex = player.getSum();
        account.updateBalance(Values.values[fieldIndex]);

        assertEquals(1000 + Values.values[fieldIndex], player.getKonto().getBalance());
    }
}


