package Vista;
import Funciones.Usuario;
import javax.swing.JOptionPane;

public class RegistroVista extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroVista.class.getName());

    
    public RegistroVista() {
    initComponents();
    setSize(965, 430);
    setResizable(false);
    setTitle("Registro de Usuarios");
    setLocationRelativeTo(null);
    this.repaint();
    lbErrorNombres.setVisible(false);
    lbErrorApellidos.setVisible(false);
    lbErrorUsuario.setVisible(false);
    lbErrorContraseña.setVisible(false);
    lbErrorContraseña2.setVisible(false);
    lbErrorCorreo.setVisible(false);
    lbErrorTelefono.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Icono = new javax.swing.JLabel();
        txt_RegistroUsuario = new javax.swing.JLabel();
        FondoBienvenida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellidos = new javax.swing.JTextField();
        txt_Usuario = new javax.swing.JTextField();
        txt_Contraseña = new javax.swing.JTextField();
        txt_CorreoElectronico = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_ConfirmarContraseña = new javax.swing.JTextField();
        lbErrorNombres = new javax.swing.JLabel();
        lbErrorApellidos = new javax.swing.JLabel();
        lbErrorContraseña = new javax.swing.JLabel();
        lbErrorCorreo = new javax.swing.JLabel();
        lbErrorUsuario = new javax.swing.JLabel();
        lbErrorTelefono = new javax.swing.JLabel();
        lbErrorContraseña2 = new javax.swing.JLabel();
        FondoRegistroUsuarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image (1).png"))); // NOI18N
        Icono.setText("Ingrese nombres");
        Icono.setToolTipText("");
        jPanel1.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 430, 590));

        txt_RegistroUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_RegistroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/txt_RegistrarUsuario.png"))); // NOI18N
        txt_RegistroUsuario.setText("jLabel9");
        jPanel1.add(txt_RegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 600, 270));

        FondoBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoBienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        FondoBienvenida.setText("jLabel9");
        FondoBienvenida.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(FondoBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 402));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE USUARIOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CORREO ELECTRONICO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        btn_Registrar.setBackground(new java.awt.Color(0, 102, 102));
        btn_Registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("REGISTRAR");
        btn_Registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Registrar.addActionListener(this::btn_RegistrarActionPerformed);
        jPanel2.add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDOS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONTRASEÑA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        txt_Nombre.addActionListener(this::txt_NombreActionPerformed);
        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NombreKeyReleased(evt);
            }
        });
        jPanel2.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 160, -1));
        jPanel2.add(txt_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 170, -1));
        jPanel2.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, -1));
        jPanel2.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 160, -1));
        jPanel2.add(txt_CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 160, -1));
        jPanel2.add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONFIRMAR CONTRASEÑA");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        txt_ConfirmarContraseña.addActionListener(this::txt_ConfirmarContraseñaActionPerformed);
        jPanel2.add(txt_ConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 160, -1));

        lbErrorNombres.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorNombres.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorNombres.setText("Ingresar nombres");
        jPanel2.add(lbErrorNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        lbErrorApellidos.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorApellidos.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorApellidos.setText("Ingresar apellidos");
        jPanel2.add(lbErrorApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 20));

        lbErrorContraseña.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorContraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorContraseña.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorContraseña.setText("Ingresar contraseña");
        jPanel2.add(lbErrorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, 20));

        lbErrorCorreo.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorCorreo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorCorreo.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorCorreo.setText("Ingresar correo");
        jPanel2.add(lbErrorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        lbErrorUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorUsuario.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorUsuario.setText("Ingresar usuario");
        jPanel2.add(lbErrorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));

        lbErrorTelefono.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorTelefono.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorTelefono.setText("Ingresar teléfono");
        jPanel2.add(lbErrorTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 20));

        lbErrorContraseña2.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorContraseña2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorContraseña2.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorContraseña2.setText("Confirma la contraseña");
        jPanel2.add(lbErrorContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, 20));

        FondoRegistroUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        FondoRegistroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        FondoRegistroUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        FondoRegistroUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        FondoRegistroUsuarios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(FondoRegistroUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 450, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 0, -1, 402));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        
        
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_ConfirmarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ConfirmarContraseñaActionPerformed
        
    }//GEN-LAST:event_txt_ConfirmarContraseñaActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
            String nameUsuario = txt_Usuario.getText().trim();

    String nombre = txt_Nombre.getText().trim();
    String apellidos = txt_Apellidos.getText().trim();
    String correo = txt_CorreoElectronico.getText().trim();
    String telefono = txt_Telefono.getText().trim();
    String contrasena = txt_Contraseña.getText();
    String confirmar = txt_ConfirmarContraseña.getText();
    Usuario u = new Usuario();
    
    // VALIDAR CAMPOS VACÍOS
    if(nameUsuario.isEmpty()){
        lbErrorUsuario.setVisible(true);    }
    if(nombre.isEmpty()){
        lbErrorNombres.setVisible(true);}
    if(apellidos.isEmpty()){
        lbErrorApellidos.setVisible(true);}
    if(correo.isEmpty()){
        lbErrorCorreo.setVisible(true);}
    if(contrasena.isEmpty()){
        lbErrorContraseña.setVisible(true);}
    if(!telefono.matches("\\d{9}")){
        lbErrorTelefono.setVisible(true);}
    if(!contrasena.equals(confirmar)){
        lbErrorContraseña2.setVisible(true);
        return;}
    
    
    if(nameUsuario.isEmpty() ||
       nombre.isEmpty() ||
       apellidos.isEmpty() ||
       correo.isEmpty() ||
       contrasena.isEmpty() ||
       !telefono.matches("\\d{9}") ||
       !contrasena.equals(confirmar)){
        JOptionPane.showMessageDialog(null,
                "Ingrese correctamente los datos",
                "ERROR",
                JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // VALIDAR USUARIO REPETIDO
    if(u.AutenticacionUsuario(nameUsuario)){

        JOptionPane.showMessageDialog(null,
                "El usuario ya existe",
                "ERROR",
                JOptionPane.ERROR_MESSAGE);
        return;
    }


    
    // REGISTRAR
    int telefonoInt = Integer.parseInt(telefono);
    u.RegistraUsuario(nameUsuario,
                      nombre,
                      apellidos,
                      correo,
                      telefonoInt,
                      contrasena);
    JOptionPane.showMessageDialog(null,
            "Registro Exitoso !!");

    
    LoginVista LV = new LoginVista();
    LV.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void txt_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyReleased
        // TODO add your handling code here:
    lbErrorNombres.setVisible(false);
    lbErrorApellidos.setVisible(false);
    lbErrorUsuario.setVisible(false);
    lbErrorContraseña.setVisible(false);
    lbErrorContraseña2.setVisible(false);
    lbErrorCorreo.setVisible(false);
    lbErrorTelefono.setVisible(false);
    }//GEN-LAST:event_txt_NombreKeyReleased

    /*
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RegistroVista().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoBienvenida;
    private javax.swing.JLabel FondoRegistroUsuarios;
    private javax.swing.JLabel Icono;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbErrorApellidos;
    private javax.swing.JLabel lbErrorContraseña;
    private javax.swing.JLabel lbErrorContraseña2;
    private javax.swing.JLabel lbErrorCorreo;
    private javax.swing.JLabel lbErrorNombres;
    private javax.swing.JLabel lbErrorTelefono;
    private javax.swing.JLabel lbErrorUsuario;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_ConfirmarContraseña;
    private javax.swing.JTextField txt_Contraseña;
    private javax.swing.JTextField txt_CorreoElectronico;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JLabel txt_RegistroUsuario;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
