package mobileInfoManagementsystem;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import sun.misc.BASE64Decoder;

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
        DfrmDtabase = new javax.swing.JTextField();
        STfrmDtabase = new javax.swing.JTextField();
        ETfrmDtabase = new javax.swing.JTextField();
        logofrmDatabase = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        logofrmDatabase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(logofrmDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(txtsearch))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cmdUpdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ONfrmDtabase, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ETfrmDtabase))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(STfrmDtabase)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(182, 182, 182)
                                                .addComponent(cmdsearch))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(166, 166, 166)
                                                .addComponent(jLabel11)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtviewContact, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DfrmDtabase, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                        .addComponent(TfrmDtabase)
                                        .addComponent(txtNumber)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MNfrmDtabase)
                            .addComponent(HfrmDtabase)
                            .addComponent(UNfrmDtabase)
                            .addComponent(PNfrmDtabase)
                            .addComponent(PfrmDtabase, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(cmdback, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(cmdDelet)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(DfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(STfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PNfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11)
                    .addComponent(ETfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logofrmDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ONfrmDtabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdsearch)
                            .addComponent(cmdPrint)
                            .addComponent(cmdback))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdUpdate)
                            .addComponent(cmdDelet))
                        .addGap(47, 47, 47))))
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
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "123456");
            PreparedStatement stmt;
            ResultSet rs;
            stmt=con.prepareStatement("select * from MobileLogInformation ");
           rs=stmt.executeQuery();
           Map<String,Object>param=new HashMap<>();
           param.put("MLIparam1", "Log Information from Swing");
           JasperPrint jp=JasperFillManager.fillReport("./rptloglist,", param,new JRResultSetDataSource(rs));
            JInternalFrame privewfrm=new JInternalFrame("Report View",true,true,true,true);
            privewfrm.getContentPane().add(new JRViewer(jp));
            privewfrm.setSize(1150,610);
            privewfrm.setVisible(true);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
    }//GEN-LAST:event_cmdPrintActionPerformed
    

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
       if(myint(txtsearch.getText())==0){
             JOptionPane.showMessageDialog(null, "Invalid Number !","Forme",JOptionPane.INFORMATION_MESSAGE);
                return;
       }
        Connection con=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc.mysql:jdbc://localhost:3306/mydb","root","12345");
            PreparedStatement st = con.prepareStatement("select * from mobileloginfo where Number=?");
            st.setInt(1,  myint(txtsearch.getText()));//1 is the paramitter number
            ResultSet rs = st.executeQuery();
            //  byte[]data;//................
            
            if (rs.next()) {
//                BLOB blob;
//                blob=(BLOB)rs.getBlob(1);
//                InputStream is=blob.getBinaryStream();
//                ByteArrayOutputStream bos=new ByteArrayOutputStream();
//                int chank;
//                while((chank=is.read())!=-1)
//                    bos.write(chank);
//                 //bos.close();
//                 data=bos.toByteArray();
//                 InputStream ais=new ByteArrayInputStream(data);
//                 BufferedImage bimage=ImageIO.read(is);
//                 ImageIcon iicon=new ImageIcon(bimage);
//                 Image image=iicon.getImage();
//                 image=image.getScaledInstance(iicon.getIconWidth(), iicon.getIconWidth(), java.awt.Image.SCALE_SMOOTH);
//                 iicon.setImage(image);
                 
                 
               //............................................................................  
                String s = rs.getString(2);
                String s1 = rs.getString(3);
                String s2 = rs.getString(4);
                String s3 = rs.getString(5);
                String s4 = rs.getString(6);
                String s5 = rs.getString(7);
                String s6 = rs.getString(8);
                String s7 = rs.getString(9);

                //Sets Records in TextFields.
                txtNumber.setText(s);
                TfrmDtabase.setText(s1);
                DfrmDtabase.setText(s2);
                ETfrmDtabase.setText(s3);
                ONfrmDtabase.setText(s4);
                HfrmDtabase.setText(s5);
                UNfrmDtabase.setText(s6);
                PfrmDtabase.setText(s7);
                //...................................................................................................
               bos.close();
               rs.close();
               con.close();

            } else {
                clear();
                JOptionPane.showMessageDialog(null, " Number not found");
              
                st.execute();
            }

            //Create Exception Handler
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_cmdsearchActionPerformed
  private void clear(){
      txtNumber.setText("");
      TfrmDtabase.setText("");
      ETfrmDtabase.setText("");
      ONfrmDtabase.setText("");
      HfrmDtabase.setText("");
      UNfrmDtabase.setText("");
      DfrmDtabase.setText("");
      PfrmDtabase.setText("");
      txtsearch.setText("");
      txtsearch.requestFocusInWindow();
      
  }
    public static BufferedImage decodeToImage(String imageString) {
 
        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
    private void cmdbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbackActionPerformed
      PhoneCallManage pcm=  new PhoneCallManage();
      pcm.setVisible(true);
       
    }//GEN-LAST:event_cmdbackActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
         if (txtNumber.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input Number", "Forme ", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtviewContact.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Not Connected", "Error Connection", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtMinute.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input Number", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtSecond.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input Number", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtTimeend.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input time", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtTimestart.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input time", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtHost.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input host", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtpassword.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input password", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtPort.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input port", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtUsername.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input username", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtAreaMessage.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input Message", "Forme", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtToMessage.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please input To Number", "Forme", JOptionPane.INFORMATION_MESSAGE);
        }
        if (JOptionPane.showConfirmDialog(null, "Are you sure Change this reccord?", "Form", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc.mysql:jdbc://localhost:3306/mydb", "root", "12345");
            PreparedStatement ps ;
            ps= con.prepareStatement("update  mobileloginfo set connection=?,time=?,duration=?,bill=?starttime=?,endtime=?,messageno=?,host=?,username=?,portnumber=?,password=? where number=?");
            // ps.setString(1, txtNumber.getText());
            ps.setString(1, txtviewContact.getText());//HERE 1,2,3... ARE PARAMITERS
            ps.setString(2, txtMinute.getText() + ":");
            ps.setString(2, txtSecond.getText());
            ps.setString(3, txtduration.getText());
            ps.setString(4, txtTimestart.getText());
            ps.setString(5, txtTimeend.getText());
            ps.setString(6, txtToMessage.getText());
            ps.setString(7, txtHost.getText());
            ps.setString(8, txtUsername.getText());
            ps.setString(9, txtPort.getText());
            ps.setString(10, txtpassword.getText());
            //   ps.setInt(WIDTH, x);
            //ps.setString(11, txtAreaMessage.getText());
            ps.setInt(11, myint1(txtNumber.getText()));
            ps.execute();
            showGrid();
            // JOptionPane.showMessageDialog(null, "Record saved!", "Rosetta", JOptionPane.INFORMATION_MESSAGE);

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
            con = DriverManager.getConnection("jdbc.mysql:jdbc://localhost:3306/mydb", "root", "12345");
            PreparedStatement ps = con.prepareStatement("delete from mobileloginfo  where number=?");
            ps.setInt(1, myint1(txtNumber.getText()));
            ps.execute();
            showGrid();
            //JOptionPane.showMessageDialog(null, "Delete complete!", "Frome", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdDeletActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtviewContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtviewContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtviewContactActionPerformed
    public int myint(String num){
        int flag=0;
        try{
            flag=Integer.parseInt(num);
            
        }catch(Exception e){
            flag=0;
            
        }
        return flag;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FachingDatafromDatabase().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DfrmDtabase;
    private javax.swing.JTextField ETfrmDtabase;
    private javax.swing.JTextField HfrmDtabase;
    private javax.swing.JTextField MNfrmDtabase;
    private javax.swing.JTextField ONfrmDtabase;
    private javax.swing.JTextField PNfrmDtabase;
    private javax.swing.JTextField PfrmDtabase;
    private javax.swing.JTextField STfrmDtabase;
    private javax.swing.JTextField TfrmDtabase;
    private javax.swing.JTextField UNfrmDtabase;
    private javax.swing.JButton cmdDelet;
    private javax.swing.JButton cmdPrint;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton cmdback;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logofrmDatabase;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtviewContact;
    // End of variables declaration//GEN-END:variables
}
