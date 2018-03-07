public class Cards {

    private Rank rank;
    private Suit suit;

    public Cards(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() { return this.rank; }
    public Suit getSuit() { return this.suit; }


    public int getValueFromEnum() { return this.rank.getValue(); }
}
