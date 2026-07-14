import java.util.Deque;
import java.util.LinkedList;

import PlayingPiece.PlayingPiece;
import PlayingPiece.PlayingPieceX;
import PlayingPiece.PlayingPieceO;

import java.util.Scanner;

public class Game {
    
    Board gameBoard;
    Deque<Player> players;

    Game(int size){
        initializeGame(size);
    }

    public void initializeGame(int size){

        players = new LinkedList<>();

        PlayingPiece playingPieceX = new PlayingPieceX();
        Player player1 = new Player("Player1", playingPieceX);

        PlayingPiece playingPieceO = new PlayingPieceO();
        Player player2 = new Player("Player2", playingPieceO);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(size);

    }

    public void startGame(){

        boolean notWin = true;
        Scanner sc = new Scanner(System.in);

        while(notWin){

            printBoard();
            Player currPlayer = players.removeFirst();
            
            System.out.println(currPlayer.name +" enter x & y to add");
            int x = sc.nextInt();
            int y = sc.nextInt();

            boolean add = gameBoard.add(x, y, currPlayer.piece);
            if(!add){
                System.out.println("Already added");
                players.addFirst(currPlayer);
                continue;
            }
            players.addLast(currPlayer);

            if(checkWin(currPlayer)){
                System.out.println(currPlayer.name +" winned");
                notWin = false;
            }
            if(gameBoard.getFreeSpace().size() == 0){
                System.out.println("Game is draw");
                notWin = false;
            }

        }

        sc.close();

    }

    public void printBoard(){

        for(int i=0 ; i<gameBoard.size ; i++){
            for(int j=0 ; j<gameBoard.size ; j++){

                if(gameBoard.board[i][j] == null){
                    System.out.print(" ");
                }
                else if(gameBoard.board[i][j] instanceof PlayingPieceO) System.out.print("O");
                else System.out.print("X");

                System.out.print(" | ");
            }
            System.out.println();
        }

    }

    public boolean checkWin(Player player){

        // Row check
        for(int i=0 ; i<gameBoard.size ; i++){
            int cnt=0;
            for(int j=0 ; j<gameBoard.size ; j++){
                if(gameBoard.board[i][j] == player.piece) cnt++;
            }
            if(cnt == gameBoard.size) return true;
        }

        // Colum check
        for(int j=0 ; j<gameBoard.size ; j++){
            int cnt=0;
            for(int i=0 ; i<gameBoard.size ; i++){
                if(gameBoard.board[i][j] == player.piece)cnt++;
            }
            if(cnt == gameBoard.size) return true;
        }

        // Digonal check
        int c=0;
        for(int i=0 ; i<gameBoard.size ; i++){
            if(gameBoard.board[i][i] == player.piece) c++;
        }
        if(c == gameBoard.size) return true;

        c=0;
        for(int i=0 ; i<gameBoard.size ; i++){
            if(gameBoard.board[i][gameBoard.size-i-1] == player.piece) c++;
        }
        if(c == gameBoard.size) return true;

        return false;

    }
}
