/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beverage_machine;

/**
 *
 * @author rezay
 */
public class CoffeeMaker extends javax.swing.JFrame {

    /**
     * Creates new form CoffeeMaker
     */
    public CoffeeMaker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        coffeeRad = new javax.swing.JRadioButton();
        teaRad = new javax.swing.JRadioButton();
        hotWaterRad = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        creamChk = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        vanilaChk = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        sugarChk = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        subtotalTxf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        taxTxf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totalTxf = new javax.swing.JTextField();
        dispenserBt = new javax.swing.JButton();
        resetBt = new javax.swing.JButton();
        exitBt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bigRad = new javax.swing.JRadioButton();
        medRad = new javax.swing.JRadioButton();
        smallRad = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 14)); // NOI18N
        jLabel1.setText("     Welcome to De Anza Coffee Machine");

        coffeeRad.setText("Coffee         $2.25");
        coffeeRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffeeRadActionPerformed(evt);
            }
        });

        teaRad.setText("Tea             $1.50");
        teaRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teaRadActionPerformed(evt);
            }
        });

        hotWaterRad.setText("Hot Water    $0.75");
        hotWaterRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotWaterRadActionPerformed(evt);
            }
        });

        jLabel2.setText(" ");

        creamChk.setText("Cream         $0.35");
        creamChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creamChkActionPerformed(evt);
            }
        });

        jLabel3.setText(" ");

        vanilaChk.setText("Vanila          $0.20");

        jLabel4.setText(" ");

        sugarChk.setText(" Sugar         $0.40");

        jLabel5.setText("Sub Total   $");

        subtotalTxf.setText(" ");

        jLabel6.setText("Tax   $");

        taxTxf.setText(" ");

        jLabel7.setText("Total  $");

        totalTxf.setText(" ");

        dispenserBt.setText("Dispenser");
        dispenserBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispenserBtActionPerformed(evt);
            }
        });

        resetBt.setText("Reset");
        resetBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtActionPerformed(evt);
            }
        });

        exitBt.setText("Exit");
        exitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtActionPerformed(evt);
            }
        });

        jLabel8.setText("Select the Beverage");

        jLabel9.setText("Add your favorite Condiment");

        bigRad.setText("Big size");
        bigRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigRadActionPerformed(evt);
            }
        });

        medRad.setText("Medium size");
        medRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medRadActionPerformed(evt);
            }
        });

        smallRad.setText("Small sizie");
        smallRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallRadActionPerformed(evt);
            }
        });

        jLabel10.setText("Select Cup Size");

        jLabel11.setText("Calculation of your Bill");

        jLabel12.setText("Attention: The cup size will not affect on your bill, Enjoy it");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medRad)
                    .addComponent(bigRad)
                    .addComponent(smallRad)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(coffeeRad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teaRad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hotWaterRad, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vanilaChk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creamChk))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sugarChk, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resetBt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(taxTxf)
                                .addComponent(subtotalTxf)
                                .addComponent(totalTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exitBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(dispenserBt)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(creamChk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(vanilaChk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sugarChk)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(coffeeRad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teaRad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hotWaterRad)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotalTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(taxTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(totalTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bigRad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medRad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smallRad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dispenserBt)
                    .addComponent(resetBt)
                    .addComponent(exitBt))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void creamChkActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void coffeeRadActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (coffeeRad.isSelected()) {
            teaRad.setSelected(false);
            hotWaterRad.setSelected(false);
        }        // TODO add your handling code here:
    }                                         

    private void teaRadActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if (teaRad.isSelected()) {
            coffeeRad.setSelected(false);
            hotWaterRad.setSelected(false);
        }


    }                                      

    private void hotWaterRadActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

        if (hotWaterRad.isSelected()) {
            coffeeRad.setSelected(false);
            teaRad.setSelected(false);
        }
    }                                           

    private void dispenserBtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

        final double TAX_RATE = 0.12;

        double tax;
        double total;
        double subtotal = 0;

        if (coffeeRad.isSelected()) {
            subtotal = subtotal + 2.25;
        } else if (teaRad.isSelected()) {
            subtotal = subtotal + 1.50;
        } else if (hotWaterRad.isSelected()) {
            subtotal = subtotal + 0.75;

        }

        if (creamChk.isSelected()) {
            subtotal = subtotal + 0.35;

            subtotalTxf.setText(Double.toString(subtotal));
            subtotal = Double.parseDouble(subtotalTxf.getText());
            tax = subtotal * TAX_RATE;
            total = tax + subtotal;
            taxTxf.setText(Double.toString(tax));
            totalTxf.setText(Double.toString(total));

        }
        if (vanilaChk.isSelected()) {
            subtotal = subtotal + 0.20;

            subtotalTxf.setText(Double.toString(subtotal));
            subtotal = Double.parseDouble(subtotalTxf.getText());
            tax = subtotal * TAX_RATE;
            total = tax + subtotal;
            taxTxf.setText(Double.toString(tax));
            totalTxf.setText(Double.toString(total));

        }
        if (sugarChk.isSelected()) {
            subtotal = subtotal + 0.40;
            
            subtotalTxf.setText(Double.toString(subtotal));
            subtotal = Double.parseDouble(subtotalTxf.getText());
            tax = subtotal * TAX_RATE;
            total = tax + subtotal;
            taxTxf.setText(Double.toString(tax));
            totalTxf.setText(Double.toString(total));
        }
    }                                           

    private void exitBtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        System.exit(0);
    }                                      

    private void resetBtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:

        bigRad.setSelected(false);
        medRad.setSelected(false);
        smallRad.setSelected(false);

        coffeeRad.setSelected(false);
        teaRad.setSelected(false);
        hotWaterRad.setSelected(false);

        creamChk.setSelected(false);
        vanilaChk.setSelected(false);
        sugarChk.setSelected(false);

        subtotalTxf.setText(" ");
        taxTxf.setText(" ");
        totalTxf.setText(" ");


    }                                       

    private void bigRadActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if (bigRad.isSelected()) {
            smallRad.setSelected(false);
            medRad.setSelected(false);
        }

    }                                      

    private void medRadActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
         if (medRad.isSelected()) {
            smallRad.setSelected(false);
            bigRad.setSelected(false);
        }
        
    }                                      

    private void smallRadActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
          if (smallRad.isSelected()) {
            smallRad.setSelected(false);
            smallRad.setSelected(false);
        }
    }                                        

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
            java.util.logging.Logger.getLogger(CoffeeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoffeeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoffeeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoffeeMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoffeeMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton bigRad;
    private javax.swing.JRadioButton coffeeRad;
    private javax.swing.JCheckBox creamChk;
    private javax.swing.JButton dispenserBt;
    private javax.swing.JButton exitBt;
    private javax.swing.JRadioButton hotWaterRad;
    private javax.swing.JFrame jFrame1;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton medRad;
    private javax.swing.JButton resetBt;
    private javax.swing.JRadioButton smallRad;
    private javax.swing.JTextField subtotalTxf;
    private javax.swing.JCheckBox sugarChk;
    private javax.swing.JTextField taxTxf;
    private javax.swing.JRadioButton teaRad;
    private javax.swing.JTextField totalTxf;
    private javax.swing.JCheckBox vanilaChk;
    // End of variables declaration                   
}
