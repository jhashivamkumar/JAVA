public class Card{
    private String value;
    private String suit;

    public Card(){
    }
    public Card(String value, String suit){
        this.value = value;
        this.suit = suit;
    }
    public void showCard(){
        System.out.println(this.value+" of "+this.suit);
    }
}
