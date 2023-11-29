/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.awt.*;
import javax.swing.*;
import team11.bored.game.GamePanel;

/**
 *
 * @author Sidney, Shane
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainMenu = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        tutorialButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tutorialPanel = new javax.swing.JPanel();
        tutorialTitle = new java.awt.Label();
        tutorialText = new java.awt.TextArea();
        backButtonTutorial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        optionsPanel = new javax.swing.JPanel();
        backButtonOptions = new javax.swing.JButton();
        optionsTitle = new javax.swing.JLabel();
        controlsLabel = new javax.swing.JLabel();
        diceContolLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        volumeControlLabel = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        audioLabel = new javax.swing.JLabel();
        graphicsLabel = new javax.swing.JLabel();
        windowSizeLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        mainMenu.setPreferredSize(new java.awt.Dimension(500, 500));
        mainMenu.setLayout(null);

        title.setBackground(new java.awt.Color(204, 204, 255));
        title.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuRender/Title-small.png"))); // NOI18N
        mainMenu.add(title);
        title.setBounds(6, 135, 488, 66);

        playButton.setText("Play");
        playButton.setBorderPainted(false);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                playButtonActionPerformed(evt);
            }
        });
        mainMenu.add(playButton);
        playButton.setBounds(206, 254, 84, 31);

        tutorialButton.setText("Tutorial");
        tutorialButton.setBorderPainted(false);
        tutorialButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tutorialButtonActionPerformed(evt);
            }
        });
        mainMenu.add(tutorialButton);
        tutorialButton.setBounds(206, 303, 84, 23);

        optionsButton.setText("Options");
        optionsButton.setBorderPainted(false);
        optionsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                optionsButtonActionPerformed(evt);
            }
        });
        mainMenu.add(optionsButton);
        optionsButton.setBounds(206, 344, 84, 23);

        quitButton.setText("Quit");
        quitButton.setBorderPainted(false);
        quitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quitButtonActionPerformed(evt);
            }
        });
        mainMenu.add(quitButton);
        quitButton.setBounds(206, 385, 84, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuRender/Paper-small.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        mainMenu.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 500);

        tutorialPanel.setEnabled(false);
        tutorialPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        tutorialPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tutorialTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tutorialTitle.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        tutorialTitle.setText("Tutorial");
        tutorialPanel.add(tutorialTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        tutorialText.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tutorialPanel.add(tutorialText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 390, 360));

        backButtonTutorial.setText("Back");
        backButtonTutorial.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonTutorialActionPerformed(evt);
            }
        });
        tutorialPanel.add(backButtonTutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuRender/Paper-small.png"))); // NOI18N
        tutorialPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        optionsPanel.setEnabled(false);
        optionsPanel.setPreferredSize(new java.awt.Dimension(500, 500));
        optionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButtonOptions.setText("Back");
        backButtonOptions.setToolTipText("");
        backButtonOptions.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonOptionsActionPerformed(evt);
            }
        });
        optionsPanel.add(backButtonOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 88, -1));

        optionsTitle.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        optionsTitle.setForeground(new java.awt.Color(0, 0, 0));
        optionsTitle.setText("Options");
        optionsPanel.add(optionsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        controlsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        controlsLabel.setForeground(new java.awt.Color(0, 0, 0));
        controlsLabel.setText("Controls");
        optionsPanel.add(controlsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        diceContolLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        diceContolLabel.setForeground(new java.awt.Color(0, 0, 0));
        diceContolLabel.setText("Roll Dice");
        optionsPanel.add(diceContolLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 27));

        jTextPane1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTextPane1.setText("E");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                jTextPane1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTextPane1);

        optionsPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 26, -1));

        volumeControlLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        volumeControlLabel.setForeground(new java.awt.Color(0, 0, 0));
        volumeControlLabel.setText("Volume");
        optionsPanel.add(volumeControlLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        volumeSlider.setMajorTickSpacing(10);
        volumeSlider.setMinorTickSpacing(1);
        volumeSlider.setSnapToTicks(true);
        volumeSlider.setValue(0);
        volumeSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        optionsPanel.add(volumeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, 26));

        audioLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        audioLabel.setForeground(new java.awt.Color(0, 0, 0));
        audioLabel.setText("Audio");
        optionsPanel.add(audioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        graphicsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        graphicsLabel.setForeground(new java.awt.Color(0, 0, 0));
        graphicsLabel.setText("Graphics");
        optionsPanel.add(graphicsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        windowSizeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        windowSizeLabel.setForeground(new java.awt.Color(0, 0, 0));
        windowSizeLabel.setText("Window Size");
        optionsPanel.add(windowSizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500 x 500", "800 x 600", "1024 x 768", "1920 x 1080" }));
        optionsPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 86, 26));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuRender/Paper-small.png"))); // NOI18N
        optionsPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tutorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 519, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tutorialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addContainerGap(278, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void jTextPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextPane1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane1PropertyChange
    
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
    private javax.swing.JButton backButtonOptions;
    private javax.swing.JButton backButtonTutorial;
    private javax.swing.JLabel background;
    private javax.swing.JLabel controlsLabel;
    private javax.swing.JLabel diceContolLabel;
    private javax.swing.JLabel graphicsLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton optionsButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel optionsTitle;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton tutorialButton;
    private javax.swing.JPanel tutorialPanel;
    private java.awt.TextArea tutorialText;
    private java.awt.Label tutorialTitle;
    private javax.swing.JLabel volumeControlLabel;
    private javax.swing.JSlider volumeSlider;
    private javax.swing.JLabel windowSizeLabel;
    // End of variables declaration//GEN-END:variables
}
