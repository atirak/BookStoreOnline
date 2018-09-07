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
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class home extends javax.swing.JFrame {
    public home() {        
        initComponents();       
            setWin();
            setModeil();        
    }
public void close(){
        WindowEvent winclose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
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
        jPanel3 = new javax.swing.JPanel();
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
        jPanel7 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        type_book = new javax.swing.JTextField();
        n_author = new javax.swing.JTextField();
        name_book = new javax.swing.JTextField();
        jImgUP = new javax.swing.JTextField();
        EX_book = new javax.swing.JButton();
        dtskill = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        n_book = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        n_au = new javax.swing.JTextField();
        P_book = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        T_book = new javax.swing.JTextField();
        upskill = new javax.swing.JButton();
        deskill = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jprice = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jpup = new javax.swing.JTextField();
        jyear = new javax.swing.JTextField();
        jlang = new javax.swing.JTextField();
        jnum = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        shu = new javax.swing.JTextField();
        year_b = new javax.swing.JTextField();
        L_book = new javax.swing.JTextField();
        np = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        im_book = new javax.swing.JTextField();
        EX_book2 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel37 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JPasswordField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
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
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        credit = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("EQ Feel Good", 0, 48)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 153, 0));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_General_Ledger_50px.png"))); // NOI18N
        jLabel64.setText(" Book Store");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ekkamai Standard", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Male_User_25px_1.png"))); // NOI18N
        jLabel1.setText("ผู้เยี่ยมชม");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 240, 40));

        jPanel14.setBackground(new java.awt.Color(255, 153, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Ekkamai Standard", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Open_Book_25px.png"))); // NOI18N
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

        jButton17.setBackground(new java.awt.Color(255, 153, 0));
        jButton17.setFont(new java.awt.Font("Ekkamai Standard", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Home_25px_1.png"))); // NOI18N
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

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Name_25px.png"))); // NOI18N
        jButton1.setText("เข้าสู่ระบบ");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 120, 40));

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Ekkamai Standard", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Shopping_Cart_25px.png"))); // NOI18N
        jButton5.setText("0");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 80, 40));

        sh_book.setBackground(new java.awt.Color(255, 153, 0));
        sh_book.setFont(new java.awt.Font("Ekkamai Standard", 0, 14)); // NOI18N
        sh_book.setForeground(new java.awt.Color(255, 255, 255));
        sh_book.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sh_book.setText("กรอกเพื่อค้นหา");
        sh_book.setBorder(null);
        sh_book.setCaretColor(new java.awt.Color(255, 255, 255));
        sh_book.setRequestFocusEnabled(false);
        sh_book.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        sh_book.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel14.add(sh_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 100, 40));

        jButton11.setBackground(new java.awt.Color(255, 153, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Search_25px.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Search_Bar_25px.png"))); // NOI18N
        jPanel14.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Ekkamai Standard", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Edit_Column_25px.png"))); // NOI18N
        jButton2.setText("แก้ไขหนังสือ");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, 40));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1080, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(imgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 310, 360));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
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
        jPanel3.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 130, 50));

        jButton13.setBackground(new java.awt.Color(255, 204, 0));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("หยิบใส่ตะกร้า");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 130, 70));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 320, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 270, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 270, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 270, 50));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 270, 50));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 270, 50));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 270, 50));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 270, 50));

        jPanel13.setBackground(new java.awt.Color(232, 246, 246));
        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 410, 310));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 500));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel38.setForeground(java.awt.Color.gray);
        jLabel38.setText("แก้ไขและลบ");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel39.setForeground(java.awt.Color.gray);
        jLabel39.setText("เพิ่มข้อมูล");
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(java.awt.Color.gray);
        jLabel40.setText("ชื่อหนังสือ");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(java.awt.Color.gray);
        jLabel41.setText("ชื่อผู้แต่ง");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(java.awt.Color.gray);
        jLabel42.setText("ตัวอย่างหนังสือ");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(java.awt.Color.gray);
        jLabel43.setText("ประเภทหนังสือ");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel7.add(type_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 221, -1));

        n_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_authorActionPerformed(evt);
            }
        });
        jPanel7.add(n_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 221, -1));
        jPanel7.add(name_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 221, -1));

        jImgUP.setEditable(false);
        jImgUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImgUPActionPerformed(evt);
            }
        });
        jPanel7.add(jImgUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 220, -1));

        EX_book.setBackground(new java.awt.Color(0, 0, 255));
        EX_book.setForeground(new java.awt.Color(255, 255, 255));
        EX_book.setText("อัพโหลดรูป");
        EX_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EX_bookActionPerformed(evt);
            }
        });
        jPanel7.add(EX_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 100, 30));

        dtskill.setBackground(new java.awt.Color(0, 153, 51));
        dtskill.setForeground(new java.awt.Color(255, 255, 255));
        dtskill.setText("บันทึกการเพิ่ม");
        dtskill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtskillActionPerformed(evt);
            }
        });
        jPanel7.add(dtskill, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 110, 40));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(java.awt.Color.gray);
        jLabel44.setText("ค้นหาหนังสือ");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(java.awt.Color.gray);
        jLabel45.setText("ชื่อหนังสือ");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(java.awt.Color.gray);
        jLabel46.setText("ชื่อหนังสือ");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 80, 30));

        n_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_bookActionPerformed(evt);
            }
        });
        jPanel7.add(n_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 171, -1));

        jButton20.setBackground(new java.awt.Color(0, 0, 255));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("ค้นหา");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 85, -1, 40));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(java.awt.Color.gray);
        jLabel47.setText("ราคา");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(java.awt.Color.gray);
        jLabel48.setText("ชื่อผู้แต่ง");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel7.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 171, 30));

        n_au.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_auActionPerformed(evt);
            }
        });
        jPanel7.add(n_au, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 171, -1));

        P_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_bookActionPerformed(evt);
            }
        });
        jPanel7.add(P_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 171, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(java.awt.Color.gray);
        jLabel49.setText("ประเภทหนังสือ");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        T_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_bookActionPerformed(evt);
            }
        });
        jPanel7.add(T_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 171, -1));

        upskill.setBackground(new java.awt.Color(0, 153, 51));
        upskill.setForeground(new java.awt.Color(255, 255, 255));
        upskill.setText("บันทึกการแก้ไข");
        upskill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upskillActionPerformed(evt);
            }
        });
        jPanel7.add(upskill, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 110, 40));

        deskill.setBackground(new java.awt.Color(0, 153, 51));
        deskill.setForeground(new java.awt.Color(255, 255, 255));
        deskill.setText("ลบหนังสือ");
        deskill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskillActionPerformed(evt);
            }
        });
        jPanel7.add(deskill, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 90, 40));
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 100, 130));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(java.awt.Color.gray);
        jLabel51.setText("ราคา");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpriceActionPerformed(evt);
            }
        });
        jPanel7.add(jprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 221, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(java.awt.Color.gray);
        jLabel52.setText("สำนักพิมพิ์");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(java.awt.Color.gray);
        jLabel53.setText("ปีที่พิมพ์");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(java.awt.Color.gray);
        jLabel54.setText("ภาษาที่ใช้เขียน");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setForeground(java.awt.Color.gray);
        jLabel55.setText("จำนวนหน้า");
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jpup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpupActionPerformed(evt);
            }
        });
        jPanel7.add(jpup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 221, -1));
        jPanel7.add(jyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 221, -1));
        jPanel7.add(jlang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 221, -1));
        jPanel7.add(jnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 221, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setForeground(java.awt.Color.gray);
        jLabel56.setText("สำนักพิมพิ์");
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setForeground(java.awt.Color.gray);
        jLabel57.setText("ปีที่พิมพ์");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setForeground(java.awt.Color.gray);
        jLabel58.setText("ภาษาที่ใช้เขียน");
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setForeground(java.awt.Color.gray);
        jLabel59.setText("รูปหนังสือ");
        jPanel7.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));
        jPanel7.add(shu, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 171, -1));

        year_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_bActionPerformed(evt);
            }
        });
        jPanel7.add(year_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 171, -1));
        jPanel7.add(L_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 171, -1));
        jPanel7.add(np, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 171, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(java.awt.Color.gray);
        jLabel60.setText("จำนวนหน้า");
        jPanel7.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        im_book.setEditable(false);
        im_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im_bookActionPerformed(evt);
            }
        });
        jPanel7.add(im_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 170, -1));

        EX_book2.setBackground(new java.awt.Color(0, 0, 255));
        EX_book2.setForeground(new java.awt.Color(255, 255, 255));
        EX_book2.setText("อัพโหลดรูป");
        EX_book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EX_book2ActionPerformed(evt);
            }
        });
        jPanel7.add(EX_book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 100, 30));
        jPanel7.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 100, 130));

        jPanel9.setBackground(new java.awt.Color(204, 153, 255));
        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 430));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 500));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(jList3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 550, 360));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel37.setForeground(java.awt.Color.gray);
        jLabel37.setText("หนังสือทั้งหมด");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jButton15.setBackground(new java.awt.Color(0, 204, 0));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setText("เลือกดู");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 130, 70));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 500));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(java.awt.Color.gray);
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("ลงทะเบียน");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 110, 40));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(java.awt.Color.gray);
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("เข้าสู่ระบบ");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 120, 40));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(java.awt.Color.gray);
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("รหัสผ่าน");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(java.awt.Color.gray);
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("ชื่อผู้ใช้");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, 30));

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("เข้าสู่ระบบ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 140, 40));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 180, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(java.awt.Color.gray);
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("ชื่อผู้ใช้");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.gray);
        jLabel4.setText("รหัสผ่าน");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 70, 20));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 180, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 180, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(java.awt.Color.gray);
        jLabel29.setText("ใส่รหัสผ่านอีกครั้ง");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 110, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(java.awt.Color.gray);
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("อีเมล");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 70, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 180, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 180, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(java.awt.Color.gray);
        jLabel31.setText("บ้านเลขที่");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(java.awt.Color.gray);
        jLabel32.setText("ถนน");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 180, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(java.awt.Color.gray);
        jLabel33.setText("ตำบล");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 180, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(java.awt.Color.gray);
        jLabel34.setText("อำเภอ");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 180, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(java.awt.Color.gray);
        jLabel35.setText("จังหวัด");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 180, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 180, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(java.awt.Color.gray);
        jLabel36.setText("รหัสไปรษณีย์");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, -1, -1));

        jButton18.setBackground(new java.awt.Color(0, 204, 0));
        jButton18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("ลงทะเบียน");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 180, 50));

        jPanel8.setBackground(new java.awt.Color(219, 166, 242));
        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 440));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 500));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.gray);
        jLabel8.setText("กรอกเลขบัตรเครดิตเพื่อทำการชำระเงิน");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(java.awt.Color.gray);
        jLabel14.setText("ตะกร้าสินค้า");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jList2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 480, 150));

        jButton9.setBackground(new java.awt.Color(0, 204, 102));
        jButton9.setText("เสร็จสิ้น");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 120, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.gray);
        jLabel15.setText("สรุปรายการสั่งซื้อ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel62.setForeground(java.awt.Color.gray);
        jLabel62.setText("บาท");
        jPanel4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel63.setForeground(java.awt.Color.gray);
        jLabel63.setText("ราคาสุทธิ");
        jPanel4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        credit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });
        jPanel4.add(credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 270, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 185, 247));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("price");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("price");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 90, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 185, 247));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 185, 247));

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setForeground(new java.awt.Color(255, 153, 153));
        jButton6.setText("เลือกดู");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setForeground(new java.awt.Color(204, 204, 19));
        jButton7.setText("เลือกดู");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, -1, -1));

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setForeground(new java.awt.Color(0, 153, 0));
        jButton8.setText("เลือกดู");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 260, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(java.awt.Color.gray);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("หนังสือแนะนำ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 270, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("price");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 280, -1));

        jPanel10.setBackground(new java.awt.Color(255, 240, 245));
        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 300, 390));

        jPanel11.setBackground(new java.awt.Color(255, 228, 225));
        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 310, 390));

        jPanel12.setBackground(new java.awt.Color(255, 204, 255));
        jPanel12.setForeground(new java.awt.Color(255, 153, 0));
        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 300, 390));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1050, 500));

        pack();
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

private void setid(int id,boolean admin){
    id_user = id;
    this.admin = admin;
}
private void setAllVisibleFalse(){
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
            
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
            T_book.setVisible(false);
            P_book.setVisible(false);
            shu.setVisible(false);
            year_b.setVisible(false);
            L_book.setVisible(false);
            np.setVisible(false);
            upskill.setVisible(false);
            deskill.setVisible(false);  
            jLabel59.setVisible(false);
            im_book.setVisible(false);
            jLabel60.setVisible(false);
            EX_book2.setVisible(false);
            jButton2.setVisible(false);
            jButton5.setVisible(false);
            jButton13.setVisible(false);
            jSpinner1.setVisible(false);
            jLabel61.setVisible(false);
            if(admin!=true&&id_user!=0){
                jButton5.setVisible(true);
            }else if(admin==true&&id_user!=0){
                jButton2.setVisible(true);
            }
}
private void createArray(){
            DBCursor cursor = books.find();
            arr = new String[(int)books.count()];
            int icount=0;               
             while (cursor.hasNext()) {
                DBObject dockran= cursor.next();
                arr[icount]=(String) dockran.get("name_Book");
                
                if(icount==arr.length-1)
                    lastidbook = (double) dockran.get("book_id");
               
                icount++;
                        
		}
}
private void randomBook(){
    try{
        Random rand = new Random();
        for(int i=0;i<3;i++){
            int numrandom = rand.nextInt(arr.length-1);
             
            BasicDBObject searchQuery  = new BasicDBObject();
            searchQuery.put("name_Book",arr[numrandom]);
            dockBook= books.findOne(searchQuery);
            
            String name = (String)dockBook.get("name_Book");
            double price = (Double)dockBook.get("Pirce");
            BasicDBObject searchQueryPhoto  = new BasicDBObject();
            searchQueryPhoto.put("filename", name);
            
            GridFS gfsPhoto = new GridFS(db, "photo");
            GridFSDBFile imageForOutput = gfsPhoto.findOne(searchQueryPhoto);
            
            new File("C:\\imgBS").mkdirs();
            imageForOutput.writeTo("C:\\imgBS\\IMGbooksmain.png");
            BufferedImage img = ImageIO.read( new File("C:\\imgBS\\IMGbooksmain.png") );
            Image newImage = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT);  
           if(i==0){
             jLabel5.setIcon(new ImageIcon(newImage));
             jLabel3.setText(name);
             jLabel2.setText("ราคา : "+String.valueOf(price));
           }else if(i==1){
             jLabel6.setIcon(new ImageIcon(newImage));
             jLabel11.setText(name);
             jLabel12.setText("ราคา : "+String.valueOf(price));
           }else{
             jLabel7.setIcon(new ImageIcon(newImage));
             jLabel9.setText(name);
             jLabel13.setText("ราคา : "+String.valueOf(price));
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
               jButton13.setVisible(true);
               jSpinner1.setVisible(true);
            }
            if(id_user!=0){
                jButton1.setText("ออกจากระบบ");
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/myapp/images/icons8_Exit_25px.png"))); 
                jLabel1.setText(nameuse);
            }else{
                jLabel1.setText("ผู้เยี่ยมชม");
                jButton1.setText("เข้าสู่ระบบ");
                jButton2.setVisible(false);
                jButton5.setVisible(false);
                jButton13.setVisible(false);
                jSpinner1.setVisible(false);
            }
}
private void orderClear(){
    DefaultListModel modeil = new DefaultListModel();                
                obname.clear();
                obprice.clear();
                Value.clear();
                sumprice=0;
                jList2.setModel(modeil);
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
        DefaultListModel modeil = new DefaultListModel();
        int count=0;
        for(String coll : obname){ 
                    modeil.addElement(coll+"     จำนวน "+Value.get(count)+" เล่ม");
                    count++;
                }
            jList2.setModel(modeil);           
            jTextField2.setText(sumprice+"");
}
private boolean setBook(BasicDBObject search){
                try{
                    DBObject a = books.findOne(search);
                if(a!=null){
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
                GridFS gfsPhoto = new GridFS(db, "photo");
                GridFSDBFile imageForOutput = gfsPhoto.findOne(searchQuery);
                if(imageForOutput!=null){
                   

                    imageForOutput.writeTo("C:\\imgBS\\IMGbooksTEMP.png");
                    BufferedImage img = ImageIO.read( new File("C:\\imgBS\\IMGbooksTEMP.png") );

                    Image newImage = img.getScaledInstance(imgs.getWidth(), imgs.getHeight(), Image.SCALE_DEFAULT);
                    imgs.setIcon(new ImageIcon(newImage));
                    if(admin!=true&&id_user!=0){
                        jButton13.setVisible(true);
                        jSpinner1.setVisible(true);
                    }
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
                T_book.setVisible(flag);
                P_book.setVisible(flag);
                shu.setVisible(flag);
                year_b.setVisible(flag);
                L_book.setVisible(flag);
                np.setVisible(flag);
                upskill.setVisible(flag);
                deskill.setVisible(flag);
                jLabel59.setVisible(flag);
                im_book.setVisible(flag);
                jLabel60.setVisible(flag);
                EX_book2.setVisible(flag);
                jLabel61.setVisible(flag);
    
}
private void setEditBook(BasicDBObject search){
            try{
            dockBook= books.findOne(search);
            if(dockBook==null){
                JOptionPane.showMessageDialog(this, "ไม่มี หนังสือ นี้ในระบบ");
                setVisibleEditfield(false);

            }else{
                
                JOptionPane.showMessageDialog(this, "มี หนังสือ นี้ในระบบ");
                setVisibleEditfield(true);
                
                n_book.setText((String) dockBook.get("name_Book"));
                n_au.setText((String) dockBook.get("name_Author"));
                T_book.setText((String) dockBook.get("Type_Book"));
                double price =(Double) dockBook.get("Pirce");
                P_book.setText(Double.toString(price));

              DBObject detail = (DBObject) dockBook.get("Detail");
              shu.setText((String) detail.get("publisher"));
              double year =(Double) detail.get("year");
              int yearint = (int) year;
              year_b.setText(yearint+"");
              L_book.setText((String) detail.get("language"));
              double nump =(Double) detail.get("num_pages");
              int numint = (int) nump;
              np.setText(numint+"");
              
                BasicDBObject searchQuery  = new BasicDBObject();
                searchQuery.put("filename", n_book.getText());
                GridFS gfsPhoto = new GridFS(db, "photo");
                GridFSDBFile imageForOutput = gfsPhoto.findOne(searchQuery);
                if(imageForOutput!=null){
                    imageForOutput.writeTo("C:\\imgBS\\IMGbooksTEMPEdit.png");
                    BufferedImage img = ImageIO.read( new File("C:\\imgBS\\IMGbooksTEMPEdit.png") );

                    Image newImage = img.getScaledInstance(jLabel61.getWidth(), jLabel61.getHeight(), Image.SCALE_DEFAULT);
                    jLabel61.setIcon(new ImageIcon(newImage));
                }
            }}catch (IOException ex) {
                Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
            }
}
private void deleteBook(){
            BasicDBObject de  = new BasicDBObject();
            de.put("name_Book",search.getText());
            
            GridFS gfsPhoto = new GridFS(db, "photo");
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
            ndocuments.put("Type_Book",T_book.getText());
            ndocuments.put("Pirce",Double.valueOf(P_book.getText()));
            ndocuments1.put("publisher",shu.getText());
            ndocuments1.put("year",Double.valueOf(year_b.getText()));
            ndocuments1.put("language",L_book.getText());
            ndocuments1.put("num_pages",Double.valueOf(np.getText()));
            ndocuments.put("Detail",ndocuments1);

            if(!im_book.getText().isEmpty()){
               File imageFile = new File(im_book.getText());
            GridFS gfsPhoto = new GridFS(db, "photo");
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
            document.put("Type_Book",type_book.getText());
            document.put("Pirce",Double.valueOf(jprice.getText()));
            document1.put("publisher",jpup.getText());
            document1.put("year",Double.valueOf(jyear.getText()));
            document1.put("language",jlang.getText());
            document1.put("num_pages",Double.valueOf(jnum.getText()));
           
            File imageFile = new File(jImgUP.getText());
            GridFS gfsPhoto = new GridFS(db, "photo");
            GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
            gfsFile.setFilename(name_book.getText());
            gfsFile.save();

            document.put("Detail",document1);
            books.insert(document);
            JOptionPane.showMessageDialog(this, "เพิ่มข็อมูลรียบร้อย");                        
        } catch (IOException ex) {            
        }
}
private void resetTextAdd(){    
           name_book.setText(null);
           n_author.setText(null);
           type_book.setText(null);
           jprice.setText(null);
           jpup.setText(null);
           jyear.setText(null);
           jlang.setText(null);
           jnum.setText(null);
           jImgUP.setText(null);
           jLabel50.setIcon(null);
}
private boolean notNullAdd(){
            if(name_book.getText().isEmpty()|| n_author.getText().isEmpty()
                    ||type_book.getText().isEmpty()||jprice.getText().isEmpty()
                    ||jpup.getText().isEmpty()||jyear.getText().isEmpty()
                    ||jlang.getText().isEmpty()||jnum.getText().isEmpty()
                    ||jImgUP.getText().isEmpty()){
                return false;
            }return true;
}
private void createUser() {
            String ID = jTextField5.getText();
            String passf =jTextField6.getText();
            String passs =jTextField7.getText();
            String email =jTextField8.getText();
            String Hnum =jTextField9.getText();
            String street =jTextField12.getText();
            String subdis =jTextField10.getText();
            String dis =jTextField11.getText();
            String prov =jTextField13.getText();
            String zip =jTextField14.getText();
                BasicDBObject add  = new BasicDBObject();
                BasicDBObject addD = new BasicDBObject();
                add.put("id_user",(double)user.count()+1);
                add.put("doc_type", "User");
                add.put("username", ID);
                add.put("password", passf);
                add.put("id_type", "custumer");
                addD.put("house_num",Hnum);
                addD.put("street",street);
                addD.put("sub_district",subdis);
                addD.put("district",dis);
                addD.put("province",prov);
                addD.put("zip_code",Double.valueOf(zip));
                addD.put("email",email);
                add.put("Address",addD);
                user.insert(add);
                
                jTextField5.setText(null);
                jTextField6.setText(null);
                jTextField7.setText(null);
                jTextField8.setText(null);
                jTextField9.setText(null);
                jTextField12.setText(null);
                jTextField10.setText(null);
                jTextField11.setText(null);
                jTextField13.setText(null);
                jTextField14.setText(null);
    }
public static DefaultListModel setModeil(){
      modeil = new DefaultListModel();
		for(int m=arr.length-1;m>=1;m--){
			int index = m;
			for(int ni=0;ni<m;ni++){
				if((int)arr[ni].charAt(0)==(int)arr[index].charAt(0)){
					if((int)arr[ni].charAt(1)>(int)arr[index].charAt(1))
						index = ni;
					else if((int)arr[ni].charAt(1)==(int)arr[index].charAt(1)){
						if((int)arr[ni].charAt(2)>(int)arr[index].charAt(2))
							index = ni;
					}				
				}
				else if((int)arr[ni].charAt(0)>(int)arr[index].charAt(0))
					index = ni;				
			}
			String temp = arr[index];			
			arr[index]=arr[m];			
			arr[m] =temp;        
                }
                for(String coll : arr){ 
                    modeil.addElement(coll); 
                }
                return modeil;
 }
    private void setWin(){
        try {
            setAllVisibleFalse();
            jPanel2.setVisible(true);         
            uri = new MongoClientURI("mongodb://book:p12345@ds243212.mlab.com:43212/bkstore");
            mongo = new MongoClient(uri);
            db = mongo.getDB(uri.getDatabase());
            user = db.getCollection("users");
            books = db.getCollection("books");
            orders = db.getCollection("order");
            createArray();
            randomBook();
            
        }catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }  
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(id_user==0){
            setAllVisibleFalse();
            jPanel5.setVisible(true);       
        }else{
            id_user=0;
            admin=false;
            setAllVisibleFalse();
            orderClear(); 
            jPanel2.setVisible(true);
            checkUserAndSet();
        }
            jTextField3.setText(null);
            jTextField4.setText(null);       
    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setAllVisibleFalse(); 
        jPanel7.setVisible(true);   
    }//GEN-LAST:event_jButton2ActionPerformed
     
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       setAllVisibleFalse();
       jPanel6.setVisible(true);  
       jList3.setModel(modeil);     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setAllVisibleFalse();
        jPanel4.setVisible(true);
        if(obname.isEmpty()){         
              JOptionPane.showMessageDialog(this, "คุณยังไม่ได้เลือกสินค้า");
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setAllVisibleFalse();
        jPanel3.setVisible(true);    
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

    private void jSpinner1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1AncestorAdded

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
         if(jLabel23.getText()==null){
             JOptionPane.showMessageDialog(this, "ต้องค้นหาสินค้า หรือเลือกสินค้าก่อนใส่ตะกร้า");
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

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
       setAllVisibleFalse();
       jPanel2.setVisible(true);       
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {            
            String ID = jTextField3.getText();
            String PASS =jTextField4.getText();

            BasicDBObject searchQuery  = new BasicDBObject();
            searchQuery.put("username", ID);

           dockUser = user.findOne(searchQuery);
            if(dockUser==null){
                JOptionPane.showMessageDialog(this, "ไม่มี username นี้ในระบบ");
                jTextField3.setText(null);
                jTextField4.setText(null);
            }
            String pass = (String) dockUser.get("password");
            String type = (String) dockUser.get("id_type");
          
            if(pass.equals(PASS)){
                JOptionPane.showMessageDialog(this, "success");                
                nameuse=ID;
                double id_userdb = (double)dockUser.get("id_user");
                int id_use = (int) id_userdb;
                if(type.equals("admin")){
                    setid(id_use,true);
                   jPanel5.setVisible(false);
                   jPanel2.setVisible(true);
                   checkUserAndSet();
                }else if(type.equals("custumer")){
                    setid(id_use,false);
                    jPanel5.setVisible(false);
                    jPanel2.setVisible(true);
                    checkUserAndSet(); 
                }
            }else{
                JOptionPane.showMessageDialog(this, "password ไม่ถูกต้อง");
                jTextField4.setText(null);
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

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
                JOptionPane.showMessageDialog(this, "username ซ้ำ");
                
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

    private void jpupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpupActionPerformed

    private void deskillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskillActionPerformed
            deleteBook();
            JOptionPane.showMessageDialog(this, "ลบเรียบร้อยแล้ว");
            setVisibleEditfield(false);  
            search.setText(null);
            setModeil();
        
    }//GEN-LAST:event_deskillActionPerformed

    private void upskillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upskillActionPerformed
            editUpdate();    
            JOptionPane.showMessageDialog(this, "แก้ไขเรียบร้อย");            
            setVisibleEditfield(false);   
            setModeil();       
    }//GEN-LAST:event_upskillActionPerformed

    private void T_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_bookActionPerformed

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

    private void dtskillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtskillActionPerformed
            if(notNullAdd()){
            addBook();
            resetTextAdd();
            setModeil();
            }else{
                JOptionPane.showMessageDialog(this, "คุณใส่รายละเอียดไม่ครบ");
            }        
    }//GEN-LAST:event_dtskillActionPerformed

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

    private void jImgUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImgUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jImgUPActionPerformed

    private void n_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_authorActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel3.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel9.getText());
            setBook(search);
            jPanel2.setVisible(false);        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpriceActionPerformed

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
         jPanel3.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel3.getText());
            setBook(search);
            jPanel2.setVisible(false);           
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            jPanel3.setVisible(true);
            BasicDBObject search  = new BasicDBObject();
            search.put("name_Book",jLabel11.getText());
            setBook(search);
            jPanel2.setVisible(false);

            

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      jPanel3.setVisible(true);                 
            BasicDBObject search  = new BasicDBObject();
            
            if(!jList3.isSelectionEmpty()){
                search.put("name_Book",jList3.getSelectedValue().toString());
                setBook(search);
                jPanel6.setVisible(false);                
            }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditActionPerformed

    private void year_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_bActionPerformed
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
    private javax.swing.JTextField L_book;
    private javax.swing.JTextField P_book;
    private javax.swing.JTextField T_book;
    private javax.swing.JTextField credit;
    private javax.swing.JButton deskill;
    private javax.swing.JButton dtskill;
    private javax.swing.JTextField im_book;
    private javax.swing.JLabel imgs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jImgUP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPasswordField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPasswordField jTextField6;
    private javax.swing.JPasswordField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jlang;
    private javax.swing.JTextField jnum;
    private javax.swing.JTextField jprice;
    private javax.swing.JTextField jpup;
    private javax.swing.JTextField jyear;
    private javax.swing.JTextField n_au;
    private javax.swing.JTextField n_author;
    private javax.swing.JTextField n_book;
    private javax.swing.JTextField name_book;
    private javax.swing.JTextField np;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sh_book;
    private javax.swing.JTextField shu;
    private javax.swing.JTextField type_book;
    private javax.swing.JButton upskill;
    private javax.swing.JTextField year_b;
    // End of variables declaration//GEN-END:variables

    
}
