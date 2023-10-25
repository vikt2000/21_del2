

class TextString {
    final int ENGLISH = 0;
    final int DANISH = 1;
    public static String[] felter;
    public static String BALANCE_TEXT;
    public static String WIN_TEXT;
    public static String ENTER_FIRST_PLAYER_NAME;
    public static String ENTER_SECOND_PLAYER_NAME;

    public TextString() {
        new TextString(ENGLISH);
    }

    /**
     * @param language
     */
    public TextString(int language) {
        if (language == ENGLISH) {
            felter = new String[] { "", "",
                    " has arrived at a Tower and found silver worth 250.",
                    " has arrived at a Crater and spent 100 on rope.",
                    " has arrived at the Palace gates and received 100 from a generous passerby.",
                    " has arrived at a Cold Desert and spent 20 on a hot coat",
                    " has arrived at Walled city and received 180 from the mayor.",
                    " has arrived at the Monastery and stays one night for free.",
                    " has arrived at a Black cave and spent 70 on torches.",
                    " has arrived at some Huts in the mountain and found spare wood worth 60.",
                    " has arrived at The Werewall (werewolf-wall) and spent 80 on meat, so he could bribe them",
                    " has arrived at The pit and spent 50 on a ladder to escape",
                    " has arrived at Goldmine and found gold worth 650, he's rich!"
            };
            BALANCE_TEXT = " balance in total : ";
            WIN_TEXT = " has balance over 3000 and won the game";
            ENTER_FIRST_PLAYER_NAME = "Enter the first player's name : ";
            ENTER_SECOND_PLAYER_NAME = "Enter the second player's name : ";
        } else if (language == DANISH) {
            felter = new String[] { "", "",
                    " er ankommet til en tårn og har fundet sølv til en værdi af 250.",
                    " er ankommet til en krater og har brugt 100 på reb.",
                    " er ankommet til paladsgitteret og har modtaget 100 fra en gavmild forbipasserende.",
                    " er ankommet til en kold ørken og har brugt 20 på en varm frakke.",
                    " er ankommet til en befæstet by og har modtaget 180 fra borgmesteren.",
                    " er ankommet til et kloster og overnatter gratis.",
                    " er ankommet til en sort hule og har brugt 70 på fakler.",
                    " er ankommet til nogle hytter i bjergene og har fundet reservedele af træ til en værdi af 60.",
                    " er ankommet til Ulvevæggen og har brugt 80 på kød for at kunne bestikke dem.",
                    " er ankommet til afgrunden og har brugt 50 på en stige for at undslippe.",
                    " er ankommet til en guldmine og har fundet guld til en værdi af 650. Han er rig!"
            };
            BALANCE_TEXT = " balance in total : ";
            WIN_TEXT = " has a balance over 3000 and won the game.";
            ENTER_FIRST_PLAYER_NAME = "Enter the first player's name : ";
            ENTER_SECOND_PLAYER_NAME = "Enter the second player's name : ";
        }

    }

}