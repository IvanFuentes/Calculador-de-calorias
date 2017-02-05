package calculadordecalorias;

/**
 *
 * @author Iván Fuentes
 */
import static calculadordecalorias.AddContact.lc;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Iván Fuentes; (044) 981 125 1397
 */
public class Data extends javax.swing.JFrame {

    private DefaultTableModel model;
    int con = 0;

    public Data() {
        initComponents();
        CargarInterfaz();
        try {
            setIconImage(new ImageIcon(getClass().getResource("../icono.png")).getImage());
        } catch (Exception ex) {
        }
    }

    public void CargarInterfaz() {
        String z[][] = {};
        String col[] = {"Nombre", "Género", "Edad", "Estatura", "Peso", "I.M.C.", "G.E.B.", "G.E.T.", "Patología"};
        model = new DefaultTableModel(z, col);
        consultas.setModel(model);
    }

    public void MostrarDatos(Contact c) {
        model.insertRow(con, new Object[]{});
        model.setValueAt(c.getNombre(), con, 0);
        model.setValueAt(c.getGenero(), con, 1);
        model.setValueAt(c.getEdad(), con, 2);
        model.setValueAt(c.getEstatura(), con, 3);
        model.setValueAt(c.getPeso(), con, 4);
        model.setValueAt(c.getImc(), con, 5);
        model.setValueAt(c.getGeb(), con, 6);
        model.setValueAt(c.getEaf(), con, 7);
        model.setValueAt(c.getPatologia(), con, 8);
        con++;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultas = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de registros");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455862214_search_16.png"))); // NOI18N
        jLabel1.setText("Consulta de registros");

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455685001_plus_16.png"))); // NOI18N
        add.setText("Agregar");
        add.setToolTipText("Agregar nuevo paciente");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455685013_pencil_16.png"))); // NOI18N
        edit.setText("Editar");
        edit.setToolTipText("Editar paciente seleccionado");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455685006_delete_16.png"))); // NOI18N
        delete.setText("Eliminar");
        delete.setToolTipText("Eliminar paciente seleccionado");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Género", "Edad", "Estatura", "Peso", "I.M.C.", "G.E.B.", "G.E.T.", "Patología"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(consultas);

        back.setText("Cerrar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460020280_excel.png"))); // NOI18N
        jButton1.setText("Exportar");
        jButton1.setToolTipText("Capturar datos en un documento Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460020237_pizza.png"))); // NOI18N
        jButton2.setText("Raciones");
        jButton2.setToolTipText("Indicar las raciones del paciente seleccionado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(edit)
                    .addComponent(delete)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        this.dispose();
        AddContact open = new AddContact(true);
        open.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int filaBorrar = consultas.getSelectedRow();
        if (filaBorrar >= 0) {
            model.removeRow(filaBorrar);
            lc.remove(filaBorrar);
        } else {
            JOptionPane.showMessageDialog(null, "Tabla vacía o sin datos seleccionados.");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int fila = consultas.getSelectedRow();

        if (fila >= 0) {
            String nombre = (String) consultas.getValueAt(fila, 0);
            String genero = (String) consultas.getValueAt(fila, 1);
            String edad = (String) consultas.getValueAt(fila, 2);
            String estatura = (String) consultas.getValueAt(fila, 3);
            String peso = (String) consultas.getValueAt(fila, 4);
            String imc = (String) consultas.getValueAt(fila, 5);
            String geb = (String) consultas.getValueAt(fila, 6);
            String eaf = (String) consultas.getValueAt(fila, 7);
            String patologia = (String) consultas.getValueAt(fila, 8);
            new EditContact(fila, nombre, genero, edad, estatura, peso, geb, imc, eaf, patologia).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Tabla vacía o sin datos seleccionados.");
        }
    }//GEN-LAST:event_editActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = consultas.getSelectedRow();

        if (fila >= 0) {
            String nombre = (String) consultas.getValueAt(fila, 0);
            String eaf = (String) consultas.getValueAt(fila, 7);
            String patologia = (String) consultas.getValueAt(fila, 8);
            new Food(nombre, eaf, patologia).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Tabla vacía o sin datos seleccionados.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            JFileChooser selector = new JFileChooser();
            selector.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
            selector.showSaveDialog(this);
            String r = selector.getSelectedFile().getAbsolutePath();

            int cantFila = consultas.getRowCount();
            int cantColumna = consultas.getColumnCount();

            String ruta = r + ".xls";
            File archivoXLS = new File(ruta);

            if (archivoXLS.exists()) {
                archivoXLS.delete();
            }
            archivoXLS.createNewFile();
            Workbook libro = new HSSFWorkbook();
            FileOutputStream archivo = new FileOutputStream(archivoXLS);
            Sheet hoja = libro.createSheet("Datos Pacientes");

            for (int f = -1; f < cantFila; f++) {
                Row fila = hoja.createRow(f + 1);
                for (int c = 0; c < cantColumna; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(consultas.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(consultas.getValueAt(f, c)));
                    }
                }
            }
            libro.write(archivo);
            archivo.close();
            JOptionPane.showMessageDialog(null, "Documento exportado con éxito.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Los datos no fueron exportados.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Data.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTable consultas;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
