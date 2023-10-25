package main;

public class DiceGame {
    static Dice[] DICES = new Dice[] {
            new Dice(6),
            new Dice(6)
    };
    static Account[] ACCOUNTS = new Account[] {
            new Account("Player1", 1000),
            new Account("Player2", 1000)
    };
    static Player[] PLAYERS = new Player[] {
            new Player(ACCOUNTS[0]),
            new Player(ACCOUNTS[1])
    };
    static Field[] FIELDS = new Field[] {
            new Field("Neverland", 0, false),
            new Field("Tower", +250, false),
            new Field("Crater", -100, false),
            new Field("Palace gates", +100, false),
            new Field("Cold desert", -20, false),
            new Field("Walled city", +180, false),
            new Field("Monastery", 0, false),
            new Field("Black cave", -70, false),
            new Field("Huts in the mountain", +60, false),
            new Field("The Werewall", -80, true),
            new Field("The pit", -50, false),
            new Field("Goldmine", +650, false)
    };
    static Text[] DANISH_TEXTS = new Text[] {
            new Text("Tower", " er ankommet til en tårn og har fundet sølv til en værdi af 250 "),
            new Text("Crater", " er ankommet til en krater og har brugt 100 på reb. "),
            new Text("Palace gates",
                    " er ankommet til paladsgitteret og har modtaget 100 fra en gavmild forbipasserende."),
            new Text("Cold desert", " er ankommet til en kold ørken og har brugt 20 på en varm frakke. "),
            new Text("Walled city", " er ankommet til en befæstet by og har modtaget 180 fra borgmesteren. "),
            new Text("Monastery", " er ankommet til et kloster og overnatter gratis."),
            new Text("Black cave", " er ankommet til en sort hule og har brugt 70 på fakler. "),
            new Text("Huts in the mountain",
                    " er ankommet til nogle hytter i bjergene og har fundet reservedele af træ til en værdi af 60."),
            new Text("The Werewall", " er ankommet til Ulvevæggen og har brugt 80 på kød for at kunne bestikke dem."),
            new Text("The pit", " er ankommet til afgrunden og har brugt 50 på en stige for at undslippe. "),
            new Text("Goldmine", " er ankommet til en guldmine og har fundet guld til en værdi af 650. Han er rig! "),
            new Text("BALANCE_TEXT", " balance i alt : "),
            new Text("WIN_TEXT", " har en balance over 3000 og vinder spillet"),
            new Text("ENTER_PLAYER_NAME", "indtast spillers navn : ")
            
        };

    static Text[] ENGLISH_TEXTS = new Text[] {
            new Text("Tower", " has arrived at a Tower and found silver worth 250."),
            new Text("Crater", " has arrived at a Crater and spent 100 on rope."),
            new Text("Palace gates", " has arrived at the Palace gates and received 100 from a generous passerby."),
            new Text("Cold desert", " has arrived at a Cold Desert and spent 20 on a hot coat"),
            new Text("Walled city", " has arrived at Walled city and received 180 from the mayor."),
            new Text("Monastery", " has arrived at the Monastery and stays one night for free."),
            new Text("Black cave", " has arrived at a Black cave and spent 70 on torches."),
            new Text("Huts in the mountain", " has arrived at some Huts in the mountain and found spare wood worth 60."),
            new Text("The Werewall",
                    " has arrived at The Werewall (werewolf-wall) and spent 80 on meat, so he could bribe them"),
            new Text("The pit", " has arrived at The pit and spent 50 on a ladder to escape"),
            new Text("Goldmine", " has arrived at Goldmine and found gold worth 650, he's rich!"),
            new Text("BALANCE_TEXT", " balance in total : "),
            new Text("WIN_TEXT", " has balance over 3000 and won the game"),
            new Text("ENTER_PLAYER_NAME", "Enter the player's name : ")
            
    };

    static Game diceGame = new DefaultGame(new DiceGameLogic(), DICES, PLAYERS, ENGLISH_TEXTS, FIELDS);

    public static void main(String[] args) {
        diceGame.start();

    }
}
