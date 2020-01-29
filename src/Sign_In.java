
package ums_gui;

import java.awt.Color;
import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class Sign_In extends javax.swing.JFrame {


    public Sign_In() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_usname = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(555, 371));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setText("                 Sign In");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Name : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password :");

        jTextField_usname.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_usname.setText("Username");
        jTextField_usname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usnameFocusLost(evt);
            }
        });
        jTextField_usname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usnameActionPerformed(evt);
            }
        });

        jPasswordField_pass.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_pass.setText("Password");
        jPasswordField_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passFocusLost(evt);
            }
        });
        jPasswordField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton_back)
                                                .addGap(47, 47, 47)
                                                .addComponent(jButton1))
                                        .addComponent(jTextField_usname, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField_usname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton_back)
                                        .addComponent(jButton1))
                                .addContainerGap(52, Short.MAX_VALUE))
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
    }// </editor-fold>

    private void jTextField_usnameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jPasswordField_passActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextField_usnameFocusGained(java.awt.event.FocusEvent evt) {
        if(jTextField_usname.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_usname.setText("");
            jTextField_usname.setForeground(Color.black);
        }
    }

    private void jTextField_usnameFocusLost(java.awt.event.FocusEvent evt) {
        if(jTextField_usname.getText().trim().equals("") || jTextField_usname.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_usname.setText("username");
            jTextField_usname.setForeground(new Color(153,153,153));
        }
    }

    private void jPasswordField_passFocusGained(java.awt.event.FocusEvent evt) {
        String password= String.valueOf(jPasswordField_pass.getPassword());
        if(password.trim().toLowerCase().equals("password"))
        {
            jPasswordField_pass.setText("");
            jPasswordField_pass.setForeground(Color.black);
        }
    }

    private void jPasswordField_passFocusLost(java.awt.event.FocusEvent evt) {
        String password= String.valueOf(jPasswordField_pass.getPassword());
        if(jTextField_usname.getText().trim().equals("") || jTextField_usname.getText().trim().toLowerCase().equals("username"))
        {
            jPasswordField_pass.setText("password");
            jPasswordField_pass.setForeground(new Color(153,153,153));
        }
    }

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {
        Start form = new Start();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        PreparedStatement st;
        ResultSet rs;

        String username = jTextField_usname.getText();
        String password = String.valueOf(jPasswordField_pass.getPassword());

        String query = "SELECT * FROM details WHERE username= ? AND password= ? ";
        try {
            st = Connector.getConnection().prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();

            if(rs.next())
            {

                String name = rs.getString("name");
                String age = rs.getString("age");
                String post = rs.getString("position");
                String course = rs.getString("course");
                Profile form = new Profile();
                form.details(name,age,post,course);
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Username / Password","Login Error",2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Sign_In.class.getName()).log(Level.SEVERE, null, ex);
        }

    }



    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_usname;
    // End of variables declaration
}
