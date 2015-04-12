/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudokuclisp;

import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author daniar heri
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    public static final int FRAME_WIDTH = 915;
    public static final int FRAME_HEIGHT = 640;
    public static BufferedImage Image = null;
    public static BufferedImage MarkedAllImage = null;
    
    public static JPanel BasePanel = new JPanel();
    public SudokuPanel SudokuPane = new SudokuPanel("img/BackGround.png");
    public HelpPanel HelpPane = new HelpPanel("img/Help.png");
    
    public MainFrame() {
        super("SUDOKU");        
        
        BasePanel.setLayout(new CardLayout());
        BasePanel.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        initComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        BasePanel.add(SudokuPane,"Sudoku");
        BasePanel.add(HelpPane,"Help");
        add(BasePanel);
        setVisible(true);
    }

    public static void SetNewPanel(String PanelName){
        CardLayout cardLayout = (CardLayout)BasePanel.getLayout();
        cardLayout.show(BasePanel, PanelName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}