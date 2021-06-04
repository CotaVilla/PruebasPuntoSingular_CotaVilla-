/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.*;

/**
 *
 * @author Edy
 */
/*
4.-Realizar un método que reciba un parámetro genérico (object)
y dependiendo del tipo de objeto imprimir
*/
public class Descriptor extends javax.swing.JFrame {
    Indentificador a = new Indentificador();

    /**
     * Creates new form Descriptor
     */
    public Descriptor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tboxTipo = new javax.swing.JTextField();
        lbObjetoIdentificado = new javax.swing.JLabel();
        btnString = new javax.swing.JButton();
        btnByte = new javax.swing.JButton();
        btnShort = new javax.swing.JButton();
        btnInterger = new javax.swing.JButton();
        btnLong = new javax.swing.JButton();
        btnFloat = new javax.swing.JButton();
        btnDouble = new javax.swing.JButton();
        btnArrayList = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnLinkedList = new javax.swing.JButton();
        btnStack = new javax.swing.JButton();
        btnPato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbObjetoIdentificado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tboxTipo.setEditable(false);
        tboxTipo.setText("-");

        lbObjetoIdentificado.setText("Objeto ingresado es:");

        btnString.setText("String");
        btnString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStringActionPerformed(evt);
            }
        });

        btnByte.setText("Byte");
        btnByte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByteActionPerformed(evt);
            }
        });

        btnShort.setText("Short");
        btnShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShortActionPerformed(evt);
            }
        });

        btnInterger.setText("Interger");
        btnInterger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntergerActionPerformed(evt);
            }
        });

        btnLong.setText("Long");
        btnLong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLongActionPerformed(evt);
            }
        });

        btnFloat.setText("Float");
        btnFloat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloatActionPerformed(evt);
            }
        });

        btnDouble.setText("Double");
        btnDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoubleActionPerformed(evt);
            }
        });

        btnArrayList.setText("ArrayList");
        btnArrayList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrayListActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnLinkedList.setText("LinkedList");
        btnLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkedListActionPerformed(evt);
            }
        });

        btnStack.setText("Stack");
        btnStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStackActionPerformed(evt);
            }
        });

        btnPato.setText("Pato");
        btnPato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatoActionPerformed(evt);
            }
        });

        jLabel1.setText("Objetos a ingresar");

        lbObjetoIdentificado1.setText("Form para probar el metodo de la clase identificador.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnInterger, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(btnByte, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(btnShort, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(btnLong, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(btnFloat, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnStack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnArrayList, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnLinkedList, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(45, 45, 45))))
                    .addComponent(lbObjetoIdentificado)
                    .addComponent(lbObjetoIdentificado1)
                    .addComponent(jLabel1))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbObjetoIdentificado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbObjetoIdentificado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnString)
                    .addComponent(btnDouble))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnByte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInterger)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLong))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArrayList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLinkedList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFloat)
                    .addComponent(btnPato))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Lista de eventos donde al hacer clic en los botones se usa el 
    //metodo para ver que tipo de objetos son
    private void btnStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStringActionPerformed
        //Formato
        String b = "";//Objeto a ingresar
        tboxTipo.setText(a.indentificar(b));//Se coloca le resultado del metodo
    }//GEN-LAST:event_btnStringActionPerformed

    private void btnByteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByteActionPerformed
        byte b = 123;
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnByteActionPerformed

    private void btnShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShortActionPerformed
        short b = 10000;
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnShortActionPerformed

    private void btnIntergerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntergerActionPerformed
        int  b = 100000;
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnIntergerActionPerformed

    private void btnLongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLongActionPerformed
        long  b = 100000;
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnLongActionPerformed

    private void btnFloatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloatActionPerformed
        float  b = (float)10.21;
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnFloatActionPerformed

    private void btnDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoubleActionPerformed
        double  b = 12.24;
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnDoubleActionPerformed

    private void btnArrayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrayListActionPerformed
        ArrayList<Integer> b = new ArrayList();
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnArrayListActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        List<Integer> b = new ArrayList();
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnListActionPerformed

    private void btnLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkedListActionPerformed
        LinkedList<Integer> b = new LinkedList();
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnLinkedListActionPerformed

    private void btnStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStackActionPerformed
        Stack<Integer> b = new Stack();
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnStackActionPerformed

    private void btnPatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatoActionPerformed
        Pato b = new Pato();
        tboxTipo.setText(a.indentificar(b));
    }//GEN-LAST:event_btnPatoActionPerformed

   
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
            java.util.logging.Logger.getLogger(Descriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descriptor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArrayList;
    private javax.swing.JButton btnByte;
    private javax.swing.JButton btnDouble;
    private javax.swing.JButton btnFloat;
    private javax.swing.JButton btnInterger;
    private javax.swing.JButton btnLinkedList;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnLong;
    private javax.swing.JButton btnPato;
    private javax.swing.JButton btnShort;
    private javax.swing.JButton btnStack;
    private javax.swing.JButton btnString;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbObjetoIdentificado;
    private javax.swing.JLabel lbObjetoIdentificado1;
    private javax.swing.JTextField tboxTipo;
    // End of variables declaration//GEN-END:variables
}
