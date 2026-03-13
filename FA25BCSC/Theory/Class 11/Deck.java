import java.util.Random;

public class Deck {

    // Ace, 2,3,4,5,6,7,8,9,Jack, Queen , King
    // Spades, Clubs, Diamonds, Hearts
    private final String SUITS[]={"Spades", "Clubs", "Diamonds", "Hearts"}; //4
    private final String RANKS[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}; //13

    final Card cards[]=new Card[52];

    Deck(){
        int counter=0;
        for(int i=0;i<SUITS.length;i++)
            for(int j=0;j<RANKS.length;j++)
                cards[counter++]=new Card(SUITS[i],RANKS[j]);
    }
    public void shuffle(){
       Random random=new Random();
        for(int i=0;i<10000;i++) {
            int ran = random.nextInt(52);
            Card temp=cards[0];
            cards[0]=cards[ran];
            cards[ran]=temp;
        }
    }

    public void displayCard(){
        for(int i=0;i<cards.length;i++)
            System.out.println(cards[i]);
    }


}
