/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.awt.*;
import javax.swing.*;
import team11.bored.game.GamePanel;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Sidney, Shane
 */
public class MenuFrame extends javax.swing.JFrame {

    public char rollButton;
    public int audioLevel;
    public int screenX;
    public int screenY;
    public Dimension screenSize;
    
    /**
     * Creates new form MenuFrame
     */
    
    public MenuFrame() {
        File optionsFile = new File("src/main/java/menu/options.txt");
        try {
            if (!optionsFile.exists()) {
                //Creates new file if one does not exist
                optionsFile.createNewFile();
            }
            
            if (optionsFile.length() == 0) {
                //If file is empty, set it to default settings
                FileWriter optionsWriteFile = new FileWriter(optionsFile);
                optionsWriteFile.write("e\n0\n500\n500");
                rollButton = 'e';
                audioLevel = 0;
                screenX = 500;
                screenY = 500;
                screenSize = new Dimension(screenX, screenY);
                optionsWriteFile.close();
            } 
            else {
                //If file is not empty, read in settings and save in variables
                Scanner optionsReadFile = new Scanner(optionsFile);
                String temp = optionsReadFile.nextLine();
                rollButton = temp.charAt(0);
                temp = optionsReadFile.nextLine();
                audioLevel = Integer.parseInt(temp);
                temp = optionsReadFile.nextLine();
                screenX = Integer.parseInt(temp);
                temp = optionsReadFile.nextLine();
                screenY = Integer.parseInt(temp);
                screenSize = new Dimension(screenX, screenY);
                
                optionsReadFile.close();
            }
        }
        catch (Exception exc){
        }
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        tutorialButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        tutorialPanel = new javax.swing.JPanel();
        tutorialTitle = new java.awt.Label();
        tutorialText = new java.awt.TextArea();
        backButtonTutorial = new javax.swing.JButton();
        optionsPanel = new javax.swing.JPanel();
        backButtonOptions = new javax.swing.JButton();
        optionsTitle = new javax.swing.JLabel();
        rollDiceButton = new javax.swing.JTextField();
        controlsLabel = new javax.swing.JLabel();
        diceContolLabel = new javax.swing.JLabel();
        volumeControlLabel = new javax.swing.JLabel();
        audioLevelBar = new javax.swing.JSlider();
        audioLabel = new javax.swing.JLabel();
        graphicsLabel = new javax.swing.JLabel();
        windowSizeLabel = new javax.swing.JLabel();
        screenSizeBox = new javax.swing.JComboBox<>();
        resetOptions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(screenSize);
        setResizable(false);

        mainMenu.setPreferredSize(screenSize);

        title.setBackground(new java.awt.Color(204, 204, 255));
        title.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Bored Game");

        playButton.setText("Play");
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        tutorialButton.setText("Tutorial");
        tutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialButtonActionPerformed(evt);
            }
        });

        optionsButton.setText("Options");
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(optionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tutorialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(204, 204, 204)))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(tutorialButton)
                .addGap(18, 18, 18)
                .addComponent(optionsButton)
                .addGap(18, 18, 18)
                .addComponent(quitButton)
                .addGap(118, 118, 118))
        );

        tutorialPanel.setEnabled(false);
        tutorialPanel.setPreferredSize(screenSize);

        tutorialTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        tutorialTitle.setText("Tutorial");

        tutorialText.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        backButtonTutorial.setText("Back");
        backButtonTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonTutorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tutorialPanelLayout = new javax.swing.GroupLayout(tutorialPanel);
        tutorialPanel.setLayout(tutorialPanelLayout);
        tutorialPanelLayout.setHorizontalGroup(
            tutorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorialPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tutorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tutorialPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tutorialText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tutorialPanelLayout.createSequentialGroup()
                        .addComponent(backButtonTutorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(402, 402, 402))
                    .addGroup(tutorialPanelLayout.createSequentialGroup()
                        .addComponent(tutorialTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        tutorialPanelLayout.setVerticalGroup(
            tutorialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tutorialPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tutorialTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tutorialText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(backButtonTutorial)
                .addContainerGap())
        );

        optionsPanel.setEnabled(false);
        optionsPanel.setPreferredSize(screenSize);

        backButtonOptions.setText("Back");
        backButtonOptions.setToolTipText("");
        backButtonOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonOptionsActionPerformed(evt);
            }
        });

        optionsTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        optionsTitle.setText("Options");

        rollDiceButton.setText("" + rollButton);
        rollDiceButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rollDiceButtonPropertyChange(evt);
            }
        });

        controlsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        controlsLabel.setText("Controls");

        diceContolLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        diceContolLabel.setText("Roll Dice");

        volumeControlLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        volumeControlLabel.setText("Volume");

        audioLevelBar.setMajorTickSpacing(10);
        audioLevelBar.setMinorTickSpacing(1);
        audioLevelBar.setSnapToTicks(true);
        audioLevelBar.setValue(audioLevel);
        audioLevelBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        audioLevelBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                audioLevelBarStateChanged(evt);
            }
        });

        audioLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        audioLabel.setText("Audio");

        graphicsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        graphicsLabel.setText("Graphics");

        windowSizeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        windowSizeLabel.setText("Window Size");

        screenSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 x 500", "800 x 600", "1024 x 768", "1920 x 1080" }));
        screenSizeBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                screenSizeBoxPropertyChange(evt);
            }
        });

        resetOptions.setText("Reset to Default");
        resetOptions.setToolTipText("");
        resetOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetOptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(optionsTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, optionsPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(audioLabel)
                                    .addGroup(optionsPanelLayout.createSequentialGroup()
                                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(controlsLabel)
                                            .addComponent(diceContolLabel)
                                            .addGroup(optionsPanelLayout.createSequentialGroup()
                                                .addComponent(volumeControlLabel)
                                                .addGap(11, 11, 11)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(audioLevelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rollDiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(graphicsLabel)
                                    .addComponent(backButtonOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetOptions)))))
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(windowSizeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(screenSizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diceContolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollDiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(audioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumeControlLabel)
                    .addComponent(audioLevelBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(graphicsLabel)
                .addGap(18, 18, 18)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(screenSizeBox)
                    .addComponent(windowSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetOptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButtonOptions)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tutorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tutorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addContainerGap(219, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 57, Short.MAX_VALUE)
                    .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGap(0, 62, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonTutorialActionPerformed
        changePanel(mainMenu);
    }//GEN-LAST:event_backButtonTutorialActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        changePanel(optionsPanel);
    }//GEN-LAST:event_optionsButtonActionPerformed

    private void tutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialButtonActionPerformed
        changePanel(tutorialPanel);
    }//GEN-LAST:event_tutorialButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
                
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
    }//GEN-LAST:event_playButtonActionPerformed

    private void backButtonOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonOptionsActionPerformed
        changePanel(mainMenu);
    }//GEN-LAST:event_backButtonOptionsActionPerformed

    private void resetOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetOptionsActionPerformed
        //Resets the options back to default and updates the options.txt file
        rollButton = 'e';
        rollDiceButton.setText("" + rollButton);
        audioLevel = 0;
        audioLevelBar.setValue(audioLevel);
        screenX = 500;
        screenY = 500;
        screenSize = new Dimension(screenX, screenY);
        File optionsFile = new File("src/main/java/menu/options.txt");
        try {
            optionsFile.delete();
            optionsFile.createNewFile();
            FileWriter optionsWriteFile = new FileWriter(optionsFile);
            optionsWriteFile.write(rollButton + "\n" + audioLevel + "\n" + screenX + "\n" + screenY);
            optionsWriteFile.close();
        } catch (Exception exc) {}
    }//GEN-LAST:event_resetOptionsActionPerformed

    private void audioLevelBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_audioLevelBarStateChanged
        audioLevel = audioLevelBar.getValue();
        File optionsFile = new File("src/main/java/menu/options.txt");
        try {
            optionsFile.delete();
            optionsFile.createNewFile();
            FileWriter optionsWriteFile = new FileWriter(optionsFile);
            optionsWriteFile.write(rollButton + "\n" + audioLevel + "\n" + screenX + "\n" + screenY);
            optionsWriteFile.close();
        } catch (Exception exc) {}
    }//GEN-LAST:event_audioLevelBarStateChanged

    private void rollDiceButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rollDiceButtonPropertyChange
        String temp = rollDiceButton.getText();
        rollButton = temp.charAt(0);
        File optionsFile = new File("src/main/java/menu/options.txt");
        try {
            optionsFile.delete();
            optionsFile.createNewFile();
            FileWriter optionsWriteFile = new FileWriter(optionsFile);
            optionsWriteFile.write(rollButton + "\n" + audioLevel + "\n" + screenX + "\n" + screenY);
            optionsWriteFile.close();
        } catch (Exception exc) {}
    }//GEN-LAST:event_rollDiceButtonPropertyChange

    private void screenSizeBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_screenSizeBoxPropertyChange
        //TODO Make it so that the screenSizeBox changes window size
    }//GEN-LAST:event_screenSizeBoxPropertyChange
    
    private void changePanel(JPanel panel) { // Code from https://stackoverflow.com/questions/5077321/how-could-i-make-the-jframe-content-change-to-corresponding-click
    getContentPane().removeAll();
    getContentPane().add(panel, BorderLayout.CENTER);
    getContentPane().doLayout();
    update(getGraphics());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel audioLabel;
    private javax.swing.JSlider audioLevelBar;
    private javax.swing.JButton backButtonOptions;
    private javax.swing.JButton backButtonTutorial;
    private javax.swing.JLabel controlsLabel;
    private javax.swing.JLabel diceContolLabel;
    private javax.swing.JLabel graphicsLabel;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton optionsButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel optionsTitle;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton resetOptions;
    private javax.swing.JTextField rollDiceButton;
    private javax.swing.JComboBox<String> screenSizeBox;
    private javax.swing.JLabel title;
    private javax.swing.JButton tutorialButton;
    private javax.swing.JPanel tutorialPanel;
    private java.awt.TextArea tutorialText;
    private java.awt.Label tutorialTitle;
    private javax.swing.JLabel volumeControlLabel;
    private javax.swing.JLabel windowSizeLabel;
    // End of variables declaration//GEN-END:variables
}
