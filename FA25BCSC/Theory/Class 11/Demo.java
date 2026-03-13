import java.util.Random;

public class Demo {
    public static void main(String[] args) {

//        Card card1=new Card("Ace","Diamonds");
//
//        System.out.println(card1);
//
//        Deck deck1=new Deck();
//
//        deck1.displayCard();
//        System.out.println("After shuffeling");
//        System.out.println();
//        deck1.shuffle();
//        deck1.displayCard();

        Game game1=new Game(3);
        game1.distribute();

    }
}
