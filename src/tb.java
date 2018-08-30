


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
import java.text.*;
import java.awt.print.*;
import java.sql.Time;

import javafx.print.Printer;
import javax.swing.JTextArea;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PLAYBOLD!!
 */
public class tb extends javax.swing.JFrame {
Connection conn;
    ResultSet rs;
    PreparedStatement pst;
 
    /**
     * Creates new form tb
     */
    public tb() {
        super("Your Transactions");
       
        initComponents();
        conn=jconnect.ConnecrDb();
        setResizable(false);
        date();
        time();
       
/*table.setBackground(new Color(0,0,0,0));
((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
table.setGridColor(Color.WHITE);
        table.setForeground(Color.WHITE);
        jScrollPane2.setBackground(new Color(0,0,0,0));
        jScrollPane2.setOpaque(false);
          table.setOpaque(false);
          ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
          jScrollPane2.getViewport().setOpaque(false);
           table.setShowGrid(true);
           
           //columnheader
           table.getTableHeader().setOpaque(false);
           table.getTableHeader().setBackground(new Color(0,0,0,30));
           table.getTableHeader().setForeground(Color.white);
           jScrollPane2.setBackground(new Color(0,0,0,30));
           JTableHeader
                   head=table.getTableHeader();
           head.setBackground(Color.yellow);
           head.setForeground(Color.red);*/
           
       
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
              time1.setText("" +ttime);
          }
      }).start();
              
          }
    /* public void minitable(){
      
       try{
           String sql="select  Date,Time,Credit,Debit,creditor as 'Particulars' from Transactions where Acc_no ORDER BY ROWID DESC LIMIT 5";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           table.setModel(DbUtils.resultSetToTableModel(rs));
   }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);              //customer list
       }finally{
           try{
               rs.close();
               pst.close();
               
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
     }*/
    public void statementprint(){
        int rows=table.getRowCount();
                for(int row = 0; row<rows; row++)
               {
    
    Date dateno = (Date)table.getValueAt(row,1);
    Time time=(Time)table.getValueAt(row,2);
    String credit = (String)table.getValueAt(row,3);
    String debit = (String)table.getValueAt(row,4);
    String part=(String)table.getValueAt(row,5);
            String currdate=String.format(date.getText());
            String currtime=String.format(time1.getText());
            String dateno1=String.valueOf(dateno);
            String daten=String.valueOf(time);//time
            String cd=String.valueOf(credit);
            String db=String.valueOf(debit);
            String crd=String.valueOf(part);
            String balance=new Integer(bal2.getText()).toString();
  
  
 
  
           
        String billbody=("\n\t\tVERMA'S COMMERCIAL BANK\n" +
  "\n==============================================================\t"+
            "\t\t          VASAI WEST MAIN BRANCH\n"+
               
            "DATE: "+currdate+"\t\t   TIME: "+currtime+
            "\n=======================================================\t"+
            "\nDATE\t\t\tTIME\t\t\tCREDIT\t\t\tDEBIT\t\t\tPARTICULARS"+
            "\n=======================================================\t"+
            "\n=======================================================\t"+
            "\n YOUR AVAILABLE BALANCE IS\t\t\tRs. "+balance+"/-"+
            "\n\t        THANK YOU \n");
        summarytext.setText(billbody);
        summarybody.append("\n"+dateno1+"\t\t\t"+daten+"\t\t\t"+cd+"\t\t\t"+db+"\t\t\t"+crd);
        summarytext.insert(summarybody.getText(),223);

    }
  }
     /*public void print(){
  JTextArea ta=new JTextArea();
  ta.setLineWrap(true);
  ta.setWrapStyleWord(true);
  JScrollPane scroll=new JScrollPane(ta);
  ta.append("This Is First Line Of Code\n");
  ta.append("Line Two!\n");
  }*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        year = new com.toedter.calendar.JYearChooser();
        month = new com.toedter.calendar.JMonthChooser();
        byyear = new javax.swing.JButton();
        bymonth = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        search1 = new javax.swing.JButton();
        search3 = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        time1 = new javax.swing.JTextField();
        bosdk = new javax.swing.JTextField();
        bal2 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        summarytext = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        summarybody = new javax.swing.JTextArea();
        print = new javax.swing.JButton();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Credit", "Debit", "Particulars"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        jButton1.setText("CUSTOM SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        year.setEnabled(false);

        month.setEnabled(false);

        byyear.setText("BY YEAR");
        byyear.setEnabled(false);
        byyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byyearActionPerformed(evt);
            }
        });

        bymonth.setText("BY MONTH");
        bymonth.setEnabled(false);
        bymonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bymonthActionPerformed(evt);
            }
        });

        jButton4.setText("BY DATE");
        jButton4.setEnabled(false);

        search1.setText("search2");
        search1.setEnabled(false);

        search3.setText("search");
        search3.setEnabled(false);

        date.setEditable(false);

        time1.setEditable(false);

        bal2.setEditable(false);

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        summarytext.setEditable(false);
        summarytext.setColumns(20);
        summarytext.setRows(5);
        jScrollPane1.setViewportView(summarytext);

        summarybody.setEditable(false);
        summarybody.setColumns(20);
        summarybody.setRows(5);
        jScrollPane3.setViewportView(summarybody);

        print.setText("printw");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        show.setText("show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(time1)
                                .addComponent(date)
                                .addComponent(bosdk, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bymonth)
                                .addComponent(byyear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(28, 28, 28)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(search3)
                                                .addComponent(search1))))
                                    .addGap(67, 67, 67))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGap(50, 50, 50)
                            .addComponent(show)
                            .addGap(51, 51, 51)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bal2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGap(232, 232, 232))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(print)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(byyear)
                        .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(search1)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bymonth)
                    .addComponent(search3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(bosdk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show)))
                .addGap(20, 20, 20)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(669, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        byyear.setEnabled(true);
        bymonth.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void byyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byyearActionPerformed
        // TODO add your handling code here:
        year.setEnabled(true);
        search1.setEnabled(true);
    }//GEN-LAST:event_byyearActionPerformed

    private void bymonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bymonthActionPerformed
        // TODO add your handling code here:
        month.setEnabled(true);
        search3.setEnabled(true);
        year.setEnabled(false);
        byyear.setEnabled(false);
        search1.setEnabled(false);
        
    }//GEN-LAST:event_bymonthActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
         String ac=bosdk.getText();
       try{
           String sql="select  Date,Time,Credit,Debit,creditor as 'Particulars' from Transactions where Acc_no='"+ac+"' ORDER BY ROWID DESC LIMIT 5";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           table.setModel(DbUtils.resultSetToTableModel(rs));
    
   }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);              //customer list
       }finally{
           try{
               rs.close();
               pst.close();
               
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
       
       
  
    }//GEN-LAST:event_searchActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
     statementprint();
         try
        {
          summarytext.print();

        }catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found",  e);

        }
          
    }//GEN-LAST:event_printActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
         String ac=bosdk.getText();
        
        try{
            String sql1="select Balances from Balances2 where Acc_No='"+ac+"'";
       pst=conn.prepareStatement(sql1);
           
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Balances");
                bal2.setText(add1);
                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "enter correct account number");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        finally{
           try{
               rs.close();
               pst.close();
               
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bal2;
    private javax.swing.JTextField bosdk;
    private javax.swing.JButton bymonth;
    private javax.swing.JButton byyear;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JMonthChooser month;
    private javax.swing.JButton print;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JButton search3;
    private javax.swing.JButton show;
    private javax.swing.JTextArea summarybody;
    private javax.swing.JTextArea summarytext;
    private javax.swing.JTable table;
    private javax.swing.JTextField time1;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}
