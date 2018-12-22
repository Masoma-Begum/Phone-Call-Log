package mobileInfoManagementsystem;

import java.awt.Cursor;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.beans.Statement;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultEditorKit;
import mobileinforeferclass.HelpCenter;

public class PhoneCallManage extends javax.swing.JFrame {

    Image image;
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat formatehour = new SimpleDateFormat("hh");
    Date datehour = cal.getTime();
    Thread updateThread = null;
    Timer t;
    int x = 0;
    String[] imgList = {
        "F:\\JSP\\dtasjd\\src\\Images\\gp.png",//0
        "F:\\JSP\\dtasjd\\src\\Images\\art.PNG",//1
        "F:\\JSP\\dtasjd\\src\\Images\\bl.png",//2
        "F:\\JSP\\dtasjd\\src\\Images\\tt.png",//3
        "F:\\JSP\\dtasjd\\src\\Images\\rb.jpg"//4
    };
    String[] imgnameList = {"Telecommunications company",//0
        "Mobile network operator company",//1
        "Telecom company",//2
        "Mobile phone operator company",//3
        "Mobile phone operator company"//4
    };

    public PhoneCallManage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mainlog.png")));//if 2 frame is then 1 is custom ant other is default
        this.setExtendedState(MAXIMIZED_BOTH);

        initComponents();

        lblslide.setBounds(30, 20, 60, 40);
        lblslide.setVerticalTextPosition(SwingConstants.BOTTOM);
        lblslide.setHorizontalTextPosition(SwingConstants.CENTER);
        setSlideImageSize(4);
        t = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSlideImageSize(x);
                x += 1;
                if (x >= imgList.length) {
                    x = 0;
                }
            }
        });
        t.start();
        showGrid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        appInfoTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblSlideImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtbil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtviewContact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        txtMinuteSec = new javax.swing.JTextField();
        txtTimestart = new javax.swing.JTextField();
        lblTimestart = new javax.swing.JLabel();
        lblendTime = new javax.swing.JLabel();
        txtTimeend = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txtOperator = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMessage = new javax.swing.JTextArea();
        txtToMessage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btndial = new javax.swing.JButton();
        btnend = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblslide = new javax.swing.JLabel();
        lbllogoname = new javax.swing.JLabel();
        btnSendMessege = new javax.swing.JButton();
        btnShowData = new javax.swing.JButton();
        cmdHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2147483647, 2147));
        setPreferredSize(new java.awt.Dimension(1153, 1522));
        setResizable(false);

        appInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numbers", "Time", "Duration", "Bill", "host", "password", "username", "port"
            }
        ));
        appInfoTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                appInfoTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        appInfoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appInfoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appInfoTable);

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("App Information");

        lblSlideImage.setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(241, 209, 209));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bill :");

        txtbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbilActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Dutatin :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Time :");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel1.setText("Call :");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumberFocusLost(evt);
            }
        });
        txtNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumberMouseClicked(evt);
            }
        });
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });
        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });

        txtMinuteSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinuteSecActionPerformed(evt);
            }
        });

        lblTimestart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTimestart.setText("Start Time :");

        lblendTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblendTime.setText("End Time :");

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldate.setText("Date :");

        txtOperator.setEditable(false);
        txtOperator.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        txtOperator.setForeground(new java.awt.Color(255, 204, 255));
        txtOperator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOperator.setText("Operator Name");
        txtOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperatorActionPerformed(evt);
            }
        });

        lblLogo.setBackground(new java.awt.Color(255, 204, 204));
        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblMessage.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(153, 51, 0));
        lblMessage.setText("Write your Message here :");

        txtAreaMessage.setColumns(20);
        txtAreaMessage.setRows(5);
        txtAreaMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaMessageKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaMessage);

        txtToMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtToMessageFocusGained(evt);
            }
        });
        txtToMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtToMessageMouseClicked(evt);
            }
        });
        txtToMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtToMessageKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("To :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Host :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Port :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("User name :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Password :");

        txtHost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHostMouseClicked(evt);
            }
        });

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 3, 11)); // NOI18N
        jLabel5.setText("iphone7s myApps");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        btndial.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btndial.setText("Dial");
        btndial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndialActionPerformed(evt);
            }
        });

        btnend.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnend.setText("End");
        btnend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnendActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btn0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn1KeyTyped(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn2KeyTyped(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn3KeyTyped(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn7KeyTyped(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3)
                            .addComponent(btn6)
                            .addComponent(btn9))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnSave)))
        );

        lblslide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lbllogoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogoname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnSendMessege.setText("SendMsg");
        btnSendMessege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessegeActionPerformed(evt);
            }
        });

        btnShowData.setText("Show DATA");
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });

        cmdHelp.setText("Help");
        cmdHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btndial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnend)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbllogoname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSendMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnShowData))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(lblslide, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(btndial)
                            .addComponent(btnend)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbllogoname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(cmdHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSendMessege)
                            .addComponent(btnShowData)))
                    .addComponent(lblslide, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(lbldate)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblendTime)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtTimeend, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTimestart)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTimestart, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtbil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtviewContact, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtMinuteSec, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtToMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtToMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtviewContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtMinuteSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimestart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimestart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimeend, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblendTime, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setSlideImageSize(int i) {
        ImageIcon ii = new ImageIcon(imgList[i]);
        Image im = ii.getImage();
        Image newimage = im.getScaledInstance(lblslide.getWidth(), lblslide.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newimageIcon = new ImageIcon(newimage);
        lblslide.setIcon(newimageIcon);
        setimagename(i);//Nested method Declearation
    }

    private void setimagename(int i) {
        String logo = new String(imgnameList[i]);
        lbllogoname.setText(logo);

    }

    private void imagePathes() {
        ImageIcon ii = new ImageIcon();
        Image im = ii.getImage();
        Image newimage = im.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon newimageIcon = new ImageIcon(newimage);
        lblLogo.setIcon(newimageIcon);
    }

    private void SaveAsfile() {
        final JFileChooser SaveAs = new JFileChooser();
        int actionDialog = SaveAs.showSaveDialog(this);
        if (actionDialog != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File fileName = new File(SaveAs.getSelectedFile() + ".txt");
        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter(fileName));
            txtNumber.write(outFile);
            txtMinuteSec.write(outFile);
          
            txtduration.write(outFile);
            txtbil.write(outFile);
            txtdate.write(outFile);
            txtTimestart.write(outFile);
            txtTimeend.write(outFile);
            txtToMessage.write(outFile);
            txtOperator.write(outFile);
            txtAreaMessage.write(outFile);
            txtOperator.write(outFile);
            AppZarfileCompress azc = new AppZarfileCompress();
            azc.zarfileCompress(fileName);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void timeSet() {
        CreateMinuteSecond cms = new CreateMinuteSecond() {
            @Override
            public void printTime() {
                try {
                   // txtSecond.setText(timeStringSecond.substring(0, 5));
                    txtMinuteSec.setText(timeStringMinute+":"+timeStringSecond.substring(0, 5));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void fullTime() {
                txtMinuteSec.setText(formatehour.format(formatehour) + ":" + txtMinuteSec.getText());
            }
        };
    }

    private void timeDiuBill() {
        TimeDuration td = new TimeDuration() {

            @Override
            public void builtDiuration() {
                txtduration.setText(Mindiu + ":" + Secdiu);
                txtbil.setText(bill);
            }
        };
    }

    Action action = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("\n");
        }
    };

    private void dateFormater() {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        txtdate.setText(df.format(date));
    }

    public void setDattoTable() {
        DefaultTableModel model = new DefaultTableModel();
        appInfoTable.setModel(model);
        Object[] addRows = new Object[4];
        addRows[0] = txtNumber.getText().toString();
        addRows[1] = txtMinuteSec.getText();
        addRows[1] = ("\t");
        addRows[2] = txtduration.getText();
        addRows[3] = txtbil.getText();
        model.addRow(addRows);
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

    private void showGrid() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
            PreparedStatement statement;
            ResultSet rs;
            statement = con.prepareStatement("select * from mobileloginfo order by number asc");
            rs = statement.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) appInfoTable.getModel();
            for (int j = appInfoTable.getRowCount() - 1; j >= 0; j--) {
                dtm.removeRow(j);
            }
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
            }
            appInfoTable.setModel(dtm);
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void appInfoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appInfoTableMouseClicked
        int columnslected = appInfoTable.getSelectedColumn();
        if (columnslected == -1) {
            return;
        }
        txtHost.setText(appInfoTable.getValueAt(columnslected, 4).toString());
        txtpassword.setText(appInfoTable.getValueAt(columnslected, 5).toString());
        txtPort.setText(appInfoTable.getValueAt(columnslected, 6).toString());
        txtUsername.setText(appInfoTable.getValueAt(columnslected, 7).toString());
    }//GEN-LAST:event_appInfoTableMouseClicked

    private void appInfoTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_appInfoTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_appInfoTableAncestorAdded

    private void cmdHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHelpActionPerformed
        HelpCenter hc = new HelpCenter();
        hc.setVisible(true);

    }//GEN-LAST:event_cmdHelpActionPerformed

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed
        FachingDatafromDatabase fdd = new FachingDatafromDatabase();
        fdd.setVisible(true);
    }//GEN-LAST:event_btnShowDataActionPerformed

    private void btnSendMessegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessegeActionPerformed
        //SET IT IN SENDMESAGE BUTTON
        TestTcpSms tts = new TestTcpSms();
        String sendtoNumber = txtToMessage.getText();
        String sendMessage = txtAreaMessage.getText();
        String sendPort = txtPort.getText();
        String sendHost = txtHost.getText();
        String sendPssword = txtpassword.getText();
        String sendUsername = txtUsername.getText();

        tts.TestTcpSms(sendtoNumber, sendMessage, sendPort, sendHost, sendPssword, sendUsername);
    }//GEN-LAST:event_btnSendMessegeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Connection con = null;
        try {
            SaveAsfile();

        } catch (Exception e) {

            e.printStackTrace();
        }

        if (JOptionPane.showConfirmDialog(null, "Are you sure sava this reccord?", "Form", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
            PreparedStatement ps;
            Icon icon = lblLogo.getIcon();
            BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics g = bufferedImage.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            ByteArrayInputStream is = new ByteArrayInputStream(baos.toByteArray());
            ps = con.prepareStatement("insert into mobileloginfo(phnnumber,phnconnection,calltime,duration,bill,calldate,starttime,endtime,msghost,msgport,messageno,username,msgpassword,photo)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, txtNumber.getText());
            ps.setString(2, txtviewContact.getText());
            ps.setString(3, txtMinuteSec.getText());
            ps.setString(4, txtduration.getText());
            ps.setInt(5, myint1(txtbil.getText()));
            ps.setString(6, txtdate.getText());
            ps.setString(7, txtTimestart.getText());
            ps.setString(8, txtTimeend.getText());
            ps.setString(9, txtHost.getText());
            ps.setString(10, txtPort.getText());
            ps.setString(11, txtToMessage.getText());
            ps.setString(12, txtUsername.getText());
            ps.setString(13, txtpassword.getText());
            ps.setBinaryStream(14, is, baos.size());

            ps.execute();
            ps.executeUpdate();
            showGrid();
            ps.clearParameters();
            con.setAutoCommit(false);
            Statement s = (Statement) con.createStatement();
            baos.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "9");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "9");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "8");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "8");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn7KeyTyped

    }//GEN-LAST:event_btn7KeyTyped

    private void btn7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn7KeyPressed

    }//GEN-LAST:event_btn7KeyPressed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "7");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "7");
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "6");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "6");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "5");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "5");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "4");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "4");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn3KeyTyped

    }//GEN-LAST:event_btn3KeyTyped

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "3");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "3");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn2KeyTyped

    }//GEN-LAST:event_btn2KeyTyped

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (referField.equals(txtNumber) && txtNumber.getText().length() < 11) {
            txtNumber.setText(txtNumber.getText() + "2");
        } else if (referField.equals(txtToMessage) && txtToMessage.getText().length() < 11) {
            txtToMessage.setText(txtToMessage.getText() + "2");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyTyped

    }//GEN-LAST:event_btn1KeyTyped

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed

    }//GEN-LAST:event_btn1KeyPressed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "1");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "1");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (referField.equals(txtNumber)) {
            txtNumber.setText(txtNumber.getText() + "0");
        } else if (referField.equals(txtToMessage)) {
            txtToMessage.setText(txtToMessage.getText() + "0");
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        txtNumber.setText("");
        txtviewContact.setText("");
        txtduration.setText("");
        txtbil.setText("");
        txtTimestart.setText("");
        txtTimeend.setText("");
        txtMinuteSec.setText("");
        txtduration.setText("");
        txtdate.setText("");
        txtHost.setText("");
        txtPort.setText("");
        txtToMessage.setText("");
        txtAreaMessage.setText("");
        txtpassword.setText("");
        txtUsername.setText("");

        TimeDuration dirutin = new TimeDuration() {

            @Override
            public void builtDiuration() {

            }
        };
    }//GEN-LAST:event_clearBtnActionPerformed

    private void btnendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnendActionPerformed
        txtTimeend.setText(formatehour.format(datehour) + ":" + txtMinuteSec.getText() );
        
        TimeDuration td = new TimeDuration() {

            @Override
            public void builtDiuration() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        try {
            td.sleep(1000 * 10);
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
           td.interrupt();//Stop thread
        }
    }//GEN-LAST:event_btnendActionPerformed

    private void btndialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndialActionPerformed

        dateFormater();
        Connected con = new Connected();
        String sst = txtNumber.getText();
        String sss = sst.substring(0, 3);
        txtviewContact.setText(con.connect(sss));
        txtOperator.setText(con.myOperator(sss));
        lblLogo.setIcon(con.setImagelogo(sss));
       
        if (txtviewContact.getText().equals("Connected")) {
            Toolkit.getDefaultToolkit().beep();
            timeSet();
            timeDiuBill();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            txtTimestart.setText(formatehour.format(datehour) + ":" + txtMinuteSec.getText() );
        } else {
            JOptionPane.showMessageDialog(rootPane, "Something Error to Connect");
        }
    }//GEN-LAST:event_btndialActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtHostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHostMouseClicked

    }//GEN-LAST:event_txtHostMouseClicked

    private void txtToMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToMessageKeyTyped
        char ch = evt.getKeyChar();
        if (txtToMessage.getText().length() == 11) {
            evt.consume();
        }
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtToMessageKeyTyped

    private void txtToMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtToMessageMouseClicked

    }//GEN-LAST:event_txtToMessageMouseClicked

    private void txtToMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtToMessageFocusGained
        if (evt.getSource() instanceof JTextField) {
            referField = (JTextField) evt.getSource();
        }
    }//GEN-LAST:event_txtToMessageFocusGained

    private void txtAreaMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaMessageKeyTyped
        String s = txtAreaMessage.getText();
        int c = 0;
        char ch[] = new char[s.length()];      //in string especially we have to mention the () after length
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                c++;
            }
            if (c == 161) {
                Action actiona = txtAreaMessage.getActionMap().get(DefaultEditorKit.beepAction);
                actiona.setEnabled(false);
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtAreaMessageKeyTyped

    private void txtOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperatorActionPerformed
        // TODO add your handling code here:sss
    }//GEN-LAST:event_txtOperatorActionPerformed

    private void txtMinuteSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinuteSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinuteSecActionPerformed

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
        char ch = evt.getKeyChar();
        if (txtNumber.getText().length() == 11) {
            evt.consume();
        }
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumberKeyTyped

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed

    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumberMouseClicked

    }//GEN-LAST:event_txtNumberMouseClicked

    private void txtNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumberFocusLost
        if (txtNumber.getText().length() == 3) {
        }
    }//GEN-LAST:event_txtNumberFocusLost

    private void txtNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumberFocusGained
        if (evt.getSource() instanceof JTextField) {
            referField = (JTextField) evt.getSource();
        }
    }//GEN-LAST:event_txtNumberFocusGained

    private void txtbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbilActionPerformed

    }//GEN-LAST:event_txtbilActionPerformed
 
    
    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appInfoTable;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSendMessege;
    private javax.swing.JButton btnShowData;
    private javax.swing.JButton btndial;
    private javax.swing.JButton btnend;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton cmdHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSlideImage;
    private javax.swing.JLabel lblTimestart;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblendTime;
    private javax.swing.JLabel lbllogoname;
    private javax.swing.JLabel lblslide;
    private javax.swing.JTextArea txtAreaMessage;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtMinuteSec;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtOperator;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtTimeend;
    private javax.swing.JTextField txtTimestart;
    private javax.swing.JTextField txtToMessage;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtbil;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtviewContact;
    // End of variables declaration//GEN-END:variables
    JTextField referField = txtNumber;

}
