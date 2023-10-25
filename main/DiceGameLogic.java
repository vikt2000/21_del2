package main;

import java.util.Random;
import java.util.Scanner;

public class DiceGameLogic implements Logic{
    Scanner input = new Scanner(System.in);

    @Override
    public Player firstPlayer(Player[] players) {

        return players[0];
    }

    @Override
    public boolean gameEnded(Player player) {

        return player.getAccount().getBalance() > 3000;
        
    }

    @Override
    public Field getField(Field[] fields, DiceRoll diceRoll) {
    
        return fields[diceRoll.getValue()-1];
    }

    @Override
    public String keyPressed() {

        return input.nextLine();
    }

    @Override
    public Player nextPlayer(Player[] players, Player actualPlayer, Field actualField) {
        if (actualField.isExtraTurn()) {
            return actualPlayer;
        }

        int nextPosition = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getAccount().getName().equals(actualPlayer.getAccount().getName())) {
                nextPosition = i + 1;
                if (nextPosition == players.length) {
                    nextPosition = 0;
                }
                return players[nextPosition];
            }

        }

        return players[nextPosition];
    }

    @Override
    public void printText(Player player, DiceRoll diceRoll, Text[] texts, Field field) {
        String text = "<empty text>";
        for (int i = 0; i < texts.length; i++) {
            if (texts[i].getCode().equals(field.getTextcode())) {
                text = texts[i].getString();
            }
        }
        System.out.println(player.getAccount().getName() + " rolled " + diceRoll.getValue());
        System.out.println(player.getAccount().getName() + text);
        System.out.println(player.getAccount().getName() + " has a balance of " + player.getAccount().getBalance());
    }

    @Override
    public DiceRoll rollDice(Dice[] dices) {
        int value = 0;
        Random ran = new Random();
        for (int i = 0; i < dices.length; i++) {
            value += ran.nextInt(dices[i].getSideCount()) + 1;
        }
        return new DiceRoll(value);
    }

    @Override
    public void updateAccount(Player player, Field field) {
       int newBalance = player.getAccount().getBalance() + field.getPoint();
       player.getAccount().setBalance(newBalance);

    }

    

}
