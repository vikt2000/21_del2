package main;

public interface Logic {

    public Player firstPlayer(Player[] players);

    public String keyPressed();

    public DiceRoll rollDice(Dice[] dices);

    public Field getField(Field[] fields, DiceRoll diceRoll);

    public void updateAccount(Player player, Field field);

    public boolean gameEnded(Player player);

    public Player nextPlayer(Player[] players, Player actualPlayer, Field field);

    public void printText(Player player, DiceRoll diceRoll, Text[] texts, Field field);

    
}
