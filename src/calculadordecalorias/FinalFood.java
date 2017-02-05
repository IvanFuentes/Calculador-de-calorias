package calculadordecalorias;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Iván Fuentes
 */
public class FinalFood extends javax.swing.JFrame {

    public FinalFood(String nombre2, String eaf2, String patologia2, String calcHc1, String calcPr1, String calcGr1, String FrS, String VeS, String LeS, String CeS, String AlS, String AcS, String LaS) {
        initComponents();
        iniciarComponentes(nombre2, eaf2, patologia2, calcHc1, calcPr1, calcGr1, FrS, VeS, LeS, CeS, AlS, AcS, LaS);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../icono.png")).getImage());
        } catch (Exception ex) {
        }
    }
    
    public void iniciarComponentes(String nombre2, String eaf2, String patologia2, String calcHc1, String calcPr1, String calcGr1, String FrS, String VeS, String LeS, String CeS, String AlS, String AcS, String LaS){
        DecimalFormat numberFormat = new DecimalFormat("######.#");
        
        this.jNombreF.setText(nombre2);
        this.jEafF.setText(eaf2);
        this.jPatolog.setText(patologia2);
        this.jLabelHc.setText(calcHc1);
        this.jLabelPr.setText(calcPr1);
        this.jLabelGr.setText(calcGr1);
        this.jLabel2.setText("Ración máxima de " + FrS + " para frutas.");
        this.jLabel3.setText("Ración máxima de " + VeS + " para verduras.");
        this.jLabel4.setText("Ración máxima de " + LeS + " para leguminosas.");
        this.jLabel5.setText("Ración máxima de " + CeS + " para cereales y tubérculos.");
        this.jLabel6.setText("Ración máxima de " + AlS + " para proteínas y alimentos de origen animal.");
        this.jLabel7.setText("Ración máxima de " + LaS + " para lácteos.");
        this.jLabel8.setText("Ración máxima de " + AcS + " para aceites y grasas sin proteínas.");
        
        DefaultTableModel modeloFinalFood0 = (DefaultTableModel) jTa0.getModel();
        modeloFinalFood0.addRow(new Object[]{"Nombre: " + nombre2});
        modeloFinalFood0.addRow(new Object[]{eaf2});
        modeloFinalFood0.addRow(new Object[]{patologia2});
        modeloFinalFood0.addRow(new Object[]{calcHc1});
        modeloFinalFood0.addRow(new Object[]{calcPr1});
        modeloFinalFood0.addRow(new Object[]{calcGr1});
        
        Double FrX, CalcFr1, CalcFr2, CalcFr3, CalcFr4, CalcFr5;
        String CalcFrX, CalcFr1X = "", CalcFr2X = "", CalcFr3X = "", CalcFr4X = "", CalcFr5X = "";
        CalcFrX = FrS;
        FrX = Double.parseDouble(CalcFrX);
        CalcFr1 = (FrX * 0.5); // Igual a 1
        CalcFr1X = String.valueOf(numberFormat.format(CalcFr1));
        CalcFr2 = (FrX * 0.25); // Igual a 1/2
        CalcFr2X = String.valueOf(numberFormat.format(CalcFr2));
        CalcFr3 = (FrX * 8); // Igual a 18
        CalcFr3X = String.valueOf(numberFormat.format(CalcFr3));
        CalcFr4 = (FrX * 1); // Igual a 2
        CalcFr4X = String.valueOf(numberFormat.format(CalcFr4));
        CalcFr5 = (FrX * 1.5); // Igual a 3
        CalcFr5X = String.valueOf(numberFormat.format(CalcFr5));
        
        DefaultTableModel modeloFinalFood1 = (DefaultTableModel) jTa1.getModel();
        modeloFinalFood1.addRow(new Object[]{"Fresa rebanada", CalcFr1X + " taza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Granada roja", CalcFr1X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Guanábana", CalcFr1X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Guayaba", CalcFr5X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Mandarina", CalcFr4X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Manzana", CalcFr1X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Naranja", CalcFr4X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Pera", CalcFr2X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Toronja", CalcFr1X + " pieza(s)"});
        modeloFinalFood1.addRow(new Object[]{"Uva", CalcFr3X + " pieza(s)"});
        
        Double VeX, CalcVe1, CalcVe2, CalcVe3, CalcVe4, CalcVe5, CalcVe6;
        String CalcVeX, CalcVe1X = "", CalcVe2X = "", CalcVe3X = "", CalcVe4X = "", CalcVe5X = "", CalcVe6X = "";
        CalcVeX = VeS;
        VeX = Double.parseDouble(CalcVeX);
        CalcVe1 = (VeX * 0.5); // Igual a 1
        CalcVe1X = String.valueOf(numberFormat.format(CalcVe1));
        CalcVe2 = (VeX * 0.25); // Igual a 1/2
        CalcVe2X = String.valueOf(numberFormat.format(CalcVe2));
        CalcVe3 = (VeX * 0.375); // Igual a 3/4
        CalcVe3X = String.valueOf(numberFormat.format(CalcVe3));
        CalcVe4 = (VeX * 60); // Igual a 120
        CalcVe4X = String.valueOf(numberFormat.format(CalcVe4));
        CalcVe5 = (VeX * 1.5); // Igual a 3
        CalcVe5X = String.valueOf(numberFormat.format(CalcVe5));
        CalcVe6 = (VeX * 0.125); // Igual a 1/4
        CalcVe6X = String.valueOf(numberFormat.format(CalcVe6));
        
        DefaultTableModel modeloFinalFood2 = (DefaultTableModel) jTa2.getModel();
        modeloFinalFood2.addRow(new Object[]{"Apio cocido", CalcVe3X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Berenjena", CalcVe1X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Betabel crudo", CalcVe6X + " pieza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Brócoli cocido", CalcVe2X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Cebolla", CalcVe6X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Coliflor cocida picada", CalcVe2X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Espinaca cocida", CalcVe2X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Lechuga", CalcVe5X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Pepino", CalcVe1X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Pimientos", CalcVe1X + " taza(s)"});
        modeloFinalFood2.addRow(new Object[]{"Tomate", CalcVe4X + " gramo(s)"});
        modeloFinalFood2.addRow(new Object[]{"Zanahoria", CalcVe2X + " taza(s)"});
        
        Double LeX, CalcLe1, CalcLe2;
        String CalcLeX, CalcLe1X = "", CalcLe2X = "";
        CalcLeX = LeS;
        LeX = Double.parseDouble(CalcLeX);
        CalcLe1 = (LeX * 0.25); // Igual a 1/2
        CalcLe1X = String.valueOf(numberFormat.format(CalcLe1));
        CalcLe2 = (LeX * 0.16); // Igual a 1/3
        CalcLe2X = String.valueOf(numberFormat.format(CalcLe2));
        
        DefaultTableModel modeloFinalFood3 = (DefaultTableModel) jTa3.getModel();
        modeloFinalFood3.addRow(new Object[]{"Alubia cocida", CalcLe1X + " taza(s)"});
        modeloFinalFood3.addRow(new Object[]{"Frijol promedio cocido", CalcLe1X + " taza(s)"});
        modeloFinalFood3.addRow(new Object[]{"Garbanzo cocido", CalcLe1X + " taza(s)"});
        modeloFinalFood3.addRow(new Object[]{"Lenteja cocida", CalcLe1X + " taza(s)"});
        modeloFinalFood3.addRow(new Object[]{"Soya cocida", CalcLe2X + " taza(s)"});
        
        Double CeX, CalcCe1, CalcCe2, CalcCe3, CalcCe4;
        String CalcCeX, CalcCe1X = "", CalcCe2X = "", CalcCe3X = "", CalcCe4X = "";
        CalcCeX = CeS;
        CeX = Double.parseDouble(CalcCeX);
        CalcCe1 = (CeX * 0.5); // Igual a 1
        CalcCe1X = String.valueOf(numberFormat.format(CalcCe1));
        CalcCe2 = (CeX * 0.16); // Igual a 1/3
        CalcCe2X = String.valueOf(numberFormat.format(CalcCe2));
        CalcCe3 = (CeX * 0.375); // Igual a 3/4
        CalcCe3X = String.valueOf(numberFormat.format(CalcCe3));
        CalcCe4 = (CeX * 0.25); // Igual a 1/2
        CalcCe4X = String.valueOf(numberFormat.format(CalcCe4));
        
        DefaultTableModel modeloFinalFood4 = (DefaultTableModel) jTa4.getModel();
        modeloFinalFood4.addRow(new Object[]{"Arroz integral cocido", CalcCe2X + " taza(s)"});
        modeloFinalFood4.addRow(new Object[]{"Avena cocida", CalcCe3X + " taza(s)"});
        modeloFinalFood4.addRow(new Object[]{"Avena integral", CalcCe2X + " taza(s)"});
        modeloFinalFood4.addRow(new Object[]{"Cereal de avena integral", CalcCe2X + " taza(s)"});
        modeloFinalFood4.addRow(new Object[]{"Espaguetti integral cocido", CalcCe2X + " taza(s)"});
        modeloFinalFood4.addRow(new Object[]{"Pan de caja integral", CalcCe1X + " rebanada(s)"});
        modeloFinalFood4.addRow(new Object[]{"Pan tostado", CalcCe1X + " rebanada(s)"});
        modeloFinalFood4.addRow(new Object[]{"Pan de centeno y trigo", CalcCe1X + " rebanada(s)"});
        modeloFinalFood4.addRow(new Object[]{"Pasta cocida integral", CalcCe4X + " taza(s)"});
        modeloFinalFood4.addRow(new Object[]{"Tortilla de trigo y maíz", CalcCe1X + " pieza(s)"});
        
        Double AlX, CalcAl1, CalcAl2, CalcAl3, CalcAl4, CalcAl5, CalcAl6;
        String CalcAlX, CalcAl1X = "", CalcAl2X = "", CalcAl3X = "", CalcAl4X = "", CalcAl5X = "", CalcAl6X = "";
        CalcAlX = AlS;
        AlX = Double.parseDouble(CalcAlX);
        CalcAl1 = (AlX * 0.16); // Igual a 1/3
        CalcAl1X = String.valueOf(numberFormat.format(CalcAl1));
        CalcAl2 = (AlX * 1); // Igual a 2
        CalcAl2X = String.valueOf(numberFormat.format(CalcAl2));
        CalcAl3 = (AlX * 15); // Igual a 30
        CalcAl3X = String.valueOf(numberFormat.format(CalcAl3));
        CalcAl4 = (AlX * 0.75); // Igual a 3/2
        CalcAl4X = String.valueOf(numberFormat.format(CalcAl4));
        CalcAl5 = (AlX * 20); // Igual a 40
        CalcAl5X = String.valueOf(numberFormat.format(CalcAl5));
        CalcAl6 = (AlX * 22.5); // Igual a 45
        CalcAl6X = String.valueOf(numberFormat.format(CalcAl6));
        
        DefaultTableModel modeloFinalFood5 = (DefaultTableModel) jTa5.getModel();
        modeloFinalFood5.addRow(new Object[]{"Atún en agua", CalcAl1X + " lata(s)"});
        modeloFinalFood5.addRow(new Object[]{"Clara de huevo", CalcAl2X + " pieza(s)"});
        modeloFinalFood5.addRow(new Object[]{"Milanesa de pollo", CalcAl3X + " gramo(s)"});
        modeloFinalFood5.addRow(new Object[]{"Pechuga de pavo", CalcAl4X + " rebanada(s)"});
        modeloFinalFood5.addRow(new Object[]{"Pechuga de pollo sin piel", CalcAl3X + " gramo(s)"});
        modeloFinalFood5.addRow(new Object[]{"Filete de pescado", CalcAl5X + " gramo(s)"});
        modeloFinalFood5.addRow(new Object[]{"Queso oaxaca", CalcAl3X + " gramo(s)"});
        modeloFinalFood5.addRow(new Object[]{"Queso panela", CalcAl5X + " gramo(s)"});
        modeloFinalFood5.addRow(new Object[]{"Pavo", CalcAl6X + " gramo(s)"});
        modeloFinalFood5.addRow(new Object[]{"Bistec de res", CalcAl3X + " gramo(s)"});
        
        Double LaX, CalcLa1, CalcLa2;
        String CalcLaX, CalcLa1X = "", CalcLa2X = "";
        CalcLaX = LaS;
        LaX = Double.parseDouble(CalcLaX);
        CalcLa1 = (LaX * 0.5); // Igual a 1
        CalcLa1X = String.valueOf(numberFormat.format(CalcLa1));
        CalcLa2 = (LaX * 0.375); // Igual a 3/4
        CalcLa2X = String.valueOf(numberFormat.format(CalcLa2));
        
        DefaultTableModel modeloFinalFood6 = (DefaultTableModel) jTa6.getModel();
        modeloFinalFood6.addRow(new Object[]{"Leche de soya", CalcLa1X + " taza(s)"});
        modeloFinalFood6.addRow(new Object[]{"Leche semidescremada", CalcLa1X + " taza(s)"});
        modeloFinalFood6.addRow(new Object[]{"Yoghur descremado light", CalcLa2X + " taza(s)"});
        modeloFinalFood6.addRow(new Object[]{"Leche de almendras", CalcLa1X + " taza(s)"});
        modeloFinalFood6.addRow(new Object[]{"Yoghur light", CalcLa2X + " taza(s)"});
        
        Double AcX, CalcAc1;
        String CalcAcX, CalcAc1X = "";
        CalcAcX = AcS;
        AcX = Double.parseDouble(CalcAcX);
        CalcAc1 = (AcX * 0.5); // Igual a 1
        CalcAc1X = String.valueOf(numberFormat.format(CalcAc1));
        
        DefaultTableModel modeloFinalFood7 = (DefaultTableModel) jTa7.getModel();
        modeloFinalFood7.addRow(new Object[]{"Aceite de almendra", CalcAc1X + " cucharadita(s)"});
        modeloFinalFood7.addRow(new Object[]{"Aceite de canola", CalcAc1X + " cucharadita(s)"});
        modeloFinalFood7.addRow(new Object[]{"Aceite de cartamo", CalcAc1X + " cucharadita(s)"});
        modeloFinalFood7.addRow(new Object[]{"Aceite de maíz", CalcAc1X + " cucharadita(s)"});
        modeloFinalFood7.addRow(new Object[]{"Aceite de aguacate", CalcAc1X + " cucharadita(s)"});
        modeloFinalFood7.addRow(new Object[]{"Aceite de oliva extra virgen", CalcAc1X + " cucharadita(s)"});
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScroll1 = new javax.swing.JScrollPane();
        jTa1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScroll2 = new javax.swing.JScrollPane();
        jTa2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScroll3 = new javax.swing.JScrollPane();
        jTa3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScroll4 = new javax.swing.JScrollPane();
        jTa4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScroll5 = new javax.swing.JScrollPane();
        jTa5 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScroll6 = new javax.swing.JScrollPane();
        jTa6 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScroll7 = new javax.swing.JScrollPane();
        jTa7 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelHc = new javax.swing.JLabel();
        jLabelPr = new javax.swing.JLabel();
        jLabelGr = new javax.swing.JLabel();

        jTa0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATOS DEL PACIENTE"
            }
        ));
        jScrollPane1.setViewportView(jTa0);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Determinación del tamaño del Equivalente con base en los Alimentos de referencia");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460029163_pizza.png"))); // NOI18N
        jLabel1.setText("Determinación del tamaño del Equivalente con base en los Alimentos de referencia");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1460029173_excel.png"))); // NOI18N
        jButton2.setText("Exportar");
        jButton2.setToolTipText("Capturar datos en un documento Excel");
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

        jLabel2.setText("Ración máxima de \"X\" para \"Y\".");

        jTa1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FRUTAS", "PORCIÓN"
            }
        ));
        jScroll1.setViewportView(jTa1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("FRUTAS", jPanel3);

        jTa2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VERDURAS", "PORCIÓN"
            }
        ));
        jScroll2.setViewportView(jTa2);

        jLabel3.setText("Ración máxima de \"X\" para \"Y\".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScroll2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("VERDURAS", jPanel4);

        jTa3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LEGUMINOSAS", "PORCIÓN"
            }
        ));
        jScroll3.setViewportView(jTa3);

        jLabel4.setText("Ración máxima de \"X\" para \"Y\".");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScroll3, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LEGUMINOSAS", jPanel5);

        jTa4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEREALES", "PORCIÓN"
            }
        ));
        jScroll4.setViewportView(jTa4);

        jLabel5.setText("Ración máxima de \"X\" para \"Y\".");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScroll4, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("CEREALES", jPanel6);

        jTa5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROTEÍNAS Y ALIMENTOS DE ORIGEN ANIMAL", "PORCIÓN"
            }
        ));
        jScroll5.setViewportView(jTa5);

        jLabel6.setText("Ración máxima de \"X\" para \"Y\".");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScroll5, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll5, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("PROTEÍNAS Y A. DE O. A.", jPanel7);

        jTa6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LÁCTEOS", "PORCIÓN"
            }
        ));
        jScroll6.setViewportView(jTa6);

        jLabel7.setText("Ración máxima de \"X\" para \"Y\".");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScroll6, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LÁCTEOS", jPanel8);

        jTa7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRASAS SIN PROTEÍNA", "PORCIÓN"
            }
        ));
        jScroll7.setViewportView(jTa7);

        jLabel8.setText("Ración máxima de \"X\" para \"Y\".");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScroll7, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll7, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("GRASAS SIN PROT.", jPanel9);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Porcentajes"));

        jLabelHc.setText("Hc: 50%");

        jLabelPr.setText("Pr: 20 %");

        jLabelGr.setText("Gr: 30 %");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
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
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            HSSFWorkbook libro = new HSSFWorkbook();
            
            JFileChooser selector = new JFileChooser();
            selector.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
            selector.showSaveDialog(this);
            
            String r = selector.getSelectedFile().getAbsolutePath();

            String ruta = r + ".xls";
            File archivoXLS = new File(ruta);

            if (archivoXLS.exists()) {
                archivoXLS.delete();
            }
            
            archivoXLS.createNewFile();
            
            HSSFSheet hoja0 = libro.createSheet("Datos Paciente");
            HSSFSheet hoja1 = libro.createSheet("Frutas");
            HSSFSheet hoja2 = libro.createSheet("Verduras");
            HSSFSheet hoja3 = libro.createSheet("Leguminosas");
            HSSFSheet hoja4 = libro.createSheet("Cereales");
            HSSFSheet hoja5 = libro.createSheet("Proteínas y Al. de O.A.");
            HSSFSheet hoja6 = libro.createSheet("Lácteos");
            HSSFSheet hoja7 = libro.createSheet("Grasas sin proteínas");
            
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
            
            // Hoja de Excel "Frutas"
            int cantFila1 = jTa1.getRowCount();
            int cantColumna1 = jTa1.getColumnCount();

            for (int f = -1; f < cantFila1; f++) {
                Row fila = hoja1.createRow(f + 1);
                for (int c = 0; c < cantColumna1; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa1.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa1.getValueAt(f, c)));
                    }
                }
            }
            
            // Hoja de Excel "Verduras"
            int cantFila2 = jTa2.getRowCount();
            int cantColumna2 = jTa2.getColumnCount();

            for (int f = -1; f < cantFila2; f++) {
                Row fila = hoja2.createRow(f + 1);
                for (int c = 0; c < cantColumna2; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa2.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa2.getValueAt(f, c)));
                    }
                }
            }
            
            // Hoja de Excel "Leguminosas"
            int cantFila3 = jTa3.getRowCount();
            int cantColumna3 = jTa3.getColumnCount();

            for (int f = -1; f < cantFila3; f++) {
                Row fila = hoja3.createRow(f + 1);
                for (int c = 0; c < cantColumna3; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa3.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa3.getValueAt(f, c)));
                    }
                }
            }
            
            // Hoja de Excel "Cereales"
            int cantFila4 = jTa4.getRowCount();
            int cantColumna4 = jTa4.getColumnCount();

            for (int f = -1; f < cantFila4; f++) {
                Row fila = hoja4.createRow(f + 1);
                for (int c = 0; c < cantColumna4; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa4.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa4.getValueAt(f, c)));
                    }
                }
            }
            
            // Hoja de Excel "Proteínas y Al. de O. A."
            int cantFila5 = jTa5.getRowCount();
            int cantColumna5 = jTa5.getColumnCount();

            for (int f = -1; f < cantFila5; f++) {
                Row fila = hoja5.createRow(f + 1);
                for (int c = 0; c < cantColumna5; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa5.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa5.getValueAt(f, c)));
                    }
                }
            }
            
            // Hoja de Excel "Lácteos"
            int cantFila6 = jTa6.getRowCount();
            int cantColumna6 = jTa6.getColumnCount();

            for (int f = -1; f < cantFila6; f++) {
                Row fila = hoja6.createRow(f + 1);
                for (int c = 0; c < cantColumna6; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa6.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa6.getValueAt(f, c)));
                    }
                }
            }
            
            // Hoja de Excel "Grasas sin proteínas"
            int cantFila7 = jTa7.getRowCount();
            int cantColumna7 = jTa7.getColumnCount();

            for (int f = -1; f < cantFila7; f++) {
                Row fila = hoja7.createRow(f + 1);
                for (int c = 0; c < cantColumna7; c++) {
                    Cell celda = fila.createCell(c);
                    if (f == -1) {
                        celda.setCellValue(jTa7.getColumnName(c));
                    } else {
                        celda.setCellValue(String.valueOf(jTa7.getValueAt(f, c)));
                    }
                }
            }
            
            FileOutputStream archivo = new FileOutputStream(archivoXLS);
            libro.write(archivo);
            archivo.close();
            
            JOptionPane.showMessageDialog(null, "Documento exportado con éxito.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Los datos no fueron exportados.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jEafF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelGr;
    private javax.swing.JLabel jLabelHc;
    private javax.swing.JLabel jLabelPr;
    private javax.swing.JLabel jNombreF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jPatolog;
    private javax.swing.JScrollPane jScroll1;
    private javax.swing.JScrollPane jScroll2;
    private javax.swing.JScrollPane jScroll3;
    private javax.swing.JScrollPane jScroll4;
    private javax.swing.JScrollPane jScroll5;
    private javax.swing.JScrollPane jScroll6;
    private javax.swing.JScrollPane jScroll7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTa0;
    private javax.swing.JTable jTa1;
    private javax.swing.JTable jTa2;
    private javax.swing.JTable jTa3;
    private javax.swing.JTable jTa4;
    private javax.swing.JTable jTa5;
    private javax.swing.JTable jTa6;
    private javax.swing.JTable jTa7;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    
}
