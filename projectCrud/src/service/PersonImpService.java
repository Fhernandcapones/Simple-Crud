
package service;

import dao.PersonDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.PersonModel;


public class PersonImpService implements PersonService   {
    // calling Dao
    private PersonDao personDao = new PersonDao();
    
    public PersonImpService(){
    }
    @Override
    public void connection(Connection connection,PreparedStatement ps,Statement st,ResultSet rs){
     
     
     personDao.connections(connection, ps, st, rs);
    }
    
    /*@Override*/
    @Override
    public void addInfo(PersonModel personModel){
     this.personDao.addInfo(personModel);     
}
    @Override
    public void updateInformation(PersonModel personModel){
     this.personDao.updateInformation(personModel);
    }
   @Override
   public void deleteInformation(PersonModel personModel){
     this.personDao.deleteInformation(personModel);
   }
    
    
}
