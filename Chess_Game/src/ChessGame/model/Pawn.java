/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Laz Bratton
 */
public class Pawn extends Piece {
    
    Set<Square> moves;

    
    public Pawn() {
        super();
        
        moves = new HashSet<>();
    }
     
    @Override
    public String getStringRepresentation() {
        return "P";
    }

    @Override
    public Set movesPossible() {
        moves.clear();
        Position pos = this.getPosition();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        Position forward = new Position(pos.getBoard(), rowNo + 1, colNo);
        Square thisSquare = forward.getBoard().getSquare(forward);
        moves.add(thisSquare);
        return moves;
    }
}
