/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicReservationSystem;

import static ClinicReservationSystem.HomePage.xsize;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Kamal
 */
public class ReserveApp extends javax.swing.JFrame {

    static Toolkit tk= Toolkit.getDefaultToolkit();
    static int  xsize=(int) tk.getScreenSize().getWidth();
    static int  ysize=(int) tk.getScreenSize().getHeight();
    Date date;Doctor D;
    /**
     * Creates new form PatientHome
     */
    public ReserveApp() {
       this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        ImageIcon icon=new ImageIcon("Profile.jpg");
        Image img = icon.getImage() ;
        Image newimg = img.getScaledInstance(Lprofile.getWidth(), Lprofile.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  
        icon=new ImageIcon(newimg);
        Lprofile.setIcon(icon);
        this.setSize(xsize, ysize);
        Background.setSize(xsize, ysize);
        ImageIcon icon1=new ImageIcon ("Patient.jpg");
        Image img1=icon1.getImage();
        Image newimg1 = img1.getScaledInstance(Background.getWidth(), Background.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  
        icon1=new ImageIcon(newimg1);
        Background.setIcon(icon1);
        jPanel1.setBackground(new Color(51,51,255,40));
        jPanel3.setBackground(new Color(51,51,255,40));
        jPanel4.setBackground(new Color(51,51,255,40));
        jPanel2.setBackground(new Color(0,0,0,0));
        Clinic.LoadingDataBase();
        
        ////////////////////////////////////////////////////////////////////////
        ImageIcon icon3=new ImageIcon("Available.jpg");
        Image img3 = icon3.getImage() ;
        Image newimg3 = img3.getScaledInstance(LabelAvailableAppoinmentPage.getWidth(), LabelAvailableAppoinmentPage.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  
        icon3=new ImageIcon(newimg3);
        LabelAvailableAppoinmentPage.setIcon(icon3);
        ////////////////////////////////////////////////////////////////////////
        for (String key : Clinic.getClinicDoctors().keySet())
        {
            D1.addItem(Clinic.getClinicDoctors().get(key).getName());
        }
       /////////////////////////////////////////////////////////////////////////
           
            
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Lprofile = new javax.swing.JLabel();
        Pname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        D3 = new javax.swing.JComboBox();
        jButton10 = new javax.swing.JButton();
        LabelAvailableAppoinmentPage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        D1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        D2 = new javax.swing.JComboBox();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setText("Clinic Reservation system");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 677, -1));

        Lprofile.setIcon(new javax.swing.ImageIcon("E:\\OmarKamal\\E-Learning\\Year One\\Semester 2\\Software Engineering\\Project\\Phase 2\\Clinic Reservation System\\Clinic Reservation System\\Clinic Reservation System\\profile.jpg")); // NOI18N

        Pname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pname.setText("Omar Kamal");

        jButton1.setText("Edite Acount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(Lprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 330, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1310, 130));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Reserve Appointment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Avialable Appointment");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Exist");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Edit Appointment");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("View Report");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, 540));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel2.setText("Available Appointments");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 410, -1));

        D3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                D3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                D3MouseReleased(evt);
            }
        });
        D3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                D3ItemStateChanged(evt);
            }
        });
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        D3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Input(evt);
            }
        });
        D3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                D3PropertyChange(evt);
            }
        });
        D3.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                D3VetoableChange(evt);
            }
        });
        jPanel4.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 150, 30));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Reserve");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 80, -1));

        LabelAvailableAppoinmentPage.setIcon(new javax.swing.ImageIcon("E:\\OmarKamal\\E-Learning\\Year One\\Semester 2\\Software Engineering\\Project\\Phase 2\\Clinic Reservation System\\Clinic Reservation System\\Clinic Reservation System\\Available.jpg")); // NOI18N
        jPanel4.add(LabelAvailableAppoinmentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 530, 380));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Time:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 150, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Select Doctor:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, -1));

        D1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                D1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                D1MouseReleased(evt);
            }
        });
        D1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                D1ItemStateChanged(evt);
            }
        });
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        D1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                D1Input(evt);
            }
        });
        D1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                D1PropertyChange(evt);
            }
        });
        D1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                D1VetoableChange(evt);
            }
        });
        jPanel4.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 150, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Dates:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, -1));

        D2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                D2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                D2MouseReleased(evt);
            }
        });
        D2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                D2ItemStateChanged(evt);
            }
        });
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        D2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                D2Input(evt);
            }
        });
        D2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                D2PropertyChange(evt);
            }
        });
        D2.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                D2VetoableChange(evt);
            }
        });
        jPanel4.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 150, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 980, 540));

        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                    EditAccount fr2=new EditAccount();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        HomePage.setUsername1("F");
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
                     HomePage fr2=new HomePage();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        HomePage fr2=new HomePage();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         HomePage fr2=new HomePage();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                    ReserveApp fr2=new ReserveApp();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ReserveApp fr2=new ReserveApp();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        EditApp fr2=new EditApp();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        ViewReport fr2=new ViewReport();
                    fr2.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_D3ActionPerformed

    private void D3VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_D3VetoableChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_D3VetoableChange

    private void D3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_D3PropertyChange
        // TODO add your handling code here:
      
    }//GEN-LAST:event_D3PropertyChange

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            for (String key : Clinic.getClinicDoctors().keySet())
            {
                if(Clinic.getClinicDoctors().get(key).equals(D1.getSelectedItem().toString()))
                {
                    for(String key1 : Clinic.getClinicDoctors().get(key).getAvailableAppointment().keySet())
                    {
                        Appointment app=Clinic.getClinicDoctors().get(key).getAvailableAppointment().get(key1);
                        
                        String[] parts = D2.getSelectedItem().toString().split("/");
                        Date date=new Date();
                        date.setDate(Integer.parseInt(parts[0]));
                        date.setMonth(Integer.parseInt(parts[1]));
                        date.setYear((Integer.parseInt(parts[2])));
                        if(app.getDate().compareTo(date)==0)
                        {
                            if(app.getTime()==Integer.parseInt(D3.getSelectedItem().toString()))
                            {
                                Patient p=Clinic.getClinicPatients().get(HomePage.getUsername1());
                                p.setAppointment(app);
                            }
                        }
                    }
                }
            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_D3MouseClicked

    private void D3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_D3MouseEntered

    private void D3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_D3MousePressed

    private void D3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_D3MouseReleased

    private void D3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_D3MouseExited

    private void Input(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Input
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Input

    private void D3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_D3ItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_D3ItemStateChanged

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D1MouseClicked

    private void D1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_D1MouseEntered

    private void D1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_D1MouseExited

    private void D1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1MousePressed

    private void D1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_D1MouseReleased

    private void D1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_D1ItemStateChanged
        // TODO add your handling code here:
        D2.removeAllItems();
        String name=D1.getSelectedItem().toString();
        for (String key : Clinic.getClinicDoctors().keySet()) 
        {
            if(Clinic.getClinicDoctors().get(key).getName().equals(name))
            {
                 D=Clinic.getClinicDoctors().get(key);
                for(String key2:D.getAvailableAppointment().keySet())
                {
                    date=D.getAvailableAppointment().get(key2).getDate();
                    D2.addItem(""+date.getDate()+'/'+date.getMonth()+'/'+date.getYear());
                }
            }
        }
    }//GEN-LAST:event_D1ItemStateChanged

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1ActionPerformed

    private void D1Input(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_D1Input
        // TODO add your handling code here:
    }//GEN-LAST:event_D1Input

    private void D1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_D1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_D1PropertyChange

    private void D1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_D1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_D1VetoableChange

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D2MouseClicked

    private void D2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_D2MouseEntered

    private void D2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_D2MouseExited

    private void D2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_D2MousePressed

    private void D2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_D2MouseReleased

    private void D2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_D2ItemStateChanged
        // TODO add your handling code here:
        D3.removeAllItems();
        for(String key:Clinic.getClinicDoctors().keySet())
        {
            if(Clinic.getClinicDoctors().get(key).getName().equals(D1.getSelectedItem().toString()))
            {
                for( String key1:Clinic.getClinicDoctors().get(key).getAvailableAppointment().keySet())
                {
                    Date d=Clinic.getClinicDoctors().get(key).getAvailableAppointment().get(key1).getDate();
                     String[] parts = D2.getSelectedItem().toString().split("/");
                        Date date=new Date();
                        date.setDate(Integer.parseInt(parts[0]));
                        date.setMonth(Integer.parseInt(parts[1]));
                        date.setYear((Integer.parseInt(parts[2])));
                    if(d.compareTo(date)==0)
                    {
                        D3.addItem(Clinic.getClinicDoctors().get(key).getAvailableAppointment().get(key1).getTime());
                    }
                }
            }
        }
       
    }//GEN-LAST:event_D2ItemStateChanged

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D2ActionPerformed

    private void D2Input(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_D2Input
        // TODO add your handling code here:
    }//GEN-LAST:event_D2Input

    private void D2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_D2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_D2PropertyChange

    private void D2VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_D2VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_D2VetoableChange

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
            java.util.logging.Logger.getLogger(ReserveApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReserveApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox D1;
    private javax.swing.JComboBox D2;
    private javax.swing.JComboBox D3;
    private javax.swing.JLabel LabelAvailableAppoinmentPage;
    private javax.swing.JLabel Lprofile;
    private javax.swing.JLabel Pname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
