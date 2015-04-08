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
public class King extends Piece {
    
    private HashSet<Position> possibleMoves;
    public King() {
        
    }
    
    @Override
    public String getStringRepresentation() {
        return "K";
    }

    @Override
    public HashSet movesPossible() {
        Position pos = getPosition();
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        
        Position northPosition = new Position(currentBoard, rowNo + 1, colNo);
        Position southPosition = new Position(currentBoard, rowNo - 1, colNo);
        Position eastPosition = new Position(currentBoard, rowNo, colNo + 1);
        Position westPosition = new Position(currentBoard, rowNo, colNo - 1);
        if(!currentBoard.getSquare(northPosition).isOccupied())
            possibleMoves.add(northPosition);
        if(!currentBoard.getSquare(southPosition).isOccupied())
            possibleMoves.add(southPosition);
        if(!currentBoard.getSquare(eastPosition).isOccupied())
            possibleMoves.add(eastPosition);
        if(!currentBoard.getSquare(westPosition).isOccupied())
            possibleMoves.add(westPosition);
        
        return possibleMoves;
            
    }
}
