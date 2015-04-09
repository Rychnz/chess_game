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
    
    
    public Pawn() {
        super();
    }
     
    @Override
    public String getStringRepresentation() {
        return "P";
    }

    @Override
    public Set movesPossible() {
        Set<Position> moves = new HashSet<>();
        Position pos = getPosition();
        if(pos == null)
            throw new IllegalArgumentException("Position can't be null");
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        Position forward = new Position(pos.getBoard(), 2, 2);
        moves.add(forward);
        return moves;
    }
}
