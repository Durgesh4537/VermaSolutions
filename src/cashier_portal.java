



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author PLAYBOLD!!
 */
public class cashier_portal extends javax.swing.JFrame {
Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form cashier_portal
     */
    public cashier_portal() {
        super("Cashier Portal");
        initComponents();
        conn=jconnect.ConnecrDb();
        setResizable(false);
        Account();
        depositreceipt.setEnabled(true);
        date();
        time();
        
    }
     public void date(){
      String tdate=new SimpleDateFormat("dd/MM/YY",Locale.ENGLISH).format(new Date());
      date.setText("" +tdate);
  }
  public void time(){
      new Timer(0,new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              java.text.SimpleDateFormat ad=new java.text.SimpleDateFormat("HH:mm:ss");
              String ttime=ad.format(new Date());
              time.setText("" +ttime);
          }
      }).start();
              
          }
  //deposit
  public void ctrans(){
       String sql="insert into Transactions(Date,Time,Credit,Balance,Acc_No,creditor) values (?,?,?,?,?,?)";
      try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,jt3.getText());
                   pst.setString(4,jt4.getText());
                   pst.setString(5,jtxtsearch1.getText());
                    pst.setString(6,l1.getText());
                   
                   pst.execute();
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
           }
        }
  }
  ///withdraw
  public void ctrans1(){
       String sql="insert into Transactions(Date,Time,Debit,Balance,Acc_No,creditor) values (?,?,?,?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,db4.getText());
                   pst.setString(4,db5.getText());
                   pst.setString(5,db1.getText());
                   pst.setString(6,l1.getText());
                   pst.execute();
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
  }
  ///transfer
  public void ctrans2(){
       String sql="insert into Transactions(Date,Time,Debit,Balance,Acc_No,creditor) values (?,?,?,?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,cd4.getText());
                   pst.setString(4,cd5.getText());
                   pst.setString(5,cd1.getText());
                    pst.setString(6,l1.getText());
                   
                   pst.execute();
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
  }
  public void ctrans3(){
       String sql="insert into Transactions(Date,Time,Credit,Balance,Acc_No,creditor) values (?,?,?,?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,cd4.getText());
                   pst.setString(4,cd7.getText());
                   pst.setString(5,(String) jcmbcdacc.getSelectedItem());
                   pst.setString(6, cd1.getText());
                   pst.execute();
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
  }
  public void emplogout1(){
       conn=j2connect.ConnecrDb();
       String sql="insert into emplog(Outdate,Outtime,Username) values (?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,l1.getText());
                 pst.execute();
 }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                
                
            }
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

        logout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtxtsearch1 = new javax.swing.JTextField();
        jt1 = new javax.swing.JTextField();
        jt2 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jt4 = new javax.swing.JTextField();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jlblimg = new javax.swing.JLabel();
        jbtndeposit = new javax.swing.JButton();
        jbtntotal = new javax.swing.JButton();
        jbtnsearch1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        depositreceipt = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        db1 = new javax.swing.JTextField();
        db2 = new javax.swing.JTextField();
        db3 = new javax.swing.JTextField();
        db4 = new javax.swing.JTextField();
        db5 = new javax.swing.JTextField();
        jbtnshow = new javax.swing.JButton();
        jbtndb1 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jlblpicture = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        debitreciept = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cd1 = new javax.swing.JTextField();
        cd2 = new javax.swing.JTextField();
        cd3 = new javax.swing.JTextField();
        cd4 = new javax.swing.JTextField();
        cd5 = new javax.swing.JTextField();
        jbtncal = new javax.swing.JButton();
        jcmbcdacc = new javax.swing.JComboBox<>();
        cd6 = new javax.swing.JTextField();
        cd7 = new javax.swing.JTextField();
        jbtncd1 = new javax.swing.JButton();
        jbtntransfer = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jlblcd100 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transferreciept = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        email3 = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apps-session-logout-icon(2).png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ACCOUNT NUMBER");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("NAME");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("AVAILABLE BALANCE");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("DEPOSITING AMOUNT");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("TOTAL");

        jtxtsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearch1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtsearch1KeyTyped(evt);
            }
        });

        jt1.setEditable(false);
        jt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt1ActionPerformed(evt);
            }
        });

        jt2.setEditable(false);

        jt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt3KeyTyped(evt);
            }
        });

        jt4.setEditable(false);

        jDesktopPane3.setPreferredSize(new java.awt.Dimension(146, 162));

        jDesktopPane3.setLayer(jlblimg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtndeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtndeposit.setText("DEPOSIT");
        jbtndeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndepositActionPerformed(evt);
            }
        });

        jbtntotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtntotal.setText("TOTAL");
        jbtntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntotalActionPerformed(evt);
            }
        });

        jbtnsearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eye-icon3.png"))); // NOI18N
        jbtnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearch1ActionPerformed(evt);
            }
        });

        depositreceipt.setColumns(20);
        depositreceipt.setForeground(java.awt.Color.darkGray);
        depositreceipt.setRows(5);
        depositreceipt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        depositreceipt.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(depositreceipt);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("PRINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("EMAIL");

        email1.setEditable(false);

        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtsearch1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jt2)
                            .addComponent(email1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtnsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt3)
                            .addComponent(jt4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtntotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtndeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtndeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("DEPOSIT", jPanel2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ACCOUNT NUMBER");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NAME");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("AVAILABLE BALANCE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("WITHDRAWAL AMOUNT");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("TOTAL");

        db1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                db1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                db1KeyTyped(evt);
            }
        });

        db2.setEditable(false);

        db3.setEditable(false);
        db3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db3ActionPerformed(evt);
            }
        });

        db4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                db4KeyTyped(evt);
            }
        });

        db5.setEditable(false);

        jbtnshow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnshow.setText("SHOW");
        jbtnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnshowActionPerformed(evt);
            }
        });

        jbtndb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtndb1.setText("WITHDRAWAL");
        jbtndb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndb1ActionPerformed(evt);
            }
        });

        jDesktopPane2.setPreferredSize(new java.awt.Dimension(146, 162));

        jDesktopPane2.setLayer(jlblpicture, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eye-icon3.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        debitreciept.setEditable(false);
        debitreciept.setColumns(20);
        debitreciept.setForeground(java.awt.Color.darkGray);
        debitreciept.setRows(5);
        debitreciept.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(debitreciept);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("EMAIL");

        email2.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(db1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(db2)
                            .addComponent(db3)
                            .addComponent(db4)
                            .addComponent(db5)
                            .addComponent(email2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnshow)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtndb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(db1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(db2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(db3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(db4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnshow, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(db5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtndb1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("DEBIT", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ACCOUNT NUMBER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BALANCE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TRANSFER AMOUNT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CREDIT ACCOUNT");

        cd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cd1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cd1KeyTyped(evt);
            }
        });

        cd2.setEditable(false);

        cd3.setEditable(false);

        cd4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cd4KeyTyped(evt);
            }
        });

        cd5.setEditable(false);

        jbtncal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtncal.setText("TOTAL");
        jbtncal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncalActionPerformed(evt);
            }
        });

        jcmbcdacc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcmbcdacc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcmbcdaccPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcmbcdacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbcdaccActionPerformed(evt);
            }
        });

        cd6.setEditable(false);
        cd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cd6ActionPerformed(evt);
            }
        });

        cd7.setEditable(false);

        jbtncd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtncd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eye-icon3.png"))); // NOI18N
        jbtncd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncd1ActionPerformed(evt);
            }
        });

        jbtntransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtntransfer.setText("TRANSFER");
        jbtntransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntransferActionPerformed(evt);
            }
        });

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(146, 162));

        jDesktopPane1.setLayer(jlblcd100, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblcd100, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblcd100, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eye-icon3.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        transferreciept.setEditable(false);
        transferreciept.setColumns(20);
        transferreciept.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        transferreciept.setForeground(java.awt.Color.darkGray);
        transferreciept.setRows(5);
        transferreciept.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(transferreciept);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("EMAIL");

        email3.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cd1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cd2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cd4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cd5))
                                                    .addComponent(cd3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtncal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcmbcdacc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cd6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cd7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtncd1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jbtntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cd1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cd2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cd3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cd4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cd5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtncal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmbcdacc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cd6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cd7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(jbtncd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CREDIT", jPanel1);

        date.setEditable(false);
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        time.setEditable(false);
        time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vermaadmin.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        setSize(new java.awt.Dimension(925, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cd6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cd6ActionPerformed

    private void db3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_db3ActionPerformed

    private void jt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt1ActionPerformed

    private void jbtnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearch1ActionPerformed
        // TODO add your handling code here:
        if(jtxtsearch1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter The Account Number");
            //jbtntotal.setEnabled(false);
        }
        else
        {
         String sql="select * from Balances2 where Acc_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,jtxtsearch1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Name");
                jt1.setText(add1);
                String add2=rs.getString("Balances");
                jt2.setText(add2);
               String add3=rs.getString("Email");
               email1.setText(add3);
                ///image
                 byte[]imagedata=rs.getBytes("Image");
                format=new ImageIcon(imagedata);
                jlblimg.setIcon(format);
                
                rs.close();
                pst.close();
                
                
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Enter correct Account Number");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
        }
        //jbtntotal.setEnabled(true);
        
    }//GEN-LAST:event_jbtnsearch1ActionPerformed

    private void jbtntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntotalActionPerformed
        // TODO add your handling code here:
        
        if(jt3.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Enter The Amount To Be Deposited");  
        }else{
        try{
            String a1=jt2.getText();
            String a2=jt3.getText();
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jt4.setText(sum1);
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
       
            
    }
        //receipt
           String AccountNo=String.format(jtxtsearch1.getText());
          String Name=String.format(jt1.getText());
           String Balance=String.format(jt2.getText());
            String Amount=String.format(jt3.getText());
             String Available_Balance=String.format(jt4.getText());
        

        //=============================================================
        int refs=1325+(int)(Math.random()*4238);
        //int ref=(refs);

        //============================================================

        Calendar timer=Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate=new SimpleDateFormat("dd:MMM:YYYY");
        Tdate.format(timer.getTime());

        //=============================================================
        depositreceipt.append("\tDepositing Reciept\n" +
            "Reference:\t" + refs +
            "\n ===============================\t"+
            "\nAccountNo:\t"+ AccountNo +
            "\nDepositer:\t"+ Name +
            "\nBalance:\t"+"Rs"+ Balance +
            "\n Depositing Amount:\t" + Amount +
            "\nLedger Balance:\t"+Available_Balance+
            "\n=================================\t"+
            "\nDate: " + Tdate.format(timer.getTime())+
            "\nTime: " + tTime.format(timer.getTime())+
             "\n\tTHANK YOU \n");
       /* jbtntotal.setEnabled(false);
        jt3.setEditable(false);
        jbtndeposit.setEnabled(true);*/
        }
    }//GEN-LAST:event_jbtntotalActionPerformed

    private void jbtndepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndepositActionPerformed
        // TODO add your handling code here:
         try{
             String value0=l1.getText();
            String value3=email1.getText();
            String add2=jt3.getText();
            String value1=jtxtsearch1.getText();
             String value2=jt4.getText();
              String sql="update Balances2 set Balances='"+value2+"' where Acc_No='"+value1+"'";
              pst=conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Amount Deposited Successfully!!");
                 ///mail
              Properties props=new Properties();
     props.put("mail.smtp.host","smtp.gmail.com");              
         props.put("mail.smtp.socketFactory.port","465");
        // props.put("mail.smtp.starttls.enable","true"); //

          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
           props.put("mail.smtp.auth","true");
            props.put("mail.smtp.port","465");
           //session code
           Session session=Session.getDefaultInstance(props,
                   new javax.mail.Authenticator() {
                 protected PasswordAuthentication getPasswordAuthentication(){
                     return new PasswordAuthentication("vermacommercialbank@gmail.com","Durgesh8788740554"); //big exception
        }                                          
         });
            try{
               Message message=new MimeMessage(session); 
               message.setFrom(new InternetAddress("rsvarma45370@gmail.com"));
               message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(value3));
               message.setSubject("Amount Deposited");
               message.setText("YOUR ACCOUNT XXXXX"+value1+" HAS BEEEN CREDITED WITH  "+add2+" RUPEES AND YOUR AVAILABLE BALANCE IS RUPEES  "+value2+"  FROM  WINDOW "+value0+" OF VERMA'S COMMERCIAL BANK");
              Transport.send(message);
               JOptionPane.showMessageDialog(null, "Email Update Sent");
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null, e); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
         ctrans();
          jtxtsearch1.setText("");
               jt1.setText("");                  
              jt2.setText("");
               jt3.setText("");
              jt4.setText("");
            email1.setText("");
              //jButton3.setEnabled(true);
       //jbtndeposit.setEnabled(false);
       jlblimg.setIcon(null);
       /*jlblpicture.setIcon(null);
       jlblcd100.setIcon(null);*/
    
    }//GEN-LAST:event_jbtndepositActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        if(db1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter The Account Number");
        }
        else{
          String sql="select * from Balances2 where Acc_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, db1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Name");
              db2.setText(add1);
                String add2=rs.getString("Balances");
           db3.setText(add2);
            String add3=rs.getString("Email");
               email2.setText(add3);
           
               
                ////image
                 byte[]imagedata=rs.getBytes("Image");
                format=new ImageIcon(imagedata);
                jlblpicture.setIcon(format);
                
                rs.close();
                pst.close();
                
                
            }else{
             JOptionPane.showMessageDialog(null, "Enter correct Account Number");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
                
                
            }catch(Exception e){
                e.printStackTrace();
                
            }
        }
        }
    }//GEN-LAST:event_searchMouseClicked

    private void jbtnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnshowActionPerformed
        // TODO add your handling code here:
        if(db4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter The Amount To Be Withdrawn");
        }
        else{
         try{
String a1=db3.getText();
String a2=db4.getText();
int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            db5.setText(sum1);

}catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
         
         //reciept
          String AccountNo=String.format(db1.getText());
          String Name=String.format(db2.getText());
           String Balance=String.format(db3.getText());
            String Amount=String.format(db4.getText());
             String Available_Balance=String.format(db5.getText());
        

        //=============================================================
        int refs=1325+(int)(Math.random()*4238);
        //int ref=(refs);

        //============================================================

        Calendar timer=Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate=new SimpleDateFormat("dd:MMM:YYYY");
        Tdate.format(timer.getTime());

        //=============================================================
        debitreciept.append("\tWithdrawal Reciept\n" +
            "Reference:\t" + refs +
            "\n ===============================\t"+
            "\nAccountNo:\t"+ AccountNo +
            "\nDebtor:\t"+ Name +
            "\nBalance:\t"+"Rs"+ Balance +
            "\nWithdrawal Amount:\t" + Amount +
            "\nLedger Balance:\t"+Available_Balance+
            "\n=================================\t"+
            "\nDate: " + Tdate.format(timer.getTime())+
            "\nTime: " + tTime.format(timer.getTime())+
             "\n\tTHANK YOU \n");
         
        }              
    }//GEN-LAST:event_jbtnshowActionPerformed

    private void jbtndb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndb1ActionPerformed
        // TODO add your handling code here:
         try{
             String ab=l1.getText();
             String aa=db4.getText();
           String a7=email2.getText();
           String a1=db1.getText(); 
           String a2=db5.getText();
           String sql="update Balances2 set Balances='"+a2+"' where Acc_No='"+a1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Withdrawn Sucessfuly!!!");
             Properties props=new Properties();
               props.put("mail.smtp.host","smtp.gmail.com");              
         props.put("mail.smtp.socketFactory.port","465");
        // props.put("mail.smtp.starttls.enable","true"); //

          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
           props.put("mail.smtp.auth","true");
            props.put("mail.smtp.port","465");
           //session code
           Session session=Session.getDefaultInstance(props,
                   new javax.mail.Authenticator() {
                 protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                     return new javax.mail.PasswordAuthentication("vermacommercialbank@gmail.com","Durgesh8788740554"); //big exception
        }                                          
         });
            try{
               Message message=new MimeMessage(session); 
               message.setFrom(new InternetAddress("rsvarma45370@gmail.com"));
               message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(a7));
               message.setSubject("Amount Deposited");
               message.setText("YOUR ACCOUNT XXXXX"+a1+" HAS BEEEN DEBITED FOR RUPEES "+aa+"  AND YOUR AVAILABLE BALANCE IS RUPEES  "+a2+"  FROM WINDOW "+ab+" OF VERMA'S COMMERCIAL BANK");
              javax.mail.Transport.send(message);
               JOptionPane.showMessageDialog(null, "Email Update Sent");
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null, e); 
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           
        }
         finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
         ctrans1();
         db1.setText("");
         db2.setText("");
         db3.setText("");
         db4.setText("");
         db5.setText("");
         email2.setText("");
         jlblpicture.setIcon(null);
    }//GEN-LAST:event_jbtndb1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        if(cd1.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Enter The Account Number"); 
        }
        else{
          String sql="select * from Balances2 where Acc_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, cd1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Name");
                cd2.setText(add1);
                String add2=rs.getString("Balances");
                cd3.setText(add2);
                 String add3=rs.getString("Email");
               email3.setText(add3);
               
                ////image
                 byte[]imagedata=rs.getBytes("Image");
                format=new ImageIcon(imagedata);
                jlblcd100.setIcon(format);
               
            
                rs.close();
                pst.close();
                
                
            }else{
             JOptionPane.showMessageDialog(null, "Enter correct Account Number");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         
        }
        finally{
            try{
                rs.close();
                pst.close();
                
                
            }catch(Exception e){
            }
        }
        }
    }//GEN-LAST:event_jLabel14MouseClicked
 public void Account(){
         try{
             String sql="select * from Balances2";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();                      ///credit acc
             while(rs.next()){
                 String account=rs.getString("Acc_No");
                 jcmbcdacc.addItem(account);
                 
             }
             
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
             
         }
         finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
     }
    private void jcmbcdaccPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcmbcdaccPopupMenuWillBecomeInvisible
try{
            String a1=(String) jcmbcdacc.getSelectedItem();
            String sql="select * from Balances2 where Acc_No=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1 ,a1);
            rs=pst.executeQuery();
            if(rs.next()){
                String add=rs.getString("Balances");
            cd6.setText(add);
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
    }                                                       
    public void TransferC(){
        try{
            String value1=(String) jcmbcdacc.getSelectedItem();
            String value2=cd7.getText();
            String sql="update Balances2 set Balances='"+value2+"' where Acc_No='"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Amount Transferred Successfully!!!");
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
    }
    public void TransferD(){
        try{
            String value1=cd1.getText();
            String value2=cd5.getText();
            String sql="update Balances2 set Balances='"+value2+"' where Acc_No='"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }  
        finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }// TODO add your handling code here:
    }//GEN-LAST:event_jcmbcdaccPopupMenuWillBecomeInvisible

    private void jbtncalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncalActionPerformed
        // TODO add your handling code here:
        if(cd4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter The Amount To Be Transfered");
        }
        else{
         try{
String a1=cd3.getText();
String a2=cd4.getText();
int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            cd5.setText(sum1);

}catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
        }
    }//GEN-LAST:event_jbtncalActionPerformed

    private void jbtncd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncd1ActionPerformed
        // TODO add your handling code here:
        try{
String a1=cd4.getText();
String a2=cd6.getText();
int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            cd7.setText(sum1);

}catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
        String AccountNo=String.format(cd1.getText());
          String Name=String.format(cd2.getText());
           String Your_Balance=String.format(cd3.getText());
            String Transfer_Amount=String.format(cd4.getText());
            String Your_Current_Balance=String.format(cd5.getText());
            String Credit_Account=String.format( (String) jcmbcdacc.getSelectedItem());
            String Creditor_Balance=String.format(cd6.getText());
            String Creditor_Current_Balance=String.format(cd7.getText());
  //=============================================================
        int refs=1325+(int)(Math.random()*4238);
        //int ref=(refs);
 //============================================================

        Calendar timer=Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate=new SimpleDateFormat("dd:MMM:YYYY");
        Tdate.format(timer.getTime());

        //=============================================================
       transferreciept.append("\tTransfer Reciept\n" +
            "Reference:\t" + refs +
            "\n ===============================\t"+
            "\nAccountNo:\t"+ AccountNo +
            "\nName:\t"+ Name +
            "\nBalance:\t"+"Rs"+Your_Balance +
            "\nTransfer Amount:\t" +Transfer_Amount +
            "\nYour Ledger Balance:\t"+Your_Current_Balance+
              "\nTransfer To:\t"+Credit_Account+
                 "\nCreditor's Balance:\t"+Creditor_Balance+
                 "\nCreditor's Ledger Balance:\t"+Creditor_Current_Balance+
            "\n=================================\t"+
            "\nDate: " + Tdate.format(timer.getTime())+
            "\nTime: " + tTime.format(timer.getTime())+
             "\n\tTHANK YOU \n");
    }//GEN-LAST:event_jbtncd1ActionPerformed

    private void jbtntransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntransferActionPerformed
        // TODO add your handling code here:
         TransferD();
        TransferC();
        ctrans2();
        ctrans3();
        String e5=l1.getText();
         String e4=email3.getText();
        String from=cd1.getText();
        String amount=cd4.getText();
        String to=(String) jcmbcdacc.getSelectedItem();
        String balance=cd5.getText();
        Properties props=new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");              
         props.put("mail.smtp.socketFactory.port","465");
        // props.put("mail.smtp.starttls.enable","true"); //

          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
           props.put("mail.smtp.auth","true");
            props.put("mail.smtp.port","465");
           //session code
           Session session=Session.getDefaultInstance(props,
                   new javax.mail.Authenticator() {
                 protected PasswordAuthentication getPasswordAuthentication(){
                     return new PasswordAuthentication("vermacommercialbank@gmail.com","Durgesh8788740554"); //big exception
        }                                          
         });
            try{
               Message message=new MimeMessage(session); 
               message.setFrom(new InternetAddress("rsvarma45370@gmail.com"));
               message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(e4));
               message.setSubject("Amount Deposited");
               message.setText("RUPEES "+amount+" HAS BEEN TRANSFERED FROM YOUR ACCOUNT XXXXX"+from+ " TO ACCOUNT XXXXX  " +to+ " FROM WINDOW "+e5+" OF VERMA'S COMMERCIAL BANK AND YOUR AVAILABLE BALANCE IS RUPEES " +balance+"");
              Transport.send(message);
               JOptionPane.showMessageDialog(null, "Email Update Sent");
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null, e); 
            } 
     cd1.setText("");
      cd2.setText("");
       cd3.setText("");
        cd4.setText("");
         cd5.setText("");
          cd6.setText("");
           cd7.setText("");
           jcmbcdacc.setSelectedItem("8296");
          email3.setText("");
          jlblcd100.setIcon(null);
     
    }//GEN-LAST:event_jbtntransferActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try
        {
            depositreceipt.print();

        }catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found",  e.getMessage());

        }
        depositreceipt.setText("");
        /*jButton3.setEnabled(false);
         jbtntotal.setEnabled(false);
         jbtndeposit.setEnabled(false);*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            debitreciept.print();

        }catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found",  e.getMessage());

        }
        debitreciept.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
           transferreciept.print();

        }catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found",  e.getMessage());

        }
         transferreciept.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
         setVisible(false);                                        
               cashierauth ob=new cashierauth();
            ob.setVisible(true);
            emplogout1();
    }//GEN-LAST:event_logoutActionPerformed

    private void jcmbcdaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbcdaccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbcdaccActionPerformed

    private void jtxtsearch1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearch1KeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtxtsearch1KeyTyped

    private void db1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_db1KeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_db1KeyTyped

    private void cd1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cd1KeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cd1KeyTyped

    private void cd4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cd4KeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cd4KeyTyped

    private void db4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_db4KeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_db4KeyTyped

    private void jt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt3KeyTyped
        // TODO add your handling code here:
        char iNumber=evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
            ||(iNumber == KeyEvent.VK_BACK_SPACE)
            ||(iNumber == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jt3KeyTyped

    private void jtxtsearch1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearch1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             String sql="select * from Balances2 where Acc_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,jtxtsearch1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Name");
                jt1.setText(add1);
                String add2=rs.getString("Balances");
                jt2.setText(add2);
               String add3=rs.getString("Email");
               email1.setText(add3);
                ///image
                 byte[]imagedata=rs.getBytes("Image");
                format=new ImageIcon(imagedata);
                jlblimg.setIcon(format);
       rs.close();
                pst.close();
    }
            else
            {
             JOptionPane.showMessageDialog(null, "Enter correct Account Number");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
        }
        jbtntotal.setEnabled(true);
    }//GEN-LAST:event_jtxtsearch1KeyPressed

    private void db1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_db1KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             String sql="select * from Balances2 where Acc_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, db1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Name");
              db2.setText(add1);
                String add2=rs.getString("Balances");
           db3.setText(add2);
            String add3=rs.getString("Email");
               email2.setText(add3);
   ////image
                 byte[]imagedata=rs.getBytes("Image");
                format=new ImageIcon(imagedata);
                jlblpicture.setIcon(format);
        rs.close();
                pst.close();
    }else{
             JOptionPane.showMessageDialog(null, "Enter correct Account Number");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
      }catch(Exception e){
                e.printStackTrace();
                
            }
        }  
         }
    }//GEN-LAST:event_db1KeyPressed

    private void cd1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cd1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            String sql="select * from Balances2 where Acc_No=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, cd1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Name");
                cd2.setText(add1);
                String add2=rs.getString("Balances");
                cd3.setText(add2);
                 String add3=rs.getString("Email");
               email3.setText(add3);
   ////image
                 byte[]imagedata=rs.getBytes("Image");
                format=new ImageIcon(imagedata);
                jlblcd100.setIcon(format);
  rs.close();
                pst.close();
 }else{
             JOptionPane.showMessageDialog(null, "Enter correct Account Number");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         
        }
        finally{
            try{
                rs.close();
                pst.close();
}catch(Exception e){
            }
        }
        } 
    }//GEN-LAST:event_cd1KeyPressed

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
            java.util.logging.Logger.getLogger(cashier_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cashier_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cashier_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cashier_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashier_portal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cd1;
    private javax.swing.JTextField cd2;
    private javax.swing.JTextField cd3;
    private javax.swing.JTextField cd4;
    private javax.swing.JTextField cd5;
    private javax.swing.JTextField cd6;
    private javax.swing.JTextField cd7;
    private javax.swing.JTextField date;
    private javax.swing.JTextField db1;
    private javax.swing.JTextField db2;
    private javax.swing.JTextField db3;
    private javax.swing.JTextField db4;
    private javax.swing.JTextField db5;
    private javax.swing.JTextArea debitreciept;
    private javax.swing.JTextArea depositreceipt;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField email3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtncal;
    private javax.swing.JButton jbtncd1;
    private javax.swing.JButton jbtndb1;
    private javax.swing.JButton jbtndeposit;
    private javax.swing.JButton jbtnsearch1;
    private javax.swing.JButton jbtnshow;
    private javax.swing.JButton jbtntotal;
    private javax.swing.JButton jbtntransfer;
    private javax.swing.JComboBox<String> jcmbcdacc;
    private javax.swing.JLabel jlblcd100;
    private javax.swing.JLabel jlblimg;
    private javax.swing.JLabel jlblpicture;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt4;
    private javax.swing.JTextField jtxtsearch1;
    public static javax.swing.JLabel l1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel search;
    private javax.swing.JTextField time;
    private javax.swing.JTextArea transferreciept;
    // End of variables declaration//GEN-END:variables
private ImageIcon format=null;

String filename=null;
int s=0;
byte[] person_image=null;
 private void Transfer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
