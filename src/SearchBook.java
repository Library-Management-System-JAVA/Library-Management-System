/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import project.connector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
//import net.proteanit.sql.DbUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dell
 */
public class SearchBook extends javax.swing.JFrame {

    /**
     * Creates new form SearchBook
     */
    public SearchBook() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        DisplayTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Book");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Enter Information of Book");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(58, 55, 220, 20);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(310, 50, 519, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(337, 106, 79, 25);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "Name", "Author", "Publisher", "Genre", "ISBN", "Copies"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(70);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(5).setMinWidth(60);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(6).setMinWidth(60);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 149, 1370, 402);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(511, 106, 65, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/33939946.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1390, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void DisplayTable()
    {
        try{
            String sql;
            Connection con=connector.getCon();
            Statement st=con.createStatement();
            sql="select * from books1 order by bookId" ;
            ResultSet rs=st.executeQuery(sql);  
            DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
            tbModel.setRowCount(0);
            if(!rs.next()){
                JOptionPane.showMessageDialog(null,"No Similar Book Data Found!");
            }
            else
            {
             do{
                            
                String BookId=rs.getString("bookId");
                String Name=rs.getString("bname");
                String Author=rs.getString("author");
                String Publisher=rs.getString("Publisher");
                String Genre=rs.getString("genre");
                String Copies=String.valueOf(rs.getInt("copies"));
                String ISBN=String.valueOf(rs.getInt("ISBN"));//convert int to string                
                //string array to store data into jtable                
                String tbData[]={BookId,Name,Author,Publisher,Genre,ISBN,Copies};
                //add string array data into jtable
                tbModel.addRow(tbData);                  
             }while(rs.next());
            con.close();        
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String info=jTextField2.getText();

        try{
            String sql;
            Connection con=connector.getCon();
            Statement st=con.createStatement();
            sql="select * from books1 where author LIKE '%"+info+"%' or bookId Like '%"+info+"%' or bname Like '%"+info+"%' or Publisher Like '%"+info+"%' order by bookId" ;
            ResultSet rs=st.executeQuery(sql);  
            DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
            tbModel.setRowCount(0);
            if(!rs.next()){
                JOptionPane.showMessageDialog(null,"No Similar Book Data Found!");
            }
            else
            {
             do{
                            
                String BookId=rs.getString("bookId");
                String Name=rs.getString("bname");
                String Author=rs.getString("author");
                String Publisher=rs.getString("Publisher");
                String Genre=rs.getString("genre");
                String Copies=String.valueOf(rs.getInt("copies"));
                String ISBN=String.valueOf(rs.getInt("ISBN"));//convert int to string                
                //string array to store data into jtable                
                String tbData[]={BookId,Name,Author,Publisher,Genre,ISBN,Copies};
                //add string array data into jtable
                tbModel.addRow(tbData);                  
             }while(rs.next());
            con.close();        
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}