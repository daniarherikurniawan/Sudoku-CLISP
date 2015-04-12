package sudokuclisp;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author daniar heri
 */
public class SudokuPanel extends ImagePanelBackGround {

    Font ff = new Font("Arial", Font.BOLD, 23);
    ImageIcon Yellow = new ImageIcon("img/Yellow.png");
    String CurrentValue = new String("9");
    JLabel CurrentLabel = null;
    String NamaFile = new String("Grid2x3.clp");
    public static MakeSound buttonSound = new MakeSound();
    public static boolean exit = false;
    public CLPHandler CLISP = new CLPHandler();

    //relatif thd 1;
    public static String Value[][] = new String[7][7];

    public SudokuPanel(String Path) {
        super(Path);
        initComponents();
        ExitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LoadButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SolveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        RandomButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        HelpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                Value[i][j] = new String("");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        Label22 = new javax.swing.JLabel();
        pane1 = new javax.swing.JPanel();
        Label12 = new javax.swing.JLabel();
        Panel11 = new javax.swing.JPanel();
        Label11 = new javax.swing.JLabel();
        pane3 = new javax.swing.JPanel();
        Label21 = new javax.swing.JLabel();
        pane4 = new javax.swing.JPanel();
        Label13 = new javax.swing.JLabel();
        pane5 = new javax.swing.JPanel();
        Label23 = new javax.swing.JLabel();
        pane6 = new javax.swing.JPanel();
        Label33 = new javax.swing.JLabel();
        pane7 = new javax.swing.JPanel();
        Label43 = new javax.swing.JLabel();
        pane8 = new javax.swing.JPanel();
        Label32 = new javax.swing.JLabel();
        pane9 = new javax.swing.JPanel();
        Label31 = new javax.swing.JLabel();
        pane10 = new javax.swing.JPanel();
        Label41 = new javax.swing.JLabel();
        pane11 = new javax.swing.JPanel();
        Label42 = new javax.swing.JLabel();
        pane12 = new javax.swing.JPanel();
        Label51 = new javax.swing.JLabel();
        pane13 = new javax.swing.JPanel();
        Label52 = new javax.swing.JLabel();
        pane14 = new javax.swing.JPanel();
        Label53 = new javax.swing.JLabel();
        pane15 = new javax.swing.JPanel();
        Label63 = new javax.swing.JLabel();
        pane62 = new javax.swing.JPanel();
        Label62 = new javax.swing.JLabel();
        pane61 = new javax.swing.JPanel();
        Label61 = new javax.swing.JLabel();
        pane2 = new javax.swing.JPanel();
        Label15 = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        Label14 = new javax.swing.JLabel();
        pane36 = new javax.swing.JPanel();
        Label24 = new javax.swing.JLabel();
        pane45 = new javax.swing.JPanel();
        Label54 = new javax.swing.JLabel();
        pane46 = new javax.swing.JPanel();
        Label55 = new javax.swing.JLabel();
        pane47 = new javax.swing.JPanel();
        Label56 = new javax.swing.JLabel();
        pane48 = new javax.swing.JPanel();
        Label66 = new javax.swing.JLabel();
        pane49 = new javax.swing.JPanel();
        Label65 = new javax.swing.JLabel();
        pane50 = new javax.swing.JPanel();
        Label64 = new javax.swing.JLabel();
        pane51 = new javax.swing.JPanel();
        Label25 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JPanel();
        LoadButton = new javax.swing.JPanel();
        SolveButton = new javax.swing.JPanel();
        RandomButton = new javax.swing.JPanel();
        HelpButton = new javax.swing.JPanel();
        Label36 = new javax.swing.JLabel();
        Label26 = new javax.swing.JLabel();
        Label46 = new javax.swing.JLabel();
        Label34 = new javax.swing.JLabel();
        Label35 = new javax.swing.JLabel();
        Label44 = new javax.swing.JLabel();
        Label45 = new javax.swing.JLabel();
        Label16 = new javax.swing.JLabel();

        setOpaque(false);

        pane.setBackground(new java.awt.Color(153, 255, 0));
        pane.setOpaque(false);
        pane.setPreferredSize(new java.awt.Dimension(600, 600));

        Label22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane1.setBackground(new java.awt.Color(102, 255, 255));
        pane1.setOpaque(false);
        pane1.setPreferredSize(new java.awt.Dimension(600, 600));

        Label12.setName("12"); // NOI18N
        Label12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel11.setBackground(new java.awt.Color(102, 255, 255));
        Panel11.setOpaque(false);
        Panel11.setPreferredSize(new java.awt.Dimension(600, 600));
        Panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel11MouseClicked(evt);
            }
        });

        Label11.setName("11"); // NOI18N
        Label11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane3.setBackground(new java.awt.Color(102, 255, 255));
        pane3.setOpaque(false);
        pane3.setPreferredSize(new java.awt.Dimension(600, 600));

        Label21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane3Layout = new javax.swing.GroupLayout(pane3);
        pane3.setLayout(pane3Layout);
        pane3Layout.setHorizontalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane3Layout.setVerticalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane4.setBackground(new java.awt.Color(102, 255, 255));
        pane4.setOpaque(false);
        pane4.setPreferredSize(new java.awt.Dimension(600, 600));

        Label13.setName("12"); // NOI18N
        Label13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane4Layout = new javax.swing.GroupLayout(pane4);
        pane4.setLayout(pane4Layout);
        pane4Layout.setHorizontalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane4Layout.setVerticalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane5.setBackground(new java.awt.Color(102, 255, 255));
        pane5.setOpaque(false);
        pane5.setPreferredSize(new java.awt.Dimension(600, 600));

        Label23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane5Layout = new javax.swing.GroupLayout(pane5);
        pane5.setLayout(pane5Layout);
        pane5Layout.setHorizontalGroup(
            pane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane5Layout.setVerticalGroup(
            pane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane6.setBackground(new java.awt.Color(102, 255, 255));
        pane6.setOpaque(false);
        pane6.setPreferredSize(new java.awt.Dimension(600, 600));

        Label33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane6Layout = new javax.swing.GroupLayout(pane6);
        pane6.setLayout(pane6Layout);
        pane6Layout.setHorizontalGroup(
            pane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane6Layout.setVerticalGroup(
            pane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane7.setBackground(new java.awt.Color(102, 255, 255));
        pane7.setOpaque(false);
        pane7.setPreferredSize(new java.awt.Dimension(600, 600));

        Label43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane7Layout = new javax.swing.GroupLayout(pane7);
        pane7.setLayout(pane7Layout);
        pane7Layout.setHorizontalGroup(
            pane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane7Layout.setVerticalGroup(
            pane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane8.setBackground(new java.awt.Color(102, 255, 255));
        pane8.setOpaque(false);
        pane8.setPreferredSize(new java.awt.Dimension(600, 600));

        Label32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane8Layout = new javax.swing.GroupLayout(pane8);
        pane8.setLayout(pane8Layout);
        pane8Layout.setHorizontalGroup(
            pane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane8Layout.setVerticalGroup(
            pane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane9.setBackground(new java.awt.Color(102, 255, 255));
        pane9.setOpaque(false);
        pane9.setPreferredSize(new java.awt.Dimension(600, 600));

        Label31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane9Layout = new javax.swing.GroupLayout(pane9);
        pane9.setLayout(pane9Layout);
        pane9Layout.setHorizontalGroup(
            pane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane9Layout.setVerticalGroup(
            pane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane10.setBackground(new java.awt.Color(102, 255, 255));
        pane10.setOpaque(false);
        pane10.setPreferredSize(new java.awt.Dimension(600, 600));

        Label41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane10Layout = new javax.swing.GroupLayout(pane10);
        pane10.setLayout(pane10Layout);
        pane10Layout.setHorizontalGroup(
            pane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane10Layout.setVerticalGroup(
            pane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane11.setBackground(new java.awt.Color(102, 255, 255));
        pane11.setOpaque(false);
        pane11.setPreferredSize(new java.awt.Dimension(600, 600));

        Label42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane11Layout = new javax.swing.GroupLayout(pane11);
        pane11.setLayout(pane11Layout);
        pane11Layout.setHorizontalGroup(
            pane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane11Layout.setVerticalGroup(
            pane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane12.setBackground(new java.awt.Color(102, 255, 255));
        pane12.setOpaque(false);
        pane12.setPreferredSize(new java.awt.Dimension(600, 600));

        Label51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label51MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane12Layout = new javax.swing.GroupLayout(pane12);
        pane12.setLayout(pane12Layout);
        pane12Layout.setHorizontalGroup(
            pane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane12Layout.setVerticalGroup(
            pane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane13.setBackground(new java.awt.Color(102, 255, 255));
        pane13.setOpaque(false);
        pane13.setPreferredSize(new java.awt.Dimension(600, 600));

        Label52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label52MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane13Layout = new javax.swing.GroupLayout(pane13);
        pane13.setLayout(pane13Layout);
        pane13Layout.setHorizontalGroup(
            pane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane13Layout.setVerticalGroup(
            pane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane14.setBackground(new java.awt.Color(102, 255, 255));
        pane14.setOpaque(false);
        pane14.setPreferredSize(new java.awt.Dimension(600, 600));

        Label53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label53MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane14Layout = new javax.swing.GroupLayout(pane14);
        pane14.setLayout(pane14Layout);
        pane14Layout.setHorizontalGroup(
            pane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane14Layout.setVerticalGroup(
            pane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label53, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane15.setBackground(new java.awt.Color(102, 255, 255));
        pane15.setOpaque(false);
        pane15.setPreferredSize(new java.awt.Dimension(600, 600));

        Label63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label63MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane15Layout = new javax.swing.GroupLayout(pane15);
        pane15.setLayout(pane15Layout);
        pane15Layout.setHorizontalGroup(
            pane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label63, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane15Layout.setVerticalGroup(
            pane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label63, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane62.setBackground(new java.awt.Color(102, 255, 255));
        pane62.setOpaque(false);
        pane62.setPreferredSize(new java.awt.Dimension(600, 600));

        Label62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane62Layout = new javax.swing.GroupLayout(pane62);
        pane62.setLayout(pane62Layout);
        pane62Layout.setHorizontalGroup(
            pane62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane62Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane62Layout.setVerticalGroup(
            pane62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane62Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane61.setBackground(new java.awt.Color(102, 255, 255));
        pane61.setOpaque(false);
        pane61.setPreferredSize(new java.awt.Dimension(600, 600));

        Label61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label61MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane61Layout = new javax.swing.GroupLayout(pane61);
        pane61.setLayout(pane61Layout);
        pane61Layout.setHorizontalGroup(
            pane61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane61Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane61Layout.setVerticalGroup(
            pane61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane61Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane2.setBackground(new java.awt.Color(102, 255, 255));
        pane2.setOpaque(false);
        pane2.setPreferredSize(new java.awt.Dimension(600, 600));

        Label15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane2Layout = new javax.swing.GroupLayout(pane2);
        pane2.setLayout(pane2Layout);
        pane2Layout.setHorizontalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        pane2Layout.setVerticalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel12.setBackground(new java.awt.Color(102, 255, 255));
        Panel12.setOpaque(false);
        Panel12.setPreferredSize(new java.awt.Dimension(600, 600));
        Panel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel12MouseClicked(evt);
            }
        });

        Label14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane36.setBackground(new java.awt.Color(102, 255, 255));
        pane36.setOpaque(false);
        pane36.setPreferredSize(new java.awt.Dimension(600, 600));

        Label24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane36Layout = new javax.swing.GroupLayout(pane36);
        pane36.setLayout(pane36Layout);
        pane36Layout.setHorizontalGroup(
            pane36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane36Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane36Layout.setVerticalGroup(
            pane36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane36Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane45.setBackground(new java.awt.Color(102, 255, 255));
        pane45.setOpaque(false);
        pane45.setPreferredSize(new java.awt.Dimension(600, 600));

        Label54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label54MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane45Layout = new javax.swing.GroupLayout(pane45);
        pane45.setLayout(pane45Layout);
        pane45Layout.setHorizontalGroup(
            pane45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane45Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane45Layout.setVerticalGroup(
            pane45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane45Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane46.setBackground(new java.awt.Color(102, 255, 255));
        pane46.setOpaque(false);
        pane46.setPreferredSize(new java.awt.Dimension(600, 600));

        Label55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label55MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane46Layout = new javax.swing.GroupLayout(pane46);
        pane46.setLayout(pane46Layout);
        pane46Layout.setHorizontalGroup(
            pane46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane46Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane46Layout.setVerticalGroup(
            pane46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane46Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label55, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane47.setBackground(new java.awt.Color(102, 255, 255));
        pane47.setOpaque(false);
        pane47.setPreferredSize(new java.awt.Dimension(600, 600));

        Label56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label56MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane47Layout = new javax.swing.GroupLayout(pane47);
        pane47.setLayout(pane47Layout);
        pane47Layout.setHorizontalGroup(
            pane47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane47Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label56, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane47Layout.setVerticalGroup(
            pane47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane47Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label56, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane48.setBackground(new java.awt.Color(102, 255, 255));
        pane48.setOpaque(false);
        pane48.setPreferredSize(new java.awt.Dimension(600, 600));

        Label66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label66MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane48Layout = new javax.swing.GroupLayout(pane48);
        pane48.setLayout(pane48Layout);
        pane48Layout.setHorizontalGroup(
            pane48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane48Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label66, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane48Layout.setVerticalGroup(
            pane48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane48Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label66, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane49.setBackground(new java.awt.Color(102, 255, 255));
        pane49.setOpaque(false);
        pane49.setPreferredSize(new java.awt.Dimension(600, 600));

        Label65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label65MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane49Layout = new javax.swing.GroupLayout(pane49);
        pane49.setLayout(pane49Layout);
        pane49Layout.setHorizontalGroup(
            pane49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane49Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label65, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane49Layout.setVerticalGroup(
            pane49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane49Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label65, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane50.setBackground(new java.awt.Color(102, 255, 255));
        pane50.setOpaque(false);
        pane50.setPreferredSize(new java.awt.Dimension(600, 600));

        Label64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label64MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane50Layout = new javax.swing.GroupLayout(pane50);
        pane50.setLayout(pane50Layout);
        pane50Layout.setHorizontalGroup(
            pane50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane50Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label64, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane50Layout.setVerticalGroup(
            pane50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane50Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label64, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pane51.setBackground(new java.awt.Color(153, 255, 0));
        pane51.setOpaque(false);
        pane51.setPreferredSize(new java.awt.Dimension(600, 600));

        Label25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pane51Layout = new javax.swing.GroupLayout(pane51);
        pane51.setLayout(pane51Layout);
        pane51Layout.setHorizontalGroup(
            pane51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane51Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane51Layout.setVerticalGroup(
            pane51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane51Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ExitButton.setBackground(new java.awt.Color(0, 0, 255));
        ExitButton.setOpaque(false);
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ExitButtonLayout = new javax.swing.GroupLayout(ExitButton);
        ExitButton.setLayout(ExitButtonLayout);
        ExitButtonLayout.setHorizontalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        ExitButtonLayout.setVerticalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        LoadButton.setBackground(new java.awt.Color(0, 0, 255));
        LoadButton.setOpaque(false);
        LoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoadButtonLayout = new javax.swing.GroupLayout(LoadButton);
        LoadButton.setLayout(LoadButtonLayout);
        LoadButtonLayout.setHorizontalGroup(
            LoadButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        LoadButtonLayout.setVerticalGroup(
            LoadButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        SolveButton.setBackground(new java.awt.Color(0, 0, 255));
        SolveButton.setOpaque(false);
        SolveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SolveButtonLayout = new javax.swing.GroupLayout(SolveButton);
        SolveButton.setLayout(SolveButtonLayout);
        SolveButtonLayout.setHorizontalGroup(
            SolveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        SolveButtonLayout.setVerticalGroup(
            SolveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        RandomButton.setBackground(new java.awt.Color(0, 0, 255));
        RandomButton.setOpaque(false);
        RandomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RandomButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RandomButtonLayout = new javax.swing.GroupLayout(RandomButton);
        RandomButton.setLayout(RandomButtonLayout);
        RandomButtonLayout.setHorizontalGroup(
            RandomButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        RandomButtonLayout.setVerticalGroup(
            RandomButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        HelpButton.setBackground(new java.awt.Color(0, 0, 255));
        HelpButton.setOpaque(false);
        HelpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HelpButtonLayout = new javax.swing.GroupLayout(HelpButton);
        HelpButton.setLayout(HelpButtonLayout);
        HelpButtonLayout.setHorizontalGroup(
            HelpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        HelpButtonLayout.setVerticalGroup(
            HelpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        Label36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label36MouseClicked(evt);
            }
        });

        Label26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label26MouseClicked(evt);
            }
        });

        Label46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label46MouseClicked(evt);
            }
        });

        Label34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label34MouseClicked(evt);
            }
        });

        Label35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label35MouseClicked(evt);
            }
        });

        Label44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label44MouseClicked(evt);
            }
        });

        Label45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label45MouseClicked(evt);
            }
        });

        Label16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pane15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pane45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pane50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pane46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pane49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pane47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pane48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pane36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pane51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Label45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SolveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(Label46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(184, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pane51, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(SolveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(Label26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pane45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(pane50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pane46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(pane49, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pane47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(pane48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(RandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Label42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label42MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label42;
        CurrentValue = Label42.getText();

        Label42.setText(null);
        Label42.setIcon(Yellow);
        Label42.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label42.removeKeyListener(this);

                    Label42.setHorizontalAlignment(SwingConstants.CENTER);
                    Label42.setIcon(null);
                    CurrentLabel = null;

                    Label42.setFont(ff);
                    Label42.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label42.setText("" + e.getKeyChar());
                        Value[4][2] = "" + e.getKeyChar();
                    } else {
                        Value[4][2] = "";
                        Label42.setText(null);
                    }
                }
            }
        });
        Label42.setFocusable(true);
        Label42.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label42MouseClicked

    private void Label43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label43MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label43;
        CurrentValue = Label43.getText();

        Label43.setText(null);
        Label43.setIcon(Yellow);
        Label43.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label43.removeKeyListener(this);

                    Label43.setHorizontalAlignment(SwingConstants.CENTER);
                    Label43.setIcon(null);
                    CurrentLabel = null;

                    Label43.setFont(ff);
                    Label43.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label43.setText("" + e.getKeyChar());
                        Value[4][3] = "" + e.getKeyChar();
                    } else {
                        Value[4][3] = "";
                        Label43.setText(null);
                    }
                }
            }
        });
        Label43.setFocusable(true);
        Label43.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label43MouseClicked

    private void Label32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label32MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label32;
        CurrentValue = Label32.getText();

        Label32.setText(null);
        Label32.setIcon(Yellow);
        Label32.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label32.removeKeyListener(this);

                    Label32.setHorizontalAlignment(SwingConstants.CENTER);
                    Label32.setIcon(null);
                    CurrentLabel = null;

                    Label32.setFont(ff);
                    Label32.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label32.setText("" + e.getKeyChar());
                        Value[3][2] = "" + e.getKeyChar();
                    } else {
                        Value[3][2] = "";
                        Label32.setText(null);
                    }
                }
            }
        });
        Label32.setFocusable(true);
        Label32.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label32MouseClicked

    private void Label31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label31MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label31;
        CurrentValue = Label31.getText();

        Label31.setText(null);
        Label31.setIcon(Yellow);
        Label31.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label31.removeKeyListener(this);

                    Label31.setHorizontalAlignment(SwingConstants.CENTER);
                    Label31.setIcon(null);
                    CurrentLabel = null;

                    Label31.setFont(ff);
                    Label31.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label31.setText("" + e.getKeyChar());
                        Value[3][1] = "" + e.getKeyChar();
                    } else {
                        Value[3][1] = "";
                        Label31.setText(null);
                    }
                }
            }
        });
        Label31.setFocusable(true);
        Label31.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label31MouseClicked

    private void Label22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label22MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label22;
        CurrentValue = Label22.getText();

        Label22.setText(null);
        Label22.setIcon(Yellow);
        Label22.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label22.removeKeyListener(this);

                    Label22.setHorizontalAlignment(SwingConstants.CENTER);
                    Label22.setIcon(null);
                    CurrentLabel = null;

                    Label22.setFont(ff);
                    Label22.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label22.setText("" + e.getKeyChar());
                        Value[2][2] = "" + e.getKeyChar();
                    } else {
                        Value[2][2] = "";
                        Label22.setText(null);
                    }
                }
            }
        });
        Label22.setFocusable(true);
        Label22.requestFocusInWindow();
    }//GEN-LAST:event_Label22MouseClicked

    private void Label23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label23MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label23;
        CurrentValue = Label23.getText();

        Label23.setText(null);
        Label23.setIcon(Yellow);
        Label23.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label23.removeKeyListener(this);

                    Label23.setHorizontalAlignment(SwingConstants.CENTER);
                    Label23.setIcon(null);
                    CurrentLabel = null;

                    Label23.setFont(ff);
                    Label23.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label23.setText("" + e.getKeyChar());
                        Value[2][3] = "" + e.getKeyChar();
                    } else {
                        Value[2][3] = "";
                        Label23.setText(null);
                    }
                }
            }
        });
        Label23.setFocusable(true);
        Label23.requestFocusInWindow();
    }//GEN-LAST:event_Label23MouseClicked

    private void Label21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label21MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label21;
        CurrentValue = Label21.getText();

        Label21.setText(null);
        Label21.setIcon(Yellow);
        Label21.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label21.removeKeyListener(this);

                    Label21.setHorizontalAlignment(SwingConstants.CENTER);
                    Label21.setIcon(null);
                    CurrentLabel = null;

                    Label21.setFont(ff);
                    Label21.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label21.setText("" + e.getKeyChar());
                        Value[2][1] = "" + e.getKeyChar();
                    } else {
                        Value[2][1] = "";
                        Label21.setText(null);
                    }
                }
            }
        });
        Label21.setFocusable(true);
        Label21.requestFocusInWindow();
    }//GEN-LAST:event_Label21MouseClicked

    private void Panel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel11MouseClicked


    }//GEN-LAST:event_Panel11MouseClicked

    private void Panel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel12MouseClicked

    private void Label24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label24MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label24;
        CurrentValue = Label24.getText();

        Label24.setText(null);
        Label24.setIcon(Yellow);
        Label24.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label24.removeKeyListener(this);

                    Label24.setHorizontalAlignment(SwingConstants.CENTER);
                    Label24.setIcon(null);
                    CurrentLabel = null;

                    Label24.setFont(ff);
                    Label24.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label24.setText("" + e.getKeyChar());
                        Value[2][4] = "" + e.getKeyChar();
                    } else {
                        Value[2][4] = "";
                        Label24.setText(null);
                    }
                }
            }
        });
        Label24.setFocusable(true);
        Label24.requestFocusInWindow();  // TODO add your handling code here:
    }//GEN-LAST:event_Label24MouseClicked

    private void Label16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label16MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label16;
        CurrentValue = Label16.getText();

        Label16.setText(null);
        Label16.setIcon(Yellow);
        Label16.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label16.removeKeyListener(this);

                    Label16.setHorizontalAlignment(SwingConstants.CENTER);
                    Label16.setIcon(null);
                    CurrentLabel = null;

                    Label16.setFont(ff);
                    Label16.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label16.setText("" + e.getKeyChar());
                        Value[1][6] = "" + e.getKeyChar();
                    } else {
                        Value[1][6] = "";
                        Label16.setText(null);
                    }
                }
            }
        });
        Label16.setFocusable(true);
        Label16.requestFocusInWindow();       // TODO add your handling code here:
    }//GEN-LAST:event_Label16MouseClicked

    private void Label26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label26MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label26;
        CurrentValue = Label26.getText();

        Label26.setText(null);
        Label26.setIcon(Yellow);
        Label26.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label26.removeKeyListener(this);

                    Label26.setHorizontalAlignment(SwingConstants.CENTER);
                    Label26.setIcon(null);
                    CurrentLabel = null;

                    Label26.setFont(ff);
                    Label26.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label26.setText("" + e.getKeyChar());
                        Value[2][6] = "" + e.getKeyChar();
                    } else {
                        Value[2][6] = "";
                        Label26.setText(null);
                    }
                }
            }
        });
        Label26.setFocusable(true);
        Label26.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label26MouseClicked

    private void Label46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label46MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label46;
        CurrentValue = Label46.getText();

        Label46.setText(null);
        Label46.setIcon(Yellow);
        Label46.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label46.removeKeyListener(this);

                    Label46.setHorizontalAlignment(SwingConstants.CENTER);
                    Label46.setIcon(null);
                    CurrentLabel = null;

                    Label46.setFont(ff);
                    Label46.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label46.setText("" + e.getKeyChar());
                        Value[4][6] = "" + e.getKeyChar();
                    } else {
                        Value[4][6] = "";
                        Label46.setText(null);
                    }
                }
            }
        });
        Label46.setFocusable(true);
        Label46.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label46MouseClicked

    private void Label44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label44MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label44;
        CurrentValue = Label44.getText();

        Label44.setText(null);
        Label44.setIcon(Yellow);
        Label44.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label44.removeKeyListener(this);

                    Label44.setHorizontalAlignment(SwingConstants.CENTER);
                    Label44.setIcon(null);
                    CurrentLabel = null;

                    Label44.setFont(ff);
                    Label44.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label44.setText("" + e.getKeyChar());
                        Value[4][4] = "" + e.getKeyChar();
                    } else {
                        Value[4][4] = "";
                        Label44.setText(null);
                    }
                }
            }
        });
        Label44.setFocusable(true);
        Label44.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label44MouseClicked

    private void Label45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label45MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label45;
        CurrentValue = Label45.getText();

        Label45.setText(null);
        Label45.setIcon(Yellow);
        Label45.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label45.removeKeyListener(this);

                    Label45.setHorizontalAlignment(SwingConstants.CENTER);
                    Label45.setIcon(null);
                    CurrentLabel = null;

                    Label45.setFont(ff);
                    Label45.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label45.setText("" + e.getKeyChar());
                        Value[4][5] = "" + e.getKeyChar();
                    } else {
                        Value[4][5] = "";
                        Label45.setText(null);
                    }
                }
            }
        });
        Label45.setFocusable(true);
        Label45.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label45MouseClicked

    private void Label25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label25MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label25;
        CurrentValue = Label25.getText();

        Label25.setText(null);
        Label25.setIcon(Yellow);
        Label25.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label25.removeKeyListener(this);

                    Label25.setHorizontalAlignment(SwingConstants.CENTER);
                    Label25.setIcon(null);
                    CurrentLabel = null;

                    Label25.setFont(ff);
                    Label25.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label25.setText("" + e.getKeyChar());
                        Value[2][5] = "" + e.getKeyChar();
                    } else {
                        Value[2][5] = "";
                        Label25.setText(null);
                    }
                }
            }
        });
        Label25.setFocusable(true);
        Label25.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label25MouseClicked

    private void Label12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label12MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label12;
        CurrentValue = Label12.getText();

        Label12.setText(null);
        Label12.setIcon(Yellow);
        Label12.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label12.removeKeyListener(this);

                    Label12.setHorizontalAlignment(SwingConstants.CENTER);
                    Label12.setIcon(null);
                    CurrentLabel = null;

                    Label12.setFont(ff);
                    Label12.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label12.setText("" + e.getKeyChar());
                        Value[1][2] = "" + e.getKeyChar();
                    } else {
                        Value[1][2] = "";
                        Label12.setText(null);
                    }
                }
            }
        });
        Label12.setFocusable(true);
        Label12.requestFocusInWindow();
    }//GEN-LAST:event_Label12MouseClicked

    private void Label14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label14MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label14;
        CurrentValue = Label14.getText();

        Label14.setText(null);
        Label14.setIcon(Yellow);
        Label14.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label14.removeKeyListener(this);

                    Label14.setHorizontalAlignment(SwingConstants.CENTER);
                    Label14.setIcon(null);
                    CurrentLabel = null;

                    Label14.setFont(ff);
                    Label14.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label14.setText("" + e.getKeyChar());
                        Value[1][4] = "" + e.getKeyChar();
                    } else {
                        Value[1][4] = "";
                        Label14.setText(null);
                    }
                }
            }
        });
        Label14.setFocusable(true);
        Label14.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label14MouseClicked

    private void Label15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label15MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label15;
        CurrentValue = Label15.getText();

        Label15.setText(null);
        Label15.setIcon(Yellow);
        Label15.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label15.removeKeyListener(this);

                    Label15.setHorizontalAlignment(SwingConstants.CENTER);
                    Label15.setIcon(null);
                    CurrentLabel = null;

                    Label15.setFont(ff);
                    Label15.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label15.setText("" + e.getKeyChar());
                        Value[1][5] = "" + e.getKeyChar();
                    } else {
                        Value[1][5] = "";
                        Label15.setText(null);
                    }
                }
            }
        });
        Label15.setFocusable(true);
        Label15.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label15MouseClicked

    private void Label11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label11MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label11;
        CurrentValue = Label11.getText();

        Label11.setText(null);
        Label11.setIcon(Yellow);
        Label11.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label11.removeKeyListener(this);

                    Label11.setHorizontalAlignment(SwingConstants.CENTER);
                    Label11.setIcon(null);
                    CurrentLabel = null;

                    Label11.setFont(ff);
                    Label11.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label11.setText("" + e.getKeyChar());
                        Value[1][1] = "" + e.getKeyChar();
                    } else {
                        Value[1][1] = "";
                        Label11.setText(null);
                    }
                }
            }
        });
        Label11.setFocusable(true);
        Label11.requestFocusInWindow();
        //   }
    }//GEN-LAST:event_Label11MouseClicked

    private void Label13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label13MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label13;
        CurrentValue = Label13.getText();

        Label13.setText(null);
        Label13.setIcon(Yellow);
        Label13.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label13.removeKeyListener(this);

                    Label13.setHorizontalAlignment(SwingConstants.CENTER);
                    Label13.setIcon(null);
                    CurrentLabel = null;

                    Label13.setFont(ff);
                    Label13.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label13.setText("" + e.getKeyChar());
                        Value[1][3] = "" + e.getKeyChar();
                    } else {
                        Value[1][3] = "";
                        Label13.setText(null);
                    }
                }
            }
        });
        Label13.setFocusable(true);
        Label13.requestFocusInWindow();
    }//GEN-LAST:event_Label13MouseClicked

    private void Label33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label33MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label33;
        CurrentValue = Label33.getText();

        Label33.setText(null);
        Label33.setIcon(Yellow);
        Label33.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label33.removeKeyListener(this);

                    Label33.setHorizontalAlignment(SwingConstants.CENTER);
                    Label33.setIcon(null);
                    CurrentLabel = null;

                    Label33.setFont(ff);
                    Label33.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label33.setText("" + e.getKeyChar());
                        Value[3][3] = "" + e.getKeyChar();
                    } else {
                        Value[3][3] = "";
                        Label33.setText(null);
                    }
                }
            }
        });
        Label33.setFocusable(true);
        Label33.requestFocusInWindow();
    }//GEN-LAST:event_Label33MouseClicked

    private void Label34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label34MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label34;
        CurrentValue = Label34.getText();

        Label34.setText(null);
        Label34.setIcon(Yellow);
        Label34.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label34.removeKeyListener(this);

                    Label34.setHorizontalAlignment(SwingConstants.CENTER);
                    Label34.setIcon(null);
                    CurrentLabel = null;

                    Label34.setFont(ff);
                    Label34.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label34.setText("" + e.getKeyChar());
                        Value[3][4] = "" + e.getKeyChar();
                    } else {
                        Value[3][4] = "";
                        Label34.setText(null);
                    }
                }
            }
        });
        Label34.setFocusable(true);
        Label34.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label34MouseClicked

    private void Label35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label35MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label35;
        CurrentValue = Label35.getText();

        Label35.setText(null);
        Label35.setIcon(Yellow);
        Label35.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label35.removeKeyListener(this);

                    Label35.setHorizontalAlignment(SwingConstants.CENTER);
                    Label35.setIcon(null);
                    CurrentLabel = null;

                    Label35.setFont(ff);
                    Label35.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label35.setText("" + e.getKeyChar());
                        Value[3][5] = "" + e.getKeyChar();

                    } else {
                        Value[3][5] = "";
                        Label35.setText(null);
                    }
                }
            }
        });
        Label35.setFocusable(true);
        Label35.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label35MouseClicked

    private void Label36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label36MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label36;
        CurrentValue = Label36.getText();

        Label36.setText(null);
        Label36.setIcon(Yellow);
        Label36.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label36.removeKeyListener(this);

                    Label36.setHorizontalAlignment(SwingConstants.CENTER);
                    Label36.setIcon(null);
                    CurrentLabel = null;

                    Label36.setFont(ff);
                    Label36.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label36.setText("" + e.getKeyChar());
                        Value[3][6] = "" + e.getKeyChar();
                    } else {
                        Value[3][6] = "";
                        Label36.setText(null);
                    }
                }
            }
        });
        Label36.setFocusable(true);
        Label36.requestFocusInWindow();           // TODO add your handling code here:
    }//GEN-LAST:event_Label36MouseClicked

    private void Label41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label41MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label41;
        CurrentValue = Label41.getText();

        Label41.setText(null);
        Label41.setIcon(Yellow);
        Label41.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label41.removeKeyListener(this);

                    Label41.setHorizontalAlignment(SwingConstants.CENTER);
                    Label41.setIcon(null);
                    CurrentLabel = null;

                    Label41.setFont(ff);
                    Label41.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label41.setText("" + e.getKeyChar());
                        Value[4][1] = "" + e.getKeyChar();
                    } else {
                        Value[4][1] = "";
                        Label41.setText(null);
                    }
                }
            }
        });
        Label41.setFocusable(true);
        Label41.requestFocusInWindow();
    }//GEN-LAST:event_Label41MouseClicked

    private void Label51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label51MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label51;
        CurrentValue = Label51.getText();

        Label51.setText(null);
        Label51.setIcon(Yellow);
        Label51.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label51.removeKeyListener(this);

                    Label51.setHorizontalAlignment(SwingConstants.CENTER);
                    Label51.setIcon(null);
                    CurrentLabel = null;

                    Label51.setFont(ff);
                    Label51.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label51.setText("" + e.getKeyChar());
                        Value[5][1] = "" + e.getKeyChar();
                    } else {
                        Value[5][1] = "";
                        Label51.setText(null);
                    }
                }
            }
        });
        Label51.setFocusable(true);
        Label51.requestFocusInWindow();
    }//GEN-LAST:event_Label51MouseClicked

    private void Label52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label52MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label52;
        CurrentValue = Label52.getText();

        Label52.setText(null);
        Label52.setIcon(Yellow);
        Label52.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label52.removeKeyListener(this);

                    Label52.setHorizontalAlignment(SwingConstants.CENTER);
                    Label52.setIcon(null);
                    CurrentLabel = null;

                    Label52.setFont(ff);
                    Label52.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label52.setText("" + e.getKeyChar());
                        Value[5][2] = "" + e.getKeyChar();
                    } else {
                        Value[5][2] = "";
                        Label52.setText(null);
                    }
                }
            }
        });
        Label52.setFocusable(true);
        Label52.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label52MouseClicked

    private void Label53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label53MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label53;
        CurrentValue = Label53.getText();

        Label53.setText(null);
        Label53.setIcon(Yellow);
        Label53.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label53.removeKeyListener(this);

                    Label53.setHorizontalAlignment(SwingConstants.CENTER);
                    Label53.setIcon(null);
                    CurrentLabel = null;

                    Label53.setFont(ff);
                    Label53.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label53.setText("" + e.getKeyChar());
                        Value[5][3] = "" + e.getKeyChar();
                    } else {
                        Value[5][3] = "";
                        Label53.setText(null);
                    }
                }
            }
        });
        Label53.setFocusable(true);
        Label53.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label53MouseClicked

    private void Label54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label54MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label54;
        CurrentValue = Label54.getText();

        Label54.setText(null);
        Label54.setIcon(Yellow);
        Label54.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label54.removeKeyListener(this);

                    Label54.setHorizontalAlignment(SwingConstants.CENTER);
                    Label54.setIcon(null);
                    CurrentLabel = null;

                    Label54.setFont(ff);
                    Label54.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label54.setText("" + e.getKeyChar());
                        Value[5][4] = "" + e.getKeyChar();
                    } else {
                        Value[5][4] = "";
                        Label54.setText(null);
                    }
                }
            }
        });
        Label54.setFocusable(true);
        Label54.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label54MouseClicked

    private void Label55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label55MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label55;
        CurrentValue = Label55.getText();

        Label55.setText(null);
        Label55.setIcon(Yellow);
        Label55.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label55.removeKeyListener(this);

                    Label55.setHorizontalAlignment(SwingConstants.CENTER);
                    Label55.setIcon(null);
                    CurrentLabel = null;

                    Label55.setFont(ff);
                    Label55.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label55.setText("" + e.getKeyChar());
                        Value[5][5] = "" + e.getKeyChar();
                    } else {
                        Value[5][5] = "";
                        Label55.setText(null);
                    }
                }
            }
        });
        Label55.setFocusable(true);
        Label55.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label55MouseClicked

    private void Label56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label56MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label56;
        CurrentValue = Label56.getText();

        Label56.setText(null);
        Label56.setIcon(Yellow);
        Label56.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label56.removeKeyListener(this);

                    Label56.setHorizontalAlignment(SwingConstants.CENTER);
                    Label56.setIcon(null);
                    CurrentLabel = null;

                    Label56.setFont(ff);
                    Label56.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label56.setText("" + e.getKeyChar());
                        Value[5][6] = "" + e.getKeyChar();
                    } else {
                        Value[5][6] = "";
                        Label56.setText(null);
                    }
                }
            }
        });
        Label56.setFocusable(true);
        Label56.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label56MouseClicked

    private void Label61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label61MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label61;
        CurrentValue = Label61.getText();

        Label61.setText(null);
        Label61.setIcon(Yellow);
        Label61.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label61.removeKeyListener(this);

                    Label61.setHorizontalAlignment(SwingConstants.CENTER);
                    Label61.setIcon(null);
                    CurrentLabel = null;

                    Label61.setFont(ff);
                    Label61.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label61.setText("" + e.getKeyChar());
                        Value[6][1] = "" + e.getKeyChar();
                    } else {
                        Value[6][1] = "";
                        Label61.setText(null);
                    }
                }
            }
        });
        Label61.setFocusable(true);
        Label61.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_Label61MouseClicked

    private void Label62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label62MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label62;
        CurrentValue = Label62.getText();

        Label62.setText(null);
        Label62.setIcon(Yellow);
        Label62.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label62.removeKeyListener(this);

                    Label62.setHorizontalAlignment(SwingConstants.CENTER);
                    Label62.setIcon(null);
                    CurrentLabel = null;

                    Label62.setFont(ff);
                    Label62.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label62.setText("" + e.getKeyChar());
                        Value[6][2] = "" + e.getKeyChar();
                    } else {
                        Value[6][2] = "";
                        Label62.setText(null);
                    }
                }
            }
        });
        Label62.setFocusable(true);
        Label62.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label62MouseClicked

    private void Label63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label63MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label63;
        CurrentValue = Label63.getText();

        Label63.setText(null);
        Label63.setIcon(Yellow);
        Label63.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label63.removeKeyListener(this);

                    Label63.setHorizontalAlignment(SwingConstants.CENTER);
                    Label63.setIcon(null);
                    CurrentLabel = null;

                    Label63.setFont(ff);
                    Label63.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label63.setText("" + e.getKeyChar());
                        Value[6][3] = "" + e.getKeyChar();
                    } else {
                        Value[6][3] = "";
                        Label63.setText(null);
                    }
                }
            }
        });
        Label63.setFocusable(true);
        Label63.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label63MouseClicked

    private void Label64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label64MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label64;
        CurrentValue = Label64.getText();

        Label64.setText(null);
        Label64.setIcon(Yellow);
        Label64.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label64.removeKeyListener(this);

                    Label64.setHorizontalAlignment(SwingConstants.CENTER);
                    Label64.setIcon(null);
                    CurrentLabel = null;

                    Label64.setFont(ff);
                    Label64.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label64.setText("" + e.getKeyChar());
                        Value[6][4] = "" + e.getKeyChar();
                    } else {
                        Value[6][4] = "";
                        Label64.setText(null);
                    }
                }
            }
        });
        Label64.setFocusable(true);
        Label64.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label64MouseClicked

    private void Label65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label65MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label65;
        CurrentValue = Label65.getText();

        Label65.setText(null);
        Label65.setIcon(Yellow);
        Label65.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label65.removeKeyListener(this);

                    Label65.setHorizontalAlignment(SwingConstants.CENTER);
                    Label65.setIcon(null);
                    CurrentLabel = null;

                    Label65.setFont(ff);
                    Label65.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label65.setText("" + e.getKeyChar());
                        Value[6][5] = "" + e.getKeyChar();
                    } else {
                        Value[6][5] = "";
                        Label65.setText(null);
                    }
                }
            }
        });
        Label65.setFocusable(true);
        Label65.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label65MouseClicked

    private void Label66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label66MouseClicked
        if (CurrentLabel != null) {
            // masih menyeleksi
            CurrentLabel.setText(CurrentValue);
            CurrentLabel.setIcon(null);
        }
        CurrentLabel = Label66;
        CurrentValue = Label66.getText();

        Label66.setText(null);
        Label66.setIcon(Yellow);
        Label66.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                if (isValidInteger(e.getKeyChar())) {
                    Label66.removeKeyListener(this);

                    Label66.setHorizontalAlignment(SwingConstants.CENTER);
                    Label66.setIcon(null);
                    CurrentLabel = null;

                    Label66.setFont(ff);
                    Label66.setVerticalAlignment(SwingConstants.CENTER);
                    if (e.getKeyChar() != '0') {
                        Label66.setText("" + e.getKeyChar());
                        Value[6][6] = "" + e.getKeyChar();
                    } else {
                        Value[6][6] = "";
                        Label66.setText(null);
                    }
                }
            }
        });
        Label66.setFocusable(true);
        Label66.requestFocusInWindow();         // TODO add your handling code here:
    }//GEN-LAST:event_Label66MouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        buttonSound.playSound("music/balllose.wav");
        exit = true;
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void LoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadButtonMouseClicked
        buttonSound.playSound("music/menuclick.wav");

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        switch (result) {
            case JFileChooser.APPROVE_OPTION:
                System.out.println("Approve (Open or Save) was clicked" + chooser.getSelectedFile());
                String pathImage;
                pathImage = chooser.getSelectedFile().getAbsolutePath();
                try {
                    LoadFile(pathImage);
                } catch (IOException ex) {
                    Logger.getLogger(SudokuPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case JFileChooser.CANCEL_OPTION:
                System.out.println("Cancel or the close-dialog icon was clicked");
                break;
            case JFileChooser.ERROR_OPTION:
                System.out.println("Error");
                break;
        }

        SetValueToColumn();

    }//GEN-LAST:event_LoadButtonMouseClicked

    private void SolveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolveButtonMouseClicked
        buttonSound.playSound("music/menuclick.wav");

        //PrintValue();  // TODO add your handling code here:
        CLISP.start();
        SetValueToColumn();
        if (CLPHandler.NumberOfEmpty() != 0) {
            SetValueToColumn();
            CLISP.start();
            SetValueToColumn();
        }
        //SudokuPanel.PrintValue();
    }//GEN-LAST:event_SolveButtonMouseClicked

    private void RandomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandomButtonMouseClicked
        buttonSound.playSound("music/menuclick.wav");
        try {
            int idxRand = randInt(1, 3);
            switch (idxRand) {
                case 1:
                    LoadFile("RandomSeed1.txt");
                    break;
                case 2:
                    LoadFile("RandomSeed2.txt");
                    break;
                case 3:
                    LoadFile("RandomSeed3.txt");
                    break;
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ReduceValue();
        SetValueToColumn();

    }//GEN-LAST:event_RandomButtonMouseClicked

    private void HelpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpButtonMouseClicked
        buttonSound.playSound("music/menuclick.wav");

        MainFrame.SetNewPanel("Help");
    }//GEN-LAST:event_HelpButtonMouseClicked
    private void ReduceValue() {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                int idxRand = randInt(1, 6);
                Value[i][idxRand] = "";
            }
        }
    }

    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public void LoadFile(String Path) throws FileNotFoundException, IOException {
        System.out.println(Path);
        BufferedReader reader = new BufferedReader(new FileReader(Path));
        String line = null;
        int i = 1;
        while ((line = reader.readLine()) != null) {
            String co[] = line.split(" ");
            for (int j = 1; j < 7; j++) {
                if (co[j - 1].contains("*")) {
                    Value[i][j] = "";
                } else {
                    Value[i][j] = co[j - 1];
                }
            }
            // System.out.println(i);
            i++;
        }
        reader.close();
    }

    public static boolean isValidInteger(char ch) {
        if (ch >= '0' && ch <= '6') {
            return true;
        } else {
            return false;
        }
    }

    public static void PrintValue() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                System.out.print(Value[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void SetValueToColumn() {
        Label11.setFont(ff);
        Label12.setFont(ff);
        Label13.setFont(ff);
        Label14.setFont(ff);
        Label15.setFont(ff);
        Label16.setFont(ff);
        Label21.setFont(ff);
        Label22.setFont(ff);
        Label23.setFont(ff);
        Label24.setFont(ff);
        Label25.setFont(ff);
        Label26.setFont(ff);
        Label31.setFont(ff);
        Label32.setFont(ff);
        Label33.setFont(ff);
        Label34.setFont(ff);
        Label35.setFont(ff);
        Label36.setFont(ff);
        Label41.setFont(ff);
        Label42.setFont(ff);
        Label43.setFont(ff);
        Label44.setFont(ff);
        Label45.setFont(ff);
        Label46.setFont(ff);
        Label51.setFont(ff);
        Label52.setFont(ff);
        Label53.setFont(ff);
        Label54.setFont(ff);
        Label55.setFont(ff);
        Label56.setFont(ff);
        Label61.setFont(ff);
        Label62.setFont(ff);
        Label63.setFont(ff);
        Label64.setFont(ff);
        Label65.setFont(ff);
        Label66.setFont(ff);

        Label11.setHorizontalAlignment(SwingConstants.CENTER);
        Label12.setHorizontalAlignment(SwingConstants.CENTER);
        Label13.setHorizontalAlignment(SwingConstants.CENTER);
        Label14.setHorizontalAlignment(SwingConstants.CENTER);
        Label15.setHorizontalAlignment(SwingConstants.CENTER);
        Label16.setHorizontalAlignment(SwingConstants.CENTER);
        Label21.setHorizontalAlignment(SwingConstants.CENTER);
        Label22.setHorizontalAlignment(SwingConstants.CENTER);
        Label23.setHorizontalAlignment(SwingConstants.CENTER);
        Label24.setHorizontalAlignment(SwingConstants.CENTER);
        Label25.setHorizontalAlignment(SwingConstants.CENTER);
        Label26.setHorizontalAlignment(SwingConstants.CENTER);
        Label31.setHorizontalAlignment(SwingConstants.CENTER);
        Label32.setHorizontalAlignment(SwingConstants.CENTER);
        Label33.setHorizontalAlignment(SwingConstants.CENTER);
        Label34.setHorizontalAlignment(SwingConstants.CENTER);
        Label35.setHorizontalAlignment(SwingConstants.CENTER);
        Label36.setHorizontalAlignment(SwingConstants.CENTER);
        Label41.setHorizontalAlignment(SwingConstants.CENTER);
        Label42.setHorizontalAlignment(SwingConstants.CENTER);
        Label43.setHorizontalAlignment(SwingConstants.CENTER);
        Label44.setHorizontalAlignment(SwingConstants.CENTER);
        Label45.setHorizontalAlignment(SwingConstants.CENTER);
        Label46.setHorizontalAlignment(SwingConstants.CENTER);
        Label51.setHorizontalAlignment(SwingConstants.CENTER);
        Label52.setHorizontalAlignment(SwingConstants.CENTER);
        Label53.setHorizontalAlignment(SwingConstants.CENTER);
        Label54.setHorizontalAlignment(SwingConstants.CENTER);
        Label55.setHorizontalAlignment(SwingConstants.CENTER);
        Label56.setHorizontalAlignment(SwingConstants.CENTER);
        Label61.setHorizontalAlignment(SwingConstants.CENTER);
        Label62.setHorizontalAlignment(SwingConstants.CENTER);
        Label63.setHorizontalAlignment(SwingConstants.CENTER);
        Label64.setHorizontalAlignment(SwingConstants.CENTER);
        Label65.setHorizontalAlignment(SwingConstants.CENTER);
        Label66.setHorizontalAlignment(SwingConstants.CENTER);

        Label11.setText(Value[1][1]);
        Label12.setText(Value[1][2]);
        Label13.setText(Value[1][3]);
        Label14.setText(Value[1][4]);
        Label15.setText(Value[1][5]);
        Label16.setText(Value[1][6]);
        Label21.setText(Value[2][1]);
        Label22.setText(Value[2][2]);
        Label23.setText(Value[2][3]);
        Label24.setText(Value[2][4]);
        Label25.setText(Value[2][5]);
        Label26.setText(Value[2][6]);
        Label31.setText(Value[3][1]);
        Label32.setText(Value[3][2]);
        Label33.setText(Value[3][3]);
        Label34.setText(Value[3][4]);
        Label35.setText(Value[3][5]);
        Label36.setText(Value[3][6]);
        Label41.setText(Value[4][1]);
        Label42.setText(Value[4][2]);
        Label43.setText(Value[4][3]);
        Label44.setText(Value[4][4]);
        Label45.setText(Value[4][5]);
        Label46.setText(Value[4][6]);
        Label51.setText(Value[5][1]);
        Label52.setText(Value[5][2]);
        Label53.setText(Value[5][3]);
        Label54.setText(Value[5][4]);
        Label55.setText(Value[5][5]);
        Label56.setText(Value[5][6]);
        Label61.setText(Value[6][1]);
        Label62.setText(Value[6][2]);
        Label63.setText(Value[6][3]);
        Label64.setText(Value[6][4]);
        Label65.setText(Value[6][5]);
        Label66.setText(Value[6][6]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExitButton;
    private javax.swing.JPanel HelpButton;
    private javax.swing.JLabel Label11;
    private javax.swing.JLabel Label12;
    private javax.swing.JLabel Label13;
    private javax.swing.JLabel Label14;
    private javax.swing.JLabel Label15;
    private javax.swing.JLabel Label16;
    private javax.swing.JLabel Label21;
    private javax.swing.JLabel Label22;
    private javax.swing.JLabel Label23;
    private javax.swing.JLabel Label24;
    private javax.swing.JLabel Label25;
    private javax.swing.JLabel Label26;
    private javax.swing.JLabel Label31;
    private javax.swing.JLabel Label32;
    private javax.swing.JLabel Label33;
    private javax.swing.JLabel Label34;
    private javax.swing.JLabel Label35;
    private javax.swing.JLabel Label36;
    private javax.swing.JLabel Label41;
    private javax.swing.JLabel Label42;
    private javax.swing.JLabel Label43;
    private javax.swing.JLabel Label44;
    private javax.swing.JLabel Label45;
    private javax.swing.JLabel Label46;
    private javax.swing.JLabel Label51;
    private javax.swing.JLabel Label52;
    private javax.swing.JLabel Label53;
    private javax.swing.JLabel Label54;
    private javax.swing.JLabel Label55;
    private javax.swing.JLabel Label56;
    private javax.swing.JLabel Label61;
    private javax.swing.JLabel Label62;
    private javax.swing.JLabel Label63;
    private javax.swing.JLabel Label64;
    private javax.swing.JLabel Label65;
    private javax.swing.JLabel Label66;
    private javax.swing.JPanel LoadButton;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel RandomButton;
    private javax.swing.JPanel SolveButton;
    private javax.swing.JPanel pane;
    private javax.swing.JPanel pane1;
    private javax.swing.JPanel pane10;
    private javax.swing.JPanel pane11;
    private javax.swing.JPanel pane12;
    private javax.swing.JPanel pane13;
    private javax.swing.JPanel pane14;
    private javax.swing.JPanel pane15;
    private javax.swing.JPanel pane2;
    private javax.swing.JPanel pane3;
    private javax.swing.JPanel pane36;
    private javax.swing.JPanel pane4;
    private javax.swing.JPanel pane45;
    private javax.swing.JPanel pane46;
    private javax.swing.JPanel pane47;
    private javax.swing.JPanel pane48;
    private javax.swing.JPanel pane49;
    private javax.swing.JPanel pane5;
    private javax.swing.JPanel pane50;
    private javax.swing.JPanel pane51;
    private javax.swing.JPanel pane6;
    private javax.swing.JPanel pane61;
    private javax.swing.JPanel pane62;
    private javax.swing.JPanel pane7;
    private javax.swing.JPanel pane8;
    private javax.swing.JPanel pane9;
    // End of variables declaration//GEN-END:variables
}
