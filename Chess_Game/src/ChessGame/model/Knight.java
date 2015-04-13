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
public class Knight extends Piece{
    
    private HashSet<Position> possibleMoves;
    public Knight() {
        possibleMoves = new HashSet<>();
    }
    
    @Override
    public String getStringRepresentation() {
        return "KN";
    }

    @Override
    public HashSet movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        Position moveOne = new Position(currentBoard, rowNo + 2, colNo + 1);
        possibleMoves.add(moveOne);
        Position moveTwo = new Position(currentBoard, rowNo + 2, colNo - 1);
        possibleMoves.add(moveTwo);
        Position moveThree = new Position(currentBoard, rowNo + 1, colNo + 2);
        possibleMoves.add(moveThree);
        Position moveFour = new Position(currentBoard, rowNo + 1, colNo - 2);
        possibleMoves.add(moveFour);
        Position moveFive = new Position(currentBoard, rowNo - 1, colNo + 2);
        possibleMoves.add(moveFive);
        Position moveSix = new Position(currentBoard, rowNo - 1, colNo - 2);
        possibleMoves.add(moveSix);
        Position moveSeven = new Position(currentBoard, rowNo - 2, colNo + 1);
        possibleMoves.add(moveSeven);
        Position moveEight = new Position(currentBoard, rowNo - 2, colNo - 1);
        possibleMoves.add(moveEight);
        
        return possibleMoves;
    }
}
