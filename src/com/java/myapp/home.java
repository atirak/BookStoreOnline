package com.java.myapp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.QueryBuilder;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class home extends javax.swing.JFrame {
    public home() {        
        initComponents();
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icons8_General_Ledger_50px.png")));
            setWin();
            createArray(); 
            tm.start(); 
    }
public void close(){
        WindowEvent winclose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
        tm.stop();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusbar = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        sh_book = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        panelEdit = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        n_au = new javax.swing.JTextField();
        n_book = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        im_book = new javax.swing.JTextField();
        EX_book2 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        P_book = new javax.swing.JTextField();
        deskill = new javax.swing.JButton();
        upskill = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton25 = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        EX_book = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jprice = new javax.swing.JTextField();
        n_author = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jnum = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        name_book = new javax.swing.JTextField();
        dtskill = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jImgUP = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panelAllBookImg = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        panelAllBook = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        panelBook = new javax.swing.JPanel();
        imgs = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton13 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        panelRegis = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JPasswordField();
        jTextField7 = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel75 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        panelRule = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        panelLogin = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JPasswordField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        panelBasket = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        credit = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        panelHome = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bookburi : Book Online Shopping");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setText("version : 1.4.0");
        statusbar.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel85.setText("status : Online");
        statusbar.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        getContentPane().add(statusbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1050, 20));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(1024, 60));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ekkamai Standard", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(215, 168, 111));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Male User_28px.png"))); // NOI18N
        jLabel1.setText("ผู้เยี่ยมชม");
        panelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 240, 40));

        jPanel14.setBackground(new java.awt.Color(235, 198, 128));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(235, 198, 128));
        jButton4.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Open Book_26px.png"))); // NOI18N
        jButton4.setText("หนังสือทั้งหมด");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 160, 40));

        jButton17.setBackground(new java.awt.Color(235, 198, 128));
        jButton17.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Home_26px_1.png"))); // NOI18N
        jButton17.setText("หน้าหลัก");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setFocusable(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        jButton1.setBackground(new java.awt.Color(235, 198, 128));
        jButton1.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Name_26px.png"))); // NOI18N
        jButton1.setText("เข้าสู่ระบบ");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 120, 40));

        jButton5.setBackground(new java.awt.Color(235, 198, 128));
        jButton5.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Shopping Cart_26px tarang.png"))); // NOI18N
        jButton5.setText("0");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 80, 40));

        sh_book.setBackground(new java.awt.Color(235, 198, 128));
        sh_book.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        sh_book.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sh_book.setText("กรอกเพื่อค้นหา");
        sh_book.setBorder(null);
        sh_book.setCaretColor(new java.awt.Color(255, 255, 255));
        sh_book.setRequestFocusEnabled(false);
        sh_book.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        sh_book.setSelectionColor(new java.awt.Color(255, 255, 255));
        sh_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sh_bookMouseClicked(evt);
            }
        });
        jPanel14.add(sh_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 100, 40));

        jButton11.setBackground(new java.awt.Color(235, 198, 128));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Search_26px.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Search Bar_26px.png"))); // NOI18N
        jPanel14.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 5, 30, 30));

        jButton2.setBackground(new java.awt.Color(235, 198, 128));
        jButton2.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Edit Column_26px white.png"))); // NOI18N
        jButton2.setText("แก้ไขหนังสือ");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, 40));

        panelMenu.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1080, 40));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/LOGO BBR Store.png"))); // NOI18N
        panelMenu.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 60));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/TITLE Contact .png"))); // NOI18N
        panelMenu.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 230, 60));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        panelEdit.setBackground(new java.awt.Color(255, 255, 255));
        panelEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 250, 240));
        jPanel17.setEnabled(false);
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Ekkamai Standard", 1, 24)); // NOI18N
        jLabel38.setForeground(java.awt.Color.darkGray);
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Edit_26px.png"))); // NOI18N
        jLabel38.setText("แก้ไขและลบหนังสือ");
        jPanel17.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 260, 40));

        jButton24.setBackground(new java.awt.Color(235, 198, 128));
        jButton24.setFont(new java.awt.Font("Ekkamai Standard", 1, 15)); // NOI18N
        jButton24.setForeground(new java.awt.Color(51, 51, 51));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Add Folder_15px.png"))); // NOI18N
        jButton24.setText("เพิ่มหนังสือ");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 130, 30));

        search.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel17.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 200, 30));

        jButton20.setBackground(new java.awt.Color(235, 198, 128));
        jButton20.setFont(new java.awt.Font("Ekkamai Standard", 1, 15)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 51, 51));
        jButton20.setText("ค้นหา");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 90, 30));

        jLabel44.setFont(new java.awt.Font("Ekkamai Standard", 1, 16)); // NOI18N
        jLabel44.setForeground(java.awt.Color.darkGray);
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Search_21px.png"))); // NOI18N
        jLabel44.setText("ค้นหาหนังสือ");
        jPanel17.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 130, 30));

        jLabel45.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel45.setForeground(java.awt.Color.darkGray);
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Book_21px.png"))); // NOI18N
        jLabel45.setText("ชื่อหนังสือ");
        jPanel17.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 30));

        jLabel48.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel48.setForeground(java.awt.Color.darkGray);
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Administrator Male_20px.png"))); // NOI18N
        jLabel48.setText("ชื่อผู้แต่ง");
        jPanel17.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 30));

        n_au.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        n_au.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_auActionPerformed(evt);
            }
        });
        jPanel17.add(n_au, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, 30));

        n_book.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        n_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_bookActionPerformed(evt);
            }
        });
        jPanel17.add(n_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, 30));

        jLabel56.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel56.setForeground(java.awt.Color.darkGray);
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Apartment_20px.png"))); // NOI18N
        jLabel56.setText("สำนักพิมพ์");
        jPanel17.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, -1));

        jLabel53.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel53.setForeground(java.awt.Color.darkGray);
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Today_20px.png"))); // NOI18N
        jLabel53.setText("ปีที่พิมพ์");
        jPanel17.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, -1));

        jComboBox5.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2540", "2541", "2542", "2543", "2544", "2545", "2546", "2547", "2548", "2549", "2550", "2551", "2252", "2553", "2554", "2555", "2556", "2557", "2558", "2559", "2560", "2561" }));
        jPanel17.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 70, -1));

        jComboBox4.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "สำนักพิมพ์แสงดาว", "สำนักพิมพ์โนเบิ้ลบุ๊คส์", "สำนักพิมพ์บีเวลล์ สปีเชียล" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel17.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 190, 30));

        im_book.setEditable(false);
        im_book.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        im_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_bookActionPerformed(evt);
            }
        });
        jPanel17.add(im_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 180, 30));

        EX_book2.setBackground(new java.awt.Color(235, 198, 128));
        EX_book2.setFont(new java.awt.Font("Ekkamai Standard", 1, 13)); // NOI18N
        EX_book2.setForeground(new java.awt.Color(51, 51, 51));
        EX_book2.setText("อัพโหลดรูป");
        EX_book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EX_book2ActionPerformed(evt);
            }
        });
        jPanel17.add(EX_book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 120, 30));

        jLabel59.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel59.setForeground(java.awt.Color.darkGray);
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Xlarge Icons_20px.png"))); // NOI18N
        jLabel59.setText("รูปหนังสือ");
        jPanel17.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 110, 30));

        jComboBox3.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วรรณกรรม", "ประวัติศาสตร์", "วรรณคดีไทย", "สุขภาพ-ความงาม", "ชีวประวัติ", "สารคดี", "ปรัชญา", "นวนิยาย", "ความเชื่อ", "อัตชีวประวัติ", "ภาษา", "วิทยาศาสตร์", "โหราศาสตร์", "นวนิยาย", "จิตวิทยา", "พระราชประวัติ" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel17.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 190, 30));

        jLabel49.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel49.setForeground(java.awt.Color.darkGray);
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Bulleted List_20px.png"))); // NOI18N
        jLabel49.setText("ประเภทหนังสือ");
        jPanel17.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 30));

        jLabel58.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel58.setForeground(java.awt.Color.darkGray);
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Geography_20px.png"))); // NOI18N
        jLabel58.setText("ภาษาที่ใช้เขียน");
        jPanel17.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 30));

        jComboBox2.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ไทย", "english" }));
        jPanel17.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 100, 30));

        jLabel60.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel60.setForeground(java.awt.Color.darkGray);
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Literature_20px.png"))); // NOI18N
        jLabel60.setText("จำนวนหน้า");
        jPanel17.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 30));

        np.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        jPanel17.add(np, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 30));

        jLabel47.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel47.setForeground(java.awt.Color.darkGray);
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Pricing_20px.png"))); // NOI18N
        jLabel47.setText("ราคา");
        jPanel17.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 30));

        P_book.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        P_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_bookActionPerformed(evt);
            }
        });
        jPanel17.add(P_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 190, 30));

        deskill.setBackground(new java.awt.Color(235, 198, 128));
        deskill.setFont(new java.awt.Font("Ekkamai Standard", 1, 13)); // NOI18N
        deskill.setForeground(new java.awt.Color(51, 51, 51));
        deskill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Trash_20px.png"))); // NOI18N
        deskill.setText("ลบหนังสือ");
        deskill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskillActionPerformed(evt);
            }
        });
        jPanel17.add(deskill, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 160, 40));

        upskill.setBackground(new java.awt.Color(235, 198, 128));
        upskill.setFont(new java.awt.Font("Ekkamai Standard", 1, 12)); // NOI18N
        upskill.setForeground(new java.awt.Color(51, 51, 51));
        upskill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Save_20px.png"))); // NOI18N
        upskill.setText("บันทึกการแก้ไข");
        upskill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upskillActionPerformed(evt);
            }
        });
        jPanel17.add(upskill, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 160, 40));

        jLabel61.setFont(new java.awt.Font("Ekkamai Standard", 0, 10)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel17.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, 130));

        jTable1.setFont(new java.awt.Font("Ekkamai Standard", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane5.setViewportView(jTable1);

        jPanel17.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 350, 290));

        jButton25.setBackground(new java.awt.Color(235, 198, 128));
        jButton25.setFont(new java.awt.Font("Ekkamai Standard", 1, 10)); // NOI18N
        jButton25.setForeground(new java.awt.Color(51, 51, 51));
        jButton25.setText("เลือกจากตาราง");
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 120, 30));

        panelEdit.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 900, 490));

        getContentPane().add(panelEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(255, 250, 240));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EX_book.setBackground(new java.awt.Color(235, 198, 128));
        EX_book.setFont(new java.awt.Font("Ekkamai Standard", 1, 14)); // NOI18N
        EX_book.setForeground(new java.awt.Color(51, 51, 51));
        EX_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/FTP_24px.png"))); // NOI18N
        EX_book.setText("อัพโหลดรูป");
        EX_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EX_bookActionPerformed(evt);
            }
        });
        jPanel20.add(EX_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 170, 30));

        jLabel87.setFont(new java.awt.Font("Ekkamai Standard", 1, 24)); // NOI18N
        jLabel87.setForeground(java.awt.Color.darkGray);
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Add Folder_24px.png"))); // NOI18N
        jLabel87.setText("เพิ่มข้อมูลหนังสือ");
        jPanel20.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 270, 50));

        jLabel102.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel102.setForeground(java.awt.Color.darkGray);
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Geography_20px.png"))); // NOI18N
        jLabel102.setText("ภาษาที่ใช้เขียน");
        jPanel20.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 30));

        jprice.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpriceActionPerformed(evt);
            }
        });
        jPanel20.add(jprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 221, -1));

        n_author.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        n_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_authorActionPerformed(evt);
            }
        });
        jPanel20.add(n_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 221, -1));

        jComboBox7.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกสำนักพิมพ์", "สำนักพิมพ์แสงดาว", "สำนักพิมพ์โนเบิ้ลบุ๊คส์", "สำนักพิมพ์บีเวลล์ สปีเชียล" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel20.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, -1));

        jnum.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jPanel20.add(jnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 221, -1));

        jComboBox6.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกประเภท", "วรรณกรรม", "ประวัติศาสตร์", "วรรณคดีไทย", "สุขภาพ-ความงาม", "ชีวประวัติ", "สารคดี", "ปรัชญา", "นวนิยาย", "ความเชื่อ", "อัตชีวประวัติ", "ภาษา", "วิทยาศาสตร์", "โหราศาสตร์", "นวนิยาย", "จิตวิทยา", "พระราชประวัติ" }));
        jPanel20.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jComboBox8.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกปี", "2540", "2541", "2542", "2543", "2544", "2545", "2546", "2547", "2548", "2549", "2550", "2551", "2252", "2553", "2554", "2555", "2556", "2557", "2558", "2559", "2560", "2561" }));
        jPanel20.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 150, -1));

        jComboBox9.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกภาษา", "ไทย", "english" }));
        jPanel20.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, -1));

        jLabel50.setFont(new java.awt.Font("Ekkamai Standard", 0, 10)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel20.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 120, 160));

        jLabel88.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel88.setForeground(java.awt.Color.darkGray);
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Book_21px.png"))); // NOI18N
        jLabel88.setText("ชื่อหนังสือ");
        jPanel20.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 30));

        name_book.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jPanel20.add(name_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 221, -1));

        dtskill.setBackground(new java.awt.Color(235, 198, 128));
        dtskill.setFont(new java.awt.Font("Ekkamai Standard", 1, 14)); // NOI18N
        dtskill.setForeground(new java.awt.Color(51, 51, 51));
        dtskill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Save_20px.png"))); // NOI18N
        dtskill.setText("บันทึกการเพิ่มข้อมูล");
        dtskill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtskillActionPerformed(evt);
            }
        });
        jPanel20.add(dtskill, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 190, 60));

        jLabel100.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel100.setForeground(java.awt.Color.darkGray);
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Apartment_20px.png"))); // NOI18N
        jLabel100.setText("สำนักพิมพ์");
        jPanel20.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        jLabel103.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel103.setForeground(java.awt.Color.darkGray);
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Literature_20px.png"))); // NOI18N
        jLabel103.setText("จำนวนหน้า");
        jPanel20.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 30));

        jImgUP.setEditable(false);
        jImgUP.setFont(new java.awt.Font("Ekkamai Standard", 0, 15)); // NOI18N
        jImgUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImgUPActionPerformed(evt);
            }
        });
        jPanel20.add(jImgUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 170, 30));

        jLabel99.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel99.setForeground(java.awt.Color.darkGray);
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Pricing_20px.png"))); // NOI18N
        jLabel99.setText("ราคา");
        jPanel20.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        jLabel90.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel90.setForeground(java.awt.Color.darkGray);
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Xlarge Icons_20px.png"))); // NOI18N
        jLabel90.setText("รูปหนังสือ");
        jPanel20.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, 30));

        jLabel89.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel89.setForeground(java.awt.Color.darkGray);
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Administrator Male_20px.png"))); // NOI18N
        jLabel89.setText("ชื่อผู้แต่ง");
        jPanel20.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        jLabel91.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel91.setForeground(java.awt.Color.darkGray);
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Bulleted List_20px.png"))); // NOI18N
        jLabel91.setText("ประเภทหนังสือ");
        jPanel20.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));

        jLabel105.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel105.setForeground(java.awt.Color.darkGray);
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Today_20px.png"))); // NOI18N
        jLabel105.setText("ปีที่พิมพ์");
        jPanel20.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 30));

        jTable3.setFont(new java.awt.Font("Ekkamai Standard", 0, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setRowHeight(25);
        jScrollPane8.setViewportView(jTable3);

        jPanel20.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 350, 290));

        panelAdd.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 900, 490));

        getContentPane().add(panelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelAllBookImg.setBackground(new java.awt.Color(255, 255, 255));
        panelAllBookImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel123.setFont(new java.awt.Font("Ekkamai Standard", 1, 25)); // NOI18N
        jLabel123.setForeground(java.awt.Color.darkGray);
        jLabel123.setText("หนังสือทั้งหมด");
        panelAllBookImg.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 200, 40));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Open Book_50px.png"))); // NOI18N
        panelAllBookImg.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 40));

        jButton40.setBackground(new java.awt.Color(235, 198, 128));
        jButton40.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton40.setForeground(new java.awt.Color(0, 51, 51));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_List_18px.png"))); // NOI18N
        jButton40.setText("แสดงแบบ List");
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        panelAllBookImg.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(940, 730));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 730));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton30.setBackground(new java.awt.Color(235, 198, 128));
        jButton30.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 51, 51));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton30.setText("เลือกดู");
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 300, 120, -1));

        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("jLabel6");
        jPanel2.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 150, 210));

        jLabel126.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 0, 102));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("name");
        jPanel2.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, -1));

        jButton31.setBackground(new java.awt.Color(235, 198, 128));
        jButton31.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 51, 51));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton31.setText("เลือกดู");
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 300, 120, -1));

        jButton32.setBackground(new java.awt.Color(235, 198, 128));
        jButton32.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 51, 51));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton32.setText("เลือกดู");
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 300, 120, -1));

        jLabel127.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(0, 0, 102));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("name");
        jPanel2.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 150, -1));

        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("jLabel5");
        jPanel2.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 210));

        jLabel129.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 0, 102));
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("name");
        jPanel2.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 150, -1));

        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("jLabel6");
        jPanel2.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 150, 210));

        jLabel131.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(0, 0, 102));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("price");
        jPanel2.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 130, -1));

        jLabel132.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(0, 0, 102));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("price");
        jPanel2.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, -1));

        jLabel133.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(0, 0, 102));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("price");
        jPanel2.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 130, -1));

        jLabel134.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(0, 0, 102));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("price");
        jPanel2.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, -1));

        jLabel135.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(0, 0, 102));
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("name");
        jPanel2.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 150, -1));

        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setText("jLabel6");
        jPanel2.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 150, 210));

        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("jLabel7");
        jPanel2.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 210));

        jLabel138.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(0, 0, 102));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("name");
        jPanel2.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 150, -1));

        jLabel139.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(0, 0, 102));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("price");
        jPanel2.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 130, -1));

        jButton33.setBackground(new java.awt.Color(235, 198, 128));
        jButton33.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 51, 51));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton33.setText("เลือกดู");
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 300, 120, -1));

        jButton34.setBackground(new java.awt.Color(235, 198, 128));
        jButton34.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 51, 51));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton34.setText("เลือกดู");
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 300, 120, -1));

        jButton35.setBackground(new java.awt.Color(235, 198, 128));
        jButton35.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 51, 51));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton35.setText("เลือกดู");
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 670, 120, -1));

        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setText("jLabel6");
        jPanel2.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 150, 210));

        jLabel141.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(0, 0, 102));
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("name");
        jPanel2.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 150, -1));

        jButton36.setBackground(new java.awt.Color(235, 198, 128));
        jButton36.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton36.setForeground(new java.awt.Color(0, 51, 51));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton36.setText("เลือกดู");
        jButton36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 670, 120, -1));

        jButton37.setBackground(new java.awt.Color(235, 198, 128));
        jButton37.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton37.setForeground(new java.awt.Color(0, 51, 51));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton37.setText("เลือกดู");
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 670, 120, -1));

        jLabel142.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(0, 0, 102));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("name");
        jPanel2.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 150, -1));

        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("jLabel5");
        jPanel2.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 150, 210));

        jLabel144.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(0, 0, 102));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("name");
        jPanel2.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 150, -1));

        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("jLabel6");
        jPanel2.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 150, 210));

        jLabel146.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(0, 0, 102));
        jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel146.setText("price");
        jPanel2.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 130, -1));

        jLabel147.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(0, 0, 102));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setText("price");
        jPanel2.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 130, -1));

        jLabel148.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(0, 0, 102));
        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel148.setText("price");
        jPanel2.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 130, -1));

        jLabel149.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(0, 0, 102));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setText("price");
        jPanel2.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 130, -1));

        jLabel150.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(0, 0, 102));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel150.setText("name");
        jPanel2.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 150, -1));

        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("jLabel6");
        jPanel2.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 150, 210));

        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setText("jLabel7");
        jPanel2.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 210));

        jLabel153.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(0, 0, 102));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("name");
        jPanel2.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 150, -1));

        jLabel154.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(0, 0, 102));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("price");
        jPanel2.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 640, 130, -1));

        jButton38.setBackground(new java.awt.Color(235, 198, 128));
        jButton38.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 51, 51));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton38.setText("เลือกดู");
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 670, 120, -1));

        jButton39.setBackground(new java.awt.Color(235, 198, 128));
        jButton39.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton39.setForeground(new java.awt.Color(0, 51, 51));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton39.setText("เลือกดู");
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 670, 120, -1));

        jScrollPane6.setViewportView(jPanel2);

        panelAllBookImg.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 970, 360));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Go Back_55px color.png"))); // NOI18N
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        panelAllBookImg.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 425, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Circled Right_55px color.png"))); // NOI18N
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        panelAllBookImg.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 425, -1, -1));

        getContentPane().add(panelAllBookImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelAllBook.setBackground(new java.awt.Color(255, 255, 255));
        panelAllBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Ekkamai Standard", 0, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setCellSelectionEnabled(true);
        jTable2.setRowHeight(30);
        jScrollPane7.setViewportView(jTable2);

        panelAllBook.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 710, 360));

        jLabel37.setFont(new java.awt.Font("Ekkamai Standard", 1, 29)); // NOI18N
        jLabel37.setForeground(java.awt.Color.darkGray);
        jLabel37.setText("หนังสือทั้งหมด");
        panelAllBook.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 250, 50));

        jButton15.setBackground(new java.awt.Color(235, 198, 128));
        jButton15.setFont(new java.awt.Font("Ekkamai Standard", 1, 16)); // NOI18N
        jButton15.setText("เลือกดู");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        panelAllBook.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 110, 40));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Open Book_50px.png"))); // NOI18N
        panelAllBook.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, 50));

        getContentPane().add(panelAllBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelBook.setBackground(new java.awt.Color(255, 255, 255));
        panelBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBook.add(imgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 310, 370));

        jSpinner1.setFont(new java.awt.Font("Ekkamai Standard", 1, 24)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner1.setVerifyInputWhenFocusTarget(false);
        jSpinner1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSpinner1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panelBook.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 110, 40));

        jButton13.setBackground(new java.awt.Color(235, 198, 128));
        jButton13.setFont(new java.awt.Font("Ekkamai Standard", 1, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Shopping Cart_26px tarang.png"))); // NOI18N
        jButton13.setText("หยิบใส่ตะกร้า");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panelBook.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 160, 40));

        jLabel16.setFont(new java.awt.Font("Ekkamai Standard", 1, 18)); // NOI18N
        panelBook.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 320, 50));

        jLabel17.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 270, 50));

        jLabel18.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 270, 50));

        jLabel19.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 270, 50));

        jLabel20.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 270, 50));

        jLabel21.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 270, 50));

        jLabel22.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 270, 50));

        jLabel23.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelBook.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 270, 50));

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        panelBook.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 420, 320));

        getContentPane().add(panelBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelRegis.setBackground(new java.awt.Color(255, 255, 255));
        panelRegis.setToolTipText("");
        panelRegis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Ekkamai Standard", 1, 24)); // NOI18N
        jLabel24.setForeground(java.awt.Color.darkGray);
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Add User Male_45px.png"))); // NOI18N
        jLabel24.setText("สมัครสมาชิก /ลงทะเบียน");
        panelRegis.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 310, 60));

        jTextField5.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        panelRegis.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 180, -1));

        jLabel28.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("ชื่อผู้ใช้");
        jLabel28.setToolTipText("");
        panelRegis.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 50, 30));

        jLabel4.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("รหัสผ่าน");
        jLabel4.setToolTipText("");
        panelRegis.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 60, 30));

        jTextField6.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        panelRegis.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 180, -1));

        jTextField7.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        panelRegis.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 180, -1));

        jLabel29.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("ใส่รหัสผ่านอีกครั้ง");
        jLabel29.setToolTipText("");
        panelRegis.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 30));

        jLabel30.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("อีเมล");
        jLabel30.setToolTipText("");
        panelRegis.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 40, 30));

        jTextField8.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        panelRegis.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 180, -1));

        jTextField9.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        panelRegis.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 180, -1));

        jLabel31.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel31.setText("บ้านเลขที่");
        panelRegis.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 80, 30));

        jLabel32.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel32.setText("ถนน");
        panelRegis.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 60, 30));

        jTextField12.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        panelRegis.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 180, -1));

        jLabel33.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel33.setText("ตำบล");
        panelRegis.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 60, -1));

        jTextField10.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        panelRegis.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 180, -1));

        jLabel34.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel34.setText("อำเภอ");
        panelRegis.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 70, -1));

        jTextField11.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        panelRegis.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 180, -1));

        jLabel35.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel35.setText("จังหวัด");
        panelRegis.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 80, -1));

        jTextField14.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        panelRegis.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 180, -1));

        jLabel36.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel36.setText("รหัสไปรษณีย์");
        panelRegis.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        jButton18.setBackground(new java.awt.Color(102, 255, 102));
        jButton18.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Ok_24px.png"))); // NOI18N
        jButton18.setText("ลงทะเบียน");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setFocusable(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        panelRegis.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 180, 50));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 204));
        jCheckBox1.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jCheckBox1.setText("administrator");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        panelRegis.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/User_18px.png"))); // NOI18N
        panelRegis.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 30, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Key_18px white.png"))); // NOI18N
        panelRegis.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 30, 30));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Key_18px white.png"))); // NOI18N
        panelRegis.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 30, 30));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Email_18px.png"))); // NOI18N
        panelRegis.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 30, 30));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Zip Code_18px.png"))); // NOI18N
        panelRegis.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 30, 30));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Home_18px.png"))); // NOI18N
        panelRegis.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 30, 30));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Truck_18px.png"))); // NOI18N
        panelRegis.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 30, 30));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Map Marker_18px.png"))); // NOI18N
        panelRegis.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 30, 30));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Map Marker_18px.png"))); // NOI18N
        panelRegis.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 30, 30));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Map Marker_18px.png"))); // NOI18N
        panelRegis.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 30, 30));

        jComboBox1.setFont(new java.awt.Font("Ekkamai Standard", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือกจังหวัด", "กรุงเทพมหานคร ", "กระบี่ ", "กาญจนบุรี ", "กาฬสินธุ์ ", "กำแพงเพชร ", "ขอนแก่น ", "จันทบุรี ", "ฉะเชิงเทรา ", "ชลบุรี ", "ชัยนาท ", "ชัยภูมิ ", "ชุมพร ", "เชียงราย ", "เชียงใหม่ ", "ตรัง ", "ตราด ", "ตาก ", "นครนายก ", "นครปฐม ", "นครพนม ", "นครราชสีมา ", "นครศรีธรรมราช ", "นครสวรรค์ ", "นนทบุรี ", "นราธิวาส ", "น่าน ", "บึงกาฬ ", "บุรีรัมย์ ", "ปทุมธานี ", "ประจวบคีรีขันธ์ ", "ปราจีนบุรี ", "ปัตตานี ", "พระนครศรีอยุธยา ", "พังงา ", "พัทลุง ", "พิจิตร ", "พิษณุโลก ", "เพชรบุรี ", "เพชรบูรณ์ ", "แพร่ ", "พะเยา ", "ภูเก็ต ", "มหาสารคาม ", "มุกดาหาร ", "แม่ฮ่องสอน ", "ยะลา ", "ยโสธร ", "ร้อยเอ็ด ", "ระนอง ", "ระยอง ", "ราชบุรี ", "ลพบุรี ", "ลำปาง ", "ลำพูน ", "เลย ", "ศรีสะเกษ ", "สกลนคร ", "สงขลา ", "สตูล ", "สมุทรปราการ ", "สมุทรสงคราม ", "สมุทรสาคร ", "สระแก้ว ", "สระบุรี ", "สิงห์บุรี ", "สุโขทัย ", "สุพรรณบุรี ", "สุราษฎร์ธานี ", "สุรินทร์ ", "หนองคาย ", "หนองบัวลำภู ", "อ่างทอง ", "อุดรธานี ", "อุทัยธานี ", "อุตรดิตถ์ ", "อุบลราชธานี ", "อำนาจเจริญ " }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelRegis.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 150, -1));

        jPanel16.setBackground(new java.awt.Color(255, 250, 240));
        panelRegis.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 860, 470));

        getContentPane().add(panelRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelRule.setBackground(new java.awt.Color(255, 255, 255));
        panelRule.setMinimumSize(new java.awt.Dimension(950, 500));
        panelRule.setPreferredSize(new java.awt.Dimension(950, 500));
        panelRule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel116.setFont(new java.awt.Font("Ekkamai Standard", 0, 18)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 153, 51));
        jLabel116.setText("เงื่อนไขสมัครสมาชิก BOOKBURI");
        panelRule.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 240, 42));

        jButton3.setBackground(new java.awt.Color(235, 198, 128));
        jButton3.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Add User Male_22px.png"))); // NOI18N
        jButton3.setText("ตกลง");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelRule.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 100, 40));

        jLabel117.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("ทางสำนักพิมพ์ขอสงวนสิทธิ์ในการเปลี่ยนแปลงเงื่อนไขต่างๆ โดยมีการแจ้งให้ทราบล่วงหน้า");
        panelRule.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 530, 40));

        jLabel160.setFont(new java.awt.Font("Ekkamai Standard", 1, 16)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 153, 51));
        jLabel160.setText("หมายเหตุ");
        panelRule.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 80, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel161.setFont(new java.awt.Font("Ekkamai Standard", 1, 14)); // NOI18N
        jLabel161.setText("กรุณาอ่านรายละเอียด กฎ กติกาในการเป็นสมาชิกโปรแกรม BOOKBURI ด้านล่างนี้ให้ละเอียด");

        jLabel162.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel162.setText("ก่อนทำการคลิก \"ตกลง\" เพื่อให้การใช้งานโปรแกรมร่วมกันมีแต่ความสุข สนุกสนาน นะครับ");

        jLabel163.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel163.setText("                  1. กรุณากรอกรายละเอียดส่วนตัวในใบสมัครให้ถูกต้องตามความเป็นจริง เพื่อผลประโยชน์\n");

        jLabel164.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel164.setText("                    และความสะดวกแก่ตัวสมาชิก ในการรับสิทธิพิเศษต่างๆ จากสำนักพิมพ์");

        jLabel165.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel165.setText("                 2. ชื่อสมาชิก และ รหัสผ่านถือเป็นสมบัติส่วนบุคคลที่เพื่อนๆ จะต้องดูแลรักษา");

        jLabel166.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel166.setText("                    เพราะหากเกิดการกระทำไม่สมควร ภายใต้ชื่อสมาชิกในโปรแกรม BOOKBURI");

        jLabel167.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel167.setText("                    ทางสำนักพิมพ์ BOOKBURI จะไม่รับผิดชอบไม่ว่ากรณีใดๆ");

        jLabel168.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel168.setText("                 3. สำนักพิมพ์ BOOKBURI จะระงับการให้บริการแก่สมาชิกทันที หากพบว่าสมาชิกมีเจตนา");

        jLabel169.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel169.setText("                     *  เขียนเรื่องราว เนื้อหา หรือ โพสต์รูปภาพ อันนำไปสู่การเสื่อมเสียของสถาบันชาติ ศาสนา");

        jLabel170.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel170.setText("                     *  เขียนเรื่องราว เนื้อหา หรือ โพสต์รูปภาพ อันสื่อไปถึงความลามก อนาจาร");

        jLabel171.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel171.setText("                     *  ใช้พื้นที่ใดๆ ใน BOOKBURI เพื่อการโฆษณาสินค้าและบริการ");

        jLabel172.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel172.setText("                     *  เขียนเรื่องราวอันเป็นการท้าทาย ชักชวน โดยมีเจตนาก่อให้เกิดการทะเลาะวิวาท");

        jLabel173.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel173.setText("                     *  เขียนเรื่องราว เนื้อหา หรือ โพสต์รูปภาพถึงผู้อื่นไปในทางเสื่อมเสีย (หากมีการฟ้องร้องเกิดขึ้น");

        jLabel174.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel174.setText("                        ทางสำนักพิมพ์ BOOKBURI จะไม่รับผิดชอบ หรือเข้าไปยุ่งเกี่ยว ไม่ว่ากรณีใด ๆ ทั้งสิ้น)");

        jLabel175.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel175.setText("                     *  แอบอ้างชื่อของทีมงาน หรือสำนักพิมพ์ BOOKBURI ไปในทางมิชอบ");

        jLabel176.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel176.setText("                     *  ละเมิดลิขสิทธิ์ผลงานเขียนของนักเขียนท่านอื่นๆ (รวมถึงผลงานอันมีลิขสิทธิ์ทุกประเภท)");

        jLabel177.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel177.setText("                     ไม่นับกรณีสุดวิสัยเช่น ความเสียหายที่เกิดจากไวรัส, แฮคเกอร์ หรือการล่มของ Server\n");

        jLabel178.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel178.setText("                 4. สำนักพิมพ์ BOOKBURI สัญญาว่าจะดูแลข้อมูลต่างๆ ของสมาชิกให้ปลอดภัยอย่างสุดความสามารถ");

        jLabel179.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel179.setText("                 5. สมาชิกจะไม่ดำเนินการฟ้องร้องสำนักพิมพ์ BOOKBURI ไม่ว่ากรณีใดๆ ทั้งสิ้น");

        jLabel180.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel180.setText("                    อันเกิดจากการใช้งานบนโปรแกรม BOOKBURI");

        jLabel181.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel181.setText("                 6. สำนักพิมพ์ BOOKBURI สามารถปรับปรุง เปลี่ยนแปลงส่วนต่างๆ ของโปรแกรม");

        jLabel182.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel182.setText("                 7. หากตรวจสอบพบว่าสมาชิกละเมิดข้อตกลงข้างต้น สำนักพิมพ์ BOOKBURI ขอสงวนสิทธิ์");

        jLabel183.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel183.setText("                     โดยไม่ต้องแจ้งล่วงหน้าในการระงับการให้บริการโดยไม่ต้องแจ้งให้ทราบล่วงหน้า");

        jLabel184.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel184.setText("ยินดีต้อนรับ สู่การสมัครสมาชิกของสำนักพิมพ์ BOOKBURI ครับ");

        jLabel185.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel185.setText("                    ในการระงับการให้บริการโดยไม่ต้องแจ้งให้ทราบล่วงหน้า");

        jLabel186.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel186.setText("                        หรือก่อให้เกิดความวุ่นวายขึ้น");

        jLabel187.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel187.setText("                        พระมหากษัตริย์");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel184, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel166, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel167, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel170, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel179, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel178, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel181, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel163, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel165, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel182, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel187, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel161)
                .addGap(1, 1, 1)
                .addComponent(jLabel162)
                .addGap(1, 1, 1)
                .addComponent(jLabel163)
                .addGap(1, 1, 1)
                .addComponent(jLabel164)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel165)
                .addGap(1, 1, 1)
                .addComponent(jLabel166)
                .addGap(1, 1, 1)
                .addComponent(jLabel167)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel168)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel169)
                .addGap(1, 1, 1)
                .addComponent(jLabel187)
                .addGap(1, 1, 1)
                .addComponent(jLabel170)
                .addGap(1, 1, 1)
                .addComponent(jLabel173)
                .addGap(1, 1, 1)
                .addComponent(jLabel174)
                .addGap(1, 1, 1)
                .addComponent(jLabel172)
                .addGap(1, 1, 1)
                .addComponent(jLabel186)
                .addGap(1, 1, 1)
                .addComponent(jLabel171)
                .addGap(1, 1, 1)
                .addComponent(jLabel175)
                .addGap(1, 1, 1)
                .addComponent(jLabel176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel178)
                .addGap(1, 1, 1)
                .addComponent(jLabel177)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel179)
                .addGap(1, 1, 1)
                .addComponent(jLabel180)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel181)
                .addGap(1, 1, 1)
                .addComponent(jLabel183)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel182)
                .addGap(1, 1, 1)
                .addComponent(jLabel185)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        jScrollPane4.setViewportView(jPanel3);

        panelRule.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 720, 290));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Ekkamai Standard", 0, 13)); // NOI18N
        jCheckBox2.setText("ยอมรับเงื่อนการสมัครสมาชิก");
        panelRule.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        getContentPane().add(panelRule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Ekkamai Standard", 1, 24)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("เข้าสู่ระบบ");
        panelLogin.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 140, 50));

        jTextField15.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        panelLogin.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 200, 30));

        jTextField16.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        panelLogin.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 200, 30));

        jLabel68.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel68.setText("รหัสผ่าน");
        panelLogin.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 60, 30));

        jLabel69.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel69.setText("ชื่อผู้ใช้");
        panelLogin.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 50, 30));

        jLabel66.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("สมัครสมาชิก       ");
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        panelLogin.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 120, 30));

        jButton12.setBackground(new java.awt.Color(235, 198, 128));
        jButton12.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Login_24px.png"))); // NOI18N
        jButton12.setText("เข้าสู่ระบบ");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panelLogin.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 140, 40));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/login-pics.png"))); // NOI18N
        panelLogin.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 340, 340));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Add User Male_22px.png"))); // NOI18N
        panelLogin.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 30, 30));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/User_24px.png"))); // NOI18N
        panelLogin.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 30, 30));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Key_22px.png"))); // NOI18N
        panelLogin.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 30, 30));
        panelLogin.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 30, 30));

        jPanel18.setBackground(new java.awt.Color(255, 250, 240));
        panelLogin.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 860, 470));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelBasket.setBackground(new java.awt.Color(255, 255, 255));
        panelBasket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        jTextField2.setForeground(java.awt.Color.darkGray);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panelBasket.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 150, -1));

        jLabel8.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.darkGray);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Analyze_20px.png"))); // NOI18N
        jLabel8.setText("กรอกเลขบัตรเครดิตเพื่อทำการชำระเงิน");
        panelBasket.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 340, -1));

        jLabel14.setFont(new java.awt.Font("Ekkamai Standard", 1, 20)); // NOI18N
        jLabel14.setForeground(java.awt.Color.darkGray);
        jLabel14.setText("ตะกร้าสินค้า");
        panelBasket.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 40));

        jButton9.setBackground(new java.awt.Color(235, 198, 128));
        jButton9.setFont(new java.awt.Font("Ekkamai Standard", 1, 16)); // NOI18N
        jButton9.setForeground(java.awt.Color.darkGray);
        jButton9.setText("เสร็จสิ้น");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelBasket.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 130, 50));

        jLabel15.setFont(new java.awt.Font("Ekkamai Standard", 0, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.darkGray);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_List_18px.png"))); // NOI18N
        jLabel15.setText("สรุปรายการสั่งซื้อ");
        panelBasket.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 220, -1));

        jLabel62.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        jLabel62.setForeground(java.awt.Color.darkGray);
        jLabel62.setText("บาท");
        panelBasket.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 50, 40));

        jLabel63.setFont(new java.awt.Font("Ekkamai Standard", 0, 17)); // NOI18N
        jLabel63.setForeground(java.awt.Color.darkGray);
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Pricing_20px.png"))); // NOI18N
        jLabel63.setText("ราคาสุทธิ");
        panelBasket.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 120, 40));

        credit.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        credit.setForeground(java.awt.Color.darkGray);
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });
        panelBasket.add(credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 340, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Shopping Cart_26px tarang.png"))); // NOI18N
        panelBasket.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 50, 40));

        jPanel21.setBackground(new java.awt.Color(255, 250, 240));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setFont(new java.awt.Font("Ekkamai Standard", 0, 24)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.setCellSelectionEnabled(true);
        jTable4.setRowHeight(30);
        jScrollPane9.setViewportView(jTable4);

        jPanel21.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 730, 210));

        panelBasket.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 900, 490));

        getContentPane().add(panelBasket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setAlignmentY(0.0F);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(1050, 1200));
        jPanel15.setPreferredSize(new java.awt.Dimension(0, 1200));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("price");
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 130, -1));

        jLabel11.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("name");
        jPanel15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 150, -1));

        jButton8.setBackground(new java.awt.Color(235, 198, 128));
        jButton8.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton8.setText("เลือกดู");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 130, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");
        jPanel15.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 150, 210));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 150, 210));

        jLabel3.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("name");
        jPanel15.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 150, -1));

        jLabel12.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("price");
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 130, -1));

        jButton6.setBackground(new java.awt.Color(235, 198, 128));
        jButton6.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton6.setText("เลือกดู");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 130, -1));

        jLabel10.setFont(new java.awt.Font("Ekkamai Standard", 1, 26)); // NOI18N
        jLabel10.setForeground(java.awt.Color.darkGray);
        jLabel10.setText("หนังสือแนะนำ");
        jLabel10.setMaximumSize(new java.awt.Dimension(200, 51));
        jLabel10.setMinimumSize(new java.awt.Dimension(200, 51));
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 51));
        jPanel15.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 60));

        jLabel13.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("price");
        jPanel15.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 130, -1));

        jButton7.setBackground(new java.awt.Color(235, 198, 128));
        jButton7.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 51));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton7.setText("เลือกดู");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 130, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");
        jPanel15.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 150, 210));

        jLabel9.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("name");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 150, -1));

        jLabel39.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 102));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("name");
        jPanel15.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 150, -1));

        jLabel40.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 102));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("price");
        jPanel15.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 130, -1));

        jButton10.setBackground(new java.awt.Color(235, 198, 128));
        jButton10.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 51, 51));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton10.setText("เลือกดู");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 130, -1));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("jLabel6");
        jPanel15.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 150, 210));

        jLabel42.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 102));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("name");
        jPanel15.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 150, -1));

        jLabel43.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("price");
        jPanel15.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 130, -1));

        jButton14.setBackground(new java.awt.Color(235, 198, 128));
        jButton14.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 51, 51));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton14.setText("เลือกดู");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 130, -1));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("jLabel6");
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 150, 210));

        jLabel57.setFont(new java.awt.Font("Ekkamai Standard", 1, 26)); // NOI18N
        jLabel57.setForeground(java.awt.Color.darkGray);
        jLabel57.setText("หนังสือใหม่");
        jPanel15.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 160, 50));

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("jLabel7");
        jPanel15.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 150, 210));

        jLabel92.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 102));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("name");
        jPanel15.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 920, 150, -1));

        jLabel93.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 102));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("price");
        jPanel15.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 950, 130, -1));

        jButton16.setBackground(new java.awt.Color(235, 198, 128));
        jButton16.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 51, 51));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton16.setText("เลือกดู");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 980, 130, -1));

        jButton19.setBackground(new java.awt.Color(235, 198, 128));
        jButton19.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 51, 51));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton19.setText("เลือกดู");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 980, 130, -1));

        jLabel94.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 102));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("price");
        jPanel15.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 950, 130, -1));

        jLabel95.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 102));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("name");
        jPanel15.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 920, 150, -1));

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("jLabel5");
        jPanel15.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, 150, 210));

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("jLabel6");
        jPanel15.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, 150, 210));

        jLabel98.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 102));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("name");
        jPanel15.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 920, 150, -1));

        jLabel101.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 102));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("price");
        jPanel15.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 950, 130, -1));

        jButton21.setBackground(new java.awt.Color(235, 198, 128));
        jButton21.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 51, 51));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton21.setText("เลือกดู");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 980, 130, -1));

        jButton22.setBackground(new java.awt.Color(235, 198, 128));
        jButton22.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 51, 51));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton22.setText("เลือกดู");
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 980, 130, -1));

        jLabel104.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 102));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("price");
        jPanel15.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 950, 130, -1));

        jLabel106.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 0, 102));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("name");
        jPanel15.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 920, 150, -1));

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("jLabel6");
        jPanel15.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, 160, 210));

        jButton23.setBackground(new java.awt.Color(235, 198, 128));
        jButton23.setFont(new java.awt.Font("Ekkamai Standard", 0, 16)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 51, 51));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Detective_18px.png"))); // NOI18N
        jButton23.setText("เลือกดู");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 980, 130, -1));

        jLabel108.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 102));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("price");
        jPanel15.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 950, 130, -1));

        jLabel110.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 102));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("name");
        jPanel15.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 920, 150, -1));

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("jLabel6");
        jPanel15.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 690, 150, 210));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/แบนเนอร์แก้ (3).png"))); // NOI18N
        jLabel113.setPreferredSize(new java.awt.Dimension(815, 239));
        jPanel15.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 220));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/BANNERR PEACH (1).png"))); // NOI18N
        jLabel114.setPreferredSize(new java.awt.Dimension(220, 65));
        jPanel15.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 60));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/BANNERR PURPLE (1).png"))); // NOI18N
        jPanel15.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 210, 50));

        jLabel119.setBackground(new java.awt.Color(235, 198, 128));
        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/footer (4).png"))); // NOI18N
        jLabel119.setText("jLabel119");
        jPanel15.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1044, 1040, 160));

        jScrollPane1.setViewportView(jPanel15);

        panelHome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 480));

        getContentPane().add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
static String[] arr;
static MongoClientURI uri ;
static MongoClient mongo ;
static DB db;
static DBCollection user;
static DBCollection books;
static DBCollection orders;
static DBObject dockUser;
static DBObject dockBook;
static GridFS gfsPhoto;
static BufferedImage img;
static GridFSDBFile imageForOutput;
static Image newImage;
static int id_user =0;
static boolean admin=false;
static String nameuse;
public  ArrayList<String> obname = new ArrayList<>();
public  ArrayList<Integer> obprice = new ArrayList<>();
public  ArrayList<Integer> Value = new ArrayList<>();
 String n ;
 int p ;
 int i = 0 ;
 int sumprice;
 int sum ;
 int r = 0;
static double lastidbook;  
static DefaultListModel modeil;
static DefaultTableModel model1;
static DefaultTableModel model2;
static DefaultTableModel model3;
static DefaultTableModel modelOrder;
static int countBook=0;
Timer tm;
int ban = 2;
private void setid(int id,boolean admin){
    id_user = id;
    this.admin = admin;
}
private void setAllVisibleFalse(){
            panelHome.setVisible(false);
            panelBook.setVisible(false);
            panelBasket.setVisible(false);
            panelRegis.setVisible(false);
            panelAllBook.setVisible(false);
            panelEdit.setVisible(false);
            panelLogin.setVisible(false);
            panelAdd.setVisible(false);
            panelAllBookImg.setVisible(false);
             panelRule.setVisible(false);
            
            jLabel45.setVisible(false);
            jLabel48.setVisible(false);
            jLabel49.setVisible(false);
            jLabel47.setVisible(false);
            jLabel56.setVisible(false);
            jLabel53.setVisible(false);
            jLabel58.setVisible(false);
            jLabel59.setVisible(false);
            n_book.setVisible(false);
            n_au.setVisible(false);
            P_book.setVisible(false);
            np.setVisible(false);
            upskill.setVisible(false);
            deskill.setVisible(false);  
            jLabel59.setVisible(false);
            im_book.setVisible(false);
            jLabel60.setVisible(false);
            EX_book2.setVisible(false);
            jButton2.setVisible(false);
            jButton5.setVisible(false);
            
            jLabel61.setVisible(false);
            jComboBox3.setVisible(false);
            jComboBox4.setVisible(false);
            jComboBox5.setVisible(false);
            jComboBox2.setVisible(false);
                            
            if(admin!=true&&id_user!=0){
                jButton5.setVisible(true);
            }else if(admin==true&&id_user!=0){
                jButton2.setVisible(true);
            }
}
private void setBookNew(String s1,double s2,JLabel a1,JLabel a2,JLabel a3){
    try{
            BasicDBObject searchQueryPhoto  = new BasicDBObject();
            searchQueryPhoto.put("filename", s1);
            imageForOutput = gfsPhoto.findOne(searchQueryPhoto);
            imageForOutput.writeTo("C:\\imgBS\\IMGbooksNew.png");
             img = ImageIO.read( new File("C:\\imgBS\\IMGbooksNew.png") );
             newImage = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT);  
           
             a1.setIcon(new ImageIcon(newImage));
             a2.setText(s1);
             a3.setText("ราคา : "+String.valueOf(s2));
           }catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
}
private void createArray(){
            DBCursor cursor = books.find();
            String[] columnNames = {"ชื่อ"};
            model1 = new DefaultTableModel(columnNames, 0);
            arr = new String[(int)books.count()];
            int icount=0;               
             while (cursor.hasNext()) {
                DBObject dockran= cursor.next();
                arr[icount]=(String) dockran.get("name_Book");
                String name = arr[icount];
                if(icount==arr.length-5){
                    setBookNew(arr[icount],(Double)dockran.get("Pirce"),jLabel111,jLabel110,jLabel108);
                }
                if(icount==arr.length-4){
                    setBookNew(arr[icount],(Double)dockran.get("Pirce"),jLabel107,jLabel106,jLabel104);
                }
                if(icount==arr.length-3){
                    setBookNew(arr[icount],(Double)dockran.get("Pirce"),jLabel97,jLabel98,jLabel101);
                }
                if(icount==arr.length-2){
                    setBookNew(arr[icount],(Double)dockran.get("Pirce"),jLabel96,jLabel95,jLabel94);
                }
                if(icount==arr.length-1){
                lastidbook = (double) dockran.get("book_id");
                setBookNew(arr[icount],(Double)dockran.get("Pirce"),jLabel86,jLabel92,jLabel93);
                }
                icount++;
                    model1.addRow(new Object[] { name});     
		} Arrays.sort(arr);
          model2 = new DefaultTableModel(columnNames, 0);
          for(String list:arr)   {
              model2.addRow(new Object[] {list});
          }   
                
        jTable1.setModel(model1);
        jTable3.setModel(model1);
        jTable2.setModel(model2);
       jTable1.setDefaultEditor(Object.class, null);
       jTable3.setDefaultEditor(Object.class, null);
        jTable2.setDefaultEditor(Object.class, null);
        jTable3.scrollRectToVisible(jTable3.getCellRect(jTable3.getRowCount()-1, 0, true));
        
        cursor.close(); 

                
}
private void randomBook(){
    try{
        Random rand = new Random();
        for(int i=0;i<5;i++){
            int numrandom = rand.nextInt(arr.length-1);
             
            BasicDBObject searchQuery  = new BasicDBObject();
            searchQuery.put("name_Book",arr[numrandom]);
            dockBook= books.findOne(searchQuery);
            
            String name = (String)dockBook.get("name_Book");
            double price = (Double)dockBook.get("Pirce");
            BasicDBObject searchQueryPhoto  = new BasicDBObject();
            searchQueryPhoto.put("filename", name);
            
            
            imageForOutput = gfsPhoto.findOne(searchQueryPhoto);
            
            
            imageForOutput.writeTo("C:\\imgBS\\IMGbooksmain.png");
             img = ImageIO.read( new File("C:\\imgBS\\IMGbooksmain.png") );
             newImage = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT);  
           if(i==0){
             jLabel5.setIcon(new ImageIcon(newImage));
             jLabel3.setText(name);
             jLabel2.setText("ราคา : "+String.valueOf(price));
           }else if(i==1){
             jLabel6.setIcon(new ImageIcon(newImage));
             jLabel11.setText(name);
             jLabel12.setText("ราคา : "+String.valueOf(price));
           }else if(i==2){
             jLabel7.setIcon(new ImageIcon(newImage));
             jLabel9.setText(name);
             jLabel13.setText("ราคา : "+String.valueOf(price));
           }else if(i==3){
             jLabel41.setIcon(new ImageIcon(newImage));
             jLabel39.setText(name);
             jLabel40.setText("ราคา : "+String.valueOf(price));
           }else if(i==4){
             jLabel51.setIcon(new ImageIcon(newImage));
             jLabel42.setText(name);
             jLabel43.setText("ราคา : "+String.valueOf(price));
           }
        }  }catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
}
private void checkUserAndSet(){
            if(admin==true){
               jButton2.setVisible(true);
            }else if(id_user!=0){
               jButton5.setVisible(true);
               
            }
            if(id_user!=0){
                jButton1.setText("ออกจากระบบ");
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Exit_26px.png"))); 
                jLabel1.setText(nameuse);
            }else{
                jLabel1.setText("ผู้เยี่ยมชม");
                jButton1.setText("เข้าสู่ระบบ");
                jButton2.setVisible(false);
                jButton5.setVisible(false);
                
                jButton5.setText("0");
            }
}
private void orderClear(){
    DefaultTableModel modeil = new DefaultTableModel();                
                obname.clear();
                obprice.clear();
                Value.clear();
                sumprice=0;
                jTable4.setModel(modeil);
                jTextField2.setText(null);
                credit.setText(null);
}
private void orderAdd(){
                BasicDBObject add  = new BasicDBObject();
                BasicDBObject addP = new BasicDBObject();
                 
                add.put("id_order",(double)orders.count()+1);
                add.put("doc_type", "Order");
                add.put("id_user", id_user);
                add.put("all_price", sumprice);
                List<DBObject> idb = new ArrayList<>();
                
                for(int i=0;i<obname.size();i++){
                    BasicDBObject addD = new BasicDBObject();                   
                    addD.put("book_name", obname.get(i));
                    addD.put("amount",Value.get(i) );                
                    idb.add(addD);
                }
                add.put("Orderlist", idb);                 
                addP.put("credit",credit.getText());
                addP.put("status","success");
                add.put("Payment",addP);
                orders.insert(add);
                jButton5.setText("0");
}
private void orderList(){
    int currentValue = (Integer)jSpinner1.getValue();
        boolean flag=false;
        int ncount=0;
            if(obname.isEmpty()){
                obname.add(n);
                obprice.add(p);
                Value.add(currentValue);
            }else{
                for(String s:obname){
                    if(s.equals(n)){
                        flag=true;
                        break;
                    }if(flag==false){
                        ncount++; 
                    }
                }
            if(flag==false){
                obname.add(n);
                obprice.add(p);
                Value.add(currentValue);
            }else{
                obprice.set(ncount, obprice.get(ncount)+p);
                Value.set(ncount,Value.get(ncount)+currentValue);
            }
         }
            jSpinner1.setValue(new Integer(1));
            sumprice += p*currentValue;
            int val = Integer.parseInt(jButton5.getText())+currentValue;
            jButton5.setText(Integer.toString(val));
            orderShow();
         
}
private void orderShow(){
        int count=0;
                 
            jTextField2.setText(sumprice+"");
            
            String[] columnNames = {"ชื่อ","จำนวน"};
            model1 = new DefaultTableModel(columnNames, 0);
            
          modelOrder = new DefaultTableModel(columnNames, 0);
          for(String list:obname)   {
             int cou = Value.get(count);
              modelOrder.addRow(new Object[] {list,cou});
              count++;
          }   
        
        jTable4.setModel(modelOrder);
       jTable4.setDefaultEditor(Object.class, null);
       DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable4.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        
}
private boolean setBook(BasicDBObject search){
                try{
                    DBObject a = books.findOne(search);
                if(a!=null){
                jSpinner1.setVisible(true);
                jButton13.setVisible(true);
                 jSpinner1.setValue(1);
                String name = (String) a.get("name_Book");
                String author = (String) a.get("name_Author");
                String type = (String) a.get("Type_Book");
                double price = (Double) a.get("Pirce");
                int priceint = (int) price;
                DBObject b = (DBObject) a.get("Detail");
                String publisher = (String) b.get("publisher");
                double year = (Double) b.get("year");
                int yearint = (int) year;
                String language = (String) b.get("language");
                double nump = (Double) b.get("num_pages");
                int numint = (int) nump;
               
                jLabel16.setText("ชื่อหนังสือ : "+name);
                jLabel17.setText("ชื่อผู้แต่ง : "+author);
                jLabel18.setText("ประเภทหนังสือ : "+type);
                jLabel19.setText("ราคาหนังสือ : "+priceint);
                jLabel20.setText("สำนักพิมพ์ : "+publisher);
                jLabel21.setText("ปีที่พิมพ์ : "+yearint);
                jLabel22.setText("ภาษาที่พิมพ์ : "+language);
                jLabel23.setText("จำนวนหน้า : "+numint);

                n = name;
                p = priceint;

                BasicDBObject searchQuery  = new BasicDBObject();
                searchQuery.put("filename", name);
                
                 imageForOutput = gfsPhoto.findOne(searchQuery);
                if(imageForOutput!=null){
                   

                    imageForOutput.writeTo("C:\\imgBS\\IMGbooksTEMP.png");
                     img = ImageIO.read( new File("C:\\imgBS\\IMGbooksTEMP.png") );

                     newImage = img.getScaledInstance(imgs.getWidth(), imgs.getHeight(), Image.SCALE_DEFAULT);
                    imgs.setIcon(new ImageIcon(newImage));
                   
                    return false;
                } 
                }
                }catch (IOException ex) {
                Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
            }return true;
}
private void setVisibleEditfield(Boolean flag){
                jLabel45.setVisible(flag);
                jLabel48.setVisible(flag);
                jLabel49.setVisible(flag);
                jLabel47.setVisible(flag);
                jLabel56.setVisible(flag);
                jLabel53.setVisible(flag);
                jLabel58.setVisible(flag);
                jLabel59.setVisible(flag);
                n_book.setVisible(flag);
                n_au.setVisible(flag);
                P_book.setVisible(flag);
                np.setVisible(flag);
                upskill.setVisible(flag);
                deskill.setVisible(flag);
                jLabel59.setVisible(flag);
                im_book.setVisible(flag);
                jLabel60.setVisible(flag);
                EX_book2.setVisible(flag);
                jLabel61.setVisible(flag);
                jComboBox3.setVisible(flag);
                jComboBox4.setVisible(flag);
                jComboBox5.setVisible(flag);
                jComboBox2.setVisible(flag);
    
}
private void setEditBook(BasicDBObject search){
            try{
            dockBook= books.findOne(search);
            if(dockBook==null){
                JOptionPane.showMessageDialog(this, "ไม่มีหนังสือนี้ในระบบ");
                setVisibleEditfield(false);

            }else{
                
                JOptionPane.showMessageDialog(this, "พบหนังสือนี้ในระบบ");
                setVisibleEditfield(true);
                
                n_book.setText((String) dockBook.get("name_Book"));
                n_au.setText((String) dockBook.get("name_Author"));
                jComboBox3.setSelectedItem((String) dockBook.get("Type_Book"));
                double price =(Double) dockBook.get("Pirce");                
                P_book.setText(Double.toString(price));

              DBObject detail = (DBObject) dockBook.get("Detail");
              jComboBox4.setSelectedItem((String) detail.get("publisher"));
              double year =(Double) detail.get("year");
              int yearint = (int) year;
              double nump =(Double) detail.get("num_pages");
              int numint = (int) nump;              
              jComboBox5.setSelectedItem(String.valueOf(yearint));
              jComboBox2.setSelectedItem((String) detail.get("language"));
              np.setText(String.valueOf(numint));
              
                BasicDBObject searchQuery  = new BasicDBObject();
                searchQuery.put("filename", n_book.getText());
                 
                 imageForOutput = gfsPhoto.findOne(searchQuery);
                if(imageForOutput!=null){
                    imageForOutput.writeTo("C:\\imgBS\\IMGbooksTEMPEdit.png");
                     img = ImageIO.read( new File("C:\\imgBS\\IMGbooksTEMPEdit.png") );

                     newImage = img.getScaledInstance(jLabel61.getWidth(), jLabel61.getHeight(), Image.SCALE_DEFAULT);
                    jLabel61.setIcon(new ImageIcon(newImage));
                }
            }}catch (IOException ex) {
                Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
            }
}
private void deleteBook(){
            BasicDBObject de  = new BasicDBObject();
            de.put("name_Book",n_book.getText());
            
            
            gfsPhoto.remove(search.getText());
            
            books.remove(de);
}
private void editUpdate(){
    try {
            BasicDBObject documents = new BasicDBObject();
            documents.put("name_Book",search.getText());

            BasicDBObject ndocuments = new BasicDBObject();
            BasicDBObject ndocuments1 = new BasicDBObject();
            dockBook= books.findOne(documents);
         
            ndocuments.put("name_Book",n_book.getText());
            ndocuments.put("name_Author",n_au.getText());
            ndocuments.put("Type_Book",(String)jComboBox3.getSelectedItem());
            ndocuments.put("Pirce",Double.valueOf(P_book.getText()));
            ndocuments1.put("publisher",(String)jComboBox4.getSelectedItem());
            ndocuments1.put("year",(Double)jComboBox5.getSelectedItem());
            ndocuments1.put("language",(String)jComboBox2.getSelectedItem());
            ndocuments1.put("num_pages",Double.valueOf(np.getText()));
            ndocuments.put("Detail",ndocuments1);

            if(!im_book.getText().isEmpty()){
               File imageFile = new File(im_book.getText());
            
            gfsPhoto.remove((String)dockBook.get("name_Book"));
            GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
            gfsFile.setFilename(n_book.getText());
            gfsFile.save(); 
            }            
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("$set",ndocuments);

            books.update(documents, searchQuery);            
        } catch (IOException ex) {
           
        }
}
private void addBook(){
     try {
            BasicDBObject document = new BasicDBObject();
            BasicDBObject document1 = new BasicDBObject();
            document.put("book_id",lastidbook+1.0);
            document.put("doc_Type","Book");
            document.put("name_Book",name_book.getText());
            document.put("name_Author",n_author.getText());
            document.put("Type_Book",(String)jComboBox6.getSelectedItem());
            document.put("Pirce",Double.valueOf(jprice.getText()));
            document1.put("publisher",(String)jComboBox7.getSelectedItem());
            String selected = (String)jComboBox8.getSelectedItem();
            document1.put("year",Double.valueOf(selected));
            document1.put("language",(String)jComboBox9.getSelectedItem());
            document1.put("num_pages",Double.valueOf(jnum.getText()));
           
            File imageFile = new File(jImgUP.getText());
            
            GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
            gfsFile.setFilename(name_book.getText());
            gfsFile.save();

            document.put("Detail",document1);
            books.insert(document);
            JOptionPane.showMessageDialog(this, "เพิ่มข้อมูลเรียบร้อย");                        
        } catch (IOException ex) {            
        }
}
private void resetTextAdd(){    
           name_book.setText(null);
           n_author.setText(null);
           jprice.setText(null);
           jnum.setText(null);
           jImgUP.setText(null);
           jLabel50.setIcon(null);
           jComboBox6.setSelectedIndex(0);
           jComboBox7.setSelectedIndex(0);
           jComboBox8.setSelectedIndex(0);
           jComboBox9.setSelectedIndex(0);
}
private boolean notNullAdd(){
            if(name_book.getText().isEmpty()|| n_author.getText().isEmpty()||jComboBox6.getSelectedIndex()==0||
                    jComboBox7.getSelectedIndex()==0||jComboBox8.getSelectedIndex()==0
                    ||jComboBox9.getSelectedIndex()==0
                    ||jprice.getText().isEmpty()||jnum.getText().isEmpty()
                    ||jImgUP.getText().isEmpty()){
                return false;
            }return true;
}
private void createUser() {
            try{
                String ID = jTextField5.getText();
            String passf =jTextField6.getText();
            String passs =jTextField7.getText();
            String email =jTextField8.getText();
            String Hnum =jTextField9.getText();
            String street =jTextField12.getText();
            String subdis =jTextField10.getText();
            String dis =jTextField11.getText();
            String zip =jTextField14.getText();
                BasicDBObject add  = new BasicDBObject();
                BasicDBObject addD = new BasicDBObject();
                add.put("id_user",(double)user.count()+1);
                add.put("doc_type", "User");                
                add.put("username", ID);
                add.put("password", passf);
                if(jCheckBox1.isSelected()){
                    add.put("id_type","admin");
                }else{
                    add.put("id_type", "custumer");
                }                
                addD.put("house_num",Hnum);
                addD.put("street",street);
                addD.put("sub_district",subdis);
                addD.put("district",dis);
                addD.put("province",(String)jComboBox1.getSelectedItem());
                addD.put("zip_code",Double.parseDouble(zip));
                addD.put("email",email);
                add.put("Address",addD);
                user.insert(add);
                JOptionPane.showMessageDialog(this, "สมัครสมาชิกสำเร็จ");
                jTextField5.setText(null);
                jTextField6.setText(null);
                jTextField7.setText(null);
                jTextField8.setText(null);
                jTextField9.setText(null);
                jTextField12.setText(null);
                jTextField10.setText(null);
                jTextField11.setText(null);
                jTextField14.setText(null);
                jCheckBox1.setSelected(false);
                
                setAllVisibleFalse();
                panelLogin.setVisible(true);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "โปรดใส่เลขไปรษณีย์ให้ถูกต้อง");
                    jTextField14.setText(null);
                }               
    }

private void setVisibleLoop(){
   
             jLabel137.setVisible(false);
             jLabel126.setVisible(false);
             jLabel134.setVisible(false);
              jButton31.setVisible(false);
                    jLabel128.setVisible(false);
             jLabel135.setVisible(false);
             jLabel132.setVisible(false);
              jButton30.setVisible(false);
                   jLabel130.setVisible(false);
             jLabel138.setVisible(false);
             jLabel131.setVisible(false);
              jButton34.setVisible(false);
                    jLabel136.setVisible(false);
             jLabel129.setVisible(false);
             jLabel133.setVisible(false);
              jButton33.setVisible(false);
                    jLabel125.setVisible(false);
             jLabel127.setVisible(false);
             jLabel139.setVisible(false);
              jButton32.setVisible(false);
                    jLabel152.setVisible(false);
             jLabel141.setVisible(false);
             jLabel149.setVisible(false);
              jButton36.setVisible(false);
                    jLabel143.setVisible(false);
             jLabel150.setVisible(false);
             jLabel147.setVisible(false);
              jButton35.setVisible(false);
                    jLabel145.setVisible(false);
             jLabel153.setVisible(false);
             jLabel146.setVisible(false);
              jButton39.setVisible(false);
                    jLabel151.setVisible(false);
             jLabel144.setVisible(false);
             jLabel148.setVisible(false);
             jButton38.setVisible(false);
                    jLabel140.setVisible(false);
             jLabel142.setVisible(false);
             jLabel154.setVisible(false);
             jButton37.setVisible(false);
}
private void loopBook(int loop){
    int countN=0;
    setVisibleLoop();
    try{ 
        for(;countN<loop;countBook++){
            
            BasicDBObject searchQuery  = new BasicDBObject();
            searchQuery.put("name_Book",arr[countBook]);
            dockBook= books.findOne(searchQuery);
            double price = (Double)dockBook.get("Pirce");
            BasicDBObject searchQueryPhoto  = new BasicDBObject();
            searchQueryPhoto.put("filename", arr[countBook]);
            
            
             imageForOutput = gfsPhoto.findOne(searchQueryPhoto);
            
            imageForOutput.writeTo("C:\\imgBS\\IMGbooksAll.png");
             img = ImageIO.read( new File("C:\\imgBS\\IMGbooksAll.png") );
            newImage = img.getScaledInstance(jLabel137.getWidth(), jLabel137.getHeight(), Image.SCALE_DEFAULT);  
           if(countN==0){
               if(countN<=loop){
             jLabel137.setVisible(true);
             jLabel126.setVisible(true);
             jLabel134.setVisible(true);
             jButton31.setVisible(true);
             jLabel137.setIcon(new ImageIcon(newImage));
             jLabel126.setText(arr[countBook]);
             jLabel134.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==1){
               if(countN<=loop){
                    jLabel128.setVisible(true);
             jLabel135.setVisible(true);
             jLabel132.setVisible(true);
              jButton30.setVisible(true);
             jLabel128.setIcon(new ImageIcon(newImage));
             jLabel135.setText(arr[countBook]);
             jLabel132.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==2){
               if(countN<=loop){ 
                   jLabel130.setVisible(true);
             jLabel138.setVisible(true);
             jLabel131.setVisible(true);
              jButton34.setVisible(true);
             jLabel130.setIcon(new ImageIcon(newImage));
             jLabel138.setText(arr[countBook]);
             jLabel131.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==3){
               if(countN<=loop){
                    jLabel136.setVisible(true);
             jLabel129.setVisible(true);
             jLabel133.setVisible(true);
              jButton33.setVisible(true);
             jLabel136.setIcon(new ImageIcon(newImage));
             jLabel129.setText(arr[countBook]);
             jLabel133.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==4){
               if(countN<=loop){
                    jLabel125.setVisible(true);
             jLabel127.setVisible(true);
             jLabel139.setVisible(true);
              jButton32.setVisible(true);
             jLabel125.setIcon(new ImageIcon(newImage));
             jLabel127.setText(arr[countBook]);
             jLabel139.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==5){
               if(countN<=loop){
                    jLabel152.setVisible(true);
             jLabel141.setVisible(true);
             jLabel149.setVisible(true);
              jButton36.setVisible(true);
             jLabel152.setIcon(new ImageIcon(newImage));
             jLabel141.setText(arr[countBook]);
             jLabel149.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==6){
               if(countN<=loop){
                    jLabel143.setVisible(true);
             jLabel150.setVisible(true);
             jLabel147.setVisible(true);
              jButton35.setVisible(true);
             jLabel143.setIcon(new ImageIcon(newImage));
             jLabel150.setText(arr[countBook]);
             jLabel147.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==7){
               if(countN<=loop){
                    jLabel145.setVisible(true);
             jLabel153.setVisible(true);
             jLabel146.setVisible(true);
              jButton39.setVisible(true);
             jLabel145.setIcon(new ImageIcon(newImage));
             jLabel153.setText(arr[countBook]);
             jLabel146.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==8){
               if(countN<=loop){
                    jLabel151.setVisible(true);
             jLabel144.setVisible(true);
             jLabel148.setVisible(true);
              jButton38.setVisible(true);
             jLabel151.setIcon(new ImageIcon(newImage));
             jLabel144.setText(arr[countBook]);
             jLabel148.setText("ราคา : "+String.valueOf(price));
               }
           }else if(countN==9){
               if(countN<=loop){
                    jLabel140.setVisible(true);
             jLabel142.setVisible(true);
             jLabel154.setVisible(true);
              jButton37.setVisible(true);
             jLabel140.setIcon(new ImageIcon(newImage));
             jLabel142.setText(arr[countBook]);
             jLabel154.setText("ราคา : "+String.valueOf(price));
               }
           }countN++;
          
        }  }catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
}
private void checkPage(){
     if(countBook==arr.length-1){
               jLabel54.setVisible(false);
           }else{
                jLabel54.setVisible(true);
           }
            if(countBook==10){
               jLabel52.setVisible(false);
           }else{
                jLabel52.setVisible(true);
           }
}
private void setScroll(){
    
    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
         if(arr.length-1>countBook+10){
        loopBook(10);
        }else{
            loopBook((arr.length-1)-countBook); 
         }  
          checkPage();
         jScrollPane6.getVerticalScrollBar().setValue(0);         
         this.setCursor(Cursor.getDefaultCursor());
       
}
private void setScrollRe(){   
    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if(countBook==arr.length-1){
            this.countBook=(countBook-10)-((arr.length-1)%10);
            loopBook(10);
        }else if(0<=countBook-20){
             this.countBook=countBook-20;
        loopBook(10);
        } 
        checkPage();
        jScrollPane6.getVerticalScrollBar().setValue(0);
         this.setCursor(Cursor.getDefaultCursor());
       
}
private void setOther(){
    jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
    jScrollPane6.getVerticalScrollBar().setUnitIncrement(16);  
    jScrollPane4.getVerticalScrollBar().setUnitIncrement(16); 
}
    private void setWin(){
        try {
            new File("C:\\imgBS").mkdirs();
            setAllVisibleFalse();
            panelHome.setVisible(true);         
//            uri = new MongoClientURI("mongodb://book:p12345@ds243212.mlab.com:43212/bkstore");
//            mongo = new MongoClient(uri);
//            db = mongo.getDB(uri.getDatabase());
             mongo = new MongoClient("localhost", 27017);
             db = mongo.getDB("bkstore");
            user = db.getCollection("users");
            books = db.getCollection("books");
            orders = db.getCollection("order");
            gfsPhoto = new GridFS(db, "photo");
            setOther();
            createArray();
            randomBook();
            setScroll(); 
            tm = new Timer(2500,new ActionListener() {
            public void actionPerformed(ActionEvent e) {                
               if(ban==1){                   
                    jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/แบนเนอร์แก้ (3).png")));
                    ban=2;
               }else{
                   jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/แบนเนอร์แจกที่คั่น.png")));
                   ban=1;
               }
            }
        });
           
        }catch (IOException ex) {
            jLabel85.setText("status : Offline");
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }  
}
          
    private void jSpinner1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1AncestorAdded

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
         if(id_user==0){
              setAllVisibleFalse();
            panelLogin.setVisible(true);
         }else if(admin==true){
             JOptionPane.showMessageDialog(this, "แอดมินไม่สามารถสั่งซื้อสินค้าได้");
         }else{
            orderList();
            JOptionPane.showMessageDialog(this, "ใส่ตะกร้าแล้ว");
    }//GEN-LAST:event_jButton13ActionPerformed
    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
 DefaultListModel dim2 = new DefaultListModel();
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            if(obname.isEmpty()){
                JOptionPane.showMessageDialog(this, "คุณยังไม่ได้เลือกสินค้า");              
            }else if(credit.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "กรุณากรอกเลขบัตร เพื่อใช้ชำระเงิน");              
            }else{
              orderAdd();
              JOptionPane.showMessageDialog(this, "สั่งซื้อเสร็จสิ้น");
              orderClear();
            }   
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {  
            if(jTextField5.getText().isEmpty()||jTextField6.getText().isEmpty()||jTextField7.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "โปรดใส่ข้อมูลที่จำเป็นในการเข้าระบบ");
            }else{
            String ID = jTextField5.getText();
            String passf =jTextField6.getText();
            String passs =jTextField7.getText();
            BasicDBObject searchQuery  = new BasicDBObject();
            searchQuery.put("username", ID);
            dockUser = user.findOne(searchQuery);
            if(dockUser!=null){
                JOptionPane.showMessageDialog(this, "Username ซ้ำ");
                
            }else{
                if(!passs.equals(passf)){
                JOptionPane.showMessageDialog(this, "Password ไม่ตรงกัน");
                }else{
                  createUser();                
            }
            }
            }   
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void deskillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskillActionPerformed
            deleteBook();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
            setVisibleEditfield(false);  
            search.setText(null);
            createArray();
        
    }//GEN-LAST:event_deskillActionPerformed

    private void upskillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upskillActionPerformed
            editUpdate();    
            JOptionPane.showMessageDialog(this, "แก้ไขข้อมูลเรียบร้อย");            
            setVisibleEditfield(false);   
            createArray();       
    }//GEN-LAST:event_upskillActionPerformed

    private void P_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_bookActionPerformed

    private void n_auActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_auActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_auActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
            BasicDBObject sq  = new BasicDBObject();

            sq.put("name_Book", search.getText());  
            setEditBook(sq);        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void n_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_bookActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel9.getText());
            setBook(search);
            panelHome.setVisible(false);        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void im_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_im_bookActionPerformed

    private void EX_book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EX_book2ActionPerformed
        JFileChooser img = new JFileChooser();
         FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        img.setFileFilter(imageFilter);
        img.showOpenDialog(null);
        File f = img.getSelectedFile();
        if(f!=null){            
                String file = f.getAbsolutePath();                
                im_book.setText(file);          
                jLabel61.setIcon(new ImageIcon(new ImageIcon(file).getImage().getScaledInstance(jLabel61.getWidth(),jLabel61.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_EX_book2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel3.getText());
            setBook(search);
            panelHome.setVisible(false);           
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel11.getText());
            setBook(search);
            panelHome.setVisible(false);

            

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      panelBook.setVisible(true);                 
            BasicDBObject search  = new BasicDBObject();
            
            
            if(!jTable2.getSelectionModel().isSelectionEmpty()){
                String name =(String) jTable2.getModel().getValueAt( jTable2.getSelectedRow(),0);
                search.put("name_Book",name);
                setBook(search);
                panelAllBook.setVisible(false);                
            
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
         setAllVisibleFalse();
       panelRule.setVisible(true);
       jScrollPane4.getVerticalScrollBar().setValue(0);   
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setAllVisibleFalse();
        panelEdit.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setAllVisibleFalse();
        panelBook.setVisible(true);
        BasicDBObject search  = new BasicDBObject();
        search.put("name_Book",sh_book.getText());
        if(setBook(search)){
            jLabel16.setText("ไม่พบหนังสือ");
            jLabel17.setText(null);
            jLabel18.setText(null);
            jLabel19.setText(null);
            jLabel20.setText(null);
            jLabel21.setText(null);
            jLabel22.setText(null);
            jLabel23.setText(null);
            imgs.setIcon(null);
            jSpinner1.setVisible(false);
            jButton13.setVisible(false);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setAllVisibleFalse();
        panelBasket.setVisible(true);
        if(obname.isEmpty()){
            JOptionPane.showMessageDialog(this, "คุณยังไม่ได้เลือกสินค้า");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(id_user==0){
            setAllVisibleFalse();
            panelLogin.setVisible(true);
        }else{
            id_user=0;
            admin=false;
            setAllVisibleFalse();
            orderClear();
            panelHome.setVisible(true);
            checkUserAndSet();
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/Name_26px.png"))); 
            
        }
        jTextField15.setText(null);
        jTextField16.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        setAllVisibleFalse();
        panelHome.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setAllVisibleFalse();
        panelAllBookImg.setVisible(true);
        jTable2.setModel(model2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       try {
            String ID = jTextField15.getText();
            String PASS =jTextField16.getText();

            BasicDBObject searchQuery  = new BasicDBObject();
            searchQuery.put("username", ID);

            dockUser = user.findOne(searchQuery);
            if(dockUser==null){
                JOptionPane.showMessageDialog(this, "ไม่มี username นี้ในระบบ");
                jTextField15.setText(null);
                jTextField16.setText(null);
            }
            String pass = (String) dockUser.get("password");
            String type = (String) dockUser.get("id_type");

            if(pass.equals(PASS)){
                JOptionPane.showMessageDialog(this, "เข้าสู่ระบบสำเร็จ");
                nameuse=ID;
                double id_userdb = (double)dockUser.get("id_user");
                int id_use = (int) id_userdb;
                if(type.equals("admin")){
                    setid(id_use,true);
                    panelLogin.setVisible(false);
                    panelHome.setVisible(true);
                    checkUserAndSet();
                }else if(type.equals("custumer")){
                    setid(id_use,false);
                    panelLogin.setVisible(false);
                    panelHome.setVisible(true);
                    checkUserAndSet();
                }
            }else{
                JOptionPane.showMessageDialog(this, "password ไม่ถูกต้อง");
                jTextField16.setText(null);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void n_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_authorActionPerformed

    private void jImgUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImgUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jImgUPActionPerformed

    private void EX_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EX_bookActionPerformed
          JFileChooser img = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        img.setFileFilter(imageFilter);
        img.showOpenDialog(null);
        File f = img.getSelectedFile();
        if(f!=null){
            String file = f.getAbsolutePath();
            jImgUP.setText(file);
            jLabel50.setIcon(new ImageIcon(new ImageIcon(file).getImage().getScaledInstance(jLabel50.getWidth(),jLabel50.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_EX_bookActionPerformed

    private void dtskillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtskillActionPerformed
       if(notNullAdd()){
            addBook();
            resetTextAdd();
            createArray();
        }else{
            JOptionPane.showMessageDialog(this, "โปรดใส่รายละเอียดให้ครบถ้วน");
        }
    }//GEN-LAST:event_dtskillActionPerformed

    private void jpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpriceActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel39.getText());
            setBook(search);
            panelHome.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel42.getText());
            setBook(search);
            panelHome.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
         panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel135.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel126.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
         panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel127.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
         panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel129.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel138.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel150.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
         panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel141.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
         panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel142.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
         panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel144.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
       panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel153.getText());
            setBook(search);
            panelAllBookImg.setVisible(false); 
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
      setScroll();
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        setScrollRe();
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel92.getText());
            setBook(search);
            panelHome.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
      panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel95.getText());
            setBook(search);
            panelHome.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel98.getText());
            setBook(search);
            panelHome.setVisible(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel106.getText());
            setBook(search);
            panelHome.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        panelBook.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel110.getText());
            setBook(search);
            panelHome.setVisible(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void sh_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sh_bookMouseClicked
        sh_book.setText("");
    }//GEN-LAST:event_sh_bookMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jCheckBox2.isSelected()){
            setAllVisibleFalse();
            panelRegis.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "กรุณายอมรับเงื่อนไข");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
       setAllVisibleFalse();
        panelAllBook.setVisible(true);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       setAllVisibleFalse();
        panelAdd.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
       BasicDBObject search  = new BasicDBObject();
            
            
            if(!jTable1.getSelectionModel().isSelectionEmpty()){
                String name =(String) jTable1.getModel().getValueAt( jTable1.getSelectedRow(),0);
                search.put("name_Book",name);
                setEditBook(search);                                
            
        }
        
    }//GEN-LAST:event_jButton25ActionPerformed
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EX_book;
    private javax.swing.JButton EX_book2;
    private javax.swing.JTextField P_book;
    private javax.swing.JTextField credit;
    private javax.swing.JButton deskill;
    private javax.swing.JButton dtskill;
    private javax.swing.JTextField im_book;
    private javax.swing.JLabel imgs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JTextField jImgUP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JPasswordField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPasswordField jTextField6;
    private javax.swing.JPasswordField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jnum;
    private javax.swing.JTextField jprice;
    private javax.swing.JTextField n_au;
    private javax.swing.JTextField n_author;
    private javax.swing.JTextField n_book;
    private javax.swing.JTextField name_book;
    private javax.swing.JTextField np;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelAllBook;
    private javax.swing.JPanel panelAllBookImg;
    private javax.swing.JPanel panelBasket;
    private javax.swing.JPanel panelBook;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelRegis;
    private javax.swing.JPanel panelRule;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sh_book;
    private javax.swing.JPanel statusbar;
    private javax.swing.JButton upskill;
    // End of variables declaration//GEN-END:variables

    
}
