package Vista;
import Conexion.SQLConexion;
import Funciones.Usuario;
import Modelo.MSesion;
import javax.swing.JOptionPane;
import java.sql.Connection;
import Funciones.Cliente;

public class LoginVista extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginVista.class.getName());

    public LoginVista() {
        initComponents();
        setSize(930,420);
        setResizable(false);
        setTitle("Ingresar al Sistema");
        setLocationRelativeTo(null);
        this.repaint(); 
        lbUsuarioVacio.setVisible(false);
        lbContraseñaVacia.setVisible(false);
        lbErrorUsuario.setVisible(false);
        lbErrorContraseña.setVisible(false);
        
     
             }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbRegistrase = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();
        txt_Usuario = new javax.swing.JTextField();
        lbContraseñaVacia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbErrorContraseña = new javax.swing.JLabel();
        lbErrorUsuario = new javax.swing.JLabel();
        lbUsuarioVacio = new javax.swing.JLabel();
        fondoIniciarSesion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Texto = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 60));

        lbRegistrase.setBackground(new java.awt.Color(255, 255, 255));
        lbRegistrase.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        lbRegistrase.setForeground(new java.awt.Color(255, 255, 255));
        lbRegistrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegistrase.setText("Registrase");
        lbRegistrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRegistraseMouseClicked(evt);
            }
        });
        jPanel1.add(lbRegistrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 100, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        btn_Ingresar.setBackground(new java.awt.Color(0, 102, 102));
        btn_Ingresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ingresar.setText("INGRESAR");
        btn_Ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Ingresar.addActionListener(this::btn_IngresarActionPerformed);
        jPanel1.add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 140, -1));

        txt_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Contraseña.setName("txtContraseña"); // NOI18N
        jPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 210, 30));

        txt_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Usuario.setName("txtUsuario"); // NOI18N
        txt_Usuario.addActionListener(this::txt_UsuarioActionPerformed);
        txt_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_UsuarioKeyReleased(evt);
            }
        });
        jPanel1.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 30));

        lbContraseñaVacia.setBackground(new java.awt.Color(255, 255, 255));
        lbContraseñaVacia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbContraseñaVacia.setForeground(new java.awt.Color(255, 51, 51));
        lbContraseñaVacia.setText("Ingrese contraseña");
        jPanel1.add(lbContraseñaVacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 110, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUARIO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 90, -1));

        lbErrorContraseña.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorContraseña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorContraseña.setForeground(new java.awt.Color(255, 51, 51));
        lbErrorContraseña.setText("Contraseña invalida");
        jPanel1.add(lbErrorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 120, 20));

        lbErrorUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbErrorUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbErrorUsuario.setForeground(new java.awt.Color(255, 51, 51));
        lbErrorUsuario.setText("Usuario o contraseña incorrecta");
        jPanel1.add(lbErrorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 190, 20));

        lbUsuarioVacio.setBackground(new java.awt.Color(255, 255, 255));
        lbUsuarioVacio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbUsuarioVacio.setForeground(new java.awt.Color(255, 51, 51));
        lbUsuarioVacio.setText("Ingrese usuario");
        jPanel1.add(lbUsuarioVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 90, 20));

        fondoIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        jPanel1.add(fondoIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 490, 420));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/txt de la Farmacia Sana_sana.png"))); // NOI18N
        jPanel2.add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, 290));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image (1).png"))); // NOI18N
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 530, 610));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        jPanel2.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
       String Usuario = txt_Usuario.getText();
       String Contraseña = String.valueOf(txt_Contraseña.getPassword());
       Usuario u = new Usuario();
       Cliente funcionCliente = new Cliente();
       
       if(txt_Usuario.getText().isEmpty())
           lbUsuarioVacio.setVisible(true);
       
       if(txt_Contraseña.getText().isEmpty()){
           lbContraseñaVacia.setVisible(true); 
       return ; }
       

       
    if (u.AutenticacionUsuario(Usuario)
        && u.AutenticacionContraseña(Contraseña)) 
    {
    MSesion.UsuarioActual = Usuario;
    MSesion.IDcliente = funcionCliente.ObtenerIdCliente();
    
    if(!funcionCliente.existeClientePorUsuario(Usuario)){
        funcionCliente.CrearClienteDesdeUsuario();
    }

    

    String rol = u.ObtenerRol(Usuario);

    switch (rol) {

        case "Cliente":

            FormCliente formCliente = new FormCliente();
            formCliente.setVisible(true);
            break;

        case "Almacenero":

            FormAlmacenero formAlmacenero =
                    new FormAlmacenero();
            formAlmacenero.setVisible(true);
            break;

        case "Cajero":

//            FormCajero formCajero =
//                    new FormCajero();
//            formCajero.setVisible(true);
            break;

        case "Administrador":

//            FormAdministrador formAdmin =
//                    new FormAdministrador();
//            formAdmin.setVisible(true);
            break;

        default:

            JOptionPane.showMessageDialog(
                    this,
                    "Rol no reconocido");
            return;
    }

    this.dispose();
    
//       else{
//           lbErrorUsuario.setVisible(true);
//           
////        if(!u.AutenticacionUsuario(Usuario))
////           lbErrorUsuario.setVisible(true);
////       
////        if(!u.AutenticacionContraseña(Contraseña))
////           lbErrorContraseña.setVisible(true);
//       }
    }
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txt_UsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UsuarioKeyReleased
        // TODO add your handling code here:
        lbUsuarioVacio.setVisible(false);
        lbContraseñaVacia.setVisible(false);
        lbErrorUsuario.setVisible(false);
        lbErrorContraseña.setVisible(false);
    }//GEN-LAST:event_txt_UsuarioKeyReleased

    private void lbRegistraseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegistraseMouseClicked
        // TODO add your handling code here:
        RegistroVista RV = new RegistroVista();
        RV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbRegistraseMouseClicked

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_UsuarioActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new LoginVista().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Texto;
    public javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel fondoIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbContraseñaVacia;
    private javax.swing.JLabel lbErrorContraseña;
    private javax.swing.JLabel lbErrorUsuario;
    private javax.swing.JLabel lbRegistrase;
    private javax.swing.JLabel lbUsuarioVacio;
    public javax.swing.JPasswordField txt_Contraseña;
    public javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables

   
}
