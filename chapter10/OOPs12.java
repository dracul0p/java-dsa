// Interface : 

public class OOPs12 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves(); 
        
    }
     
}
interface ChessPlayer{
    void moves(); // abstract fn / no implimintation / blue print. / not define.
}
class Queen implements ChessPlayer{ // class implementing all the propetis of interface.
    public void moves(){ // re-creating abstract fn of interface  in class / implementing
        System.out.println("up , down , left , rigth , diagonal(in all 4 direction)");
    }

}
class Rook implements ChessPlayer{
    public void moves(){ // re-creating abstract fn of interface  in class / implementing
        System.out.println("up , down , left , rigth ");
    }

}
class King implements ChessPlayer{
    public void moves(){ // re-creating abstract fn of interface  in class / implementing
        System.out.println("up , down , left , rigth , diagonal-( by 1 step )");

    }

}
