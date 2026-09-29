
package Modulo_1.Vista1;
import java.util.logging.Logger;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import Modulo_1.Modelo1.GuardarEnData;
import data.Usuario.Usuario;

public class Interfaz_Registro extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Interfaz_Registro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="GeneratedCode">//GEN-BEGIN:initComponents
private void initComponents() {
jFrame1 = new javax.swing.JFrame();
jScrollPane1 = new javax.swing.JScrollPane();
jList1 = new javax.swing.JList<>();
jLabel1 = new javax.swing.JLabel();
jPanel1 = new javax.swing.JPanel();
jPanel3 = new javax.swing.JPanel();
jPanel4 = new javax.swing.JPanel();
jPanel5 = new javax.swing.JPanel();
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
PanelBarra = new javax.swing.JPanel();
PanelExit = new javax.swing.JPanel();
jLabel4 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();

javax.swing.GroupLayout jFrame1Layout = new
javax.swing.GroupLayout(jFrame1.getContentPane());
jFrame1.getContentPane().setLayout(jFrame1Layout);
jFrame1Layout.setHorizontalGroup(
jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGap(0, 400, Short.MAX_VALUE));

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
setPreferredSize(new java.awt.Dimension(1200, 700));
setResizable(false);

jPanel1.setBackground(new java.awt.Color(255, 255, 255));
jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
jPanel1.setLayout(null);

jPanel3.setBackground(new java.awt.Color(32, 117, 135));
jPanel3.setLayout(null);
jPanel1.add(jPanel3);
jPanel3.setBounds(410, 70, 0, 0);

jPanel4.setLayout(null);
jPanel1.add(jPanel4);
jPanel4.setBounds(550, 80, 0, 0);

jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5,javax.swing.BoxLayout.LINE_AXIS));
jPanel1.add(jPanel5);
jPanel5.setBounds(560, 90, 0, 0);

jPanel2.setBackground(new java.awt.Color(0, 0, 0));
jPanel2.setLayout(null);

jPanel6.setBackground(new java.awt.Color(32, 117, 135));
jPanel6.setLayout(null); // Cambio clave a null para diseño absoluto

jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IMG-20260925-WA0003.jpg"))); //NOI18N
jLabel3.setText("jLabel3");
jPanel6.add(jLabel3);
jLabel3.setBounds(37, 2, 278, 140); // Ajusta la altura según tu imagen si es necesario
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
jPanel6.add(TextFieldNombre);
TextFieldNombre.setBounds(37, 145, 292, 22);
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
jPanel6.add(TextFieldApellido);
TextFieldApellido.setBounds(37, 186, 292, 22);
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
jPanel6.add(TextFieldCedula);
TextFieldCedula.setBounds(37, 227, 292, 22);
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
jPanel6.add(TextFieldEmail);
TextFieldEmail.setBounds(37, 268, 292, 22);
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
jPanel6.add(TextFieldContraseña);
TextFieldContraseña.setBounds(37, 309, 292, 22);
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
jPanel6.add(VerificarContraseña);
VerificarContraseña.setBounds(37, 350, 292, 22);
SeleccionRol.setBackground(new java.awt.Color(255, 255, 255));
SeleccionRol.setForeground(new java.awt.Color(51, 51, 51));
SeleccionRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
"Seleccione Rol", "Estudiante", "Profesor", "Empleado", "Publico General" }));
SeleccionRol.setBorder(null);
SeleccionRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
SeleccionRol.addMouseListener(new java.awt.event.MouseAdapter() {
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
jPanel6.add(SeleccionRol);
SeleccionRol.setBounds(37, 391, 292, 22);
PanelBotonRegistro.setBackground(new java.awt.Color(234, 197, 48));
PanelBotonRegistro.setCursor(new
java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
PanelBotonRegistro.setLayout(null); // Diseño interno del botón
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
PanelBotonRegistro.add(LabelRegistro);
LabelRegistro.setBounds(26, 6, 90, 23);
jPanel6.add(PanelBotonRegistro);
PanelBotonRegistro.setBounds(122, 440, 140, 35);
jPanel2.add(jPanel6);
jPanel6.setBounds(30, 0, 390, 570);
jPanel1.add(jPanel2);
jPanel2.setBounds(400, 50, 420, 570);
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
PanelBarra.setLayout(null);
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
PanelExit.setLayout(null);
jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
jLabel4.setText("X");
jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
PanelExit.add(jLabel4);
jLabel4.setBounds(23, 6, 26, 16);
PanelBarra.add(PanelExit);
PanelExit.setBounds(1161, 10, 49, 30);
jPanel1.add(PanelBarra);
PanelBarra.setBounds(-10, -10, 1210, 40);
jLabel2.setIcon(new
javax.swing.ImageIcon(getClass().getResource("/Image/Principal.jpg"))); // NOI18N
jLabel2.setText("jLabel2");
jLabel2.setPreferredSize(new java.awt.Dimension(1245, 700));
jPanel1.add(jLabel2);
jLabel2.setBounds(0, 0, 1200, 700);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200,
Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700,
Short.MAX_VALUE)
);
pack();
}// </editor-fold>

    private void TextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldApellidoActionPerformed
      
    }//GEN-LAST:event_TextFieldApellidoActionPerformed

    private void TextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailActionPerformed
       
    }//GEN-LAST:event_TextFieldEmailActionPerformed

    private void TextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldContraseñaActionPerformed
      
    }//GEN-LAST:event_TextFieldContraseñaActionPerformed

    private void SeleccionRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionRolActionPerformed
       
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
      String nombre,apellido,correo,rol;
      int cedula;
      nombre= TextFieldNombre.getText();
      apellido=TextFieldApellido.getText();
     // String textocedula=TextFieldCedula.getText();
      cedula= Integer.valueOf(TextFieldCedula.getText().trim());
      correo=TextFieldEmail.getText();
      rol=SeleccionRol.getSelectedItem().toString();
      User=new Usuario(nombre,apellido,cedula,correo,rol);
        try {
            GuardarEnData D=new GuardarEnData();
            if(D.GuardarUsuarios(User)){
                String mensaje="!Registro Guardado con Exito \n\n"+"Nombre: "+nombre+" "+apellido+"\n"+"Correo: "+correo;
                JOptionPane.showMessageDialog(this,mensaje, "Registro Exitoso!", JOptionPane.INFORMATION_MESSAGE);
            }
//javax.swing.JOptionPane.showMessageDialog(this, "REGISTRANDO:\n Usuario: " + TextFieldNombre.getText() + "" + TextFieldApellido.getText() + "\n Rol: " + SeleccionRol.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        //javax.swing.JOptionPane.showMessageDialog(this, "REGISTRANDO:\n Usuario: " + TextFieldNombre.getText() + "" + TextFieldApellido.getText() + "\n Rol: " + SeleccionRol.getSelectedItem().toString());
    }//GEN-LAST:event_PanelBotonRegistroMouseClicked

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
    private javax.swing.JTextField TextFieldCedula;
    private javax.swing.JTextField TextFieldContraseña;
    private javax.swing.JTextField TextFieldEmail;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
