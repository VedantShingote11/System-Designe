import PlayingPiece.PlayingPiece;

import java.util.ArrayList;
import java.util.List;

public class Board {
    
    int size;
    PlayingPiece[][] board;

    Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean add(int x , int y , PlayingPiece piece){
        if(board[x][y] != null) return false;
        board[x][y] = piece;
        return true;
    }

    public List<Pair> getFreeSpace(){

        List<Pair> ls = new ArrayList<>();

        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){

                if(board[i][j] == null) ls.add(new Pair(i, j));

            }
        }

        return ls;
        
    }
}
