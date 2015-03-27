/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game;

/**
 *
 * @author Laz Bratton
 */
abstract public class Piece {
    boolean alive;
    boolean colour;
    
    Piece() {};
    
    Piece(boolean alive) {
        alive = this.alive;
    }
}
