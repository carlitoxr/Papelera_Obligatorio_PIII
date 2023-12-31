/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.grafica;

import excepciones.MsjExito;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import obligatorio2016.logica.Balneario;
import obligatorio2016.logica.Ciudad;
import obligatorio2016.logica.Cliente;
import obligatorio2016.logica.Direcciones;
import obligatorio2016.logica.Fachada;
import obligatorio2016.logica.Telefono;
import obligatorio2016.logica.Telefonos;

/**
 *
 * @author Federico
 */
public class AgregarCliente extends javax.swing.JFrame {

    private Telefonos auxTels = new Telefonos();
    private Direcciones auxDirs = new Direcciones();
    
    /**
     * Creates new form AgregarCliente
     */
    public AgregarCliente() {
        initComponents();
         GrupoOpciones.add(rbTrabajoCliente);
        GrupoOpciones.add(rbCelularCliente);
        GrupoOpciones.add(rbTelefonoCliente);
        GrupoOpciones1.add(rbBalneario);
        GrupoOpciones1.add(rbCiudad);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoOpciones = new javax.swing.ButtonGroup();
        GrupoOpciones1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        rbCelularCliente = new javax.swing.JRadioButton();
        rbTelefonoCliente = new javax.swing.JRadioButton();
        rbTrabajoCliente = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rbBalneario = new javax.swing.JRadioButton();
        lblcodigopostal = new javax.swing.JLabel();
        lblmanzana = new javax.swing.JLabel();
        jtxtnombreCalle = new javax.swing.JTextField();
        jtxtmanzana = new javax.swing.JTextField();
        jtxtnumeroPuerta = new javax.swing.JTextField();
        lblsolar = new javax.swing.JLabel();
        jtxtesquina = new javax.swing.JTextField();
        jtxtsolar = new javax.swing.JTextField();
        jtxtbarrio = new javax.swing.JTextField();
        jtxtcodigopostal = new javax.swing.JTextField();
        lblnombreCalle = new javax.swing.JLabel();
        lblnumeroPuerta = new javax.swing.JLabel();
        cboDepartamento = new javax.swing.JComboBox<>();
        lblesquina = new javax.swing.JLabel();
        lblbarrio = new javax.swing.JLabel();
        rbCiudad = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("RUT/ CI");

        jTextField1.setColumns(15);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setColumns(15);

        jTextField3.setColumns(15);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Número");

        jTextField4.setColumns(15);

        rbCelularCliente.setText("Celular");
        rbCelularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelularClienteActionPerformed(evt);
            }
        });

        rbTelefonoCliente.setText("Teléfono");

        rbTrabajoCliente.setText("Trabajo ");
        rbTrabajoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTrabajoClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton1.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton1.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("TELÉFONOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbTrabajoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbCelularCliente)
                    .addComponent(rbTelefonoCliente))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbCelularCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTelefonoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTrabajoCliente)
                        .addGap(19, 19, 19))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setViewportView(jList1);

        jLabel9.setText("Departamento");

        rbBalneario.setText("Balneario");
        rbBalneario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBalnearioActionPerformed(evt);
            }
        });

        lblcodigopostal.setText("Codigo Postal");

        lblmanzana.setText("Manzana");

        jtxtnombreCalle.setColumns(15);

        jtxtmanzana.setColumns(15);

        jtxtnumeroPuerta.setColumns(15);

        lblsolar.setText("Solar");

        jtxtesquina.setColumns(15);

        jtxtsolar.setColumns(15);

        jtxtbarrio.setColumns(15);

        jtxtcodigopostal.setColumns(15);

        lblnombreCalle.setText("Nombre Calle");

        lblnumeroPuerta.setText("N° de puerta");

        cboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Montevideo", "Interior" }));
        cboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepartamentoActionPerformed(evt);
            }
        });

        lblesquina.setText("Esquina (Nombre de calle)");

        lblbarrio.setText("Barrio o Localidad");

        rbCiudad.setText("Ciudad");
        rbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCiudadActionPerformed(evt);
            }
        });

        jLabel7.setText("DIRECCIÒN");

        jButton2.setText("Agregar");
        jButton2.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton2.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton2.setPreferredSize(new java.awt.Dimension(32, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblesquina)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtesquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblbarrio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblcodigopostal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtcodigopostal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblnumeroPuerta)
                                            .addComponent(lblnombreCalle))
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtnumeroPuerta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtnombreCalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblmanzana)
                                                .addComponent(lblsolar))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtxtmanzana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtxtsolar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(rbCiudad)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rbBalneario))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(31, 31, 31)
                                                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel7)))
                .addGap(19, 19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCiudad)
                    .addComponent(rbBalneario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmanzana)
                    .addComponent(jtxtmanzana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsolar)
                    .addComponent(jtxtsolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtnombreCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtnumeroPuerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnumeroPuerta)))
                    .addComponent(lblnombreCalle))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblesquina)
                    .addComponent(jtxtesquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbarrio)
                    .addComponent(jtxtbarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtcodigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jButton3)
                .addGap(145, 145, 145)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false); 
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepartamentoActionPerformed
        int indice3;
        indice3 = cboDepartamento.getSelectedIndex();
        switch (indice3) {

            case 0:
            rbCiudad.setVisible(false);
            rbBalneario.setVisible(false);
            lblnombreCalle.setVisible(true);
            jtxtnombreCalle.setVisible(true);
            lblnumeroPuerta.setVisible(true);
            jtxtnumeroPuerta.setVisible(true);
            jtxtesquina.setVisible(true);
            lblesquina.setVisible(true);
            lblbarrio.setVisible(true);
            jtxtbarrio.setVisible(true);
            lblcodigopostal.setVisible(true);
            jtxtcodigopostal.setVisible(true);
            lblmanzana.setVisible(false);
            jtxtmanzana.setVisible(false);
            lblsolar.setVisible(false);
            jtxtsolar.setVisible(false);

            break;

            case 1:
            rbCiudad.setVisible(true);
            rbBalneario.setVisible(true);

            break;
        }
    }//GEN-LAST:event_cboDepartamentoActionPerformed

    private void rbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCiudadActionPerformed
        lblnombreCalle.setVisible(true);
        jtxtnombreCalle.setVisible(true);
        lblnumeroPuerta.setVisible(true);
        jtxtnumeroPuerta.setVisible(true);
        jtxtesquina.setVisible(true);
        lblesquina.setVisible(true);
        lblbarrio.setVisible(true);
        jtxtbarrio.setVisible(true);
        lblcodigopostal.setVisible(true);
        jtxtcodigopostal.setVisible(true);
        jtxtmanzana.setVisible(false);
        lblmanzana.setVisible(false);
        lblsolar.setVisible(false);
        jtxtsolar.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_rbCiudadActionPerformed

    private void rbBalnearioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBalnearioActionPerformed
        // TODO add your handling code here:
        lblmanzana.setVisible(true);
        jtxtmanzana.setVisible(true);
        lblsolar.setVisible(true);
        jtxtsolar.setVisible(true);
        lblnombreCalle.setVisible(true);
        jtxtnombreCalle.setVisible(true);
        jtxtesquina.setVisible(true);
        lblesquina.setVisible(true);
        lblbarrio.setVisible(true);
        jtxtbarrio.setVisible(true);
        lblcodigopostal.setVisible(true);
        jtxtcodigopostal.setVisible(true);
    }//GEN-LAST:event_rbBalnearioActionPerformed

    private void rbCelularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelularClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCelularClienteActionPerformed

    private void rbTrabajoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTrabajoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTrabajoClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Date date = new Date();
//        Cliente cte = new Cliente(Long.valueOf(jTextField3.getText()), jTextField1.getText(), jTextField2.getText(), date);
//        Cliente cte = new Cliente(Long.valueOf(jTextField3.getText()), jTextField1.getText(), jTextField2.getText(), jTextField5.getText());
        String fech = Fachada.getInstancia().obtenerAnio(date);
        Cliente cte = new Cliente(Long.valueOf(jTextField3.getText()), jTextField1.getText(), jTextField2.getText(), fech);
        Fachada.getInstancia().insertCte(cte);
        
        Fachada.getInstancia().getDiccioCtes().find(Long.valueOf(jTextField3.getText())).setTelCle(auxTels);
        Fachada.getInstancia().getDiccioCtes().find(Long.valueOf(jTextField3.getText())).setDirCle(auxDirs);
        
        MsjExito exito = new MsjExito(1);
        JOptionPane.showMessageDialog(null, exito.getMsj(), "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
//       char tecla;
//       tecla = evt.getKeyChar();
//       if(!Character.isDigit(tecla) && tecla!= KeyEvent )
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tipo = null;
        if(rbCelularCliente.isSelected()){
            tipo = "Celular";
        }
        if(rbTelefonoCliente.isSelected()){
            tipo = "Casa";
        }
        if(rbTrabajoCliente.isSelected()){
            tipo = "Trabajo";
        }

        Telefono auxTel = new Telefono(Integer.parseInt(jTextField4.getText()), tipo);
        auxTels.Insertar(auxTel);
        
        DefaultListModel modelo = new DefaultListModel();
        for(int i=0; i < auxTels.getColeccion().size(); i++){
            modelo.addElement(auxTels.getColeccion().get(i).getNumTel() + " - " + auxTels.getColeccion().get(i).getTipoTel());
        }
        jList1.setModel(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formWindowClosed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tipo = null;
        if(cboDepartamento.getSelectedIndex() == 0){
            tipo = "Ciudad";
        }
        if(cboDepartamento.getSelectedIndex() == 1){
            if(rbBalneario.isSelected()){
                tipo = "Balneario";
            }
            if(rbCiudad.isSelected()){
                tipo = "Ciudad";
            }
        }
        
        if(tipo == "Ciudad"){
            Ciudad ciu = new Ciudad(Integer.valueOf(jtxtnumeroPuerta.getText()),
                    jtxtnombreCalle.getText(),
                    jtxtesquina.getText(),
                    jtxtbarrio.getText(),
                    cboDepartamento.getItemAt(cboDepartamento.getSelectedIndex()),
                    Integer.valueOf(jtxtcodigopostal.getText()));
            
            auxDirs.Insertar(ciu);
        }
        else{
            Balneario bal = new Balneario(jtxtmanzana.getText(),
                    Integer.valueOf(jtxtsolar.getText()),
                    jtxtnombreCalle.getText(),
                    jtxtesquina.getText(),
                    jtxtbarrio.getText(),
                    cboDepartamento.getItemAt(cboDepartamento.getSelectedIndex()),
                    Integer.valueOf(jtxtcodigopostal.getText()));
            
            auxDirs.Insertar(bal);
        }
        
        DefaultListModel modelo = new DefaultListModel();
        for(int i=0; i < auxDirs.getColeccion().size(); i++){
            if(auxDirs.getColeccion().get(i) instanceof Ciudad){
                modelo.addElement(auxDirs.getColeccion().get(i).getNomCalle() + " " + 
                        ((Ciudad) auxDirs.getColeccion().get(i)).getNumPuerta() + " esq. " +
                        auxDirs.getColeccion().get(i).getEsq());
            }
            if(auxDirs.getColeccion().get(i) instanceof Balneario){
                modelo.addElement(auxDirs.getColeccion().get(i).getNomCalle() + ", Manz. " + 
                        ((Balneario) auxDirs.getColeccion().get(i)).getManzana() + ", Solar " +
                        ((Balneario) auxDirs.getColeccion().get(i)).getSolar() + ", esq. " +
                        auxDirs.getColeccion().get(i).getEsq());
            }
        }
        jList2.setModel(modelo);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoOpciones;
    private javax.swing.ButtonGroup GrupoOpciones1;
    private javax.swing.JComboBox<String> cboDepartamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jtxtbarrio;
    private javax.swing.JTextField jtxtcodigopostal;
    private javax.swing.JTextField jtxtesquina;
    private javax.swing.JTextField jtxtmanzana;
    private javax.swing.JTextField jtxtnombreCalle;
    private javax.swing.JTextField jtxtnumeroPuerta;
    private javax.swing.JTextField jtxtsolar;
    private javax.swing.JLabel lblbarrio;
    private javax.swing.JLabel lblcodigopostal;
    private javax.swing.JLabel lblesquina;
    private javax.swing.JLabel lblmanzana;
    private javax.swing.JLabel lblnombreCalle;
    private javax.swing.JLabel lblnumeroPuerta;
    private javax.swing.JLabel lblsolar;
    private javax.swing.JRadioButton rbBalneario;
    private javax.swing.JRadioButton rbCelularCliente;
    private javax.swing.JRadioButton rbCiudad;
    private javax.swing.JRadioButton rbTelefonoCliente;
    private javax.swing.JRadioButton rbTrabajoCliente;
    // End of variables declaration//GEN-END:variables
}
