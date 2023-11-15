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
    
    private Obstacles obsType;
    
    public Tiles(int posX, int posY, Obstacles obsType, GamePanel gp)
    {
        this.gp = gp;
        this.posX = posX * gp.tileSize;
        this.posY = posY * gp.tileSize;
        
        this.obsType = obsType;
    }
    
    public int getX(){
        return posX;
    }
    public int getY(){
        return posY;
    }
    
    
}
