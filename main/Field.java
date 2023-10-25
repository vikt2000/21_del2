package main;

public class Field {

    private String textcode;
    private int point;
    private boolean extraTurn;
   
    public Field(String textcode, int point, boolean extraTurn) {
        this.textcode = textcode;
        this.point = point;
        this.extraTurn = extraTurn;
    }

    public String getTextcode() {
        return textcode;
    }

    public void setTextcode(String textcode) {
        this.textcode = textcode;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isExtraTurn() {
        return extraTurn;
    }

    public void setExtraTurn(boolean extraTurn) {
        this.extraTurn = extraTurn;
    }


    
}
