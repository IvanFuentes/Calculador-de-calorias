package calculadordecalorias;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
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
 * @author Iván Fuentes
 */
public class Food extends javax.swing.JFrame {
    
    private String FrS;
    private String VeS;
    private String LeS;
    private String CeS;
    private String AlS;
    private String AcS;
    private String LaS;
    private String TS;
    
    public Food(String nombre, String eaf, String patologia) {
        initComponents();
        iniciarComponentes(nombre, eaf, patologia);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../icono.png")).getImage());
        } catch (Exception ex) {
        }
    }
    
    public void iniciarComponentes(String nombre, String eaf, String patologia){
        DecimalFormat numberFormat = new DecimalFormat("######.#");
        
        this.jNombreF.setText(nombre);
        this.jEafF.setText("Kilocalorías: " + eaf);
        this.jPatolog.setText("Patología: " + patologia);
        
        Double CalcHc, CalcPr, CalcGr, eaf1;
        String CalcHcX = "", CalcPrX = "", CalcGrX = "", eafX;
        
        eafX = eaf;
        eaf1 = Double.parseDouble(eafX);
        CalcHc = (((eaf1 * 50) / 100) / 4);
        CalcPr = (((eaf1 * 20) / 100) / 4);
        CalcGr = (((eaf1 * 30) / 100) / 9);
        
        CalcHcX = String.valueOf(numberFormat.format(CalcHc));
        CalcPrX = String.valueOf(numberFormat.format(CalcPr));
        CalcGrX = String.valueOf(numberFormat.format(CalcGr));
        
        DefaultTableModel modeloFood0 = (DefaultTableModel) jTa0.getModel();
        modeloFood0.addRow(new Object[]{"Nombre: " + nombre});
        modeloFood0.addRow(new Object[]{"Kilocalorías: " + eaf});
        modeloFood0.addRow(new Object[]{"Patología(s): " + patologia});
        modeloFood0.addRow(new Object[]{"Hc (50%): " + CalcHcX});
        modeloFood0.addRow(new Object[]{"Pr (20%): " + CalcPrX});
        modeloFood0.addRow(new Object[]{"Gr (30%): " + CalcGrX});
        
        this.jLabelHc.setText("Hc: 50% = " + CalcHcX);
        this.jLabelPr.setText("Pr: 20% = " + CalcPrX);
        this.jLabelGr.setText("Gr: 30% = " + CalcGrX);
        
        // Valores para columna "Proteína (Pr)"
        Double P1, P2, P3, P4, P5, P6, P7, P8, SubP;
        String P1S = "", P2S = "", P3S = "", P4S = "", P5S = "", P6S = "", P7S = "", P8S = "";
        SubP = (CalcPr / 28);
        P1 = (SubP * 0);
        P2 = (SubP * 2);
        P3 = (SubP * 8);
        P4 = (SubP * 2);
        P5 = (SubP * 7);
        P6 = (SubP * 0);
        P7 = (SubP * 9);
        P8 = (P1 + P2 + P3 + P4 + P5 + P6 + P7);
        P1S = String.valueOf(numberFormat.format(P1));
        P2S = String.valueOf(numberFormat.format(P2));
        P3S = String.valueOf(numberFormat.format(P3));
        P4S = String.valueOf(numberFormat.format(P4));
        P5S = String.valueOf(numberFormat.format(P5));
        P6S = String.valueOf(numberFormat.format(P6));
        P7S = String.valueOf(numberFormat.format(P7));
        P8S = String.valueOf(numberFormat.format(P8));
        
        // Valores para columna "Lípidos (Gr)"
        Double L1, L2, L3, L4, L5, L6, L7, L8, SubL;
        String L1S = "", L2S = "", L3S = "", L4S = "", L5S = "", L6S = "", L7S = "", L8S = "";
        SubL = (CalcGr / 9);
        L1 = (SubL * 0);
        L2 = (SubL * 0);
        L3 = (SubL * 1);
        L4 = (SubL * 0);
        L5 = (SubL * 1);
        L6 = (SubL * 5);
        L7 = (SubL * 2);
        L8 = (L1 + L2 + L3 + L4 + L5 + L6 + L7);
        L1S = String.valueOf(numberFormat.format(L1));
        L2S = String.valueOf(numberFormat.format(L2));
        L3S = String.valueOf(numberFormat.format(L3));
        L4S = String.valueOf(numberFormat.format(L4));
        L5S = String.valueOf(numberFormat.format(L5));
        L6S = String.valueOf(numberFormat.format(L6));
        L7S = String.valueOf(numberFormat.format(L7));
        L8S = String.valueOf(numberFormat.format(L8));
        
        // Valores para columna "Hidratos de Carbono (Hc)"
        Double H1, H2, H3, H4, H5, H6, H7, H8, SubH;
        String H1S = "", H2S = "", H3S = "", H4S = "", H5S = "", H6S = "", H7S = "", H8S = "";
        SubH = (CalcHc / 66);
        H1 = (SubH * 15);
        H2 = (SubH * 4);
        H3 = (SubH * 20);
        H4 = (SubH * 15);
        H5 = (SubH * 0);
        H6 = (SubH * 0);
        H7 = (SubH * 12);
        H8 = (H1 + H2 + H3 + H4 + H5 + H6 + H7);
        H1S = String.valueOf(numberFormat.format(H1));
        H2S = String.valueOf(numberFormat.format(H2));
        H3S = String.valueOf(numberFormat.format(H3));
        H4S = String.valueOf(numberFormat.format(H4));
        H5S = String.valueOf(numberFormat.format(H5));
        H6S = String.valueOf(numberFormat.format(H6));
        H7S = String.valueOf(numberFormat.format(H7));
        H8S = String.valueOf(numberFormat.format(H8));
        
        // Determinación de raciones
        Double FrX, VeX, LeX, CeX, AlX, AcX, LaX, TX;
        FrX = (H1 / 15);
        VeX = (H2 / 4);
        LeX = (P3 / 8);
        CeX = (H4 / 15);
        AlX = (P5 / 7);
        AcX = (L6 / 5);
        LaX = ((((P7 / 9) + (H7 / 12)) / 100) * 72.67);
        TX = (FrX + VeX + LeX + CeX + AlX + AcX + LaX);
        FrS = String.valueOf(numberFormat.format(FrX));
        VeS = String.valueOf(numberFormat.format(VeX));
        LeS = String.valueOf(numberFormat.format(LeX));
        CeS = String.valueOf(numberFormat.format(CeX));
        AlS = String.valueOf(numberFormat.format(AlX));
        AcS = String.valueOf(numberFormat.format(AcX));
        LaS = String.valueOf(numberFormat.format(LaX));
        TS = String.valueOf(numberFormat.format(TX));
        
        // Valores para columna "Energía"
        Double E1, E2, E3, E4, E5, E6, E7, E8;
        String E1S = "", E2S = "", E3S = "", E4S = "", E5S = "", E6S = "", E7S = "", E8S = "";
        E1 = (FrX * 60);
        E2 = (VeX * 25);
        E3 = (LeX * 120);
        E4 = (CeX * 70);
        E5 = (AlX * 40);
        E6 = (AcX * 45);
        E7 = (LaX * 95);
        E8 = (E1 + E2 + E3 + E4 + E5 + E6 + E7);
        E1S = String.valueOf(numberFormat.format(E1));
        E2S = String.valueOf(numberFormat.format(E2));
        E3S = String.valueOf(numberFormat.format(E3));
        E4S = String.valueOf(numberFormat.format(E4));
        E5S = String.valueOf(numberFormat.format(E5));
        E6S = String.valueOf(numberFormat.format(E6));
        E7S = String.valueOf(numberFormat.format(E7));
        E8S = String.valueOf(numberFormat.format(E8));
        
        DefaultTableModel modeloFood = (DefaultTableModel) jSistEq.getModel();
        modeloFood.addRow(new Object[]{"Frutas", FrS, E1S, P1S, L1S, H1S});
        modeloFood.addRow(new Object[]{"Verduras", VeS, E2S, P2S, L2S, H2S});
        modeloFood.addRow(new Object[]{"Leguminosas", LeS, E3S, P3S, L3S, H3S});
        modeloFood.addRow(new Object[]{"Cereales y tubérculos", CeS, E4S, P4S, L4S, H4S});
        modeloFood.addRow(new Object[]{"Alimentos de O. A.", AlS, E5S, P5S, L5S, H5S});
        modeloFood.addRow(new Object[]{"Aceites y grasas sin proteínas", AcS, E6S, P6S, L6S, H6S});
        modeloFood.addRow(new Object[]{"Lácteos", LaS, E7S, P7S, L7S, H7S});
        modeloFood.addRow(new Object[]{"TOTAL", TS, E8S, P8S, L8S, H8S});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTa0 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jNombreF = new javax.swing.JLabel();
        jEafF = new javax.swing.JLabel();
        jPatolog = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelHc = new javax.swing.JLabel();
        jLabelPr = new javax.swing.JLabel();
        jLabelGr = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jSistEq = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        jTa0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATOS DEL PACIENTE"
            }
        ));
        jScrollPane1.setViewportView(jTa0);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aporte nutrimental promedio de los Grupos en el Sistema de Equivalentes");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460029163_pizza.png"))); // NOI18N
        jLabel1.setText("Aporte nutrimental promedio de los Grupos en el Sistema de Equivalentes");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460029163_pizza.png"))); // NOI18N
        jButton2.setText("Determinar raciones");
        jButton2.setToolTipText("Determinar raciones recomendadas para el paciente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del paciente"));

        jNombreF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jNombreF.setText("Nombre");

        jEafF.setText("Kilocalorías");

        jPatolog.setText("Patología");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNombreF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEafF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPatolog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNombreF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEafF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPatolog)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Porcentajes"));

        jLabelHc.setText("Hc: 50%");

        jLabelPr.setText("Pr: 20%");

        jLabelGr.setText("Gr: 30%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHc, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jLabelPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelGr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSistEq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPOS EN EL SISTEMA DE EQUIVALENTES", "RACIÓN", "ENERGÍA", "PROTEÍNAS", "LÍPIDOS", "HIDRATOS DE CARBONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jSistEq);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460029173_excel.png"))); // NOI18N
        jButton3.setText("Exportar");
        jButton3.setToolTipText("Capturar datos en un documento Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        
        String nombre2 = jNombreF.getText();
        String eaf2 = jEafF.getText();
        String patologia2 = jPatolog.getText();
        String calcHc1 = jLabelHc.getText();
        String calcPr1 = jLabelPr.getText();
        String calcGr1 = jLabelGr.getText();
        new FinalFood(nombre2, eaf2, patologia2, calcHc1, calcPr1, calcGr1, FrS, VeS, LeS, CeS, AlS, AcS, LaS).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            JFileChooser selector = new JFileChooser();
            selector.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
            selector.showSaveDialog(this);
            String r = selector.getSelectedFile().getAbsolutePath();

            int cantFila = jSistEq.getRowCount();
            int cantColumna = jSistEq.getColumnCount();

            String ruta = r + ".xls";
            File archivoXLS = new File(ruta);

            if (archivoXLS.exists()) {
                archivoXLS.delete();
            }
            archivoXLS.createNewFile();
            Workbook libro = new HSSFWorkbook();
            FileOutputStream archivo = new FileOutputStream(archivoXLS);
            Sheet hoja0 = libro.createSheet("Datos Paciente");
            Sheet hoja1 = libro.createSheet("Aporte Nutrimental");
            
            // Hoja de Excel "Datos Paciente"
            int cantFila0 = jTa0.getRowCount();
            int cantColumna0 = jTa0.getColumnCount();

            for (int f = -1; f < cantFila0; f++) {
                Row fila = hoja0.createRow(f + 1);
                for (int c = 0; c < cantColumna0; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa0.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa0.getValueAt(f, c)));
                    }
                }
            }
            
            // Hoja de Excel "Aporte Nutrimental"
            for (int f = -1; f < cantFila; f++) {
                Row fila = hoja1.createRow(f + 1);
                for (int c = 0; c < cantColumna; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jSistEq.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jSistEq.getValueAt(f, c)));
                    }
                }
            }
            libro.write(archivo);
            archivo.close();
            JOptionPane.showMessageDialog(null, "Documento exportado con éxito.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Los datos no fueron exportados.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jEafF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGr;
    private javax.swing.JLabel jLabelHc;
    private javax.swing.JLabel jLabelPr;
    private javax.swing.JLabel jNombreF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPatolog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jSistEq;
    private javax.swing.JTable jTa0;
    // End of variables declaration//GEN-END:variables

    
}
