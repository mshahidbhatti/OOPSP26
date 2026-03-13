public class Card {
    private final String SUIT;
    private final String  RANK;
    private Ranks rank;
    Card(String suit,String rank){
        this.SUIT=suit;
        this.RANK=rank;
        this.rank=Ranks.Ace;
    }
    public String getSUIT() {
        return SUIT;
    }
    public String getRANK() {
        return RANK;
    }
    public String toString(){
        return String.format("%s of %s",RANK,SUIT);
    }
}
