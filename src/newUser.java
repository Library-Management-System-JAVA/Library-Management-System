import java.sql.*;
import project.connector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class PasswordErrorException extends Exception {
    public PasswordErrorException() {
        //super(s);
    }
}
public class newUser extends javax.swing.JFrame {

    /**
     * Creates new form newUser
     */
    public newUser() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User SignUp");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(458, 85, 131, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Email:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(458, 150, 131, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Create Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(458, 211, 131, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Confirm Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(458, 272, 131, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("RollNo/FacultyNo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(458, 377, 131, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("City:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(458, 439, 131, 32);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(534, 515, 80, 33);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(716, 515, 80, 33);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(688, 85, 200, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(688, 150, 200, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(688, 211, 200, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(688, 272, 200, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(688, 377, 200, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(688, 441, 200, 30);

        jCheckBox1.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 0));
        jCheckBox1.setText("Teacher");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(458, 327, 131, 25);

        jCheckBox2.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 0));
        jCheckBox2.setText("Student");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(688, 327, 200, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/33939946.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1430, 1030);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Name =jTextField1.getText();
        String Email =jTextField2.getText();
        String CreatePassword =jTextField3.getText();
        String ConfirmPassword =jTextField4.getText();
        String RollNoFacultyNo =jTextField5.getText();
        String City =jTextField7.getText();
        String Teacher= "Teacher";
        String Student = "Student";
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(CreatePassword);
        boolean b = m.find();
        Pattern pa = Pattern.compile("[0-9]");
        Matcher ma = pa.matcher(CreatePassword);
        boolean bo = ma.find();
        try
        {                                                                          //true//true
            if (!(CreatePassword.length() <= 15 && CreatePassword.length() >= 8  && b && bo)) {
                throw new PasswordErrorException();
            }
            
            Connection con=connector.getCon();
            Statement st=con.createStatement();
            if(!CreatePassword.equals(ConfirmPassword)){
                JOptionPane.showMessageDialog(null,"Password Mismatched");
            }
            else if((jCheckBox1.isSelected())&&!(jCheckBox2.isSelected())){
            st.executeUpdate("insert into SignUp values('"+Email+"','"+Name+"','"+CreatePassword+"','"+Teacher+"','"+RollNoFacultyNo+"','"+City+"')");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new newUser().setVisible(true);
            }
            else if(!(jCheckBox1.isSelected())&&(jCheckBox2.isSelected())){
            st.executeUpdate("insert into SignUp values('"+Email+"','"+Name+"','"+CreatePassword+"','"+Student+"','"+RollNoFacultyNo+"','"+City+"')");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new newUser().setVisible(true);
            }
            else if((jCheckBox1.isSelected())&&(jCheckBox2.isSelected())||(!(jCheckBox1.isSelected())&&!(jCheckBox2.isSelected()))){
                JOptionPane.showMessageDialog(null,"Check box error!");
            }
            else{
                throw new Exception();
            }
        }
        catch (PasswordErrorException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid password of length between 8-15 \n containing atleast one digit and one Special Symbol.");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"User Id already Exist");
            
        }/*finally{
            setVisible(false);
            new newUser().setVisible(true);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new newUser().setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}