package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;

import Conexion.Conexion;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class App extends javax.swing.JFrame {
    
    Conexion conexion = new Conexion();
    
    Color color = new Color(72, 53, 132);
    Color colorButton = new Color(120, 7, 144);
    Color colorHover = new Color(145, 0, 175);
    Color colorClick = new Color(94, 0, 115);
    
    Color LayoutExit = new Color(44, 182, 146);
    Color LayoutExitHover = new Color(50, 204, 164);
    Color LayoutExitClick = new Color(34, 148, 118);
    
    Color LayoutItem = new Color(72, 53, 132);
    Color LayoutItemHover = new Color(148, 10, 177);
    Color LayoutItemClick = new Color(189, 3, 183);
    Color LayoutItemClicked = new Color(120, 7, 144);
    
    Color ConstruidoNormal = new Color(44, 182, 146);
    Color ConstruidoHover = new Color(14, 206, 156);
    Color ConstruidoClick = new Color(20, 149, 115);
    
    Color NoConstruidoNormal = new Color(120, 7, 145);
    Color NoConstruidoHover = new Color(148, 3, 180);
    Color NoConstruidoClick = new Color(98, 3, 119);
    
    int xMouse, yMouse;

    public App() {
        initComponents();
        Navbar.setVisible(false);
        this.setLocationRelativeTo(null);
        setIconImage(getIconImage());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        Container = new javax.swing.JPanel();
        SesionContainer = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        Tittle = new javax.swing.JLabel();
        Rut = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        PassContainer = new javax.swing.JPanel();
        Pass = new javax.swing.JPasswordField();
        Separator2 = new javax.swing.JSeparator();
        Send = new javax.swing.JPanel();
        SendText = new javax.swing.JLabel();
        ExitContainer = new javax.swing.JPanel();
        Exit = new javax.swing.JPanel();
        ExitText = new javax.swing.JLabel();
        Navbar = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        Dragged = new javax.swing.JPanel();
        HeaderText = new javax.swing.JLabel();
        HeaderBrowser = new javax.swing.JTextField();
        HeaderSeparator = new javax.swing.JSeparator();
        UserContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AdminImage = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        Layout = new javax.swing.JPanel();
        Fondos = new javax.swing.JLabel();
        LayoutSeparator = new javax.swing.JSeparator();
        FondosTextContainer = new Ventanas.PanelRound();
        FondosText = new javax.swing.JLabel();
        SalirContainer = new Ventanas.PanelRound();
        SalirText = new javax.swing.JLabel();
        ListaContainer = new javax.swing.JPanel();
        InicioContainer = new javax.swing.JPanel();
        InicioChildContainer = new javax.swing.JPanel();
        InicioText = new javax.swing.JLabel();
        AportesContainer = new javax.swing.JPanel();
        AportesChildContainer = new javax.swing.JPanel();
        AportesText = new javax.swing.JLabel();
        IngresosContainer = new javax.swing.JPanel();
        IngresosChildContainer = new javax.swing.JPanel();
        IngresosText = new javax.swing.JLabel();
        RegistroContainer = new javax.swing.JPanel();
        RegistroChildContainer = new javax.swing.JPanel();
        RegistroText = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        Idle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Informacion = new javax.swing.JPanel();
        ParcelaContainer = new Ventanas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Metros = new javax.swing.JLabel();
        Numeracion = new javax.swing.JLabel();
        Etapa = new javax.swing.JLabel();
        Construido = new javax.swing.JLabel();
        Agua = new javax.swing.JLabel();
        Luz = new javax.swing.JLabel();
        PropietarioContainer = new Ventanas.PanelRound();
        jLabel27 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        RutPropietario = new javax.swing.JLabel();
        NombrePropietario = new javax.swing.JLabel();
        ApellidoPropietario = new javax.swing.JLabel();
        CorreoPropietario = new javax.swing.JLabel();
        NumeroPropietario = new javax.swing.JLabel();
        ArrendatarioContainer = new Ventanas.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        RutArrendatario = new javax.swing.JLabel();
        NombreArrendatario = new javax.swing.JLabel();
        ApellidoArrendatario = new javax.swing.JLabel();
        CorreoArrendatario = new javax.swing.JLabel();
        NumeroArrendatario = new javax.swing.JLabel();
        VehiculosContainer = new Ventanas.PanelRound();
        jLabel21 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        AutoMarca = new javax.swing.JLabel();
        ModeloAuto = new javax.swing.JLabel();
        AutoColor = new javax.swing.JLabel();
        AutoTipo = new javax.swing.JLabel();
        AutoPatente = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        ParcelacionTittle = new javax.swing.JLabel();
        ParcelacionContainer = new javax.swing.JPanel();
        Parcelacion1 = new javax.swing.JPanel();
        parcela1text = new javax.swing.JLabel();
        Parcelacion2 = new javax.swing.JPanel();
        parcela2text = new javax.swing.JLabel();
        Parcelacion3 = new javax.swing.JPanel();
        parcela3text = new javax.swing.JLabel();
        Parcelacion4 = new javax.swing.JPanel();
        parcela4text = new javax.swing.JLabel();
        Parcelacion5 = new javax.swing.JPanel();
        parcela5text = new javax.swing.JLabel();
        Parcelacion6 = new javax.swing.JPanel();
        parcela6text = new javax.swing.JLabel();
        Parcelacion7 = new javax.swing.JPanel();
        parcela7text = new javax.swing.JLabel();
        ConstruidoContainer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Ingreso = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Egresos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ingresos = new javax.swing.JTable();
        Registrar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        Aportes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAportes = new javax.swing.JTable();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(72, 53, 132));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(72, 53, 132));
        Container.setPreferredSize(new java.awt.Dimension(1280, 720));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SesionContainer.setBackground(new java.awt.Color(72, 53, 132));

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon.png"))); // NOI18N

        Tittle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        Tittle.setForeground(new java.awt.Color(255, 255, 255));
        Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tittle.setText("Inicio de sesion");
        Tittle.setToolTipText("");

        Rut.setBackground(new java.awt.Color(72, 53, 132));
        Rut.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Rut.setForeground(new java.awt.Color(153, 153, 153));
        Rut.setText("Ingrese su rut");
        Rut.setToolTipText("");
        Rut.setBorder(null);
        Rut.setCaretColor(new java.awt.Color(112, 112, 112));
        Rut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RutMousePressed(evt);
            }
        });
        Rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutActionPerformed(evt);
            }
        });

        Separator1.setBackground(new java.awt.Color(153, 153, 153));
        Separator1.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout SesionContainerLayout = new javax.swing.GroupLayout(SesionContainer);
        SesionContainer.setLayout(SesionContainerLayout);
        SesionContainerLayout.setHorizontalGroup(
            SesionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SesionContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SesionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rut, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(448, 448, 448))
            .addGroup(SesionContainerLayout.createSequentialGroup()
                .addGroup(SesionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SesionContainerLayout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SesionContainerLayout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(Icon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SesionContainerLayout.setVerticalGroup(
            SesionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SesionContainerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Rut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Container.add(SesionContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1280, -1));

        PassContainer.setBackground(new java.awt.Color(72, 53, 132));

        Pass.setBackground(new java.awt.Color(72, 53, 132));
        Pass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Pass.setForeground(new java.awt.Color(153, 153, 153));
        Pass.setText("******");
        Pass.setToolTipText("");
        Pass.setBorder(null);
        Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassMousePressed(evt);
            }
        });
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        Separator2.setBackground(new java.awt.Color(153, 153, 153));
        Separator2.setForeground(new java.awt.Color(153, 153, 153));

        Send.setBackground(new java.awt.Color(120, 7, 144));
        Send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SendText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        SendText.setForeground(new java.awt.Color(204, 204, 204));
        SendText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SendText.setText("Iniciar");
        SendText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SendText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SendTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SendTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SendTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SendTextMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout SendLayout = new javax.swing.GroupLayout(Send);
        Send.setLayout(SendLayout);
        SendLayout.setHorizontalGroup(
            SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SendText, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        SendLayout.setVerticalGroup(
            SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SendText, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PassContainerLayout = new javax.swing.GroupLayout(PassContainer);
        PassContainer.setLayout(PassContainerLayout);
        PassContainerLayout.setHorizontalGroup(
            PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassContainerLayout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addGroup(PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PassContainerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PassContainerLayout.setVerticalGroup(
            PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(PassContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PassContainerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Container.add(PassContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1280, -1));

        ExitContainer.setBackground(new java.awt.Color(72, 53, 132));
        ExitContainer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ExitContainerMouseDragged(evt);
            }
        });
        ExitContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitContainerMousePressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(72, 53, 132));

        ExitText.setBackground(new java.awt.Color(102, 255, 102));
        ExitText.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        ExitText.setForeground(new java.awt.Color(153, 153, 153));
        ExitText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitText.setText("x");
        ExitText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ExitText, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitLayout.createSequentialGroup()
                .addComponent(ExitText)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ExitContainerLayout = new javax.swing.GroupLayout(ExitContainer);
        ExitContainer.setLayout(ExitContainerLayout);
        ExitContainerLayout.setHorizontalGroup(
            ExitContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitContainerLayout.createSequentialGroup()
                .addContainerGap(1210, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ExitContainerLayout.setVerticalGroup(
            ExitContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Container.add(ExitContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        Navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dragged.setBackground(new java.awt.Color(255, 255, 255, 100));
        Dragged.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DraggedMouseDragged(evt);
            }
        });
        Dragged.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DraggedMousePressed(evt);
            }
        });

        javax.swing.GroupLayout DraggedLayout = new javax.swing.GroupLayout(Dragged);
        Dragged.setLayout(DraggedLayout);
        DraggedLayout.setHorizontalGroup(
            DraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        DraggedLayout.setVerticalGroup(
            DraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Header.add(Dragged, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 10));

        HeaderText.setBackground(new java.awt.Color(255, 255, 255));
        HeaderText.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        HeaderText.setForeground(new java.awt.Color(72, 53, 132));
        HeaderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderText.setText("Los Queltehues");
        Header.add(HeaderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 222, 48));

        HeaderBrowser.setForeground(new java.awt.Color(153, 153, 153));
        HeaderBrowser.setText("Ingrese numero de parcela...");
        HeaderBrowser.setBorder(null);
        HeaderBrowser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderBrowserMousePressed(evt);
            }
        });
        HeaderBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeaderBrowserActionPerformed(evt);
            }
        });
        HeaderBrowser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HeaderBrowserKeyPressed(evt);
            }
        });
        Header.add(HeaderBrowser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 380, 40));

        HeaderSeparator.setBackground(new java.awt.Color(204, 204, 204));
        Header.add(HeaderSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 400, 10));

        UserContainer.setBackground(new java.awt.Color(255, 255, 255));
        UserContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Nombre.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(153, 153, 153));
        Nombre.setText("Nombre");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(AdminImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        UserContainer.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, -1));

        Header.add(UserContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 200, 60));

        Navbar.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        Layout.setBackground(new java.awt.Color(72, 53, 132));
        Layout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Fondos.setForeground(new java.awt.Color(255, 255, 255));
        Fondos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondos.setText("$420.000");
        Layout.add(Fondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 65, 119, -1));
        Layout.add(LayoutSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 109, 119, 10));

        FondosTextContainer.setBackground(new java.awt.Color(44, 182, 146));
        FondosTextContainer.setRoundBottomLeft(15);
        FondosTextContainer.setRoundBottomRight(15);
        FondosTextContainer.setRoundTopLeft(15);
        FondosTextContainer.setRoundTopRight(15);

        FondosText.setForeground(new java.awt.Color(120, 7, 145));
        FondosText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondosText.setText("Fondos Recaudados");

        javax.swing.GroupLayout FondosTextContainerLayout = new javax.swing.GroupLayout(FondosTextContainer);
        FondosTextContainer.setLayout(FondosTextContainerLayout);
        FondosTextContainerLayout.setHorizontalGroup(
            FondosTextContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondosTextContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FondosText, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        FondosTextContainerLayout.setVerticalGroup(
            FondosTextContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondosTextContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FondosText))
        );

        Layout.add(FondosTextContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 120, -1, -1));

        SalirContainer.setBackground(new java.awt.Color(44, 182, 146));
        SalirContainer.setRoundBottomLeft(20);
        SalirContainer.setRoundBottomRight(20);
        SalirContainer.setRoundTopLeft(20);
        SalirContainer.setRoundTopRight(20);

        SalirText.setBackground(new java.awt.Color(120, 7, 145));
        SalirText.setForeground(new java.awt.Color(120, 7, 145));
        SalirText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalirText.setText("Salir");
        SalirText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SalirTextMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout SalirContainerLayout = new javax.swing.GroupLayout(SalirContainer);
        SalirContainer.setLayout(SalirContainerLayout);
        SalirContainerLayout.setHorizontalGroup(
            SalirContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalirText, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        SalirContainerLayout.setVerticalGroup(
            SalirContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalirText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        Layout.add(SalirContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 80, 20));

        ListaContainer.setBackground(new java.awt.Color(72, 53, 132));

        InicioContainer.setBackground(new java.awt.Color(72, 53, 132));

        InicioChildContainer.setBackground(new java.awt.Color(72, 53, 132));
        InicioChildContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InicioChildContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioChildContainerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InicioChildContainerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioChildContainerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InicioChildContainerMousePressed(evt);
            }
        });

        InicioText.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        InicioText.setForeground(new java.awt.Color(255, 255, 255));
        InicioText.setText("Inicio");

        javax.swing.GroupLayout InicioChildContainerLayout = new javax.swing.GroupLayout(InicioChildContainer);
        InicioChildContainer.setLayout(InicioChildContainerLayout);
        InicioChildContainerLayout.setHorizontalGroup(
            InicioChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioChildContainerLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(InicioText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        InicioChildContainerLayout.setVerticalGroup(
            InicioChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InicioText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout InicioContainerLayout = new javax.swing.GroupLayout(InicioContainer);
        InicioContainer.setLayout(InicioContainerLayout);
        InicioContainerLayout.setHorizontalGroup(
            InicioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
            .addGroup(InicioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(InicioChildContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        InicioContainerLayout.setVerticalGroup(
            InicioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(InicioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InicioChildContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AportesContainer.setBackground(new java.awt.Color(72, 53, 132));
        AportesContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AportesContainerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AportesContainerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AportesContainerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AportesContainerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AportesContainerMouseReleased(evt);
            }
        });

        AportesChildContainer.setBackground(new java.awt.Color(72, 53, 132));
        AportesChildContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AportesText.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        AportesText.setForeground(new java.awt.Color(255, 255, 255));
        AportesText.setText("Aportes");

        javax.swing.GroupLayout AportesChildContainerLayout = new javax.swing.GroupLayout(AportesChildContainer);
        AportesChildContainer.setLayout(AportesChildContainerLayout);
        AportesChildContainerLayout.setHorizontalGroup(
            AportesChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AportesChildContainerLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(AportesText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AportesChildContainerLayout.setVerticalGroup(
            AportesChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AportesText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AportesContainerLayout = new javax.swing.GroupLayout(AportesContainer);
        AportesContainer.setLayout(AportesContainerLayout);
        AportesContainerLayout.setHorizontalGroup(
            AportesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(AportesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AportesContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AportesChildContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        AportesContainerLayout.setVerticalGroup(
            AportesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(AportesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AportesChildContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IngresosContainer.setBackground(new java.awt.Color(72, 53, 132));

        IngresosChildContainer.setBackground(new java.awt.Color(72, 53, 132));
        IngresosChildContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresosChildContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresosChildContainerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresosChildContainerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresosChildContainerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresosChildContainerMousePressed(evt);
            }
        });

        IngresosText.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        IngresosText.setForeground(new java.awt.Color(255, 255, 255));
        IngresosText.setText("Ingresos/Egresos");

        javax.swing.GroupLayout IngresosChildContainerLayout = new javax.swing.GroupLayout(IngresosChildContainer);
        IngresosChildContainer.setLayout(IngresosChildContainerLayout);
        IngresosChildContainerLayout.setHorizontalGroup(
            IngresosChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresosChildContainerLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(IngresosText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        IngresosChildContainerLayout.setVerticalGroup(
            IngresosChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresosText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout IngresosContainerLayout = new javax.swing.GroupLayout(IngresosContainer);
        IngresosContainer.setLayout(IngresosContainerLayout);
        IngresosContainerLayout.setHorizontalGroup(
            IngresosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(IngresosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresosContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(IngresosChildContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        IngresosContainerLayout.setVerticalGroup(
            IngresosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(IngresosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(IngresosChildContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegistroContainer.setBackground(new java.awt.Color(72, 53, 132));

        RegistroChildContainer.setBackground(new java.awt.Color(72, 53, 132));
        RegistroChildContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroChildContainerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistroChildContainerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistroChildContainerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistroChildContainerMousePressed(evt);
            }
        });

        RegistroText.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        RegistroText.setForeground(new java.awt.Color(255, 255, 255));
        RegistroText.setText("Registrar");

        javax.swing.GroupLayout RegistroChildContainerLayout = new javax.swing.GroupLayout(RegistroChildContainer);
        RegistroChildContainer.setLayout(RegistroChildContainerLayout);
        RegistroChildContainerLayout.setHorizontalGroup(
            RegistroChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroChildContainerLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(RegistroText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RegistroChildContainerLayout.setVerticalGroup(
            RegistroChildContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistroText, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RegistroContainerLayout = new javax.swing.GroupLayout(RegistroContainer);
        RegistroContainer.setLayout(RegistroContainerLayout);
        RegistroContainerLayout.setHorizontalGroup(
            RegistroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(RegistroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RegistroChildContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        RegistroContainerLayout.setVerticalGroup(
            RegistroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(RegistroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RegistroChildContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ListaContainerLayout = new javax.swing.GroupLayout(ListaContainer);
        ListaContainer.setLayout(ListaContainerLayout);
        ListaContainerLayout.setHorizontalGroup(
            ListaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(ListaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListaContainerLayout.createSequentialGroup()
                        .addComponent(InicioContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListaContainerLayout.createSequentialGroup()
                        .addGroup(ListaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RegistroContainer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IngresosContainer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AportesContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        ListaContainerLayout.setVerticalGroup(
            ListaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InicioContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(AportesContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IngresosContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegistroContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        Layout.add(ListaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 310));

        Navbar.add(Layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 660));

        Content.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Idle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon.png"))); // NOI18N
        Idle.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 132, 116, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Parcelación Los Queltehues");
        Idle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 262, 451, 62));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Dev: La Pucelle");
        Idle.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(931, 598, 80, -1));

        Content.add(Idle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1010, 620));

        Informacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ParcelaContainer.setBackground(new java.awt.Color(255, 255, 255));
        ParcelaContainer.setRoundBottomLeft(50);
        ParcelaContainer.setRoundBottomRight(50);
        ParcelaContainer.setRoundTopLeft(50);
        ParcelaContainer.setRoundTopRight(50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 53, 131));
        jLabel4.setText("Parcela");

        jSeparator1.setForeground(new java.awt.Color(44, 182, 146));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Numeración:");

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Etapa:");

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Esta Contruida:");

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Tiene agua potable:");

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Tiene luz:");

        Metros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Metros.setForeground(new java.awt.Color(71, 53, 131));
        Metros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Metros.setText("jLabel14");

        Numeracion.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Numeracion.setForeground(new java.awt.Color(71, 53, 131));
        Numeracion.setText("jLabel14");

        Etapa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Etapa.setForeground(new java.awt.Color(71, 53, 131));
        Etapa.setText("jLabel14");

        Construido.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Construido.setForeground(new java.awt.Color(71, 53, 131));
        Construido.setText("jLabel14");

        Agua.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Agua.setForeground(new java.awt.Color(71, 53, 131));
        Agua.setText("jLabel14");

        Luz.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        Luz.setForeground(new java.awt.Color(71, 53, 131));
        Luz.setText("jLabel14");

        javax.swing.GroupLayout ParcelaContainerLayout = new javax.swing.GroupLayout(ParcelaContainer);
        ParcelaContainer.setLayout(ParcelaContainerLayout);
        ParcelaContainerLayout.setHorizontalGroup(
            ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParcelaContainerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Metros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ParcelaContainerLayout.createSequentialGroup()
                        .addGroup(ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ParcelaContainerLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Luz))
                            .addGroup(ParcelaContainerLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Agua))
                            .addGroup(ParcelaContainerLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Construido))
                            .addGroup(ParcelaContainerLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Etapa))
                            .addGroup(ParcelaContainerLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Numeracion))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 181, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ParcelaContainerLayout.setVerticalGroup(
            ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParcelaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Numeracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Etapa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Construido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Agua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ParcelaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Luz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Metros, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        Informacion.add(ParcelaContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 380, 210));

        PropietarioContainer.setBackground(new java.awt.Color(255, 255, 255));
        PropietarioContainer.setRoundBottomLeft(50);
        PropietarioContainer.setRoundBottomRight(50);
        PropietarioContainer.setRoundTopLeft(50);
        PropietarioContainer.setRoundTopRight(50);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(71, 53, 131));
        jLabel27.setText("Propietario");

        jSeparator4.setForeground(new java.awt.Color(44, 182, 146));

        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setText("Rut:");

        jLabel29.setForeground(new java.awt.Color(153, 153, 153));
        jLabel29.setText("Nombre:");

        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("Apellido:");

        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setText("Correo:");

        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setText("Número:");

        RutPropietario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        RutPropietario.setForeground(new java.awt.Color(71, 53, 131));
        RutPropietario.setText("jLabel14");

        NombrePropietario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        NombrePropietario.setForeground(new java.awt.Color(71, 53, 131));
        NombrePropietario.setText("jLabel14");

        ApellidoPropietario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        ApellidoPropietario.setForeground(new java.awt.Color(71, 53, 131));
        ApellidoPropietario.setText("jLabel14");

        CorreoPropietario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        CorreoPropietario.setForeground(new java.awt.Color(71, 53, 131));
        CorreoPropietario.setText("jLabel14");

        NumeroPropietario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        NumeroPropietario.setForeground(new java.awt.Color(71, 53, 131));
        NumeroPropietario.setText("jLabel14");

        javax.swing.GroupLayout PropietarioContainerLayout = new javax.swing.GroupLayout(PropietarioContainer);
        PropietarioContainer.setLayout(PropietarioContainerLayout);
        PropietarioContainerLayout.setHorizontalGroup(
            PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PropietarioContainerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PropietarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumeroPropietario))
                    .addGroup(PropietarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CorreoPropietario))
                    .addGroup(PropietarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApellidoPropietario))
                    .addGroup(PropietarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombrePropietario))
                    .addGroup(PropietarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RutPropietario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PropietarioContainerLayout.setVerticalGroup(
            PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PropietarioContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(RutPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(NombrePropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(ApellidoPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(CorreoPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PropietarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(NumeroPropietario))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Informacion.add(PropietarioContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 380, -1));

        ArrendatarioContainer.setBackground(new java.awt.Color(255, 255, 255));
        ArrendatarioContainer.setRoundBottomLeft(50);
        ArrendatarioContainer.setRoundBottomRight(50);
        ArrendatarioContainer.setRoundTopLeft(50);
        ArrendatarioContainer.setRoundTopRight(50);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 53, 131));
        jLabel14.setText("Arrendatario");

        jSeparator2.setForeground(new java.awt.Color(44, 182, 146));

        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Rut:");

        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Nombre:");

        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Apellido:");

        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Correo:");

        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Número:");

        RutArrendatario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        RutArrendatario.setForeground(new java.awt.Color(71, 53, 131));
        RutArrendatario.setText("jLabel14");

        NombreArrendatario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        NombreArrendatario.setForeground(new java.awt.Color(71, 53, 131));
        NombreArrendatario.setText("jLabel14");

        ApellidoArrendatario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        ApellidoArrendatario.setForeground(new java.awt.Color(71, 53, 131));
        ApellidoArrendatario.setText("jLabel14");

        CorreoArrendatario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        CorreoArrendatario.setForeground(new java.awt.Color(71, 53, 131));
        CorreoArrendatario.setText("jLabel14");

        NumeroArrendatario.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        NumeroArrendatario.setForeground(new java.awt.Color(71, 53, 131));
        NumeroArrendatario.setText("jLabel14");

        javax.swing.GroupLayout ArrendatarioContainerLayout = new javax.swing.GroupLayout(ArrendatarioContainer);
        ArrendatarioContainer.setLayout(ArrendatarioContainerLayout);
        ArrendatarioContainerLayout.setHorizontalGroup(
            ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArrendatarioContainerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ArrendatarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumeroArrendatario))
                    .addGroup(ArrendatarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CorreoArrendatario))
                    .addGroup(ArrendatarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApellidoArrendatario))
                    .addGroup(ArrendatarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreArrendatario))
                    .addGroup(ArrendatarioContainerLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RutArrendatario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ArrendatarioContainerLayout.setVerticalGroup(
            ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArrendatarioContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(RutArrendatario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(NombreArrendatario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ApellidoArrendatario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CorreoArrendatario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArrendatarioContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(NumeroArrendatario))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Informacion.add(ArrendatarioContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 380, -1));

        VehiculosContainer.setBackground(new java.awt.Color(255, 255, 255));
        VehiculosContainer.setRoundBottomLeft(50);
        VehiculosContainer.setRoundBottomRight(50);
        VehiculosContainer.setRoundTopLeft(50);
        VehiculosContainer.setRoundTopRight(50);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(71, 53, 131));
        jLabel21.setText("Vehiculos");

        jSeparator3.setForeground(new java.awt.Color(44, 182, 146));

        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("Marca:");

        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Modelo:");

        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Color:");

        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Tipo");

        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Patente:");

        AutoMarca.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        AutoMarca.setForeground(new java.awt.Color(71, 53, 131));
        AutoMarca.setText("jLabel14");

        ModeloAuto.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        ModeloAuto.setForeground(new java.awt.Color(71, 53, 131));
        ModeloAuto.setText("jLabel14");

        AutoColor.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        AutoColor.setForeground(new java.awt.Color(71, 53, 131));
        AutoColor.setText("jLabel14");

        AutoTipo.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        AutoTipo.setForeground(new java.awt.Color(71, 53, 131));
        AutoTipo.setText("jLabel14");

        AutoPatente.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        AutoPatente.setForeground(new java.awt.Color(71, 53, 131));
        AutoPatente.setText("jLabel14");

        javax.swing.GroupLayout VehiculosContainerLayout = new javax.swing.GroupLayout(VehiculosContainer);
        VehiculosContainer.setLayout(VehiculosContainerLayout);
        VehiculosContainerLayout.setHorizontalGroup(
            VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehiculosContainerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VehiculosContainerLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AutoPatente))
                    .addGroup(VehiculosContainerLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AutoTipo))
                    .addGroup(VehiculosContainerLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AutoColor))
                    .addGroup(VehiculosContainerLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModeloAuto))
                    .addGroup(VehiculosContainerLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AutoMarca)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VehiculosContainerLayout.setVerticalGroup(
            VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VehiculosContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(AutoMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ModeloAuto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(AutoColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(AutoTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VehiculosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(AutoPatente))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Informacion.add(VehiculosContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 380, -1));

        Content.add(Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1010, 620));

        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ParcelacionTittle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ParcelacionTittle.setForeground(new java.awt.Color(72, 53, 132));
        ParcelacionTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ParcelacionTittle.setText("Parcelación");
        Inicio.add(ParcelacionTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 65, 860, 40));

        ParcelacionContainer.setBackground(new java.awt.Color(204, 204, 204));
        ParcelacionContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Parcelacion1.setBackground(new java.awt.Color(44, 182, 146));
        Parcelacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parcelacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Parcelacion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Parcelacion1MouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Parcelacion1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Parcelacion1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Parcelacion1MouseReleased(evt);
            }
        });

        parcela1text.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parcela1text.setForeground(new java.awt.Color(255, 255, 255));
        parcela1text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parcela1text.setText("1");

        javax.swing.GroupLayout Parcelacion1Layout = new javax.swing.GroupLayout(Parcelacion1);
        Parcelacion1.setLayout(Parcelacion1Layout);
        Parcelacion1Layout.setHorizontalGroup(
            Parcelacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(parcela1text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        Parcelacion1Layout.setVerticalGroup(
            Parcelacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parcela1text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        ParcelacionContainer.add(Parcelacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, 230, 150));

        Parcelacion2.setBackground(new java.awt.Color(120, 7, 145));
        Parcelacion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parcelacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Parcelacion2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Parcelacion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Parcelacion2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Parcelacion2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Parcelacion2MouseReleased(evt);
            }
        });

        parcela2text.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parcela2text.setForeground(new java.awt.Color(255, 255, 255));
        parcela2text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parcela2text.setText("3");

        javax.swing.GroupLayout Parcelacion2Layout = new javax.swing.GroupLayout(Parcelacion2);
        Parcelacion2.setLayout(Parcelacion2Layout);
        Parcelacion2Layout.setHorizontalGroup(
            Parcelacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(parcela2text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        Parcelacion2Layout.setVerticalGroup(
            Parcelacion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parcela2text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        ParcelacionContainer.add(Parcelacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 160, 150));

        Parcelacion3.setBackground(new java.awt.Color(44, 182, 146));
        Parcelacion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parcelacion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Parcelacion3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Parcelacion3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Parcelacion3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Parcelacion3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Parcelacion3MouseReleased(evt);
            }
        });

        parcela3text.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parcela3text.setForeground(new java.awt.Color(255, 255, 255));
        parcela3text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parcela3text.setText("5");

        javax.swing.GroupLayout Parcelacion3Layout = new javax.swing.GroupLayout(Parcelacion3);
        Parcelacion3.setLayout(Parcelacion3Layout);
        Parcelacion3Layout.setHorizontalGroup(
            Parcelacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(parcela3text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        Parcelacion3Layout.setVerticalGroup(
            Parcelacion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parcela3text, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        ParcelacionContainer.add(Parcelacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 160, -1));

        Parcelacion4.setBackground(new java.awt.Color(44, 182, 146));
        Parcelacion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parcelacion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Parcelacion4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Parcelacion4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Parcelacion4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Parcelacion4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Parcelacion4MouseReleased(evt);
            }
        });

        parcela4text.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parcela4text.setForeground(new java.awt.Color(255, 255, 255));
        parcela4text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parcela4text.setText("7");

        javax.swing.GroupLayout Parcelacion4Layout = new javax.swing.GroupLayout(Parcelacion4);
        Parcelacion4.setLayout(Parcelacion4Layout);
        Parcelacion4Layout.setHorizontalGroup(
            Parcelacion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(parcela4text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        Parcelacion4Layout.setVerticalGroup(
            Parcelacion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion4Layout.createSequentialGroup()
                .addComponent(parcela4text, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        ParcelacionContainer.add(Parcelacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 160, -1));

        Parcelacion5.setBackground(new java.awt.Color(44, 182, 146));
        Parcelacion5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parcelacion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Parcelacion5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Parcelacion5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Parcelacion5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Parcelacion5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Parcelacion5MouseReleased(evt);
            }
        });

        parcela5text.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parcela5text.setForeground(new java.awt.Color(255, 255, 255));
        parcela5text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parcela5text.setText("2");

        javax.swing.GroupLayout Parcelacion5Layout = new javax.swing.GroupLayout(Parcelacion5);
        Parcelacion5.setLayout(Parcelacion5Layout);
        Parcelacion5Layout.setHorizontalGroup(
            Parcelacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(parcela5text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        Parcelacion5Layout.setVerticalGroup(
            Parcelacion5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(parcela5text, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        ParcelacionContainer.add(Parcelacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        Parcelacion6.setBackground(new java.awt.Color(44, 182, 146));
        Parcelacion6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parcelacion6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Parcelacion6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Parcelacion6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Parcelacion6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Parcelacion6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Parcelacion6MouseReleased(evt);
            }
        });

        parcela6text.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parcela6text.setForeground(new java.awt.Color(255, 255, 255));
        parcela6text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parcela6text.setText("4");

        javax.swing.GroupLayout Parcelacion6Layout = new javax.swing.GroupLayout(Parcelacion6);
        Parcelacion6.setLayout(Parcelacion6Layout);
        Parcelacion6Layout.setHorizontalGroup(
            Parcelacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(parcela6text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        Parcelacion6Layout.setVerticalGroup(
            Parcelacion6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parcela6text, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        ParcelacionContainer.add(Parcelacion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        Parcelacion7.setBackground(new java.awt.Color(120, 7, 145));
        Parcelacion7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Parcelacion7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Parcelacion7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Parcelacion7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Parcelacion7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Parcelacion7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Parcelacion7MouseReleased(evt);
            }
        });

        parcela7text.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        parcela7text.setForeground(new java.awt.Color(255, 255, 255));
        parcela7text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parcela7text.setText("6");

        javax.swing.GroupLayout Parcelacion7Layout = new javax.swing.GroupLayout(Parcelacion7);
        Parcelacion7.setLayout(Parcelacion7Layout);
        Parcelacion7Layout.setHorizontalGroup(
            Parcelacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion7Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(parcela7text, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        Parcelacion7Layout.setVerticalGroup(
            Parcelacion7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Parcelacion7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parcela7text, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        ParcelacionContainer.add(Parcelacion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 260, -1));

        Inicio.add(ParcelacionContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 860, 380));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 182, 146));
        jLabel5.setText("•");

        jLabel33.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(120, 7, 145));
        jLabel33.setText("•");

        jLabel34.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Construido");

        jLabel35.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Sin Construir");

        javax.swing.GroupLayout ConstruidoContainerLayout = new javax.swing.GroupLayout(ConstruidoContainer);
        ConstruidoContainer.setLayout(ConstruidoContainerLayout);
        ConstruidoContainerLayout.setHorizontalGroup(
            ConstruidoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConstruidoContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConstruidoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConstruidoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        ConstruidoContainerLayout.setVerticalGroup(
            ConstruidoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConstruidoContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ConstruidoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConstruidoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Inicio.add(ConstruidoContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 501, 100, 120));

        Content.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1010, 620));

        Ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Egresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Egresos);

        Ingreso.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 300, 470));

        Ingresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Ingresos);

        Ingreso.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 300, 470));

        Content.add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1010, 620));

        Registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Registrar");
        Registrar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jTextField1.setText("Telefono");
        Registrar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 290, 40));

        jTextField2.setText("Nombre");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        Registrar.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 290, 40));

        jTextField3.setText("Apellido");
        Registrar.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 290, 40));

        jTextField4.setText("Correo");
        Registrar.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 640, 40));

        jTextField5.setText("Rut");
        Registrar.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 290, 40));
        Registrar.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 220, 40));

        jCheckBox1.setText("Vehiculo");
        Registrar.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Numero de parcela");
        Registrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 390, 200, -1));

        Content.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1010, 620));

        Aportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaAportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaAportes.setRowHeight(50);
        jScrollPane1.setViewportView(TablaAportes);

        Aportes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 97, 690, 410));

        Content.add(Aportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1010, 620));

        Navbar.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 1050, 660));

        getContentPane().add(Navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RutActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void ExitContainerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitContainerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_ExitContainerMouseDragged

    private void ExitContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitContainerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ExitContainerMousePressed

    private void ExitTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitTextMouseClicked

    private void ExitTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTextMouseEntered
        Exit.setBackground(Color.red);
    }//GEN-LAST:event_ExitTextMouseEntered

    private void ExitTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTextMouseExited
        Exit.setBackground(color);
    }//GEN-LAST:event_ExitTextMouseExited

    private void SendTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendTextMouseEntered
        Send.setBackground(colorHover);
    }//GEN-LAST:event_SendTextMouseEntered

    private void SendTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendTextMouseExited
        Send.setBackground(colorButton);
    }//GEN-LAST:event_SendTextMouseExited

    private void SendTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendTextMouseClicked
        String usuario = Rut.getText();
        String password = Pass.getText();

        // Busca la id correspondiente al usuario y contraseña ingresados
        String sql = "SELECT id FROM User WHERE Rut=? AND Contraseña=?";
        int idUsuario = -1;
        try (Connection conn = new Conexion().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    idUsuario = rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // Verifica si el usuario y la contraseña son válidos y pertenecen al mismo usuario
        if (idUsuario != -1 && new Conexion().validarUsuario(usuario, password, idUsuario)) {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection();
            
            //GetImage
            int id = getIdUsuario(usuario, password);
            String foto = conexion.getFoto(id, conn);
            String logout = "src/Imagenes/exit.png";
            conexion.closeConnection();
            
            //GetName
            String nombre = conexion.getNombre(id, conn) + " " + conexion.getApellido(id, conn);
            Nombre.setText(nombre);

            SetImageLabel(AdminImage, foto);
            SetImageLabel(Logout, logout);
            Container.setVisible(false);
            Navbar.setVisible(true);
            Inicio.setVisible(false);
            Informacion.setVisible(false);
            Ingreso.setVisible(false);
            Aportes.setVisible(false);
            Registrar.setVisible(false);
        } else {
            // Mostrar mensaje de error al usuario
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SendTextMouseClicked

    private void SendTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendTextMousePressed
        Send.setBackground(colorClick);
    }//GEN-LAST:event_SendTextMousePressed

    private void SendTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendTextMouseReleased
        Send.setBackground(colorButton);
    }//GEN-LAST:event_SendTextMouseReleased

    private void HeaderBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeaderBrowserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeaderBrowserActionPerformed

    private void SalirTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTextMouseEntered
        SalirContainer.setBackground(LayoutExitHover);
    }//GEN-LAST:event_SalirTextMouseEntered

    private void SalirTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTextMouseExited
        SalirContainer.setBackground(LayoutExit);
    }//GEN-LAST:event_SalirTextMouseExited

    private void SalirTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirTextMouseClicked

    private void SalirTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTextMousePressed
        SalirContainer.setBackground(LayoutExitClick);
    }//GEN-LAST:event_SalirTextMousePressed

    private void SalirTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTextMouseReleased
        SalirContainer.setBackground(LayoutExit);
    }//GEN-LAST:event_SalirTextMouseReleased

    private void DraggedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DraggedMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_DraggedMouseDragged

    private void DraggedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DraggedMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_DraggedMousePressed

    private void AportesContainerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AportesContainerMouseEntered
        Color clickedColor = AportesChildContainer.getBackground();
        if ( clickedColor != LayoutItemClicked ){
            AportesContainer.setBackground(LayoutItemHover);
            AportesChildContainer.setBackground(LayoutItemHover);
        }   
    }//GEN-LAST:event_AportesContainerMouseEntered

    private void AportesContainerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AportesContainerMouseExited
        Color clickedColor = AportesChildContainer.getBackground();
        
        if( clickedColor != LayoutItemClicked ){
            AportesContainer.setBackground(LayoutItem);
            AportesChildContainer.setBackground(LayoutItem);
        }
    }//GEN-LAST:event_AportesContainerMouseExited

    private void AportesContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AportesContainerMousePressed
        AportesContainer.setBackground(LayoutItemClick);
        AportesChildContainer.setBackground(LayoutItemClick);
    }//GEN-LAST:event_AportesContainerMousePressed

    private void AportesContainerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AportesContainerMouseReleased
        
    }//GEN-LAST:event_AportesContainerMouseReleased

    private void AportesContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AportesContainerMouseClicked
        AportesContainer.setBackground(LayoutItemClick);
        AportesChildContainer.setBackground(LayoutItemClicked);
        
        InicioContainer.setBackground(LayoutItem);
        InicioChildContainer.setBackground(LayoutItem);
        
        IngresosContainer.setBackground(LayoutItem);
        IngresosChildContainer.setBackground(LayoutItem);
        
        RegistroContainer.setBackground(LayoutItem);
        RegistroChildContainer.setBackground(LayoutItem);
        
        Conexion conexion = new Conexion();
        conexion.llenarTabla(TablaAportes);
        
        Informacion.setVisible(false);
        Idle.setVisible(false);
        Inicio.setVisible(false);
        Aportes.setVisible(true);
        Ingreso.setVisible(false);
        Registrar.setVisible(false);
    }//GEN-LAST:event_AportesContainerMouseClicked

    private void InicioChildContainerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioChildContainerMouseEntered
        Color clickedColor = InicioChildContainer.getBackground();
        
        if ( clickedColor != LayoutItemClicked ){
            InicioContainer.setBackground(LayoutItemHover);
            InicioChildContainer.setBackground(LayoutItemHover);
        }  
    }//GEN-LAST:event_InicioChildContainerMouseEntered

    private void InicioChildContainerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioChildContainerMouseExited
        Color clickedColor = InicioChildContainer.getBackground();
        
        if( clickedColor != LayoutItemClicked ){
            InicioContainer.setBackground(LayoutItem);
            InicioChildContainer.setBackground(LayoutItem);
        }
    }//GEN-LAST:event_InicioChildContainerMouseExited

    private void InicioChildContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioChildContainerMousePressed
        InicioContainer.setBackground(LayoutItemClick);
        InicioChildContainer.setBackground(LayoutItemClick);
    }//GEN-LAST:event_InicioChildContainerMousePressed

    private void InicioChildContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioChildContainerMouseClicked
        AportesContainer.setBackground(LayoutItem);
        AportesChildContainer.setBackground(LayoutItem);
        
        IngresosContainer.setBackground(LayoutItem);
        IngresosChildContainer.setBackground(LayoutItem);
        
        RegistroContainer.setBackground(LayoutItem);
        RegistroChildContainer.setBackground(LayoutItem);
        
        InicioContainer.setBackground(LayoutItemClick);
        InicioChildContainer.setBackground(LayoutItemClicked);
        
        Informacion.setVisible(false);
        Idle.setVisible(false);
        Inicio.setVisible(true);
        Aportes.setVisible(false);
        Ingreso.setVisible(false);
        Registrar.setVisible(false);
    }//GEN-LAST:event_InicioChildContainerMouseClicked

    private void IngresosChildContainerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresosChildContainerMouseEntered
        Color clickedColor = IngresosChildContainer.getBackground();
        
        if ( clickedColor != LayoutItemClicked ){
            IngresosContainer.setBackground(LayoutItemHover);
            IngresosChildContainer.setBackground(LayoutItemHover);
        }  
    }//GEN-LAST:event_IngresosChildContainerMouseEntered

    private void IngresosChildContainerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresosChildContainerMouseExited
        Color clickedColor = IngresosChildContainer.getBackground();
        
        if( clickedColor != LayoutItemClicked ){
            IngresosContainer.setBackground(LayoutItem);
            IngresosChildContainer.setBackground(LayoutItem);
        }
    }//GEN-LAST:event_IngresosChildContainerMouseExited

    private void IngresosChildContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresosChildContainerMousePressed
        IngresosContainer.setBackground(LayoutItemClick);
        IngresosChildContainer.setBackground(LayoutItemClick);
    }//GEN-LAST:event_IngresosChildContainerMousePressed

    private void IngresosChildContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresosChildContainerMouseClicked
        AportesContainer.setBackground(LayoutItem);
        AportesChildContainer.setBackground(LayoutItem);
        
        InicioContainer.setBackground(LayoutItem);
        InicioChildContainer.setBackground(LayoutItem);
        
        RegistroContainer.setBackground(LayoutItem);
        RegistroChildContainer.setBackground(LayoutItem);
        
        IngresosContainer.setBackground(LayoutItemClick);
        IngresosChildContainer.setBackground(LayoutItemClicked);
        
        Conexion conexion = new Conexion();
        conexion.llenarTabla(Ingresos);
        conexion.llenarGastos(Egresos);
        
        Informacion.setVisible(false);
        Idle.setVisible(false);
        Inicio.setVisible(false);
        Aportes.setVisible(false);
        Ingreso.setVisible(true);
        Registrar.setVisible(false);
    }//GEN-LAST:event_IngresosChildContainerMouseClicked

    private void RegistroChildContainerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroChildContainerMouseEntered
        Color clickedColor = RegistroChildContainer.getBackground();
        
        if ( clickedColor != LayoutItemClicked ){
            RegistroContainer.setBackground(LayoutItemHover);
            RegistroChildContainer.setBackground(LayoutItemHover);
        }  
    }//GEN-LAST:event_RegistroChildContainerMouseEntered

    private void RegistroChildContainerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroChildContainerMouseExited
        Color clickedColor = RegistroChildContainer.getBackground();
        
        if( clickedColor != LayoutItemClicked ){
            RegistroContainer.setBackground(LayoutItem);
            RegistroChildContainer.setBackground(LayoutItem);
        }
    }//GEN-LAST:event_RegistroChildContainerMouseExited

    private void RegistroChildContainerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroChildContainerMousePressed
        RegistroContainer.setBackground(LayoutItemClick);
        RegistroChildContainer.setBackground(LayoutItemClick);
    }//GEN-LAST:event_RegistroChildContainerMousePressed

    private void RegistroChildContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroChildContainerMouseClicked
        AportesContainer.setBackground(LayoutItem);
        AportesChildContainer.setBackground(LayoutItem);
        
        InicioContainer.setBackground(LayoutItem);
        InicioChildContainer.setBackground(LayoutItem);
        
        IngresosContainer.setBackground(LayoutItem);
        IngresosChildContainer.setBackground(LayoutItem);
        
        RegistroContainer.setBackground(LayoutItemClick);
        RegistroChildContainer.setBackground(LayoutItemClicked);
        
        Informacion.setVisible(false);
        Idle.setVisible(false);
        Inicio.setVisible(false);
        Aportes.setVisible(false);
        Ingreso.setVisible(false);
        Registrar.setVisible(true);
    }//GEN-LAST:event_RegistroChildContainerMouseClicked

    private void RutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RutMousePressed
        if(Rut.getText().equals("Ingrese su rut")){
            Rut.setText("");
        }
        
        if(String.valueOf(Pass.getPassword()).isEmpty()){
            Pass.setText("******");
        }
        
    }//GEN-LAST:event_RutMousePressed

    private void PassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassMousePressed
        if(String.valueOf(Pass.getPassword()).equals("******")){
            Pass.setText("");
        }
        
        if(Rut.getText().isEmpty()){
            Rut.setText("Ingrese su rut");
        }
    }//GEN-LAST:event_PassMousePressed

    private void HeaderBrowserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderBrowserMousePressed
        if(HeaderBrowser.getText().equals("Ingrese numero de parcela...")){
            HeaderBrowser.setText("");
        }
    }//GEN-LAST:event_HeaderBrowserMousePressed

    private void HeaderBrowserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HeaderBrowserKeyPressed
    Conexion conexion = new Conexion();
    Connection conn = conexion.getConnection();   

    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        int idParcela = Integer.parseInt(HeaderBrowser.getText());
        ResultSet rs = conexion.getDatosParcela(idParcela, conn);

        try {
            if (rs.next()) {
                String etapa = rs.getString("Etapa");
                boolean construido = rs.getBoolean("Construido");
                boolean agua = rs.getBoolean("Agua");
                boolean luz = rs.getBoolean("Luz");
                String metros = rs.getString("m2");
                String propietarioNombre = rs.getString("PropietarioNombre");
                String propietarioApellido = rs.getString("PropietarioApellido");
                String propietarioCorreo = rs.getString("PropietarioCorreo");
                String propietarioNumero = rs.getString("PropietarioNumero");
                String arrendatarioNombre = rs.getString("ArrendatarioNombre");
                String arrendatarioApellido = rs.getString("ArrendatarioApellido");
                String arrendatarioCorreo = rs.getString("ArrendatarioCorreo");
                String arrendatarioNumero = rs.getString("ArrendatarioNumero");
                String marca = rs.getString("Marca");
                String modelo = rs.getString("Modelo");
                String color = rs.getString("Color");
                String tipo = rs.getString("Tipo");
                String rutPropietario = rs.getString("RutPropietario");
                String rutArrendatario = rs.getString("RutArrendatario");
                String patente = rs.getString("Patente");
                int numeracion = rs.getInt("id");
                String m2 = rs.getString("m2");

                Etapa.setText(etapa);
                Construido.setText(construido ? "Sí" : "No");
                Agua.setText(agua ? "Sí" : "No");
                Luz.setText(luz ? "Sí" : "No");
                NombrePropietario.setText(propietarioNombre);
                ApellidoPropietario.setText(propietarioApellido);
                CorreoPropietario.setText(propietarioCorreo);
                NumeroPropietario.setText(propietarioNumero);
                NombreArrendatario.setText(arrendatarioNombre);
                ApellidoArrendatario.setText(arrendatarioApellido);
                CorreoArrendatario.setText(arrendatarioCorreo);
                NumeroArrendatario.setText(arrendatarioNumero);
                AutoMarca.setText(marca);
                ModeloAuto.setText(modelo);
                AutoColor.setText(color);
                AutoTipo.setText(tipo);
                RutPropietario.setText(rutPropietario);
                RutArrendatario.setText(rutArrendatario);
                AutoPatente.setText(patente);
                Numeracion.setText(Integer.toString(numeracion));
                Metros.setText(m2);
                
                Informacion.setVisible(true);
                Idle.setVisible(false);
                Inicio.setVisible(false);
                Aportes.setVisible(false);
                Ingreso.setVisible(false);
                Registrar.setVisible(false);
            } else {
                // No se encontraron resultados para la parcela
                JOptionPane.showMessageDialog(this, "ID incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    }//GEN-LAST:event_HeaderBrowserKeyPressed

    private void Parcelacion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion1MouseExited
        Parcelacion1.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion1MouseExited

    private void Parcelacion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion1MousePressed
        Parcelacion1.setBackground(ConstruidoClick);
    }//GEN-LAST:event_Parcelacion1MousePressed

    private void Parcelacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion1MouseClicked
        getParcela(parcela1text);
    }//GEN-LAST:event_Parcelacion1MouseClicked

    private void Parcelacion1MouseEntered1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion1MouseEntered1
        Parcelacion1.setBackground(ConstruidoHover);
    }//GEN-LAST:event_Parcelacion1MouseEntered1

    private void Parcelacion1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion1MouseReleased
        Parcelacion1.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion1MouseReleased

    private void Parcelacion5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion5MouseEntered
        Parcelacion5.setBackground(ConstruidoHover);
    }//GEN-LAST:event_Parcelacion5MouseEntered

    private void Parcelacion5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion5MouseExited
        Parcelacion5.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion5MouseExited

    private void Parcelacion5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion5MousePressed
        Parcelacion5.setBackground(ConstruidoClick);
    }//GEN-LAST:event_Parcelacion5MousePressed

    private void Parcelacion5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion5MouseReleased
        Parcelacion5.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion5MouseReleased

    private void Parcelacion5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion5MouseClicked
        getParcela(parcela5text);
    }//GEN-LAST:event_Parcelacion5MouseClicked

    private void Parcelacion6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion6MouseEntered
        Parcelacion6.setBackground(ConstruidoHover);
    }//GEN-LAST:event_Parcelacion6MouseEntered

    private void Parcelacion6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion6MouseExited
        Parcelacion6.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion6MouseExited

    private void Parcelacion6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion6MousePressed
        Parcelacion6.setBackground(ConstruidoClick);
    }//GEN-LAST:event_Parcelacion6MousePressed

    private void Parcelacion6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion6MouseReleased
        Parcelacion6.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion6MouseReleased

    private void Parcelacion6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion6MouseClicked
        getParcela(parcela6text);
    }//GEN-LAST:event_Parcelacion6MouseClicked

    private void Parcelacion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion3MouseEntered
        Parcelacion3.setBackground(ConstruidoHover);
    }//GEN-LAST:event_Parcelacion3MouseEntered

    private void Parcelacion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion3MouseExited
        Parcelacion3.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion3MouseExited

    private void Parcelacion3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion3MousePressed
        Parcelacion3.setBackground(ConstruidoClick);
    }//GEN-LAST:event_Parcelacion3MousePressed

    private void Parcelacion3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion3MouseReleased
        Parcelacion3.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion3MouseReleased

    private void Parcelacion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion3MouseClicked
        getParcela(parcela3text);
    }//GEN-LAST:event_Parcelacion3MouseClicked

    private void Parcelacion4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion4MouseEntered
        Parcelacion4.setBackground(ConstruidoHover);
    }//GEN-LAST:event_Parcelacion4MouseEntered

    private void Parcelacion4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion4MouseExited
        Parcelacion4.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion4MouseExited

    private void Parcelacion4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion4MousePressed
        Parcelacion4.setBackground(ConstruidoClick);
    }//GEN-LAST:event_Parcelacion4MousePressed

    private void Parcelacion4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion4MouseReleased
        Parcelacion4.setBackground(ConstruidoNormal);
    }//GEN-LAST:event_Parcelacion4MouseReleased

    private void Parcelacion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion4MouseClicked
        getParcela(parcela4text);
    }//GEN-LAST:event_Parcelacion4MouseClicked

    private void Parcelacion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion2MouseEntered
        Parcelacion2.setBackground(NoConstruidoHover);
    }//GEN-LAST:event_Parcelacion2MouseEntered

    private void Parcelacion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion2MouseExited
        Parcelacion2.setBackground(NoConstruidoNormal);
    }//GEN-LAST:event_Parcelacion2MouseExited

    private void Parcelacion2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion2MousePressed
        Parcelacion2.setBackground(NoConstruidoClick);
    }//GEN-LAST:event_Parcelacion2MousePressed

    private void Parcelacion2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion2MouseReleased
        Parcelacion2.setBackground(NoConstruidoNormal);
    }//GEN-LAST:event_Parcelacion2MouseReleased

    private void Parcelacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion2MouseClicked
        getParcela(parcela2text);
    }//GEN-LAST:event_Parcelacion2MouseClicked

    private void Parcelacion7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion7MouseEntered
        Parcelacion7.setBackground(NoConstruidoHover);
    }//GEN-LAST:event_Parcelacion7MouseEntered

    private void Parcelacion7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion7MouseExited
        Parcelacion7.setBackground(NoConstruidoNormal);
    }//GEN-LAST:event_Parcelacion7MouseExited

    private void Parcelacion7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion7MousePressed
        Parcelacion7.setBackground(NoConstruidoClick);
    }//GEN-LAST:event_Parcelacion7MousePressed

    private void Parcelacion7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion7MouseReleased
        Parcelacion7.setBackground(NoConstruidoNormal);
    }//GEN-LAST:event_Parcelacion7MouseReleased

    private void Parcelacion7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Parcelacion7MouseClicked
        getParcela(parcela7text);
    }//GEN-LAST:event_Parcelacion7MouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea cerrar sesión?", "Cerrar sesión", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            App.main(new String[0]); // iniciar la aplicación desde cero
            this.dispose(); // cerrar la ventana actual
        } else {
            // cerrar la ventana emergente y continuar en la ventana actual
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
    public void IniciarDatos(){
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Icon.png"));
        return retValue;
    }
    
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        
        labelName.setIcon(icon);
        this.repaint();
    }
    
    public int getIdUsuario(String usuario, String password) {
        int idUsuario = -1;
        String sql = "SELECT id FROM User WHERE Rut=? AND Contraseña=?";
        try (Connection conn = new Conexion().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    idUsuario = rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idUsuario;
    }
    
    public void getParcela(JLabel jlabel){
        Conexion conexion = new Conexion();
        Connection conn = conexion.getConnection();   

        int idParcela = Integer.parseInt(jlabel.getText());
        ResultSet rs = conexion.getDatosParcela(idParcela, conn);

        try {
            if (rs.next()) {
                String etapa = rs.getString("Etapa");
                boolean construido = rs.getBoolean("Construido");
                boolean agua = rs.getBoolean("Agua");
                boolean luz = rs.getBoolean("Luz");
                String metros = rs.getString("m2");
                String propietarioNombre = rs.getString("PropietarioNombre");
                String propietarioApellido = rs.getString("PropietarioApellido");
                String propietarioCorreo = rs.getString("PropietarioCorreo");
                String propietarioNumero = rs.getString("PropietarioNumero");
                String arrendatarioNombre = rs.getString("ArrendatarioNombre");
                String arrendatarioApellido = rs.getString("ArrendatarioApellido");
                String arrendatarioCorreo = rs.getString("ArrendatarioCorreo");
                String arrendatarioNumero = rs.getString("ArrendatarioNumero");
                String marca = rs.getString("Marca");
                String modelo = rs.getString("Modelo");
                String color = rs.getString("Color");
                String tipo = rs.getString("Tipo");
                String rutPropietario = rs.getString("RutPropietario");
                String rutArrendatario = rs.getString("RutArrendatario");
                String patente = rs.getString("Patente");
                int numeracion = rs.getInt("id");
                String m2 = rs.getString("m2");

                Etapa.setText(etapa);
                Construido.setText(construido ? "Sí" : "No");
                Agua.setText(agua ? "Sí" : "No");
                Luz.setText(luz ? "Sí" : "No");
                NombrePropietario.setText(propietarioNombre);
                ApellidoPropietario.setText(propietarioApellido);
                CorreoPropietario.setText(propietarioCorreo);
                NumeroPropietario.setText(propietarioNumero);
                NombreArrendatario.setText(arrendatarioNombre);
                ApellidoArrendatario.setText(arrendatarioApellido);
                CorreoArrendatario.setText(arrendatarioCorreo);
                NumeroArrendatario.setText(arrendatarioNumero);
                AutoMarca.setText(marca);
                ModeloAuto.setText(modelo);
                AutoColor.setText(color);
                AutoTipo.setText(tipo);
                RutPropietario.setText(rutPropietario);
                RutArrendatario.setText(rutArrendatario);
                AutoPatente.setText(patente);
                Numeracion.setText(Integer.toString(numeracion));
                Metros.setText(m2);

                Informacion.setVisible(true);
                Idle.setVisible(false);
                Inicio.setVisible(false);
                Aportes.setVisible(false);
                Ingreso.setVisible(false);
                Registrar.setVisible(false);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminImage;
    private javax.swing.JLabel Agua;
    private javax.swing.JLabel ApellidoArrendatario;
    private javax.swing.JLabel ApellidoPropietario;
    private javax.swing.JPanel Aportes;
    private javax.swing.JPanel AportesChildContainer;
    private javax.swing.JPanel AportesContainer;
    private javax.swing.JLabel AportesText;
    private Ventanas.PanelRound ArrendatarioContainer;
    private javax.swing.JLabel AutoColor;
    private javax.swing.JLabel AutoMarca;
    private javax.swing.JLabel AutoPatente;
    private javax.swing.JLabel AutoTipo;
    private javax.swing.JLabel Construido;
    private javax.swing.JPanel ConstruidoContainer;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel CorreoArrendatario;
    private javax.swing.JLabel CorreoPropietario;
    private javax.swing.JPanel Dragged;
    private javax.swing.JTable Egresos;
    private javax.swing.JLabel Etapa;
    private javax.swing.JPanel Exit;
    private javax.swing.JPanel ExitContainer;
    private javax.swing.JLabel ExitText;
    private javax.swing.JLabel Fondos;
    private javax.swing.JLabel FondosText;
    private Ventanas.PanelRound FondosTextContainer;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField HeaderBrowser;
    private javax.swing.JSeparator HeaderSeparator;
    private javax.swing.JLabel HeaderText;
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel Idle;
    private javax.swing.JPanel Informacion;
    private javax.swing.JPanel Ingreso;
    private javax.swing.JTable Ingresos;
    private javax.swing.JPanel IngresosChildContainer;
    private javax.swing.JPanel IngresosContainer;
    private javax.swing.JLabel IngresosText;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel InicioChildContainer;
    private javax.swing.JPanel InicioContainer;
    private javax.swing.JLabel InicioText;
    private javax.swing.JPanel Layout;
    private javax.swing.JSeparator LayoutSeparator;
    private javax.swing.JPanel ListaContainer;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Luz;
    private javax.swing.JLabel Metros;
    private javax.swing.JLabel ModeloAuto;
    private javax.swing.JPanel Navbar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NombreArrendatario;
    private javax.swing.JLabel NombrePropietario;
    private javax.swing.JLabel Numeracion;
    private javax.swing.JLabel NumeroArrendatario;
    private javax.swing.JLabel NumeroPropietario;
    private Ventanas.PanelRound ParcelaContainer;
    private javax.swing.JPanel Parcelacion1;
    private javax.swing.JPanel Parcelacion2;
    private javax.swing.JPanel Parcelacion3;
    private javax.swing.JPanel Parcelacion4;
    private javax.swing.JPanel Parcelacion5;
    private javax.swing.JPanel Parcelacion6;
    private javax.swing.JPanel Parcelacion7;
    private javax.swing.JPanel ParcelacionContainer;
    private javax.swing.JLabel ParcelacionTittle;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JPanel PassContainer;
    private Ventanas.PanelRound PropietarioContainer;
    private javax.swing.JPanel Registrar;
    private javax.swing.JPanel RegistroChildContainer;
    private javax.swing.JPanel RegistroContainer;
    private javax.swing.JLabel RegistroText;
    private javax.swing.JTextField Rut;
    private javax.swing.JLabel RutArrendatario;
    private javax.swing.JLabel RutPropietario;
    private Ventanas.PanelRound SalirContainer;
    private javax.swing.JLabel SalirText;
    private javax.swing.JPanel Send;
    private javax.swing.JLabel SendText;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JPanel SesionContainer;
    private javax.swing.JTable TablaAportes;
    private javax.swing.JLabel Tittle;
    private javax.swing.JPanel UserContainer;
    private Ventanas.PanelRound VehiculosContainer;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel parcela1text;
    private javax.swing.JLabel parcela2text;
    private javax.swing.JLabel parcela3text;
    private javax.swing.JLabel parcela4text;
    private javax.swing.JLabel parcela5text;
    private javax.swing.JLabel parcela6text;
    private javax.swing.JLabel parcela7text;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
