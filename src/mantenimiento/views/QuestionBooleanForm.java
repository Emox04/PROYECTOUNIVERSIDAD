/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento.views;

/**
 *
 * @author emaue
 */
public class QuestionBooleanForm extends javax.swing.JDialog {

    /**
     * Creates new form QuestionBoolean
     */
    public QuestionBooleanForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        bg_answer = new javax.swing.ButtonGroup();
        lb_booleanQuestion = new javax.swing.JLabel();
        lb_corretAnswer = new javax.swing.JLabel();
        rb_true = new javax.swing.JRadioButton();
        rb_false = new javax.swing.JRadioButton();
        bt_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lb_booleanQuestion.setText("Pregunta Booleana");

        lb_corretAnswer.setText("La respuesta correcta es:");

        bg_answer.add(rb_true);
        rb_true.setText("Verdadero");

        rb_false.setText("Falso");

        bt_save.setText("Guardar");
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_booleanQuestion)
                            .addComponent(lb_corretAnswer)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_true)
                                .addGap(18, 18, 18)
                                .addComponent(rb_false))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(bt_save)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_booleanQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_corretAnswer)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_true)
                    .addComponent(rb_false))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_save)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        String answer = "";
        
        if (rb_true.isSelected()) {
            answer = "Verdadero";
        } else if (rb_false.isSelected()) {
            answer = "Falso"; 
        }
        this.dispose();
    }//GEN-LAST:event_bt_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_answer;
    private javax.swing.JButton bt_save;
    private javax.swing.JLabel lb_booleanQuestion;
    private javax.swing.JLabel lb_corretAnswer;
    private javax.swing.JRadioButton rb_false;
    private javax.swing.JRadioButton rb_true;
    // End of variables declaration//GEN-END:variables
}
