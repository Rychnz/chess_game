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
public class King extends Piece {
    
    ChessBoard board;
    private HashSet<Position> possibleMoves;
    
    public King(ChessBoard currentBoard) {
        super();
        possibleMoves = new HashSet<>();
        board = currentBoard;
    }
    
    @Override
    public String getStringRepresentation() {
        return "K";
    }

    @Override
    public Set movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        
        Position northPosition = new Position(board, (rowNo + 1), colNo);
        if(!currentBoard.getSquare(northPosition).isOccupied())
            possibleMoves.add(northPosition);
        
        Position southPosition = new Position(board, rowNo - 1, colNo);
        if(!currentBoard.getSquare(southPosition).isOccupied())
            possibleMoves.add(southPosition);
        
        Position eastPosition = new Position(board, rowNo, colNo + 1);
        if(!currentBoard.getSquare(eastPosition).isOccupied())
            possibleMoves.add(eastPosition);
        
        Position westPosition = new Position(board, rowNo, colNo - 1);
        if(!currentBoard.getSquare(westPosition).isOccupied())
            possibleMoves.add(westPosition);
        
        
        
        
        
        return possibleMoves;
            
    }
}
