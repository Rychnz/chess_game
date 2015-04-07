/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;

/**
 *
 * @author Laz Bratton
 */
public class Bishop extends Piece{
    

    public Bishop(boolean alive, Color pieceColour) {
        super();
        this.pieceColour = pieceColour;
        
    }
    
    @Override
    public String getStringRepresentation() {
        return "B";
    }
}
