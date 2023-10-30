/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackgrndCalcs;

/**
 *
 * @author jaden
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import menuModel.MainMenuModel;
import Menu.MenuFrame;

public class User {
    private final MainMenuModel theModel;
    private final MenuFrame theView;
    
    public User(MainMenuModel theModel, MenuFrame theView)
    {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.playButtonListener(new MenuListener());
        this.theView.tutorialButtonListener(new MenuListener());
        this.theView.optionsButtonListener(new MenuListener());
        this.theView.quitButtonListener(new MenuListener());
    }
    
    public class MenuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String command;
            command = e.getActionCommand();
                
            if(command.equals("Play"))
                theModel.openModel();
                //TODO change to game
            if(command.equals("Tutorial"))
                theModel.openModel();
                //TODO change to Tutorial page
            if(command.equals("Options"))
                theModel.openModel();
                //TODO change to Options page
            if(command.equals("Quit"))
                theModel.closeGame();
        }
    }
}
