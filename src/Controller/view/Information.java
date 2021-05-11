/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.view;

import dao.PersonDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PersonModel;
import service.PersonImpService;
import service.PersonService;
/*import util.Database;*/


public class Information extends javax.swing.JFrame {

   private PersonService personService = new PersonImpService();
   private PersonDao personDao = new PersonDao();
   
    public Information() {
        //auto executed
        initComponents();
        connection();
        arrangedDataInTable();
        //method executed
      
    }
    public void connection(){
    Connection connection = null;
    PreparedStatement ps = null;
     Statement st = null;
     ResultSet rs = null;
     
     personService.connection(connection,ps,st,rs);
    }
public void arrangedDataInTable() {
        
        PersonDao PersonDao = new PersonDao();
        ArrayList<PersonModel> list = PersonDao.displayInformation();       
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];

        //arranged in specific row
        for (int x = 0; x < list.size(); x++) {
            row[0] = list.get(x).getId();
            row[1] = list.get(x).getName();
            row[2] = list.get(x).getAge();
            row[3] = list.get(x).getGender();
            
            //Your model = table
            model.addRow(row);

        }

    }public void getInformation (int index){
    //UI Related
    
    PersonDao personDao = new PersonDao();
    //get the value from information displayInformation method
    ID.setText(Integer.toString(personDao.displayInformation().get(index).getId()));
    Name.setText(personDao.displayInformation().get(index).getName());
    Age.setText(Integer.toString(personDao.displayInformation().get(index).getAge()) );
    
    

   
} 

 public void ClearingInput(){
          ID.setText("");
          Name.setText("");
          Age.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button1 = new javax.swing.JLabel();
        button2 = new javax.swing.JLabel();
        button3 = new javax.swing.JLabel();
        button4 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Simple CRUD MASTERS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, -10, 360, 130);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "GENDER"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(290, 110, 610, 300);

        ID.setEditable(false);
        ID.setToolTipText("");
        jPanel1.add(ID);
        ID.setBounds(100, 120, 40, 20);
        jPanel1.add(Name);
        Name.setBounds(100, 170, 110, 20);
        jPanel1.add(Age);
        Age.setBounds(100, 220, 110, 20);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        jPanel1.add(gender);
        gender.setBounds(100, 270, 110, 20);

        jLabel4.setText("ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 40, 14);

        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 270, 50, 14);

        jLabel5.setText("Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 170, 34, 14);

        jLabel6.setText("Age");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 220, 34, 14);

        button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button1.setText("CLEAR");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(490, 450, 90, 40);

        button2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button2.setText("UPDATE");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(210, 450, 70, 40);

        button3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button3.setText("DELETE");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        jPanel1.add(button3);
        button3.setBounds(350, 450, 70, 40);

        button4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button4.setText("ADD");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });
        jPanel1.add(button4);
        button4.setBounds(50, 450, 90, 40);

        Background.setBackground(new java.awt.Color(102, 255, 102));
        Background.setOpaque(true);
        jPanel1.add(Background);
        Background.setBounds(-20, -20, 980, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(958, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
      String FirstName = Name.getText();
      String Ages = Age.getText();
      String Gender = String.valueOf(gender.getSelectedItem());
      //condition
      Boolean needName = !Name.getText().equals("");
      Boolean needAge =!Age.getText().equals("");
      //gender doesnt need because its already declared as "Male"
      
      PersonModel personal = new PersonModel();
      
      
      if (needName && needAge)
      {
      //model 
      personal.setName(FirstName);
      personal.setAge(Integer.parseInt(Ages));
      personal.setGender(Gender);
      //dao    
      PersonService personService = new PersonImpService();
      personService.addInfo(personal);
      
      //RefreshData
      arrangedDataInTable();
      JOptionPane.showMessageDialog(rootPane, "Has been Created");
      
      //cleared setText
      ClearingInput();
      
      }
      else 
      {
          JOptionPane.showMessageDialog(rootPane, "Complete the blank Information");   
      }    
    }//GEN-LAST:event_button4MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
           //method
        getInformation(index);
    }//GEN-LAST:event_tableMouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
       String id = ID.getText();
      String name = Name.getText();
      
      String age = Age.getText();
      String Gender = String.valueOf(gender.getSelectedItem());
      //condition
      Boolean needID =!ID.getText().equals("");
      Boolean needName = !Name.getText().equals("");
      Boolean needAge =!Age.getText().equals("");
      //gender doesnt need because its already declared as "Male"
     
      if (needName && needAge && needID)
      {
      //model
     PersonModel personal = new PersonModel();
      personal.setName(name);
      personal.setAge(Integer.parseInt(age));
      personal.setGender(Gender);
      personal.setId(Integer.parseInt(id));
      //dao    
      PersonService personService = new PersonImpService();
      personService.updateInformation(personal);
      
      arrangedDataInTable();
      JOptionPane.showMessageDialog(rootPane, "Has been updated!");
      
      //cleared setText
      ClearingInput();
      }
      else 
      {
          JOptionPane.showMessageDialog(rootPane, "Complete the blank Information");   
      }    
    }//GEN-LAST:event_button2MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
        ClearingInput();
    }//GEN-LAST:event_button1MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
         String Id = ID.getText();
      //condition
      Boolean needId =!ID.getText().equals("");
     
      
      if (needId)
      {
      //model 
      PersonModel personal = new PersonModel();
      personal.setId(Integer.parseInt(Id) );
      //service
      PersonService personService = new PersonImpService();
      personService.deleteInformation(personal);
      //refreshData
      arrangedDataInTable();
      JOptionPane.showMessageDialog(rootPane, "Has been Deleted");
      //cleared setText
      ClearingInput();
      }
      else
      {
      JOptionPane.showMessageDialog(rootPane, "Please Select a index row and delete properly");    
      }    
    }//GEN-LAST:event_button3MouseClicked

  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> {
            new Information().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel button1;
    private javax.swing.JLabel button2;
    private javax.swing.JLabel button3;
    private javax.swing.JLabel button4;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
