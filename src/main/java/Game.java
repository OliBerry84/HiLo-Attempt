import java.util.ArrayList;

public class Game{
    private ArrayList<Cards> game;
    private String player1;
    private String player2;

    public Game(String player1, String player2){
        this.game = new ArrayList<>();
        this.player1 = player1;
        this.player2 = player2;
    }

//    public Cards getRandomCard(){
//        return this.player1.getRandomCard();
//    }


}