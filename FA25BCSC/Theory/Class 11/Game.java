public class Game {
    Deck deck;
    Player players[];


    Game(int numberOfPlayers){
        deck=new Deck();
        players=new Player[numberOfPlayers];
        for(int i=0;i<players.length;i++)
            players[i]=new Player("player "+i);

        deck.shuffle();
    }
    public void distribute(){
        for(int i=0;i<players.length;i++)
        players[i].hand[0]=deck.cards[deck.cards.length-i];
//        players[1].hand[0]=deck.cards[50];
//        players[2].hand[0]=deck.cards[49];


    }

}
