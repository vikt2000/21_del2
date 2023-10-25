package main;

public interface Game {

    public Logic getLogic();

    public Dice[] getDices();

    public Player[] getPlayers();

    public Text[] getTexts();

    public Field[] getFields();

    public void start();
}
