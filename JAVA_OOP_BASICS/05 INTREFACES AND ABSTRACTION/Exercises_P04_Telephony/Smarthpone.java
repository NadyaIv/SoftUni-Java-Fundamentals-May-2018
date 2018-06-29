package Exercises_P04_Telephony;


public class Smarthpone implements Browsable,Callable {
    private String number;
    private String url;

    public Smarthpone(String number,String url) {
        setNumber(number);
        setUrl(url);
    }

    public void setNumber(String number) {
        for (int i = 0; i <number.length(); i++) {
            if(Character.isLetter(number.charAt(i))){
                throw new IllegalArgumentException("Invalid number!");
            }
        }
        this.number = number;
    }

    public void setUrl(String url) {
        for (int i = 0; i <url.length() ; i++) {
            if(Character.isDigit(url.charAt(i))){
                throw new IllegalArgumentException("Invalid URL!");
            }
        }
        this.url = url;
    }

    @Override
    public String browsing() {
        return "Browsing: "+this.url+"!";
    }

    @Override
    public String calling() {
        return "Calling... "+this.number;

    }
}
