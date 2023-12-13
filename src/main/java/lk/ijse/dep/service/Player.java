package lk.ijse.dep.service;

public abstract class Player{
    protected Board board;
    public abstract void movePiece(int col);

    public Player(Board newBoard){
        this.board = newBoard;
    }
}
