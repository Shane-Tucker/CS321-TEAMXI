/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package team11.bored.game;

/**
 *
 * @author jaden, james
 */

import Board.Path;
import Board.Avatar;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    
    final int originalTileSize = 16;
    final int scale = 3;
    
    final public int tileSize = originalTileSize * scale;
    final public int maxScreenCol = 16;
    final public int maxScreenRow = 12;
    final public int screenWidth = tileSize * maxScreenCol;
    final public int screenHeight = tileSize * maxScreenRow;
    
    Path path = new Path(this);
    Avatar player = new Avatar(this);
    
    
    int FPS = 12;
    
    Thread gameThread;
    
    
    
    public GamePanel(){
        
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
    
    public void startGameThread(){
     gameThread = new Thread(this);
     gameThread.start();
     
    }
    
    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;
        double remainingTime;
        
        //while(gameThread != null)
        //{            
            update();
            
            repaint();
            try {
                remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;
            
                if(remainingTime < 0)
                    remainingTime = 0;
 
                Thread.sleep((long)remainingTime);
                
                nextDrawTime += drawInterval;
                
            } catch (InterruptedException ex) {
                Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        //}
    }
    
    public void update(){
        
    }
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        path.draw(g2);
        
        player.setDefaultValues(path.startPanel);
        player.draw(g2);
        
        
    }
    
}
