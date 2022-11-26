
//import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import project.connector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class UserBooks extends javax.swing.JFrame {

    /**
     * Creates new form UserBooks
     */
    public UserBooks() {
        initComponents();
        displayUserBooks();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "BookId", "Book Name", "ISBN", "Issue Date", "Return Date"
            }
        ));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(380);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(380);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(400);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(110);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(4).setMinWidth(50);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(5).setMinWidth(110);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(6).setMinWidth(110);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(120);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 1370, 402);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Enter BookId of User who returned Book:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 527, 300, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(520, 530, 470, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1020, 530, 69, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1110, 530, 65, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/33939946.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1400, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void  displayUserBooks()
    {
        
          try{
            Connection con=connector.getCon();
            Statement st=con.createStatement();
            
            String sql;
            sql="select username,Name,book_id,bname,ISBN,issue_date,return_date from User_book,books,SignUp where book_id=bookId and username=Email" ;
          
            ResultSet rs=st.executeQuery(sql);  
            
            DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
            tbModel.setRowCount(0);
            if(rs.next()){
             do{
                String Username=rs.getString("username");  
                String Name=rs.getString("Name");    
                String BookId=rs.getString("book_id");
                String BookName=rs.getString("bname");                
                String ISBN=rs.getString("ISBN");  
                String IssueDate=rs.getString("issue_date"); 
                String ReturnDate=rs.getString("return_date"); 
                Object tbData[]={Username,Name,BookId,BookName,ISBN,IssueDate,ReturnDate};
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String UserBookInput=jTextField1.getText();
        try
        {
            Connection con=connector.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("delete from User_book where book_id=('"+UserBookInput+"')");
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            try
            {
                String sql;
                sql="select username,Name,book_id,bname,ISBN,issue_date,return_date from User_book,books,SignUp where book_id=bookId and username=Email" ;
          
                ResultSet rs=st.executeQuery(sql);  
            
                DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
                tbModel.setRowCount(0);
                if(rs.next()){
                    do{
                        String Username=rs.getString("username");  
                        String Name=rs.getString("Name");    
                        String BookId=rs.getString("book_id");
                        String BookName=rs.getString("bname");                
                        String ISBN=rs.getString("ISBN");  
                        String IssueDate=rs.getString("issue_date"); 
                        String ReturnDate=rs.getString("return_date"); 
                        Object tbData[]={Username,Name,BookId,BookName,ISBN,IssueDate,ReturnDate};
                        tbModel.addRow(tbData);                  
                    }while(rs.next());
                 con.close();        
                }  
                jTextField1.setText("");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"Error");
                setVisible(false);
                new home().setVisible(true);
            }           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"User does not Exist");
            setVisible(false);
            new home().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}