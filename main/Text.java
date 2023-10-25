package main;

public class Text {
    private String code;
    private String string;

    public Text(String code, String string) {
        this.code = code;
        this.string = string;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
    
    @Override
    public String toString() {
        return "Text [code=" + code + ", string=" + string + "]";
    }

    
}
