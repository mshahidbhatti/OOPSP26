public class Game {
    Deck deck=new Deck();
    Player player[];
    Game(int numberOfPlayers){
        player=new Player[numberOfPlayers];
        player[0]=new Player("Shahid");
    }
    Game(String names[]){
        player=new Player[names.length];
        for(int i=0;i<names.length;i++)
            player[i]=new Player(names[i]);
    }
    public String toString(){
        StringBuilder playersDetails=new StringBuilder();
        for(int i=0;i<player.length;i++)
            playersDetails.append(player[i]+"\n");
        return playersDetails.toString();
    }
}
class Player{
    String name;
    int score;
    Card[] hand;
    Player(String name){
        this.name=name;
    }

    public String toString(){
        return String.format("%s %d %s",name,score,hand);
    }
}
