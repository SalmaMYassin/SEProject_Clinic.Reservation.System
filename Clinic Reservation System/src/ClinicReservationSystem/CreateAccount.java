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
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Omar Kamal
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    static Toolkit tk= Toolkit.getDefaultToolkit();
    static int  xsize=(int) tk.getScreenSize().getWidth();
    static int  ysize=(int) tk.getScreenSize().getHeight();
    public CreateAccount() {
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        
        initComponents();
        this.setSize(xsize, ysize);
        Background.setSize(xsize, ysize);
        ImageIcon icon=new ImageIcon ("r.jpg");
        Image img=icon.getImage();
        Image newimg = img.getScaledInstance(Background.getWidth(), Background.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  
        icon=new ImageIcon(newimg);
        Background.setIcon(icon);
        jPanel1.setBackground(new Color(51,51,255,10));
        buttonGroup1.add(ClientRadio);
        buttonGroup1.add(StaffRadio);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ClientRadio = new javax.swing.JRadioButton();
        StaffRadio = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TphoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TuserName = new javax.swing.JTextField();
        TConfirmPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tpassword = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        Tname = new javax.swing.JTextField();
        L5 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel3.setText("Create account");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 80, 29));

        Tage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TageActionPerformed(evt);
            }
        });
        Tage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TageKeyTyped(evt);
            }
        });
        jPanel1.add(Tage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Age");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 78, 25));

        ClientRadio.setText("Patient");
        jPanel1.add(ClientRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        StaffRadio.setBackground(getBackground());
        StaffRadio.setText("Doctor");
        StaffRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffRadioActionPerformed(evt);
            }
        });
        jPanel1.add(StaffRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, -1, -1));

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 73, -1));

        jButton4.setText("Login as a Guest");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, -1, -1));

        TphoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TphoneNumberActionPerformed(evt);
            }
        });
        TphoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TphoneNumberKeyTyped(evt);
            }
        });
        jPanel1.add(TphoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, 29));

        TuserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TuserNameActionPerformed(evt);
            }
        });
        TuserName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TuserNameInputMethodTextChanged(evt);
            }
        });
        TuserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TuserNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TuserNameKeyTyped(evt);
            }
        });
        jPanel1.add(TuserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 130, 30));

        TConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TConfirmPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(TConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("UserName*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 100, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Password*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 80, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Confirm Password*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 150, 25));
        jPanel1.add(Tpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 130, 33));

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        Tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnameActionPerformed(evt);
            }
        });
        Tname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TnameKeyTyped(evt);
            }
        });
        jPanel1.add(Tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 130, 30));

        L5.setForeground(new java.awt.Color(255, 0, 0));
        L5.setText("No spaces allowed");
        jPanel1.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 250, -1));

        L2.setForeground(new java.awt.Color(255, 0, 0));
        L2.setText("You have to fill the fields with (*) sign");
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 330, -1));

        L3.setForeground(new java.awt.Color(255, 0, 0));
        L3.setText("Numbers only");
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 250, -1));

        L4.setForeground(new java.awt.Color(255, 0, 0));
        L4.setText("Numbers only, and the range is between 18 to 200");
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 330, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 480, 650));

        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TageActionPerformed

    private void StaffRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StaffRadioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("1");
        try{if(Integer.parseInt(Tage.getText())>=200)
            JOptionPane.showMessageDialog(null, "Age Exceeds 200 Years");
        else if(Integer.parseInt(Tage.getText())<18)
            JOptionPane.showMessageDialog(null, "Age Must Exceed 18 Years");
        else{
                if((TuserName.getText().trim().length()==0)||(Tpassword.getText().trim().length()==0)||TConfirmPassword.getText().trim().length()==0)
                    {
                        JOptionPane.showMessageDialog(null, "You have to fill the fields with (*) sign");
                    }
                 else
                    {
                    if(Tpassword.getText().equals(TConfirmPassword.getText()))
                    {
                  
                        if(StaffRadio.isSelected())
                        {
                                HomePage.setUsername1(TuserName.getText());
                                Doctor.CreateAccount(Tage.getText(),Tpassword.getText(),TphoneNumber.getText(),Tname.getText(),TuserName.getText());
                                JOptionPane.showMessageDialog(null, "Account Created");
                                DoctorHome fr2=new DoctorHome();
                                fr2.setVisible(true);
                                this.setVisible(false);
                                this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE); 
                            }// TODO add your handling code here:
                        else if(ClientRadio.isSelected())
                        {
                            HomePage.setUsername1(TuserName.getText());
                            Patient.CreateAccount(Tage.getText(),Tpassword.getText(),TphoneNumber.getText(),Tname.getText(),TuserName.getText());
                               JOptionPane.showMessageDialog(null, "Account Created");
                                PatientHome fr2=new PatientHome();
                                fr2.setVisible(true);
                                this.setVisible(false);
                                this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE); 
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Choose Staff or Client");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Password Must Be Similar To Confirmation Password");
                    }
        }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Do not allowed to enter letters in Age");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        HomePage.setUsername1("F");
        PatientHome fr2=new PatientHome();
                                fr2.setVisible(true);
                                this.setVisible(false);
                                this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TphoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TphoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TphoneNumberActionPerformed

    private void TuserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TuserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TuserNameActionPerformed

    private void TConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TConfirmPasswordActionPerformed

    private void TnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        HomePage fr2=new HomePage();
        
        this.setVisible(false);
        fr2.setVisible(true);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TuserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TuserNameKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TuserNameKeyPressed

    private void TuserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TuserNameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c==KeyEvent.VK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
        
         
    }//GEN-LAST:event_TuserNameKeyTyped

    private void TuserNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TuserNameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TuserNameInputMethodTextChanged

    private void TnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TnameKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TnameKeyTyped

    private void TphoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TphoneNumberKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)||(c==KeyEvent.VK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TphoneNumberKeyTyped

    private void TageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TageKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)||(c==KeyEvent.VK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TageKeyTyped

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JRadioButton ClientRadio;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JRadioButton StaffRadio;
    private javax.swing.JTextField TConfirmPassword;
    private javax.swing.JTextField Tage;
    private javax.swing.JTextField Tname;
    private javax.swing.JPasswordField Tpassword;
    private javax.swing.JTextField TphoneNumber;
    private javax.swing.JTextField TuserName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}