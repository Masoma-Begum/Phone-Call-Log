package mobileInfoManagementsystem;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Approveto_Enter extends javax.swing.JFrame {

    Image img;
    int x, y;

    @Override
    public void setLocation(Point p) {
        super.setLocation(p); //To change body of generated methods, choose Tools | Templates.
    }

    public Approveto_Enter() {//Default Constractor(non argumented)
        super("Enter Legally!!!");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("enter.png")));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        txtnmregi = new javax.swing.JTextField();
        txtpassreg = new javax.swing.JPasswordField();
        cmdcanclereg = new javax.swing.JButton();
        cmdreg = new javax.swing.JButton();
        chepass = new javax.swing.JCheckBox();
        checkemp = new javax.swing.JCheckBox();
        cmdimgload = new javax.swing.JButton();
        lblphoto = new javax.swing.JLabel();
        genderM = new javax.swing.JRadioButton();
        genderF = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(img);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 255));
        jLabel4.setText("Athenticatin need for Enter");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 0, 340, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 49, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 72, 17);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(290, 130, 90, 23);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(390, 130, 80, 23);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(280, 30, 191, 20);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(280, 60, 190, 20);

        txtnmregi.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtnmregi.setForeground(new java.awt.Color(204, 204, 255));
        txtnmregi.setText("Name for registration");
        txtnmregi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnmregiMouseClicked(evt);
            }
        });
        txtnmregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnmregiActionPerformed(evt);
            }
        });
        jPanel1.add(txtnmregi);
        txtnmregi.setBounds(90, 30, 170, 23);

        txtpassreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassregActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassreg);
        txtpassreg.setBounds(90, 60, 170, 20);

        cmdcanclereg.setText("Cancel");
        cmdcanclereg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancleregActionPerformed(evt);
            }
        });
        jPanel1.add(cmdcanclereg);
        cmdcanclereg.setBounds(90, 210, 80, 20);

        cmdreg.setText("Save");
        cmdreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdregActionPerformed(evt);
            }
        });
        jPanel1.add(cmdreg);
        cmdreg.setBounds(180, 210, 80, 20);

        chepass.setText("Show Password");
        chepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chepassMouseClicked(evt);
            }
        });
        chepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chepassActionPerformed(evt);
            }
        });
        jPanel1.add(chepass);
        chepass.setBounds(100, 233, 150, 20);

        checkemp.setText("I am employe !!!");
        jPanel1.add(checkemp);
        checkemp.setBounds(280, 100, 190, 23);

        cmdimgload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobileInfoManagementsystem/down3-128.png"))); // NOI18N
        cmdimgload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdimgloadActionPerformed(evt);
            }
        });
        jPanel1.add(cmdimgload);
        cmdimgload.setBounds(230, 130, 30, 30);

        lblphoto.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblphoto.setForeground(new java.awt.Color(255, 153, 153));
        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setText("PHOTO");
        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblphoto);
        lblphoto.setBounds(90, 110, 130, 100);

        gender.add(genderM);
        genderM.setText("Male");
        genderM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderMActionPerformed(evt);
            }
        });
        jPanel1.add(genderM);
        genderM.setBounds(90, 80, 70, 20);

        gender.add(genderF);
        genderF.setText("Female");
        jPanel1.add(genderF);
        genderF.setBounds(160, 80, 100, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Gender :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 60, 15);

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobileInfoManagementsystem/giphy.gif"))); // NOI18N
        lblbackground.setText("Show password");
        jPanel1.add(lblbackground);
        lblbackground.setBounds(0, 0, 490, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void clearReg() {
        txtnmregi.setText("");
        txtpassreg.setText("");
        genderF.setSelected(false);
        genderM.setSelected(false);
        lblphoto = new JLabel("");
    }

    public void clearLogin() {
        name.setText("");
        password.setText("");
        checkemp.setSelected(false);
    }
    private void cmdregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdregActionPerformed
        String gender = null;
        if (txtpassreg.getPassword().length <= 4) {
            JOptionPane.showMessageDialog(null, "password must be <4 !!", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtpassreg.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Please input password", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (genderM.isSelected()) {
            gender = "Male";
        } else if (genderF.isSelected()) {
            gender = "Female";
        }

        Aescryptpass ap = new Aescryptpass();
        String sendpass = txtpassreg.getPassword().toString();

        Connection con = null;
        try {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
            PreparedStatement statement;
            Icon icon = lblphoto.getIcon();
            BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics g = bufferedImage.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", baos);
            InputStream inputStream = new ByteArrayInputStream(baos.toByteArray());
            statement = con.prepareStatement("insert into enployeinfo(name,password,photo,gender)values(?,?,?,?)");
            statement.setString(1, txtnmregi.getText());
            statement.setString(2, Aescryptpass.encrypt(sendpass));
            // statement.setString(2, txtpassreg.getPassword().toString());
            statement.setBinaryStream(3, inputStream, baos.size());
            statement.setString(4, gender);
            statement.executeUpdate();
            System.out.println("Successfully inserted the file into the database!");
            clearReg();
            statement.execute();
            statement.clearParameters();
            con.setAutoCommit(false);
            Statement s = con.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Successfully inserted the file into the database!");
        }
    }//GEN-LAST:event_cmdregActionPerformed

    private void cmdcancleregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancleregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdcancleregActionPerformed

    private void txtnmregiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnmregiMouseClicked
        txtnmregi.setText("");
    }//GEN-LAST:event_txtnmregiMouseClicked

    private void txtnmregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmregiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmregiActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        Aescryptpass a = new Aescryptpass();
        String encryptpasss = password.getPassword().toString();

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
            PreparedStatement pst;
            ResultSet result;
            pst = con.prepareStatement("select * from enployeinfo where name=? and password=?");
            pst.setString(1, name.getText());
            pst.setString(2, Aescryptpass.encrypt(encryptpasss));
            //pst.setString(2, password.getPassword().toString());
            result = pst.executeQuery();
            if (result.next() && checkemp.isSelected()) {
                JOptionPane.showMessageDialog(null, " Username and Password was succassfully varified !!");
                this.dispose();
                PhoneCallManage pcm = new PhoneCallManage();
                pcm.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Invalied username and password !!");
            }
            clearLogin();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

    }//GEN-LAST:event_nameKeyTyped

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void chepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chepassActionPerformed

    }//GEN-LAST:event_chepassActionPerformed

    private void chepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chepassMouseClicked
        if (chepass.isSelected()) {
            txtpassreg.setEchoChar((char) 0);
        } else {
            txtpassreg.setEchoChar('*');
        }
    }//GEN-LAST:event_chepassMouseClicked

    private void txtpassregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassregActionPerformed

    }//GEN-LAST:event_txtpassregActionPerformed

    private void cmdimgloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdimgloadActionPerformed
        String filepath = "";
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int st = fc.showOpenDialog(this);
        if (st == JFileChooser.APPROVE_OPTION) {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            filepath = fc.getSelectedFile().toString();
            ImageIcon icon = new ImageIcon(filepath);
            Image pp = icon.getImage();
            pp = pp.getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), pp.SCALE_SMOOTH);
            icon.setImage(pp);
            lblphoto.setIcon(icon);
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }

    }//GEN-LAST:event_cmdimgloadActionPerformed

    private void genderMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderMActionPerformed

    }//GEN-LAST:event_genderMActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Approveto_Enter().setVisible(true);
               // new PhoneCallManage().setVisible(true);
            }
        });
        /* try {
            File f = new File("F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\Sound.mp3");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            try {
                Player p = new Player(bis);
                p.play();
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        JFrame fm = new JFrame();
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkemp;
    private javax.swing.JCheckBox chepass;
    private javax.swing.JButton cmdcanclereg;
    private javax.swing.JButton cmdimgload;
    private javax.swing.JButton cmdreg;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JRadioButton genderF;
    private javax.swing.JRadioButton genderM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtnmregi;
    private javax.swing.JPasswordField txtpassreg;
    // End of variables declaration//GEN-END:variables
}
