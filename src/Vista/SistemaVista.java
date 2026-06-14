package Vista;

import Control.EstablecerControladores;
import java.awt.Color;
import Funciones.Producto;
import javax.swing.JOptionPane;



public class SistemaVista extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SistemaVista.class.getName());

    public SistemaVista() {
        initComponents();
        setSize(1208,680);
        setResizable(false);
        setTitle("Panel de Administracion");
        setLocationRelativeTo(null);
        EstablecerControladores setting=new EstablecerControladores(this);
        
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuSistema = new javax.swing.JPanel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jPanelMisRecetas = new javax.swing.JPanel();
        jLabelMisRecetas = new javax.swing.JLabel();
        jPanelMedicamentos = new javax.swing.JPanel();
        jLabelMedicamentos = new javax.swing.JLabel();
        jPanelPedidos = new javax.swing.JPanel();
        jLabelPedidos = new javax.swing.JLabel();
        jPanelPromociones = new javax.swing.JPanel();
        jLabelPromociones = new javax.swing.JLabel();
        jPanelRecordatorios = new javax.swing.JPanel();
        jLabelRecordatorios = new javax.swing.JLabel();
        jPanelMiPerfil = new javax.swing.JPanel();
        jLabelMiPerfil = new javax.swing.JLabel();
        jPanelAyuda = new javax.swing.JPanel();
        jLabelAyuda = new javax.swing.JLabel();
        jPanelCerrarSesion = new javax.swing.JPanel();
        jLabelCerrarSesion = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        ICONO = new javax.swing.JLabel();
        Cabezera = new javax.swing.JPanel();
        btn_Foto = new javax.swing.JButton();
        IconoSana_sana = new javax.swing.JLabel();
        FondoCabezera = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelINICIO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelPROXIMADOSIS = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVerRecordatorio = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVerDetalle = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnVerTodos = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnVerPromociones = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelMISRECETAS = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelPEDIDOS = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelMISMEDICAMENTOS = new javax.swing.JPanel();
        txtReceta = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtCATEGORIA = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtVencimiento = new javax.swing.JTextField();
        txtSTOCKACTIVO = new javax.swing.JTextField();
        txtREQUIERERECETAS = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtLaboratorio = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanelPROMOCIONES = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanelRECORDATORIOS = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanelMIPERFIL = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanelAYUDA = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanelCERRARSESION = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        FondoMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuSistema.setBackground(new java.awt.Color(17, 24, 39));
        MenuSistema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInicio.setBackground(new java.awt.Color(17, 24, 39));
        jPanelInicio.setForeground(new java.awt.Color(17, 24, 39));

        jLabelInicio.setBackground(new java.awt.Color(17, 24, 39));
        jLabelInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInicio.setText("   INICIO");

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 30));

        jPanelMisRecetas.setBackground(new java.awt.Color(17, 24, 39));
        jPanelMisRecetas.setForeground(new java.awt.Color(17, 24, 39));

        jLabelMisRecetas.setBackground(new java.awt.Color(17, 24, 39));
        jLabelMisRecetas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMisRecetas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMisRecetas.setText("   MIS RECETAS");
        jLabelMisRecetas.setName(""); // NOI18N

        javax.swing.GroupLayout jPanelMisRecetasLayout = new javax.swing.GroupLayout(jPanelMisRecetas);
        jPanelMisRecetas.setLayout(jPanelMisRecetasLayout);
        jPanelMisRecetasLayout.setHorizontalGroup(
            jPanelMisRecetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMisRecetas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelMisRecetasLayout.setVerticalGroup(
            jPanelMisRecetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMisRecetas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelMisRecetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 35));

        jPanelMedicamentos.setBackground(new java.awt.Color(17, 24, 39));
        jPanelMedicamentos.setForeground(new java.awt.Color(17, 24, 39));

        jLabelMedicamentos.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMedicamentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedicamentos.setText("   MIS MEDICAMENTOS");

        javax.swing.GroupLayout jPanelMedicamentosLayout = new javax.swing.GroupLayout(jPanelMedicamentos);
        jPanelMedicamentos.setLayout(jPanelMedicamentosLayout);
        jPanelMedicamentosLayout.setHorizontalGroup(
            jPanelMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedicamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelMedicamentosLayout.setVerticalGroup(
            jPanelMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedicamentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 35));

        jPanelPedidos.setBackground(new java.awt.Color(17, 24, 39));
        jPanelPedidos.setForeground(new java.awt.Color(17, 24, 39));

        jLabelPedidos.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPedidos.setText("   PEDIDOS");

        javax.swing.GroupLayout jPanelPedidosLayout = new javax.swing.GroupLayout(jPanelPedidos);
        jPanelPedidos.setLayout(jPanelPedidosLayout);
        jPanelPedidosLayout.setHorizontalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelPedidosLayout.setVerticalGroup(
            jPanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 35));

        jPanelPromociones.setBackground(new java.awt.Color(17, 24, 39));
        jPanelPromociones.setForeground(new java.awt.Color(17, 24, 39));

        jLabelPromociones.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPromociones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPromociones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPromociones.setText("   PROMOCIONES");

        javax.swing.GroupLayout jPanelPromocionesLayout = new javax.swing.GroupLayout(jPanelPromociones);
        jPanelPromociones.setLayout(jPanelPromocionesLayout);
        jPanelPromocionesLayout.setHorizontalGroup(
            jPanelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPromociones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelPromocionesLayout.setVerticalGroup(
            jPanelPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPromociones, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 35));

        jPanelRecordatorios.setBackground(new java.awt.Color(17, 24, 39));
        jPanelRecordatorios.setForeground(new java.awt.Color(17, 24, 39));

        jLabelRecordatorios.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRecordatorios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRecordatorios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRecordatorios.setText("   RECORDATORIOS");

        javax.swing.GroupLayout jPanelRecordatoriosLayout = new javax.swing.GroupLayout(jPanelRecordatorios);
        jPanelRecordatorios.setLayout(jPanelRecordatoriosLayout);
        jPanelRecordatoriosLayout.setHorizontalGroup(
            jPanelRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRecordatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelRecordatoriosLayout.setVerticalGroup(
            jPanelRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRecordatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 35));

        jPanelMiPerfil.setBackground(new java.awt.Color(17, 24, 39));
        jPanelMiPerfil.setForeground(new java.awt.Color(17, 24, 39));

        jLabelMiPerfil.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMiPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMiPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiPerfil.setText("   MI PERFIL");

        javax.swing.GroupLayout jPanelMiPerfilLayout = new javax.swing.GroupLayout(jPanelMiPerfil);
        jPanelMiPerfil.setLayout(jPanelMiPerfilLayout);
        jPanelMiPerfilLayout.setHorizontalGroup(
            jPanelMiPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMiPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelMiPerfilLayout.setVerticalGroup(
            jPanelMiPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMiPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 35));

        jPanelAyuda.setBackground(new java.awt.Color(17, 24, 39));
        jPanelAyuda.setForeground(new java.awt.Color(17, 24, 39));

        jLabelAyuda.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAyuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAyuda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAyuda.setText("   AYUDA");

        javax.swing.GroupLayout jPanelAyudaLayout = new javax.swing.GroupLayout(jPanelAyuda);
        jPanelAyuda.setLayout(jPanelAyudaLayout);
        jPanelAyudaLayout.setHorizontalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelAyudaLayout.setVerticalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        MenuSistema.add(jPanelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 35));

        jPanelCerrarSesion.setBackground(new java.awt.Color(17, 24, 39));
        jPanelCerrarSesion.setForeground(new java.awt.Color(17, 24, 39));

        jLabelCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrarSesion.setText("   CERRAR SESION");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/envio rapido.png"))); // NOI18N

        javax.swing.GroupLayout jPanelCerrarSesionLayout = new javax.swing.GroupLayout(jPanelCerrarSesion);
        jPanelCerrarSesion.setLayout(jPanelCerrarSesionLayout);
        jPanelCerrarSesionLayout.setHorizontalGroup(
            jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCerrarSesionLayout.createSequentialGroup()
                .addComponent(jLabelCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCerrarSesionLayout.setVerticalGroup(
            jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuSistema.add(jPanelCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, 200, 30));

        getContentPane().add(MenuSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        Logo.setBackground(new java.awt.Color(17, 24, 39));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ICONO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        Logo.add(ICONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, -230, 1150, 600));

        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        Cabezera.setBackground(new java.awt.Color(0, 255, 153));
        Cabezera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FotoPerfil.png"))); // NOI18N
        btn_Foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabezera.add(btn_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 70, 70));

        IconoSana_sana.setBackground(new java.awt.Color(255, 255, 255));
        IconoSana_sana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoSana_sana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cabezera Sana_sana.png"))); // NOI18N
        Cabezera.add(IconoSana_sana, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 390, 170));

        FondoCabezera.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FondoCabezera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        FondoCabezera.setToolTipText("");
        FondoCabezera.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        FondoCabezera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cabezera.add(FondoCabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 100));

        getContentPane().add(Cabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        jTabbedPane1.setBackground(new java.awt.Color(17, 24, 39));

        jPanelINICIO.setBackground(new java.awt.Color(17, 24, 39));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Hola, Usuario! ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido de nuevo a Sana sana");

        jPanelPROXIMADOSIS.setBackground(new java.awt.Color(20, 30, 48));
        jPanelPROXIMADOSIS.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRÓXIMA DOSIS");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Paracetamol");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hoy 08:00 AM");
        jLabel5.setToolTipText("");

        btnVerRecordatorio.setBackground(new java.awt.Color(0, 180, 255));
        btnVerRecordatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRecordatorio.setText("Ver recordatorio");
        btnVerRecordatorio.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.cyan));
        btnVerRecordatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerRecordatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerRecordatorioMouseExited(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicinas.png"))); // NOI18N
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelPROXIMADOSISLayout = new javax.swing.GroupLayout(jPanelPROXIMADOSIS);
        jPanelPROXIMADOSIS.setLayout(jPanelPROXIMADOSISLayout);
        jPanelPROXIMADOSISLayout.setHorizontalGroup(
            jPanelPROXIMADOSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPROXIMADOSISLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelPROXIMADOSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPROXIMADOSISLayout.createSequentialGroup()
                        .addGroup(jPanelPROXIMADOSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnVerRecordatorio))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPROXIMADOSISLayout.createSequentialGroup()
                        .addGroup(jPanelPROXIMADOSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(757, 757, 757))))
        );
        jPanelPROXIMADOSISLayout.setVerticalGroup(
            jPanelPROXIMADOSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPROXIMADOSISLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGroup(jPanelPROXIMADOSISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPROXIMADOSISLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPROXIMADOSISLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btnVerRecordatorio)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(20, 30, 48));
        jPanel11.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("#PED12345");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Entregado ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" 24/05/2025");

        btnVerDetalle.setBackground(new java.awt.Color(0, 180, 255));
        btnVerDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnVerDetalle.setText("Ver detalles");
        btnVerDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.cyan));
        btnVerDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerDetalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerDetalleMouseExited(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ÚLTIMO PEDIDO");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono neon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerDetalle)
                .addGap(80, 80, 80))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerDetalle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(20, 30, 48));
        jPanel12.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("2");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pendientes");

        btnVerTodos.setBackground(new java.awt.Color(0, 180, 255));
        btnVerTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerTodos.setText("Ver todos");
        btnVerTodos.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.cyan));
        btnVerTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerTodosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerTodosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerTodos)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(btnVerTodos)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jProgressBar1.setBackground(new java.awt.Color(20, 30, 48));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setToolTipText("");
        jProgressBar1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));
        jProgressBar1.setName(""); // NOI18N

        jPanel10.setBackground(new java.awt.Color(20, 30, 48));
        jPanel10.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PROMOCIONES");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono de promociones.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("30%");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("En vitaminas y suplementos");

        btnVerPromociones.setBackground(new java.awt.Color(0, 180, 255));
        btnVerPromociones.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPromociones.setText("Ver Promociones");
        btnVerPromociones.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.cyan));
        btnVerPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerPromocionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerPromocionesMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("Hasta");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnVerPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnVerPromociones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelINICIOLayout = new javax.swing.GroupLayout(jPanelINICIO);
        jPanelINICIO.setLayout(jPanelINICIOLayout);
        jPanelINICIOLayout.setHorizontalGroup(
            jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINICIOLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelINICIOLayout.createSequentialGroup()
                        .addGroup(jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelINICIOLayout.createSequentialGroup()
                        .addGroup(jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelINICIOLayout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelINICIOLayout.createSequentialGroup()
                                .addComponent(jPanelPROXIMADOSIS, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))))
        );
        jPanelINICIOLayout.setVerticalGroup(
            jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINICIOLayout.createSequentialGroup()
                .addGroup(jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelINICIOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelINICIOLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelPROXIMADOSIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelINICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelINICIO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelINICIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("INICIO", jPanel1);

        jPanelMISRECETAS.setBackground(new java.awt.Color(17, 24, 39));

        javax.swing.GroupLayout jPanelMISRECETASLayout = new javax.swing.GroupLayout(jPanelMISRECETAS);
        jPanelMISRECETAS.setLayout(jPanelMISRECETASLayout);
        jPanelMISRECETASLayout.setHorizontalGroup(
            jPanelMISRECETASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanelMISRECETASLayout.setVerticalGroup(
            jPanelMISRECETASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMISRECETAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMISRECETAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MIS RECETAS", jPanel2);

        jPanelPEDIDOS.setBackground(new java.awt.Color(17, 24, 39));

        javax.swing.GroupLayout jPanelPEDIDOSLayout = new javax.swing.GroupLayout(jPanelPEDIDOS);
        jPanelPEDIDOS.setLayout(jPanelPEDIDOSLayout);
        jPanelPEDIDOSLayout.setHorizontalGroup(
            jPanelPEDIDOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanelPEDIDOSLayout.setVerticalGroup(
            jPanelPEDIDOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPEDIDOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPEDIDOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PEDIDOS", jPanel3);

        jPanelMISMEDICAMENTOS.setBackground(new java.awt.Color(17, 24, 39));
        jPanelMISMEDICAMENTOS.setForeground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(20, 30, 48));
        jPanel13.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Registrar Producto: ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre del producto : ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Categoria: ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Precio Venta");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Precio compra: ");

        txtProducto.addActionListener(this::txtProductoActionPerformed);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCATEGORIA)
                            .addComponent(txtProducto))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtPrecioCompra))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(20, 30, 48));
        jPanel14.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Requiere recetas : ");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Stock activo : ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Fecha de vencimiento: ");

        txtVencimiento.addActionListener(this::txtVencimientoActionPerformed);

        btnRegistrar.setBackground(new java.awt.Color(0, 180, 255));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Laboratorio: ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSTOCKACTIVO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtREQUIERERECETAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVencimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLaboratorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtREQUIERERECETAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtSTOCKACTIVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(28, 28, 28)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(20, 30, 48));
        jPanel15.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/envio rapido.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(20, 30, 48));
        jPanel16.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos originales.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(20, 30, 48));
        jPanel17.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMISMEDICAMENTOSLayout = new javax.swing.GroupLayout(jPanelMISMEDICAMENTOS);
        jPanelMISMEDICAMENTOS.setLayout(jPanelMISMEDICAMENTOSLayout);
        jPanelMISMEDICAMENTOSLayout.setHorizontalGroup(
            jPanelMISMEDICAMENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanelMISMEDICAMENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMISMEDICAMENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(txtReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMISMEDICAMENTOSLayout.setVerticalGroup(
            jPanelMISMEDICAMENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanelMISMEDICAMENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                        .addComponent(txtReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMISMEDICAMENTOSLayout.createSequentialGroup()
                        .addGroup(jPanelMISMEDICAMENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanelMISMEDICAMENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(129, 129, 129))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanelMISMEDICAMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanelMISMEDICAMENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MIS MEDICAMENTOS", jPanel4);

        jPanelPROMOCIONES.setBackground(new java.awt.Color(17, 24, 39));

        javax.swing.GroupLayout jPanelPROMOCIONESLayout = new javax.swing.GroupLayout(jPanelPROMOCIONES);
        jPanelPROMOCIONES.setLayout(jPanelPROMOCIONESLayout);
        jPanelPROMOCIONESLayout.setHorizontalGroup(
            jPanelPROMOCIONESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanelPROMOCIONESLayout.setVerticalGroup(
            jPanelPROMOCIONESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPROMOCIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPROMOCIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PROMOCIONES", jPanel5);

        jPanelRECORDATORIOS.setBackground(new java.awt.Color(17, 24, 39));

        javax.swing.GroupLayout jPanelRECORDATORIOSLayout = new javax.swing.GroupLayout(jPanelRECORDATORIOS);
        jPanelRECORDATORIOS.setLayout(jPanelRECORDATORIOSLayout);
        jPanelRECORDATORIOSLayout.setHorizontalGroup(
            jPanelRECORDATORIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanelRECORDATORIOSLayout.setVerticalGroup(
            jPanelRECORDATORIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRECORDATORIOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRECORDATORIOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("RECORDATORIOS", jPanel6);

        jPanelMIPERFIL.setBackground(new java.awt.Color(17, 24, 39));

        javax.swing.GroupLayout jPanelMIPERFILLayout = new javax.swing.GroupLayout(jPanelMIPERFIL);
        jPanelMIPERFIL.setLayout(jPanelMIPERFILLayout);
        jPanelMIPERFILLayout.setHorizontalGroup(
            jPanelMIPERFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanelMIPERFILLayout.setVerticalGroup(
            jPanelMIPERFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMIPERFIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMIPERFIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MI PERFIL", jPanel7);

        jPanelAYUDA.setBackground(new java.awt.Color(17, 24, 39));

        javax.swing.GroupLayout jPanelAYUDALayout = new javax.swing.GroupLayout(jPanelAYUDA);
        jPanelAYUDA.setLayout(jPanelAYUDALayout);
        jPanelAYUDALayout.setHorizontalGroup(
            jPanelAYUDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanelAYUDALayout.setVerticalGroup(
            jPanelAYUDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAYUDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAYUDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("AYUDA", jPanel8);

        jPanelCERRARSESION.setBackground(new java.awt.Color(17, 24, 39));

        jPanel18.setBackground(new java.awt.Color(17, 24, 39));
        jPanel18.setName("Seguro quieres salir?"); // NOI18N

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Seguro que deeas salir?");

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");

        btnSalir.setBackground(new java.awt.Color(0, 180, 255));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SI, SALIR");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Te extrañaremos");
        jLabel34.setToolTipText("");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(141, 141, 141))))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addGap(38, 38, 38)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout jPanelCERRARSESIONLayout = new javax.swing.GroupLayout(jPanelCERRARSESION);
        jPanelCERRARSESION.setLayout(jPanelCERRARSESIONLayout);
        jPanelCERRARSESIONLayout.setHorizontalGroup(
            jPanelCERRARSESIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCERRARSESIONLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanelCERRARSESIONLayout.setVerticalGroup(
            jPanelCERRARSESIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCERRARSESIONLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCERRARSESION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCERRARSESION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CERRAR SESION", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 1010, 570));

        FondoMuestra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Farmacia Sana_sana.png"))); // NOI18N
        FondoMuestra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(FondoMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPromocionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPromocionesMouseEntered
        // TODO add your handling code here:
         btnVerPromociones.setBackground(new Color(0,255,255));
    }//GEN-LAST:event_btnVerPromocionesMouseEntered

    private void btnVerPromocionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPromocionesMouseExited
        // TODO add your handling code here:
         btnVerPromociones.setBackground(new Color(20,30,48));
    }//GEN-LAST:event_btnVerPromocionesMouseExited

    private void btnVerRecordatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRecordatorioMouseEntered
        // TODO add your handling code here:
        btnVerRecordatorio.setBackground(new Color(0,255,255));
    }//GEN-LAST:event_btnVerRecordatorioMouseEntered

    private void btnVerRecordatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRecordatorioMouseExited
        // TODO add your handling code here:
          btnVerRecordatorio.setBackground(new Color(20,30,48));
    }//GEN-LAST:event_btnVerRecordatorioMouseExited

    private void btnVerDetalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetalleMouseExited
        // TODO add your handling code here:
         btnVerDetalle.setBackground(new Color(20,30,48));
    }//GEN-LAST:event_btnVerDetalleMouseExited

    private void btnVerDetalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetalleMouseEntered
        // TODO add your handling code here:
         btnVerDetalle.setBackground(new Color(0,255,255));
    }//GEN-LAST:event_btnVerDetalleMouseEntered

    private void btnVerTodosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerTodosMouseEntered
        // TODO add your handling code here:
           btnVerTodos.setBackground(new Color(0,255,255));
    }//GEN-LAST:event_btnVerTodosMouseEntered

    private void btnVerTodosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerTodosMouseExited
        // TODO add your handling code here:
          btnVerTodos.setBackground(new Color(20,30,48));
    }//GEN-LAST:event_btnVerTodosMouseExited

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVencimientoActionPerformed

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        // TODO add your handling code here:
         btnRegistrar.setBackground(new Color(20,30,48));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        // TODO add your handling code here:
         btnRegistrar.setBackground(new Color(0,255,255));
    }//GEN-LAST:event_btnRegistrarMouseEntered


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new SistemaVista().setVisible(true));
    }
    

    public void VaciarCampos(){
    txtProducto.setText("");
     txtCATEGORIA.setText("");
txtVencimiento.setText("");
txtPrecioVenta.setText("");
txtPrecioCompra.setText("");
txtLaboratorio.setText("");
txtReceta.setText("");
txtStock.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabezera;
    private javax.swing.JLabel FondoCabezera;
    private javax.swing.JLabel FondoMuestra;
    private javax.swing.JLabel ICONO;
    private javax.swing.JLabel IconoSana_sana;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel MenuSistema;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVerDetalle;
    public javax.swing.JButton btnVerPromociones;
    public javax.swing.JButton btnVerRecordatorio;
    public javax.swing.JButton btnVerTodos;
    private javax.swing.JButton btn_Foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelAyuda;
    public javax.swing.JLabel jLabelCerrarSesion;
    public javax.swing.JLabel jLabelInicio;
    public javax.swing.JLabel jLabelMedicamentos;
    public javax.swing.JLabel jLabelMiPerfil;
    public javax.swing.JLabel jLabelMisRecetas;
    public javax.swing.JLabel jLabelPedidos;
    public javax.swing.JLabel jLabelPromociones;
    public javax.swing.JLabel jLabelRecordatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAYUDA;
    public javax.swing.JPanel jPanelAyuda;
    private javax.swing.JPanel jPanelCERRARSESION;
    public javax.swing.JPanel jPanelCerrarSesion;
    private javax.swing.JPanel jPanelINICIO;
    public javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelMIPERFIL;
    private javax.swing.JPanel jPanelMISMEDICAMENTOS;
    private javax.swing.JPanel jPanelMISRECETAS;
    public javax.swing.JPanel jPanelMedicamentos;
    public javax.swing.JPanel jPanelMiPerfil;
    public javax.swing.JPanel jPanelMisRecetas;
    private javax.swing.JPanel jPanelPEDIDOS;
    private javax.swing.JPanel jPanelPROMOCIONES;
    private javax.swing.JPanel jPanelPROXIMADOSIS;
    public javax.swing.JPanel jPanelPedidos;
    public javax.swing.JPanel jPanelPromociones;
    private javax.swing.JPanel jPanelRECORDATORIOS;
    public javax.swing.JPanel jPanelRecordatorios;
    public javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCATEGORIA;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtREQUIERERECETAS;
    private javax.swing.JTextField txtReceta;
    private javax.swing.JTextField txtSTOCKACTIVO;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
