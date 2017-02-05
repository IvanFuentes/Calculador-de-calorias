package calculadordecalorias;

import java.text.DecimalFormat;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Fuentes; (044) 981 125 1397
 */
public class AddContact extends javax.swing.JFrame {

    public static LinkedList lc = new LinkedList();
    private boolean status;

    public AddContact(boolean es) {
        initComponents();
        this.masc.setSelected(true);
        status = es;
        try {
            setIconImage(new ImageIcon(getClass().getResource("../icono.png")).getImage());
        } catch (Exception ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGenero = new javax.swing.ButtonGroup();
        groupPatologia = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        masc = new javax.swing.JRadioButton();
        feme = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCms = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jKgs = new javax.swing.JTextField();
        comboEaf = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPato1 = new javax.swing.JCheckBox();
        jPato2 = new javax.swing.JCheckBox();
        jPato3 = new javax.swing.JCheckBox();
        jPato4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jEaf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jGeb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jImc = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setTitle("Nuevo registro");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455862221_plus_16.png"))); // NOI18N
        jLabel1.setText("Nuevo registro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del paciente"));

        jLabel2.setText("Nombre:");

        jNombre.setToolTipText("Ingresa el nombre del paciente.");

        jLabel5.setText("Género:");

        groupGenero.add(masc);
        masc.setSelected(true);
        masc.setText("Masculino");

        groupGenero.add(feme);
        feme.setText("Femenino");

        jLabel6.setText("Edad:");

        jEdad.setToolTipText("Ingresa la cantidad en años. (Ejemplo: \"25\" años)");
        jEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jEdadKeyTyped(evt);
            }
        });

        jLabel7.setText("Estatura:");

        jCms.setToolTipText("Ingresa la cantidad en centímetros. (Ejemplo: \"162\" cms.)");
        jCms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCmsKeyTyped(evt);
            }
        });

        jLabel8.setText("Peso:");

        jKgs.setToolTipText("Ingresa la cantidad en kilogramos. (Ejemplo: \"64\" kgs.)");
        jKgs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jKgsKeyTyped(evt);
            }
        });

        comboEaf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentario", "Leve", "Moderada", "Intensa", "Muy intensa" }));
        comboEaf.setToolTipText("Selecciona el nivel de actividad del paciente.");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Patología del paciente"));

        jPato1.setSelected(true);
        jPato1.setText("Dislipidemia");

        jPato2.setText("Obesidad");

        jPato3.setText("Hipertensión");

        jPato4.setText("Diabetes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPato1)
                    .addComponent(jPato2)
                    .addComponent(jPato3)
                    .addComponent(jPato4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPato1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPato2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPato3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPato4))
        );

        jLabel3.setText("Actividad:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cálculo de metabolismo"));

        jLabel12.setText("G.E.B.:");

        jEaf.setEditable(false);

        jLabel13.setText("G.E.T.:");

        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1456268704_reload.png"))); // NOI18N
        btnCalc.setToolTipText("Calcular el metabolismo del paciente");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jGeb.setEditable(false);
        jGeb.setToolTipText("");

        jLabel4.setText("I.M.C.:");

        jImc.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEaf))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jImc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGeb)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jGeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jEaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCalc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEaf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jKgs))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCms))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEdad))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feme)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(masc)
                    .addComponent(feme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jKgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboEaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1455862221_plus_16.png"))); // NOI18N
        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancel))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        DecimalFormat numberFormat = new DecimalFormat("######.#");
        
        if (jEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa la edad del paciente.");
        } else if (jKgs.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el peso del paciente.");
        } else if (jCms.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa la altura del paciente.");
        } else {
            // Calculando el G.E.B. y el I.M.C. (I.M.C. = (kg / metros^2))
            Double GEB0, edad1, peso2, estatura3, IMC0;
            String GEB0X = "", GEB0Z = "", GEB0R = "", edad1X = "", peso2X = "", estatura3X = "", IMC0X = "", IMC0Z = "";
            edad1X = jEdad.getText();
            peso2X = jKgs.getText();
            estatura3X = jCms.getText();
            edad1 = Double.parseDouble(edad1X);
            peso2 = Double.parseDouble(peso2X);
            estatura3 = Double.parseDouble(estatura3X);
            
            IMC0 = (peso2 / ((estatura3 * estatura3) * 0.0001));
            IMC0X = String.valueOf(numberFormat.format(IMC0));
            IMC0Z = String.valueOf(IMC0X);
            jImc.setText(IMC0Z);
            
            if (masc.isSelected()) {
                // G.E.B. TMB Masculino = ((65.5 + (13.75 * kgs)) + (5.08 * cms) - (6.78 * edad)
                GEB0 = ((65.5 + (13.75 * peso2)) + (5.08 * estatura3) - (6.78 * edad1));
                if (jPato2.isSelected()) {
                    GEB0 = (GEB0 - 500);
                    GEB0R = String.valueOf(GEB0);
                    GEB0X = String.valueOf(numberFormat.format(GEB0));
                    GEB0Z = String.valueOf(GEB0X);
                } else {
                    GEB0R = String.valueOf(GEB0);
                    GEB0X = String.valueOf(numberFormat.format(GEB0));
                    GEB0Z = String.valueOf(GEB0X);
                }
            } else if (feme.isSelected()) {
                // G.E.B. TMB Femenino = ((655.1 + (9.56 * kgs)) + (1.85 * cms) - (4.68 * edad)
                GEB0 = ((655.1 + (9.56 * peso2)) + (1.85 * estatura3) - (4.68 * edad1));
                if (jPato2.isSelected()) {
                    GEB0 = (GEB0 - 500);
                    GEB0R = String.valueOf(GEB0);
                    GEB0X = String.valueOf(numberFormat.format(GEB0));
                    GEB0Z = String.valueOf(GEB0X);
                } else {
                    GEB0R = String.valueOf(GEB0);
                    GEB0X = String.valueOf(numberFormat.format(GEB0));
                    GEB0Z = String.valueOf(GEB0X);
                }
            }
            
            jGeb.setText(GEB0Z);
            
            // Calculando el E.A.F.
            Double EAF0;
            String EAF0X = "", EAF1Y = "", EAF2Z = "";
            EAF0X = GEB0R;
            EAF0 = Double.parseDouble(EAF0X);
            EAF1Y = (String) comboEaf.getSelectedItem();

            switch (EAF1Y) {
                case "Sedentario":
                    // Sedentario 0%
                    EAF0 = (EAF0 * 1.0);
                    EAF0X = String.valueOf(numberFormat.format(EAF0));
                    EAF2Z = String.valueOf(EAF0X);
                    break;
                case "Leve":
                    // Leve 10%
                    EAF0 = (EAF0 * 1.1);
                    EAF0X = String.valueOf(numberFormat.format(EAF0));
                    EAF2Z = String.valueOf(EAF0X);
                    break;
                case "Moderada":
                    // Moderada 20%
                    EAF0 = (EAF0 * 1.2);
                    EAF0X = String.valueOf(numberFormat.format(EAF0));
                    EAF2Z = String.valueOf(EAF0X);
                    break;
                case "Intensa":
                    // Intensa 30%
                    EAF0 = (EAF0 * 1.3);
                    EAF0X = String.valueOf(numberFormat.format(EAF0));
                    EAF2Z = String.valueOf(EAF0X);
                    break;
                default:
                    // Muy intensa 40%
                    EAF0 = (EAF0 * 1.4);
                    EAF0X = String.valueOf(numberFormat.format(EAF0));
                    EAF2Z = String.valueOf(EAF0X);
                    break;
            }

            jEaf.setText(EAF2Z);
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (jNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el nombre del paciente.");
        } else if (jGeb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cálcula el metabolismo del paciente.");
        } else {

            String nombre = jNombre.getText();
            String genero = "";
            if (masc.isSelected()) {
                genero = "Masculino";
            } else if (feme.isSelected()) {
                genero = "Femenino";
            }
            String edad = jEdad.getText();
            String estatura = jCms.getText();
            String peso = jKgs.getText();
            String geb = jGeb.getText();
            String imc = jImc.getText();
            String eaf = jEaf.getText();
            String patologia = "";
            if (jPato1.isSelected() && jPato2.isSelected() && jPato3.isSelected() && jPato4.isSelected()) {
                patologia = "Dislipidemia, obesidad, hipertensión y diabetes";
            } else if (jPato1.isSelected() && jPato2.isSelected() && jPato3.isSelected()) {
                patologia = "Dislipidemia, obesidad e hipertensión";
            } else if (jPato1.isSelected() && jPato2.isSelected() && jPato4.isSelected()) {
                patologia = "Dislipidemia, obesidad y diabetes";
            } else if (jPato1.isSelected() && jPato3.isSelected() && jPato4.isSelected()) {
                patologia = "Dislipidemia, hipertensión y diabetes";
            } else if (jPato2.isSelected() && jPato3.isSelected() && jPato4.isSelected()) {
                patologia = "Obesidad, hipertensión y diabetes";
            } else if (jPato1.isSelected() && jPato2.isSelected()) {
                patologia = "Dislipidemia y obesidad";
            } else if (jPato1.isSelected() && jPato3.isSelected()) {
                patologia = "Dislipidemia e hipertensión";
            } else if (jPato1.isSelected() && jPato4.isSelected()) {
                patologia = "Dislipidemia y diabetes";
            } else if (jPato2.isSelected() && jPato3.isSelected()) {
                patologia = "Obesidad e hipertensión";
            } else if (jPato2.isSelected() && jPato4.isSelected()) {
                patologia = "Obesidad y diabetes";
            } else if (jPato3.isSelected() && jPato4.isSelected()) {
                patologia = "Hipertensión y diabetes";
            } else if (jPato1.isSelected()) {
                patologia = "Dislipidemia";
            } else if (jPato2.isSelected()) {
                patologia = "Obesidad";
            } else if (jPato3.isSelected()) {
                patologia = "Hipertensión";
            } else if (jPato4.isSelected()) {
                patologia = "Diabetes";
            } else {
                patologia = "Sin patología";
            }

            Contact c = new Contact(nombre, genero, edad, estatura, peso, geb, imc, eaf, patologia);
            lc.add(c);
            
            if (status) {
                Data t = new Data();
                t.setVisible(true);
                t.CargarInterfaz();

                for (int i = 0; i < lc.size(); i++) {
                    c = (Contact) lc.get(i);
                    t.MostrarDatos(c);
                }
            }
            this.setVisible(false);
        }
    }//GEN-LAST:event_addActionPerformed

    private void jEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEdadKeyTyped
        char x = evt.getKeyChar();
        if (x < '0' || x > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jEdadKeyTyped

    private void jCmsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCmsKeyTyped
        char x = evt.getKeyChar();
        if (x < '0' || x > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jCmsKeyTyped

    private void jKgsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jKgsKeyTyped
        char x = evt.getKeyChar();
        if (x < '0' || x > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jKgsKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> comboEaf;
    private javax.swing.JRadioButton feme;
    private javax.swing.ButtonGroup groupGenero;
    private javax.swing.ButtonGroup groupPatologia;
    private javax.swing.JTextField jCms;
    private javax.swing.JTextField jEaf;
    private javax.swing.JTextField jEdad;
    private javax.swing.JTextField jGeb;
    private javax.swing.JTextField jImc;
    private javax.swing.JTextField jKgs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox jPato1;
    private javax.swing.JCheckBox jPato2;
    private javax.swing.JCheckBox jPato3;
    private javax.swing.JCheckBox jPato4;
    private javax.swing.JRadioButton masc;
    // End of variables declaration//GEN-END:variables

}

/* Fórmula "Harris Benedict" para calcular calorías

TMB Masculino = ((65.5 + (13.75 * kgs)) + (5.08 * cms) - (6.78 * edad)
TMB Femenino = ((655.1 + (9.56 * kgs)) + (1.85 * cms) - (4.68 * edad)
ETA 10%

EAF en pacientes externos:
Sedentario 0%
Leve 10%
Moderada 20%
Intensa 30%
Muy intensa 40%

EAF en pacientes hospitalizados sin factor de estrés:
Encamados 20%
Deambulando 30%

 */
