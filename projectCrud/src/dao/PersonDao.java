
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PersonModel;
import util.Database;


public class PersonDao {
    
    private Connection connection;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    
    
    
    public void connections(Connection connection,PreparedStatement ps,Statement st,ResultSet rs){
      this.connection = connection;
      this.ps = ps;
      this.rs = rs;
      this.st = st;
      
    }
      
    public void addInfo(PersonModel personModel){      
           this.connection = Database.getConnection();
           
        try{ 
           this.ps = connection.prepareStatement("INSERT INTO `info`(`name`, `age`, `gender`) VALUES (?,?,?)");

            this.ps.setString(1, personModel.getName() );
            this.ps.setInt(2, personModel.getAge());
            this. ps.setString(3, personModel.getGender());
            
             
            this.ps.executeUpdate();
            
            }catch (SQLException ex) {
            System.out.print(ex);
            ex.printStackTrace();


        }
      
    }
     public void updateInformation(PersonModel personModel){
            String UpdateQuery = null;
            this.connection = Database.getConnection();
             
       try 
        {     
            
            UpdateQuery ="UPDATE `info` SET `name`=?,`age`=?,`gender`=? WHERE ID =?";
            this.ps = connection.prepareStatement(UpdateQuery);
            this.ps.setString(1, personModel.getName());
            this.ps.setInt(2, personModel.getAge() );
            this.ps.setString(3, personModel.getGender());
            this.ps.setInt(4, personModel.getId());
            this.ps.executeUpdate();
       
            
        } catch (SQLException ex) {
            System.out.print(ex);
           ex.printStackTrace();
        }
       
    }
      public void deleteInformation(PersonModel personModel){
        try {
                //Connection_Var_drivers.getconnection tinatawag mo ito sa ibang class mo kung saan andun mga varibles nun
                
               this.connection= Database.getConnection();
               this.ps = connection.prepareStatement("DELETE FROM info WHERE ID = ?");
               this. ps.setInt(1, personModel.getId());
               this. ps.executeUpdate();
            } catch (SQLException e) {
              e.printStackTrace();
            }
    }
    
    public ArrayList<PersonModel> displayInformation()  {
        ArrayList<PersonModel> get = new ArrayList<PersonModel>();
        
        connection = Database.getConnection();
        String query = "SELECT * FROM `info`";

       
        try {
           this. st = connection.createStatement();
           this. rs = st.executeQuery(query);
           PersonModel userss;
           while (this.rs.next()) {
                //dito ay ididisplay nya na sa java ang naka line table mo sa GUI java
           userss = new PersonModel(this.rs.getInt("id"), this.rs.getString("name"),
                    this. rs.getInt("age"), this.rs.getString("gender"));
                    get.add(userss);
            }
        } catch (SQLException ex) {
          Logger.getLogger(PersonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
          return get;
      }
    
    
}
