import PlayingPiece.PlayingPiece;

public class Player {
    
    String name;
    PlayingPiece piece;

    Player(String name , PlayingPiece piece){
        this.name = name;
        this.piece = piece;
    }

    public String getPlayerName(){
        return name;
    }
    
}
