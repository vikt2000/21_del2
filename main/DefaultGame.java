package main;

public class DefaultGame implements Game {

    private Logic logic;

    private Dice[] dices;

    private Player[] players;

    private Text[] texts;

    private Field[] fields;

    public DefaultGame(Logic logic, Dice[] dices, Player[] players, Text[] texts, Field[] fields) {
        this.logic = logic;
        this.dices = dices;
        this.players = players;
        this.texts = texts;
        this.fields = fields;
    }

    @Override
    public Logic getLogic() {
        return logic;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    @Override
    public Dice[] getDices() {
        return dices;
    }

    public void setDices(Dice[] dices) {
        this.dices = dices;
    }

    @Override
    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public Text[] getTexts() {
        return texts;
    }

    public void setTexts(Text[] texts) {
        this.texts = texts;
    }

    @Override
    public Field[] getFields() {
        return fields;
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    public void start() {
        Player actualPlayer = logic.firstPlayer(players);

        while (true) {

            DiceRoll diceRoll = logic.rollDice(dices);

            Field field = logic.getField(fields, diceRoll);

            logic.updateAccount(actualPlayer, field);

            logic.printText(actualPlayer, diceRoll, texts, field);
            if (logic.gameEnded(actualPlayer)) {
                break;
            }
            actualPlayer = logic.nextPlayer(players, actualPlayer, field);

        }
        System.out.println(actualPlayer.getAccount().getName() + " has won the game ");
    }
}
