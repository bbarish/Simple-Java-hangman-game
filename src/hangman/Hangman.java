
package hangman;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Hangman extends javax.swing.JFrame {

//Simple hangman game.    
    public Hangman() throws IOException {
        wordArray = new ArrayList();
        initComponents();
        imagecount = 0;
        wincount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("wordlist.txt"))) {
            for (String line; (line = br.readLine()) != null;) {
                wordArray.add(line);
            }
            br.close();
        }

        setWord();
        updateImage();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonA = new javax.swing.JButton();
        buttonB = new javax.swing.JButton();
        buttonC = new javax.swing.JButton();
        buttonD = new javax.swing.JButton();
        buttonE = new javax.swing.JButton();
        buttonF = new javax.swing.JButton();
        buttonG = new javax.swing.JButton();
        buttonH = new javax.swing.JButton();
        buttonI = new javax.swing.JButton();
        buttonJ = new javax.swing.JButton();
        buttonK = new javax.swing.JButton();
        buttonL = new javax.swing.JButton();
        buttonM = new javax.swing.JButton();
        buttonN = new javax.swing.JButton();
        buttonO = new javax.swing.JButton();
        buttonP = new javax.swing.JButton();
        buttonQ = new javax.swing.JButton();
        buttonR = new javax.swing.JButton();
        buttonS = new javax.swing.JButton();
        buttonT = new javax.swing.JButton();
        buttonU = new javax.swing.JButton();
        buttonV = new javax.swing.JButton();
        buttonW = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buttonX = new javax.swing.JButton();
        buttonY = new javax.swing.JButton();
        buttonZ = new javax.swing.JButton();
        buttonRestart = new javax.swing.JButton();
        textArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonA.setText("A");
        buttonA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonA.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAActionPerformed(evt);
            }
        });

        buttonB.setText("B");
        buttonB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonB.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBActionPerformed(evt);
            }
        });

        buttonC.setText("C");
        buttonC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonC.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });

        buttonD.setText("D");
        buttonD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonD.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDActionPerformed(evt);
            }
        });

        buttonE.setText("E");
        buttonE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonE.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEActionPerformed(evt);
            }
        });

        buttonF.setText("F");
        buttonF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonF.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFActionPerformed(evt);
            }
        });

        buttonG.setText("G");
        buttonG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonG.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGActionPerformed(evt);
            }
        });

        buttonH.setText("H");
        buttonH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonH.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHActionPerformed(evt);
            }
        });

        buttonI.setText("I");
        buttonI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonI.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIActionPerformed(evt);
            }
        });

        buttonJ.setText("J");
        buttonJ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonJ.setMaximumSize(new java.awt.Dimension(39, 23));
        buttonJ.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJActionPerformed(evt);
            }
        });

        buttonK.setText("K");
        buttonK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonK.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKActionPerformed(evt);
            }
        });

        buttonL.setText("L");
        buttonL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonL.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLActionPerformed(evt);
            }
        });

        buttonM.setText("M");
        buttonM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonM.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMActionPerformed(evt);
            }
        });

        buttonN.setText("N");
        buttonN.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNActionPerformed(evt);
            }
        });

        buttonO.setText("O");
        buttonO.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOActionPerformed(evt);
            }
        });

        buttonP.setText("P");
        buttonP.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPActionPerformed(evt);
            }
        });

        buttonQ.setText("Q");
        buttonQ.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQActionPerformed(evt);
            }
        });

        buttonR.setText("R");
        buttonR.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRActionPerformed(evt);
            }
        });

        buttonS.setText("S");
        buttonS.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSActionPerformed(evt);
            }
        });

        buttonT.setText("T");
        buttonT.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTActionPerformed(evt);
            }
        });

        buttonU.setText("U");
        buttonU.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUActionPerformed(evt);
            }
        });

        buttonV.setText("V");
        buttonV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonV.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVActionPerformed(evt);
            }
        });

        buttonW.setText("W");
        buttonW.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonW.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        buttonX.setText("X");
        buttonX.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonX.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXActionPerformed(evt);
            }
        });

        buttonY.setText("Y");
        buttonY.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonY.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYActionPerformed(evt);
            }
        });

        buttonZ.setText("Z");
        buttonZ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonZ.setPreferredSize(new java.awt.Dimension(42, 23));
        buttonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZActionPerformed(evt);
            }
        });

        buttonRestart.setText("Restart");
        buttonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestartActionPerformed(evt);
            }
        });

        textArea.setFocusable(false);
        textArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAActionPerformed
        checkIfPresent('a');
        buttonA.setEnabled(false);
        
    }//GEN-LAST:event_buttonAActionPerformed

    private void buttonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBActionPerformed
        checkIfPresent('b');
        buttonB.setEnabled(false);
    }//GEN-LAST:event_buttonBActionPerformed

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCActionPerformed
        checkIfPresent('c');
        buttonC.setEnabled(false);
    }//GEN-LAST:event_buttonCActionPerformed

    private void buttonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDActionPerformed
        checkIfPresent('d');
        buttonD.setEnabled(false);
    }//GEN-LAST:event_buttonDActionPerformed

    private void buttonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEActionPerformed
        checkIfPresent('e');
        buttonE.setEnabled(false);
    }//GEN-LAST:event_buttonEActionPerformed

    private void buttonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFActionPerformed
        checkIfPresent('f');
        buttonF.setEnabled(false);
    }//GEN-LAST:event_buttonFActionPerformed

    private void buttonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGActionPerformed
        checkIfPresent('g');
        buttonG.setEnabled(false);
    }//GEN-LAST:event_buttonGActionPerformed

    private void buttonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHActionPerformed
        checkIfPresent('h');
        buttonH.setEnabled(false);
    }//GEN-LAST:event_buttonHActionPerformed

    private void buttonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIActionPerformed
        checkIfPresent('i');
        buttonI.setEnabled(false);
    }//GEN-LAST:event_buttonIActionPerformed

    private void buttonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJActionPerformed
        checkIfPresent('j');
        buttonJ.setEnabled(false);
    }//GEN-LAST:event_buttonJActionPerformed

    private void buttonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKActionPerformed
        checkIfPresent('k');
        buttonK.setEnabled(false);
    }//GEN-LAST:event_buttonKActionPerformed

    private void buttonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLActionPerformed
        checkIfPresent('l');
        buttonL.setEnabled(false);
    }//GEN-LAST:event_buttonLActionPerformed

    private void buttonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMActionPerformed
        checkIfPresent('m');
        buttonM.setEnabled(false);
    }//GEN-LAST:event_buttonMActionPerformed

    private void buttonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNActionPerformed
        checkIfPresent('n');
        buttonN.setEnabled(false);
    }//GEN-LAST:event_buttonNActionPerformed

    private void buttonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOActionPerformed
        checkIfPresent('o');
        buttonO.setEnabled(false);
    }//GEN-LAST:event_buttonOActionPerformed

    private void buttonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPActionPerformed
        checkIfPresent('p');
        buttonP.setEnabled(false);
    }//GEN-LAST:event_buttonPActionPerformed

    private void buttonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQActionPerformed
        checkIfPresent('q');
        buttonQ.setEnabled(false);
    }//GEN-LAST:event_buttonQActionPerformed

    private void buttonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRActionPerformed
        checkIfPresent('r');
        buttonR.setEnabled(false);
    }//GEN-LAST:event_buttonRActionPerformed

    private void buttonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSActionPerformed
        checkIfPresent('s');
        buttonS.setEnabled(false);
    }//GEN-LAST:event_buttonSActionPerformed

    private void buttonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTActionPerformed
        checkIfPresent('t');
        buttonT.setEnabled(false);
    }//GEN-LAST:event_buttonTActionPerformed

    private void buttonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUActionPerformed
        checkIfPresent('u');
        buttonU.setEnabled(false);
    }//GEN-LAST:event_buttonUActionPerformed

    private void buttonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVActionPerformed
        checkIfPresent('v');
        buttonV.setEnabled(false);
    }//GEN-LAST:event_buttonVActionPerformed

    private void buttonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWActionPerformed
        checkIfPresent('w');
        buttonW.setEnabled(false);
    }//GEN-LAST:event_buttonWActionPerformed

    private void buttonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXActionPerformed
        checkIfPresent('x');
        buttonX.setEnabled(false);
    }//GEN-LAST:event_buttonXActionPerformed

    private void buttonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYActionPerformed
        checkIfPresent('y');
        buttonY.setEnabled(false);
    }//GEN-LAST:event_buttonYActionPerformed

    private void buttonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZActionPerformed
        checkIfPresent('z');
        buttonZ.setEnabled(false);
    }//GEN-LAST:event_buttonZActionPerformed

    private void buttonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestartActionPerformed
        imagecount = 0;
        wincount = 0;
        jPanel1.removeAll();
        buttonW.setEnabled(true);
        setWord();
        updateImage();
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
        buttonE.setEnabled(true);
        buttonF.setEnabled(true);
        buttonG.setEnabled(true);
        buttonH.setEnabled(true);
        buttonI.setEnabled(true);
        buttonJ.setEnabled(true);
        buttonK.setEnabled(true);
        buttonL.setEnabled(true);
        buttonM.setEnabled(true);
        buttonN.setEnabled(true);
        buttonO.setEnabled(true);
        buttonP.setEnabled(true);
        buttonQ.setEnabled(true);
        buttonR.setEnabled(true);
        buttonS.setEnabled(true);
        buttonT.setEnabled(true);
        buttonU.setEnabled(true);
        buttonV.setEnabled(true);
        buttonW.setEnabled(true);
        buttonX.setEnabled(true);
        buttonY.setEnabled(true);
        buttonZ.setEnabled(true);        
    }//GEN-LAST:event_buttonRestartActionPerformed

    private void textAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaActionPerformed

    private void checkIfPresent(char c) {
        if (imagecount != 6) {
            boolean incorrect = true;
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    incorrect = false;
                    display[i] = c + "   ";
                    wincount ++;
                }
            }
            updateDisplay();
            
            if(wincount == word.length()){
                jPanel1.removeAll();
                BufferedImage myPicture = null;
                try {
                    myPicture = ImageIO.read(new File("win.png"));
                } catch (IOException ex) {
                    Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
                }
                hangmanPic = new javax.swing.JLabel(new ImageIcon(myPicture));
                jPanel1.add(hangmanPic);
                hangmanPic.setBounds(0, 0, 618, 288);                                
            }
            
            if (incorrect) {
                imagecount++;
                updateImage();
            }

        }
    }

    private void setWord() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(wordArray.size());
        word = wordArray.get(randomInt);
        display = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            display[i] = "__    ";
        }
        updateDisplay();        
    }

    private void updateDisplay() {
        String tempDisplay = "";
        for (int i = 0; i < word.length(); i++) {
            tempDisplay += display[i];
        }
        textArea.setText(tempDisplay);
    }

    private void updateImage() {
        BufferedImage myPicture = null;

        try {
            myPicture = ImageIO.read(new File("Hangman" + imagecount + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
        }
        hangmanPic = new javax.swing.JLabel(new ImageIcon(myPicture));
        jPanel1.add(hangmanPic);
        hangmanPic.setBounds(0, 0, 618, 288);

        if (imagecount == 6) {
            textArea.setText("You Lose. Word was: " + word);
        }

    }

   
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
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            new Hangman().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonA;
    private javax.swing.JButton buttonB;
    private javax.swing.JButton buttonC;
    private javax.swing.JButton buttonD;
    private javax.swing.JButton buttonE;
    private javax.swing.JButton buttonF;
    private javax.swing.JButton buttonG;
    private javax.swing.JButton buttonH;
    private javax.swing.JButton buttonI;
    private javax.swing.JButton buttonJ;
    private javax.swing.JButton buttonK;
    private javax.swing.JButton buttonL;
    private javax.swing.JButton buttonM;
    private javax.swing.JButton buttonN;
    private javax.swing.JButton buttonO;
    private javax.swing.JButton buttonP;
    private javax.swing.JButton buttonQ;
    private javax.swing.JButton buttonR;
    private javax.swing.JButton buttonRestart;
    private javax.swing.JButton buttonS;
    private javax.swing.JButton buttonT;
    private javax.swing.JButton buttonU;
    private javax.swing.JButton buttonV;
    private javax.swing.JButton buttonW;
    private javax.swing.JButton buttonX;
    private javax.swing.JButton buttonY;
    private javax.swing.JButton buttonZ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textArea;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel hangmanPic;
    private ArrayList<String> wordArray;
    private String word;
    private String display[];
    private int wincount;
    private int imagecount;
}
