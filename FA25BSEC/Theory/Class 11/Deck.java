import java.util.Random;
public class Deck {
    Card cards[];
    private String suits[]={"Spades","Clubs","Hearts","Diamonds"};
    private String ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    Deck(){
        Ranks a=Ranks.Ace;
        if(a.value>Ranks.Three.value)

        cards=new Card[52];
        int counter=0;
        for(int i=0;i<suits.length;i++)
            for (int j=0;j<ranks.length;j++)
             cards[counter++]=new Card(suits[i],ranks[j]);
    }
    public void displayDeck(){
        for(Card card:cards)
            System.out.println(card);
    }
    public void shuffle(){
        Random random=new Random();
        for(int i=0;i<10000;i++) {
            int tempIndex = random.nextInt(52);
            Card temp = cards[0];
            cards[0] = cards[tempIndex];
            cards[tempIndex] = temp;
        }
    }
    //add toString which should return a formated string of all cards to the caller, you can use StringBuilder instead of String
}
enum Ranks{
    Ace(14),Two(2),Three(2),Four(2),Five(2),Six(2),Seven(2),Eight(2),Nine(2),Ten(10),Jack(11),Queen(12),King(13);
    int value;
    private Ranks(int v){
        value=v;
    }
}
enum Suits{
    Spades("S"), Clubs("C"), Diamonds("D"), Hearts("H");
    String symbol;
    Suits(String s){
        symbol=s;
    }
}
