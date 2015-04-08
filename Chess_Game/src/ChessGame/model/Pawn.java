/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.util.HashSet;

/**
 *
 * @author Laz Bratton
 */
public class Pawn extends Piece {
    
    private HashSet<Position> possibleMoves;
    public Pawn() {}
     
    @Override
    public String getStringRepresentation() {
        return "P";
    }

    @Override
    public HashSet movesPossible() {
        Position pos = getPosition();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        Position possiblePosition = new Position(pos.getBoard(), (rowNo + 1), colNo);
        possibleMoves.add(possiblePosition);
        return possibleMoves;
    }
}
