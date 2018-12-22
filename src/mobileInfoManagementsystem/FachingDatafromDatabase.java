package mobileInfoManagementsystem;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class FachingDatafromDatabase extends javax.swing.JFrame {

    Image img;

    public FachingDatafromDatabase() {//instance default constructor(access modifier and non argumented)
        super("Mobile Information");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("feach.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        TfrmDtabase = new javax.swing.JTextField();
        txtduration = new javax.swing.JTextField();
        STfrmDtabase = new javax.swing.JTextField();
        ETfrmDtabase = new javax.swing.JTextField();
        photofromDatabase = new javax.swing.JLabel();
        ONfrmDtabase = new javax.swing.JTextField();
        MNfrmDtabase = new javax.swing.JTextField();
        HfrmDtabase = new javax.swing.JTextField();
        UNfrmDtabase = new javax.swing.JTextField();
        PNfrmDtabase = new javax.swing.JTextField();
        PfrmDtabase = new javax.swing.JTextField();
        cmdsearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        cmdPrint = new javax.swing.JButton();
        cmdback = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelet = new javax.swing.JButton();
        txtviewContact = new javax.swing.JTextField();
        cmdClear = new javax.swing.JButton();
        cmdChoiceImage = new javax.swing.JButton();
        txtBill = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(img);

        jLabel1.setText("Call Number :");

        jLabel2.setText("Start Time :");

        jLabel3.setText("End Time :");

        jLabel4.setText("Time :");

        jLabel5.setText("Operatio Logo :");

        jLabel6.setText("Duration:");

        jLabel7.setText("Operator Name :");

        jLabel8.setText("Host :");

        jLabel9.setText("User Name :");

        jLabel10.setText("Port Number :");

        jLabel11.setText("Password :");

        jLabel12.setText("Message Number :");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        ETfrmDtabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ETfrmDtabaseActionPerformed(evt);
            }
        });

        photofromDatabase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmdsearch.setText("Search");
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });

        txtsearch.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(204, 255, 204));
        txtsearch.setText("Search Here");
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });

        cmdPrint.setText("Print");
        cmdPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrintActionPerformed(evt);
            }
        });

        cmdback.setText("Back");
        cmdback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbackActionPerformed(evt);
            }
        });

        cmdUpdate.setText("update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdDelet.setText("Delet");
        cmdDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeletActionPerformed(evt);
            }
        });

        txtviewContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtviewContactActionPerformed(evt);
            }
        });

        cmdClear.setText("Clear");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        cmdChoiceImage.setBackground(new java.awt.Color(255, 204, 153));
        cmdChoiceImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChoiceImageActionPerformed(evt);
            }
        });

        jLabel13.setText("Bill :");

        jLabel14.setText("Date :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addGap(34, 34, 34))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel3))
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel2)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ETfrmDtabase)
                                        .addComponent(txtBill)
                                        .addComponent(txtviewContact, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                        .addComponent(txtduration, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                        .addComponent(TfrmDtabase)
                                        .addComponent(txtNumber)
                                        .addComponent(STfrmDtabase))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(34, 34, 34))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ONfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdsearch))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmdUpdate)
                                        .addComponent(jLabel11))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(photofromDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdChoiceImage)
                        .addGap(251, 251, 251)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsearch)
                    .addComponent(MNfrmDtabase)
                    .addComponent(HfrmDtabase)
                    .addComponent(UNfrmDtabase)
                    .addComponent(PNfrmDtabase)
                    .addComponent(PfrmDtabase, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdDelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdback, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MNfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtviewContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(TfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(HfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(UNfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(STfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(PNfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ETfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(PfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photofromDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(cmdChoiceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdsearch)
                            .addComponent(cmdPrint)
                            .addComponent(cmdback))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdUpdate)
                            .addComponent(cmdDelet)
                            .addComponent(cmdClear))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(ONfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ETfrmDtabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ETfrmDtabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ETfrmDtabaseActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
        char ch = evt.getKeyChar();
        if (txtsearch.getText().length() == 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txtsearchKeyTyped

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        txtsearch.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchMouseClicked

    private void cmdPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrintActionPerformed

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "123456");
            PreparedStatement stmt;
            ResultSet rs;
            stmt = con.prepareStatement("select * from mobileloginfo");
            rs = stmt.executeQuery();
            Map<String, Object> param = new HashMap<>();
            param.put("MLIparam1", "Log Information from Swing");
            JasperPrint jp = JasperFillManager.fillReport("./PhnLogreport/rptloglist.jasper", param, new JRResultSetDataSource(rs));
            JInternalFrame privewfrm = new JInternalFrame("Report View", true, true, true, true);
            privewfrm.getContentPane().add(new JRViewer(jp));
            privewfrm.setSize(1150, 610);
            privewfrm.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_cmdPrintActionPerformed


    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
        if (txtsearch.getText() == " ") {
            JOptionPane.showMessageDialog(null, "Invalid Number !", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc.mysql:jdbc://localhost:3306/mydb", "root", "12345");
            PreparedStatement st = con.prepareStatement("select * from mobileloginfo where phnnumber=" + txtsearch.getText() + "");
            st.setString(1, txtsearch.getText());
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                byte[] img = rs.getBytes("");
                ImageIcon imageIcon = new ImageIcon(img);
                Image image = imageIcon.getImage();
                Image myimage = image.getScaledInstance(photofromDatabase.getWidth(), photofromDatabase.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newimage = new ImageIcon(myimage);

                String s = rs.getString(1);
                String s1 = rs.getString(2);
                String s2 = rs.getString(3);
                String s3 = rs.getString(4);
                String s4 = rs.getString(5);
                String s5 = rs.getString(6);
                String s6 = rs.getString(7);
                String s7 = rs.getString(8);
                txtNumber.setText(s);
                TfrmDtabase.setText(s1);
                txtduration.setText(s2);
                ETfrmDtabase.setText(s3);
                ONfrmDtabase.setText(s4);
                HfrmDtabase.setText(s5);
                UNfrmDtabase.setText(s6);
                PfrmDtabase.setText(s7);
                photofromDatabase.setIcon(newimage);
                rs.close();
                con.close();

            } else {
                clear();
                JOptionPane.showMessageDialog(null, " Number not found");

                st.execute();
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdsearchActionPerformed
    private void clear() {
        txtNumber.setText("");
        TfrmDtabase.setText("");
        ETfrmDtabase.setText("");
        ONfrmDtabase.setText("");
        HfrmDtabase.setText("");
        UNfrmDtabase.setText("");
        txtduration.setText("");
        PfrmDtabase.setText("");
        txtsearch.setText("");
        txtsearch.requestFocusInWindow();
        photofromDatabase.setIcon(null);

    }
  private int myint1(String number) {
        int flag = 0;
        try {
            flag = Integer.parseInt(number);
        } catch (Exception e) {
            flag = 0;

        }
        return flag;
    }


    private void cmdbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbackActionPerformed
        PhoneCallManage pcm = new PhoneCallManage();
        pcm.setVisible(true);

    }//GEN-LAST:event_cmdbackActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        if (txtNumber.getText().trim().length() <= 11) {
            JOptionPane.showMessageDialog(null, "Please input Number", "Forme ", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtviewContact.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Not Connected", "Error Connection", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (TfrmDtabase.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input Minute", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtduration.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input Second", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (txtBill.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input Bill", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtDate.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input To Date", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (STfrmDtabase.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input endtime", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (ETfrmDtabase.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input starttime", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (ONfrmDtabase.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input starttime", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (photofromDatabase.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Please input Image", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (JOptionPane.showConfirmDialog(null, "Are you sure Change this reccord?", "Form", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc.mysql:jdbc://localhost:3306/mydb", "root", "12345");
            PreparedStatement ps;
            Icon icon = photofromDatabase.getIcon();
            BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics g = bufferedImage.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", baos);
            InputStream inputStream = new ByteArrayInputStream(baos.toByteArray());
            ps = con.prepareStatement("update mobileloginfo set phnnumber=?,phnconnection=?,calltime=?,duration=?,bill=?,calldate=?,starttime=?,endtime=?,msghost=?,msgport=?,messageno=?,username=?,msgpassword=?,photo=? where phnnumber=" + txtsearch.getText() + "");
            ps.setString(1, txtNumber.getText());
            ps.setString(2, txtviewContact.getText());
            ps.setString(3, TfrmDtabase.getText() + ":");
            ps.setString(4, txtduration.getText());
            ps.setInt(5, myint1(txtBill.getText()));
            ps.setString(6, txtDate.getText());
            ps.setString(7, STfrmDtabase.getText());
            ps.setString(8, ETfrmDtabase.getText());
            ps.setString(9, HfrmDtabase.getText());
            ps.setString(10, PNfrmDtabase.getText());
            ps.setString(11, MNfrmDtabase.getText());
            ps.setString(12, UNfrmDtabase.getText());
            ps.setString(13, PfrmDtabase.getText());
            ps.setBinaryStream(14, inputStream, baos.size());
            ps.execute();
            ps.clearParameters();
            con.setAutoCommit(false);
            Statement s = con.createStatement();
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record saved!", "Form", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeletActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure Delete this reccord?", "Form", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        Connection con = null;
        FachingDatafromDatabase fdd = new FachingDatafromDatabase();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
            PreparedStatement ps = con.prepareStatement("delete from mobileloginfo  where phnnumber=" + txtsearch.getText() + "");
            ps.setString(1, txtNumber.getText());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Delete complete!", "Frome", JOptionPane.INFORMATION_MESSAGE);
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FachingDatafromDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmdDeletActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtviewContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtviewContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtviewContactActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        clear();
    }//GEN-LAST:event_cmdClearActionPerformed

    private void cmdChoiceImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChoiceImageActionPerformed
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
            photofromDatabase.setIcon(icon);
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmdChoiceImageActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ETfrmDtabase;
    private javax.swing.JTextField HfrmDtabase;
    private javax.swing.JTextField MNfrmDtabase;
    private javax.swing.JTextField ONfrmDtabase;
    private javax.swing.JTextField PNfrmDtabase;
    private javax.swing.JTextField PfrmDtabase;
    private javax.swing.JTextField STfrmDtabase;
    private javax.swing.JTextField TfrmDtabase;
    private javax.swing.JTextField UNfrmDtabase;
    private javax.swing.JButton cmdChoiceImage;
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdDelet;
    private javax.swing.JButton cmdPrint;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton cmdback;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel photofromDatabase;
    private javax.swing.JTextField txtBill;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtviewContact;
    // End of variables declaration//GEN-END:variables
}
