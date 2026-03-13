public class Card {
    private final String RANK;
    private final String SUIT;
    Card(String rank, String suit){
        this.RANK=rank;
        this.SUIT=suit;
    }

    public String getRANK() {
        return RANK;
    }

    public String getSUIT() {
        return SUIT;
    }

    @Override
    public String toString(){
        return String.format("%s of %s", RANK , SUIT);
    }
}
