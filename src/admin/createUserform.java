/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dbConnector.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import static register.registerform.em;
import static register.registerform.usname;

/**
 *
 * @author Administrator
 */
public class createUserform extends javax.swing.JFrame {

    /**
     * Creates new form createUserform
     */
    public createUserform() {
        initComponents();
    }
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
       try{
           String query = "SELECT * FROM tbl_user  WHERE (u_username = '" +username.getText()+ "' OR u_email = '" + email.getText()+ "')"
                   + "AND u_id = '"+id.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
      if(resultSet.next()){
      em = resultSet.getString("u_email");
      if(em.equals(email.getText())){
      JOptionPane.showMessageDialog(null, "Email is Already Used! ");
      email.setText("");
      }
      usname = resultSet.getString("u_username");
      if(usname.equals(username.getText())){
          JOptionPane.showMessageDialog(null, "Username is Already Used! ");
      }
       username.setText("");
      return true;
      
      }else{
      return false;
      }
       }catch(SQLException ex){
           System.out.println(""+ex);
           return false;
       }
    }

    
     public boolean updateCheck(){
        
        dbConnector dbc = new dbConnector();
        
       try{
           String query = "SELECT * FROM tbl_user  WHERE (u_username = '" +username.getText()+ "' OR u_email = '" + email.getText()+ "')AND u_id != '"+id.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
      if(resultSet.next()){
      em = resultSet.getString("u_email");
      if(em.equals(email.getText())){
      JOptionPane.showMessageDialog(null, "Email is Already Used! ");
      email.setText("");
      }
      usname = resultSet.getString("u_username");
      if(usname.equals(username.getText())){
          JOptionPane.showMessageDialog(null, "Username is Already Used! ");
      }
       username.setText("");
      return true;
      
      }else{
      return false;
      }
       }catch(SQLException ex){
           System.out.println(""+ex);
           return false;
       }
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
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fname = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        lname = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        username = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        email = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        password = new javax.swing.JTextPane();
        status = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        jLabel2.setText("First Name: ");

        jScrollPane5.setViewportView(jTextPane5);

        jScrollPane6.setViewportView(jTextPane6);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name: ");

        jLabel3.setText("Password:");

        jLabel4.setText("Last Name:");

        jLabel5.setText("Email:");

        jLabel6.setText("Username:");

        jLabel7.setText("Account Type:");

        jScrollPane1.setViewportView(fname);

        jScrollPane2.setViewportView(lname);

        jScrollPane3.setViewportView(username);

        jScrollPane4.setViewportView(email);

        jScrollPane7.setViewportView(password);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        jLabel8.setText("User Type:");

        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel9.setText("User ID:");

        id.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane7)
                            .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type, 0, 167, Short.MAX_VALUE)
                            .addComponent(id)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(refresh)
                        .addGap(50, 50, 50)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(update)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(update))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(cancel)
                    .addComponent(refresh))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
       
        if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| email.getText().isEmpty()
             ||username.getText().isEmpty()||password.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "All fields are required! ");
     }else if(password.getText().length()<8){
      JOptionPane.showMessageDialog(null, "Password character should be 8 above.");
      password.setText("");
     }else if(duplicateCheck()){
         System.out.println("Duplicate Exit! ");
     }else{
               dbConnector dbc = new dbConnector();
        if(dbc.insertData("INSERT INTO tbl_user(u_fname,u_lname,u_email,u_username,u_password,u_type, u_status)"
             + "VALUES('"+fname.getText()+"','"+lname.getText()+"','"+email.getText()+"','"+username.getText()+"',"
                     + "'"+password.getText()+"','"+status.getSelectedItem()+"','"+type.getSelectedItem()+"')")){
            JOptionPane.showMessageDialog(null, "Registration Successfully");
            userForm sfr = new userForm();
       sfr.setVisible(true);
       this.dispose(); 
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }     
     }
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        userForm usf = new userForm();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

     
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     
         if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| email.getText().isEmpty()
             ||username.getText().isEmpty()||password.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "All fields are required! ");
     }else if(password.getText().length()<8){
      JOptionPane.showMessageDialog(null, "Password character should be 8 above.");
      password.setText("");
     }else if(updateCheck()){
         System.out.println("Duplicate Exit! ");
     }else{   
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE tbl_user SET u_fname = '"+fname.getText()+"', u_lname = '"+lname.getText()+"',"
                + "u_email = '"+email.getText()+"',u_username = '"+username.getText()+"',u_password = '"+password.getText()+"',"
          + "u_type = '"+type.getSelectedItem()+"',u_status = '"+status.getSelectedItem()+"' WHERE u_id = '"+id.getText()+"'");
     
       JOptionPane.showMessageDialog(null, "Updated Successfully!");
       userForm sfr = new userForm();
       sfr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_updateActionPerformed
    }
    
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
    
     String previousId = id.getText();
    String previousFname = fname.getText();
    String previousLname = lname.getText();
    String previousEmail = email.getText();
    String previousUsername = username.getText();
    String previousPassword = password.getText();
    Object previousType = type.getSelectedItem();
    Object previousStatus = status.getSelectedItem();

    id.setText("");
    fname.setText("");
    lname.setText("");
    email.setText("");
    username.setText("");
    password.setText("");
    type.setSelectedItem(null);
    status.setSelectedItem(null);  

    if (!previousId.isEmpty()) {
        id.setText(previousId);
    }
    if (!previousFname.isEmpty()) {
        fname.setText(previousFname);
    }
    if (!previousLname.isEmpty()) {
        lname.setText(previousLname);
    }
    if (!previousEmail.isEmpty()) {
        email.setText(previousEmail);
    }
    if (!previousUsername.isEmpty()) {
        username.setText(previousUsername);
    }
    if (!previousPassword.isEmpty()) {
        password.setText(previousPassword);
    }
    if (previousType != null) {
        type.setSelectedItem(previousType);
    }
    if (previousStatus != null) {
        status.setSelectedItem(previousStatus);
    }
    JOptionPane.showMessageDialog(null, "REFRESH...");
    }//GEN-LAST:event_refreshActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    
     int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the data?"
             , "Confirm", JOptionPane.YES_NO_OPTION);
    if (dialogResult == JOptionPane.YES_OPTION) {
        id.setText("");
        fname.setText("");
        lname.setText("");
        email.setText("");
        username.setText("");
        password.setText("");
        type.setSelectedItem(null);
        status.setSelectedItem(null);
      }
    
    }//GEN-LAST:event_clearActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(createUserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    public javax.swing.JTextPane email;
    public javax.swing.JTextPane fname;
    public javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    public javax.swing.JTextPane lname;
    public javax.swing.JTextPane password;
    private javax.swing.JButton refresh;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JComboBox<String> type;
    public javax.swing.JButton update;
    public javax.swing.JTextPane username;
    // End of variables declaration//GEN-END:variables
}
