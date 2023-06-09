/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import modelo.ReservHotelDAO;
import javax.swing.ImageIcon;

/**
 *
 * @author donyc
 */
public class vistaReservHotel extends javax.swing.JFrame {

    /**
     * Creates new form vistaReservHotel
     */
    public vistaReservHotel() {
        ReservHotelDAO r = new ReservHotelDAO();
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/vistas/imagenes/image.png")).getImage());
        r.listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipalReservHotel = new javax.swing.JPanel();
        pnlDatosReservHotel = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtCedulaID = new javax.swing.JTextField();
        txtnumeroHabitacion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFechadeEntrada = new javax.swing.JTextField();
        txtFechadeSalida = new javax.swing.JTextField();
        txtnumeroReservacion = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        pnlTablaReservHotel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservHotel = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cabeyes Reservation System");

        pnlPrincipalReservHotel.setBackground(new java.awt.Color(51, 204, 255));
        pnlPrincipalReservHotel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Reservaciones de Hotel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 18), new java.awt.Color(51, 0, 204))); // NOI18N
        pnlPrincipalReservHotel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDatosReservHotel.setBackground(new java.awt.Color(51, 153, 255));
        pnlDatosReservHotel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos de la Reservación", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 14), new java.awt.Color(51, 0, 204))); // NOI18N
        pnlDatosReservHotel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(51, 153, 255));
        txtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlDatosReservHotel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 50));

        txtCedulaID.setBackground(new java.awt.Color(51, 153, 255));
        txtCedulaID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCedulaID.setForeground(new java.awt.Color(255, 255, 255));
        txtCedulaID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ID-Cédula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlDatosReservHotel.add(txtCedulaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 210, 50));

        txtnumeroHabitacion.setBackground(new java.awt.Color(51, 153, 255));
        txtnumeroHabitacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnumeroHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        txtnumeroHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Número de habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlDatosReservHotel.add(txtnumeroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 210, 50));

        txtApellido.setBackground(new java.awt.Color(51, 153, 255));
        txtApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlDatosReservHotel.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 210, 50));

        txtFechadeEntrada.setBackground(new java.awt.Color(51, 153, 255));
        txtFechadeEntrada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFechadeEntrada.setForeground(new java.awt.Color(255, 255, 255));
        txtFechadeEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Fecha de entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlDatosReservHotel.add(txtFechadeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 210, 50));

        txtFechadeSalida.setBackground(new java.awt.Color(51, 153, 255));
        txtFechadeSalida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFechadeSalida.setForeground(new java.awt.Color(255, 255, 255));
        txtFechadeSalida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Fecha de salida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlDatosReservHotel.add(txtFechadeSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 210, 50));

        txtnumeroReservacion.setBackground(new java.awt.Color(51, 153, 255));
        txtnumeroReservacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnumeroReservacion.setForeground(new java.awt.Color(255, 255, 255));
        txtnumeroReservacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Número de reservación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtnumeroReservacion.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        pnlDatosReservHotel.add(txtnumeroReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 210, 50));

        btnActualizar.setFont(new java.awt.Font("Cooper Black", 0, 10)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(51, 0, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/imagenes/actualizarIcon.png"))); // NOI18N
        btnActualizar.setText("Actualizar Datos");
        pnlDatosReservHotel.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 170, 50));

        btnCancelar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 0, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/imagenes/cancelarIcon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        pnlDatosReservHotel.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 140, 50));

        btnAgendar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(51, 0, 204));
        btnAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/imagenes/agregarIcon.png"))); // NOI18N
        btnAgendar.setText("Agendar");
        pnlDatosReservHotel.add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 140, 50));

        pnlPrincipalReservHotel.add(pnlDatosReservHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 570));

        pnlTablaReservHotel.setBackground(new java.awt.Color(204, 255, 204));
        pnlTablaReservHotel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Lista de Reservaciones ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 14), new java.awt.Color(51, 0, 204))); // NOI18N
        pnlTablaReservHotel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReservHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblReservHotel);

        pnlTablaReservHotel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 580, 410));

        txtBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtBuscar.setDisabledTextColor(new java.awt.Color(51, 153, 255));
        pnlTablaReservHotel.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 210, 50));

        pnlPrincipalReservHotel.add(pnlTablaReservHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 640, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalReservHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalReservHotel, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgendar;
    public javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatosReservHotel;
    private javax.swing.JPanel pnlPrincipalReservHotel;
    private javax.swing.JPanel pnlTablaReservHotel;
    public javax.swing.JTable tblReservHotel;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCedulaID;
    public javax.swing.JTextField txtFechadeEntrada;
    public javax.swing.JTextField txtFechadeSalida;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtnumeroHabitacion;
    public javax.swing.JTextField txtnumeroReservacion;
    // End of variables declaration//GEN-END:variables
}
