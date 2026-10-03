
package Modulo_1.Vista;

import java.awt.Color;
import Data.Usuarios.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modulo_1.Modelo.GuardarEnData;
import Modulo_2.Vista.InterfazLogin;
public class Interfaz_Registro extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Interfaz_Registro() {
        
        initComponents();
        TextFieldMateria.setVisible(false);
        TextFieldFacultad.setVisible(false);
        TextFieldCarrera.setVisible(false);
        TextFieldArea.setVisible(false);
        TextFieldMatricula.setVisible(false);
        TextFieldDireccion.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldApellido = new javax.swing.JTextField();
        TextFieldEmail = new javax.swing.JTextField();
        TextFieldContraseña = new javax.swing.JTextField();
        SeleccionRol = new javax.swing.JComboBox<>();
        PanelBotonRegistro = new javax.swing.JPanel();
        LabelRegistro = new javax.swing.JLabel();
        TextFieldCedula = new javax.swing.JTextField();
        VerificarContraseña = new javax.swing.JPasswordField();
        TextFieldFacultad = new javax.swing.JTextField();
        TextFieldCarrera = new javax.swing.JTextField();
        TextFieldMateria = new javax.swing.JTextField();
        TextFieldArea = new javax.swing.JTextField();
        TextFieldMatricula = new javax.swing.JTextField();
        TextFieldDireccion = new javax.swing.JTextField();
        PanelBarra = new javax.swing.JPanel();
        PanelExit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(32, 117, 135));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modulo_1/Image/IMG-20260925-WA0003.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        TextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldNombre.setText("Ingrese Nombre");
        TextFieldNombre.setBorder(null);
        TextFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldNombreMousePressed(evt);
            }
        });
        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });

        TextFieldApellido.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldApellido.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldApellido.setText("Ingrese Apellido");
        TextFieldApellido.setBorder(null);
        TextFieldApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldApellidoMousePressed(evt);
            }
        });
        TextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldApellidoActionPerformed(evt);
            }
        });

        TextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldEmail.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldEmail.setText("Ingrese Correo Electronico");
        TextFieldEmail.setBorder(null);
        TextFieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldEmailMousePressed(evt);
            }
        });
        TextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmailActionPerformed(evt);
            }
        });

        TextFieldContraseña.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldContraseña.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldContraseña.setText("Ingrese Contraseña");
        TextFieldContraseña.setBorder(null);
        TextFieldContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldContraseñaMousePressed(evt);
            }
        });
        TextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldContraseñaActionPerformed(evt);
            }
        });

        SeleccionRol.setBackground(new java.awt.Color(255, 255, 255));
        SeleccionRol.setForeground(new java.awt.Color(51, 51, 51));
        SeleccionRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Rol", "Estudiante", "Profesor", "Empleado", "Publico  General" }));
        SeleccionRol.setBorder(null);
        SeleccionRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleccionRol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SeleccionRolItemStateChanged(evt);
            }
        });
        SeleccionRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeleccionRolMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleccionRolMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SeleccionRolMousePressed(evt);
            }
        });
        SeleccionRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionRolActionPerformed(evt);
            }
        });

        PanelBotonRegistro.setBackground(new java.awt.Color(234, 197, 48));
        PanelBotonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelBotonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBotonRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBotonRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBotonRegistroMouseExited(evt);
            }
        });

        LabelRegistro.setForeground(new java.awt.Color(0, 0, 0));
        LabelRegistro.setText("Registrar Datos");

        javax.swing.GroupLayout PanelBotonRegistroLayout = new javax.swing.GroupLayout(PanelBotonRegistro);
        PanelBotonRegistro.setLayout(PanelBotonRegistroLayout);
        PanelBotonRegistroLayout.setHorizontalGroup(
            PanelBotonRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonRegistroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LabelRegistro)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelBotonRegistroLayout.setVerticalGroup(
            PanelBotonRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        TextFieldCedula.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCedula.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldCedula.setText("Ingrese Cedula");
        TextFieldCedula.setBorder(null);
        TextFieldCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldCedulaMousePressed(evt);
            }
        });

        VerificarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        VerificarContraseña.setForeground(new java.awt.Color(51, 51, 51));
        VerificarContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VerificarContraseña.setText("********");
        VerificarContraseña.setToolTipText("");
        VerificarContraseña.setBorder(null);
        VerificarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VerificarContraseñaMousePressed(evt);
            }
        });

        TextFieldFacultad.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldFacultad.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldFacultad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldFacultad.setText("Ingrese Facultad");
        TextFieldFacultad.setBorder(null);
        TextFieldFacultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldFacultadMousePressed(evt);
            }
        });
        TextFieldFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldFacultadActionPerformed(evt);
            }
        });

        TextFieldCarrera.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCarrera.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldCarrera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldCarrera.setText("Ingrese Carrera");
        TextFieldCarrera.setBorder(null);
        TextFieldCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldCarreraMousePressed(evt);
            }
        });
        TextFieldCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCarreraActionPerformed(evt);
            }
        });

        TextFieldMateria.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldMateria.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldMateria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldMateria.setText("Materia que Dicta");
        TextFieldMateria.setBorder(null);
        TextFieldMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldMateriaMousePressed(evt);
            }
        });
        TextFieldMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMateriaActionPerformed(evt);
            }
        });

        TextFieldArea.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldArea.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldArea.setText("Ingrese Area de trabajo");
        TextFieldArea.setBorder(null);
        TextFieldArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldAreaMousePressed(evt);
            }
        });
        TextFieldArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAreaActionPerformed(evt);
            }
        });

        TextFieldMatricula.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldMatricula.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldMatricula.setText("Ingrese Area de trabajo");
        TextFieldMatricula.setBorder(null);
        TextFieldMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldMatriculaMousePressed(evt);
            }
        });
        TextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMatriculaActionPerformed(evt);
            }
        });

        TextFieldDireccion.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldDireccion.setForeground(new java.awt.Color(51, 51, 51));
        TextFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldDireccion.setText("Ingrese Direccion de Habitacion");
        TextFieldDireccion.setBorder(null);
        TextFieldDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldDireccionMousePressed(evt);
            }
        });
        TextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TextFieldContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addComponent(TextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addComponent(TextFieldApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SeleccionRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextFieldCedula, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VerificarContraseña)
                        .addComponent(TextFieldFacultad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addComponent(TextFieldMateria)
                    .addComponent(TextFieldDireccion)
                    .addComponent(TextFieldArea)
                    .addComponent(TextFieldMatricula, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(PanelBotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(TextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VerificarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SeleccionRol, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PanelBotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 390, 570));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 420, 570));

        PanelBarra.setBackground(new java.awt.Color(255, 255, 255));
        PanelBarra.setForeground(new java.awt.Color(255, 255, 255));
        PanelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelBarraMouseDragged(evt);
            }
        });
        PanelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelBarraMousePressed(evt);
            }
        });

        PanelExit.setBackground(new java.awt.Color(255, 255, 255));
        PanelExit.setForeground(new java.awt.Color(204, 204, 204));
        PanelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelExitMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelExitLayout = new javax.swing.GroupLayout(PanelExit);
        PanelExit.setLayout(PanelExitLayout);
        PanelExitLayout.setHorizontalGroup(
            PanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );
        PanelExitLayout.setVerticalGroup(
            PanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelBarraLayout = new javax.swing.GroupLayout(PanelBarra);
        PanelBarra.setLayout(PanelBarraLayout);
        PanelBarraLayout.setHorizontalGroup(
            PanelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBarraLayout.createSequentialGroup()
                .addGap(0, 1161, Short.MAX_VALUE)
                .addComponent(PanelExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelBarraLayout.setVerticalGroup(
            PanelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(PanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1210, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modulo_1/Image/Principal.jpg"))); // NOI18N
        jLabel2.setText("x");
        jLabel2.setPreferredSize(new java.awt.Dimension(1245, 700));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldApellidoActionPerformed

    private void TextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmailActionPerformed

    private void TextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldContraseñaActionPerformed

    private void SeleccionRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionRolActionPerformed

    private void PanelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBarraMousePressed
        xMouse = evt.getX();
        yMouse =evt.getY();
    }//GEN-LAST:event_PanelBarraMousePressed

    private void PanelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBarraMouseDragged
        int x =evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_PanelBarraMouseDragged

    private void PanelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelExitMouseEntered
        PanelExit.setBackground(Color.red);
    }//GEN-LAST:event_PanelExitMouseEntered

    private void PanelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_PanelExitMouseClicked

    private void PanelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelExitMouseExited
       PanelExit.setBackground(Color.white);
    }//GEN-LAST:event_PanelExitMouseExited

    private void PanelBotonRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonRegistroMouseEntered
         PanelBotonRegistro.setBackground(new Color(255,243,178));
         LabelRegistro.setBackground(Color.WHITE);
    }//GEN-LAST:event_PanelBotonRegistroMouseEntered

    private void PanelBotonRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonRegistroMouseExited
        PanelBotonRegistro.setBackground(new Color(234,197,48));
        LabelRegistro.setBackground(Color.BLACK);
    }//GEN-LAST:event_PanelBotonRegistroMouseExited

    private void TextFieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldNombreMousePressed
        TextFieldNombre.setText(" ");
        TextFieldApellido.setText("Ingrese Apellido");
        TextFieldCedula.setText("Ingrese Cedula");
        TextFieldEmail.setText("Ingrese Correo Electronico");
        TextFieldContraseña.setText("Ingrese Contraseña");
        VerificarContraseña.setText("********");
    }//GEN-LAST:event_TextFieldNombreMousePressed

    private void TextFieldApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldApellidoMousePressed
        TextFieldApellido.setText(" ");
        TextFieldCedula.setText("Ingrese Cedula");
        TextFieldEmail.setText("Ingrese Correo Electronico");
        TextFieldContraseña.setText("Ingrese Contraseña");
       VerificarContraseña.setText("********");
    }//GEN-LAST:event_TextFieldApellidoMousePressed

    private void TextFieldCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldCedulaMousePressed
      TextFieldCedula.setText(" ");
        TextFieldEmail.setText("Ingrese Correo Electronico");
        TextFieldContraseña.setText("Ingrese Contraseña");
        VerificarContraseña.setText("********");
    }//GEN-LAST:event_TextFieldCedulaMousePressed

    private void TextFieldEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldEmailMousePressed
        TextFieldEmail.setText(" ");
        TextFieldContraseña.setText("Ingrese Contraseña");
       VerificarContraseña.setText("********");
    }//GEN-LAST:event_TextFieldEmailMousePressed

    private void TextFieldContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldContraseñaMousePressed
        TextFieldContraseña.setText(" ");
        VerificarContraseña.setText("********");
    }//GEN-LAST:event_TextFieldContraseñaMousePressed

    private void VerificarContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerificarContraseñaMousePressed
            VerificarContraseña.setText(" ");
    }//GEN-LAST:event_VerificarContraseñaMousePressed

    private void SeleccionRolMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleccionRolMousePressed
     SeleccionRol.setBackground(new Color(57,208,240));
    }//GEN-LAST:event_SeleccionRolMousePressed

    private void SeleccionRolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleccionRolMouseExited
        SeleccionRol.setBackground(Color.WHITE);
    }//GEN-LAST:event_SeleccionRolMouseExited

    private void PanelBotonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonRegistroMouseClicked
      Usuario User;
      String nombre,apellido,correo,rol,contraseña;
      int cedula;
      nombre= TextFieldNombre.getText();
      apellido=TextFieldApellido.getText();
     // String textocedula=TextFieldCedula.getText();
      cedula= Integer.valueOf(TextFieldCedula.getText().trim());
      correo=TextFieldEmail.getText();
      rol=SeleccionRol.getSelectedItem().toString();
      contraseña=TextFieldContraseña.getText();
      User=new Usuario(nombre,apellido,cedula,correo,rol,contraseña);
        try {
            switch(rol.toLowerCase()){
            case("estudiante"):
            User.E.Ecarrera=TextFieldCarrera.getText();
            User.E.Efacultad=TextFieldFacultad.getText();
            break;
            case("profesor"):
            User.P.PCarrera=TextFieldCarrera.getText();
            User.P.Pfacultad=TextFieldFacultad.getText();
            User.P.PMateria=TextFieldMateria.getText();
            case("conductor"):
            //User.C.Clicencia=TextFieldMatricula.getText();
            case("empleado"):
            User.Emp.EmpArea=TextFieldArea.getText();
            case("publico general"):
            User.PG.PGDireccion=TextFieldDireccion.getText();
            default:
            break;
            
            }
            GuardarEnData D=new GuardarEnData();
            if(D.GuardarUsuarios(User)){
                String mensaje="!Registro Guardado con Exito \n\n"+"Nombre: "+nombre+" "+apellido+"\n"+"Correo: "+correo;
                JOptionPane.showMessageDialog(this,mensaje, "Registro Exitoso!", JOptionPane.INFORMATION_MESSAGE);
            }
//javax.swing.JOptionPane.showMessageDialog(this, "REGISTRANDO:\n Usuario: " + TextFieldNombre.getText() + "" + TextFieldApellido.getText() + "\n Rol: " + SeleccionRol.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PanelBotonRegistroMouseClicked

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void TextFieldCarreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldCarreraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCarreraMousePressed

    private void TextFieldCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCarreraActionPerformed

    private void TextFieldFacultadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldFacultadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldFacultadMousePressed

    private void TextFieldFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldFacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldFacultadActionPerformed

    private void TextFieldMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMateriaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMateriaMousePressed

    private void TextFieldMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMateriaActionPerformed

    private void TextFieldDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldDireccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDireccionMousePressed

    private void TextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDireccionActionPerformed

    private void TextFieldAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldAreaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAreaMousePressed

    private void TextFieldAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAreaActionPerformed

    private void TextFieldMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMatriculaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMatriculaMousePressed

    private void TextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMatriculaActionPerformed

    private void SeleccionRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleccionRolMouseClicked
        
    }//GEN-LAST:event_SeleccionRolMouseClicked

    private void SeleccionRolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SeleccionRolItemStateChanged
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED){
        String seleccionado=SeleccionRol.getSelectedItem().toString();
        if(seleccionado.equals("Estudiante")){
            TextFieldFacultad.setVisible(true);
            TextFieldCarrera.setVisible(true);
        }else if(seleccionado.equals("Profesor")){
            TextFieldFacultad.setVisible(true);
            TextFieldCarrera.setVisible(true);
            TextFieldMateria.setVisible(true);
        }else if(seleccionado.equals("Empleado")){
            TextFieldArea.setVisible(true);
        }else if(seleccionado.equals("Conducotr")){
            TextFieldMatricula.setVisible(true);
        }else if(seleccionado.equals("Publico General")){
        TextFieldDireccion.setVisible(true);
        }
        }
        
    }//GEN-LAST:event_SeleccionRolItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JPanel PanelBarra;
    private javax.swing.JPanel PanelBotonRegistro;
    private javax.swing.JPanel PanelExit;
    private javax.swing.JComboBox<String> SeleccionRol;
    private javax.swing.JTextField TextFieldApellido;
    private javax.swing.JTextField TextFieldArea;
    private javax.swing.JTextField TextFieldCarrera;
    private javax.swing.JTextField TextFieldCedula;
    private javax.swing.JTextField TextFieldContraseña;
    private javax.swing.JTextField TextFieldDireccion;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldFacultad;
    private javax.swing.JTextField TextFieldMateria;
    private javax.swing.JTextField TextFieldMatricula;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JPasswordField VerificarContraseña;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
