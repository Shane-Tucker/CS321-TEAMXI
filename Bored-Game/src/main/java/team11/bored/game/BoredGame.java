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
import menuModel.MainMenuModel;
/**
 *
 * @author jaden
 */
public class BoredGame {

    public static void main(String[] args) {
        //TODO interface creation of the main menu
        MenuFrame theView = new MenuFrame();
        
        MainMenuModel theModel = new MainMenuModel();
        
        User controller = new User(theModel, theView);
        
        theView.setVisible(true);
    }
}
