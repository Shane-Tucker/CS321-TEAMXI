/*
Class: CS 321
Teacher: Professor Daniel Rochowiak
Group Name: Team XI
Name of Project: Bored-Game
 */

package team11.bored.game;

import BackgrndCalcs.User;
import Board.Avatar;
import Menu.MenuFrame;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author jaden
 */
public class BoredGame {

    public static void main(String[] args) {
        //TODO interface creation of the main menu
        
        //MenuFrame MainMenu = new MenuFrame();
        //MainMenu.setVisible(true);
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Bored Game");
        
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        
        window.setLocationRelativeTo(null);
        
        window.setVisible(true);

        gamePanel.startGameThread();

        Avatar test = new Avatar(gamePanel);
    }

}
