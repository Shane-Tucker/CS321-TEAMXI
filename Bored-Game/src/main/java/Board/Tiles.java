/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;

/**
 *
 * @author jaden
 */

import team11.bored.game.GamePanel;

public class Tiles {
    private int posX;
    private int posY;
    GamePanel gp;
    boolean movable = false;
    private Obstacles obsType;
    
    
    
    public Tiles(int X, int Y, boolean mov, GamePanel gp)
    {
        this.gp = gp;
        posX = X;
        posY = Y;
        
        movable = mov;
    }
    
    public int getX(){
        return posX;
    }
    public int getY(){
        return posY;
    }
    public boolean getMovable(){
        return movable;
    }
    
    /*public Tiles(int posX, int posY, Obstacles obsType, GamePanel gp)
    {
        this.gp = gp;
        this.posX = posX * gp.tileSize;
        this.posY = posY * gp.tileSize;
        
        this.obsType = obsType;
    }**/
}
