import java.util.ArrayList;
import java.util.List;

public class GameLogic implements PlayableLogic {

    public Disc [][] GameBoard = new Disc[8][8];
    public List<Position> p1;
    public List<Position> p2;


    @Override
    public boolean locate_disc(Position a, Disc disc) {
        if(getDiscAtPosition(a)!=null)return false;//בדיקה שהמיקום שהדיסק מעוניין להגיע איליו ריק
        List<Position> l = ValidMoves();
        for( Position p:l ){
            if(p.equals(a))return true;
        }
        return false;
    }

    @Override
    public Disc getDiscAtPosition(Position position) {
        if(GameBoard[position.X][position.Y]==null)return null; // בודק אם המיקום שקיבלנו על הלוח הוא null ואם כן מחזיר null
        return GameBoard[position.X][position.Y].getOwner(); // במידה והמיקום לא היה null הוא מחזיר למי שייך הדיסקית באותה נקודה}
    }

    @Override
    public int getBoardSize() {
        return 8;
    }

    @Override
    public List<Position> ValidMoves() {
        Position(N) - Position(O) == A;
        public boolean check( Position(N),A)
        if(Position(O)-A == Position(X));
            return true;
        if (Position(O) == Position(O))
            Position(O)==Position(O);
            check(Position(O),A);
        return null;
    }

    @Override
    public int countFlips(Position a) {
        return 0;
    }

    @Override
    public Player getFirstPlayer() {
        return null;
    }

    @Override
    public Player getSecondPlayer() {
        return null;
    }

    @Override
    public void setPlayers(Player player1, Player player2) {

    }

    @Override
    public boolean isFirstPlayerTurn() {
        return false;
    }

    @Override
    public boolean isGameFinished() {
        List<Position> l = ValidMoves();
        if(l==null)return true;
        return false;
    }

    @Override
    public void reset() {

    }

    @Override
    public void undoLastMove(){

    }
}
