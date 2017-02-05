package calculadordecalorias;

import static calculadordecalorias.AddContact.lc;
import javax.swing.ImageIcon;

/**
 *
 * @author Iván Fuentes; (044) 981 125 1397
 */
public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
        try {
            setIconImage(new ImageIcon(getClass().getResource("../icono.png")).getImage());
        } catch (Exception ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        search = new javax.swing.JButton();
        help = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculador de Calorías");
        setLocation(new java.awt.Point(300, 200));
        setMinimumSize(new java.awt.Dimension(454, 324));
        setPreferredSize(new java.awt.Dimension(454, 324));
        setResizable(false);
        getContentPane().setLayout(null);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455685174_plus_16.png"))); // NOI18N
        add.setText("  Agregar registro     ");
        add.setToolTipText("Agregar registro");
        add.setName(""); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(10, 10, 240, 73);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455685184_search_16.png"))); // NOI18N
        search.setText("  Consulta de registros");
        search.setToolTipText("Consulta de registros");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(10, 90, 240, 73);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455685906_info_16.png"))); // NOI18N
        help.setText("  Acerca de...         ");
        help.setToolTipText("Acerca de...");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        getContentPane().add(help);
        help.setBounds(10, 170, 240, 73);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        AddContact open = new AddContact(false);
        open.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        Data t = new Data();
        t.setVisible(true);
        t.CargarInterfaz();
        
        Contact c;
        
        for (int i=0; i<lc.size(); i++) {
            c = (Contact)lc.get(i);
            t.MostrarDatos(c);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        About open = new About();
        open.setVisible(true);
    }//GEN-LAST:event_helpActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
