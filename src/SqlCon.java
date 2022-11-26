import java.sql.*;
import javax.swing.*;
public class SqlCon {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    String value;
    public void sqlcon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //this.con=DriverManager.getConnection("jdbc:mysql://127.0.1:3306/librarymanagement","root","Sanket@25");
            this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","windows10");
            this.st=this.con.createStatement();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error:"+ex);
        }
    }
    public void displaybook(){
        try{
            sqlcon();
        this.rs=this.st.executeQuery("select* from books");
        
    }catch(Exception ex)
    {
        JOptionPane.showMessageDialog(null,"Error:"+ex);
    }
    }
    public void displayenduser(){
        try{
            sqlcon();
        this.rs=st.executeQuery("select* from SignUp");
        while(this.rs.next()){
            String book_name=this.rs.getString("name");
            String author=this.rs.getString("username").trim();
            System.out.println("Book Name:"+book_name+"Author:"+author);
        }
    }catch(Exception ex)
    {
        JOptionPane.showMessageDialog(null,"Error:"+ex);
    }
    }
    public String userlogin(String a,String b){
        
        try{
            sqlcon();
            this.rs=this.st.executeQuery("Select * from SignUp");
            while(this.rs.next()){
                String username=this.rs.getString("Email");
                String password=this.rs.getString("Create_Pass");
                if(username.equals(a)&&password.equals(b)){
                   this.value="true";
                   break;
                }
                else{
                   this.value="false";
                }
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error:"+ex);
        }
        return this.value;
    }
    public String adminlogin(String a,String b){
        
        try{
            sqlcon();
            this.rs=this.st.executeQuery("Select * from librarian");
            while(this.rs.next()){
                String username=this.rs.getString("Username");
                String password=this.rs.getString("Password");
                if(username.equals(a)&&password.equals(b)){
                   this.value="true";
                   break;
                }
                else{
                   this.value="false";
                }
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error:"+ex);
        }
        return this.value;
    }
    public void adduser(String name,String username,String password,String city,String rollno,String role){
        try{
            sqlcon();
            String query="Insert into SignUp values('"+name+"','"+username+"','"+password+"','"+city+"','"+rollno+"','"+role+"')";
            
            this.st.executeUpdate(query);
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error:"+ex);
        }
    }
}
