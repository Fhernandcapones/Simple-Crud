  
    package service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
    import model.PersonModel;

  
    public interface PersonService {
        /* void AddInfo(PersonModel PersonModel);*/
        void connection(Connection connection,PreparedStatement ps,Statement st,ResultSet rs);
        void addInfo(PersonModel personal);
        void updateInformation(PersonModel personModel);
        void deleteInformation(PersonModel personModel);
}
