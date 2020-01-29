
package ums_gui;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class Sign_Up extends javax.swing.JFrame {

    
    public Sign_Up() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextField_age = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jPasswordField_conpass = new javax.swing.JPasswordField();
        jTextField_usname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox_course1 = new javax.swing.JCheckBox();
        jCheckBox_course2 = new javax.swing.JCheckBox();
        jCheckBox_course3 = new javax.swing.JCheckBox();
        jButton_register = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jComboBox_post = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setText("               Sign Up");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("User Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Confirm Password :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Age :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Register as :");

        jTextField_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ageActionPerformed(evt);
            }
        });
        jTextField_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ageKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Select Courses :");

        jCheckBox_course1.setBackground(new java.awt.Color(153, 153, 255));
        jCheckBox_course1.setText("SENG 11111 - Object Oriented Programming");
        jCheckBox_course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_course1ActionPerformed(evt);
            }
        });

        jCheckBox_course2.setBackground(new java.awt.Color(153, 153, 255));
        jCheckBox_course2.setText("SENG 11112 - Introduction to Databases");
        jCheckBox_course2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_course2ActionPerformed(evt);
            }
        });

        jCheckBox_course3.setBackground(new java.awt.Color(153, 153, 255));
        jCheckBox_course3.setText("SENG 11123 - Project Management");
        jCheckBox_course3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_course3ActionPerformed(evt);
            }
        });

        jButton_register.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_register.setText("Register");
        jButton_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registerActionPerformed(evt);
            }
        });

        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jComboBox_post.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lecturer", "Student" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_course3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField_conpass, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_usname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox_course1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox_course2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_back)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_register)))
                    .addComponent(jTextField_age, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_post, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_usname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField_conpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCheckBox_course1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_course2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_course3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_register)
                    .addComponent(jButton_back))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ageActionPerformed

    }//GEN-LAST:event_jTextField_ageActionPerformed

    private void jCheckBox_course3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_course3ActionPerformed

    }//GEN-LAST:event_jCheckBox_course3ActionPerformed

    private void jCheckBox_course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_course1ActionPerformed

    }//GEN-LAST:event_jCheckBox_course1ActionPerformed

    private void jCheckBox_course2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_course2ActionPerformed

    }//GEN-LAST:event_jCheckBox_course2ActionPerformed
    
    public boolean checkfield()
    {
        if(jTextField_name.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Please Enter the Name");
            return false;
        }
        else if(jTextField_age.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"Please Enter the Age");
            return false;
        }
        else if(jTextField_usname.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"Please Enter the User Name");
            return false;
        }
        else if(jPasswordField_pass.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"Please Enter the Password");
            return false;
        }
        else if(jPasswordField_conpass.getText().equals(jPasswordField_pass.getText())== false)
        {
            JOptionPane.showMessageDialog(this,"Password not mtached");
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean checkcourse()
    {
        if(jCheckBox_course1.isSelected())
        {
            return true;
        }
        else if(jCheckBox_course2.isSelected())
        {
            return true;
        }
        else if(jCheckBox_course3.isSelected())
        {
            return true;
        } 
        else
        {
            JOptionPane.showMessageDialog(this,"Please select Courses.....");
            return false;
        }
    }
    
    public boolean checkuser(String usname)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean usname_ok = true;
        String query = "SELECT * FROM details WHERE username=?";
        try {
            st = Connector.getConnection().prepareStatement(query);
            st.setString(1,usname);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                usname_ok = false;
                JOptionPane.showMessageDialog(null,"Username is already exists","Username Error",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usname_ok;
    }
    
    private void jButton_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registerActionPerformed
        String name = jTextField_name.getText();
        String age = jTextField_age.getText();
        String usname = jTextField_usname.getText();
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        String conpass = String.valueOf(jPasswordField_conpass.getPassword());
        String position = jComboBox_post.getSelectedItem().toString();
        String course = "";
        
        if(jCheckBox_course1.isSelected())
        {
            course = course + "SENG 11111 - Object Oriented Programming\n\n";
        }
        if(jCheckBox_course2.isSelected())
        {
            course = course + "SENG 11112 - Introduction to Databases\n\n";
        }
        if(jCheckBox_course3.isSelected())
        {
            course = course + "SENG 11123 - Project Management";
        }
        if(checkfield())
        {
            if(checkuser(usname))
            {
                if(checkcourse())
                {
                    PreparedStatement ps;
                    ResultSet rs;
                    String registerQuery="INSERT INTO details VALUES(?,?,?,?,?,?)";
                
                    try {
                        ps =Connector.getConnection().prepareStatement(registerQuery);
                        ps.setString(1,name);
                        ps.setString(2,age);
                        ps.setString(3,usname);
                        ps.setString(4,conpass);
                        ps.setString(5,position);
                        ps.setString(6,course);
                    
                        if(ps.executeUpdate() !=0)
                        {
                            JOptionPane.showMessageDialog(null,"You have registerd successfully.......");
                            Start form = new Start();
                            form.setVisible(true);
                            form.pack();
                            form.setLocationRelativeTo(null);
                            this.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Failed, Check your details");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Sign_Up.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
               
            }
        }
        
    }//GEN-LAST:event_jButton_registerActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Start form = new Start();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jTextField_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ageKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_ageKeyTyped

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_register;
    private javax.swing.JCheckBox jCheckBox_course1;
    private javax.swing.JCheckBox jCheckBox_course2;
    private javax.swing.JCheckBox jCheckBox_course3;
    private javax.swing.JComboBox jComboBox_post;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_conpass;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_age;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_usname;
    // End of variables declaration//GEN-END:variables
}
