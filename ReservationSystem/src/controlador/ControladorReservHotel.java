package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ReservHotel;
import modelo.ReservHotelDAO;
import vistas.vistaReservHotel;

/**
 *
 * @author donyc
 */
public class ControladorReservHotel implements ActionListener {

    ReservHotelDAO dao = new ReservHotelDAO();
    ReservHotel c = new ReservHotel();
    vistaReservHotel vista = new vistaReservHotel();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Constructor de la clase Controlador, se encarga de inicializar los
     * componentes del formulario de reservaciones de hotel. Recibe como
     * parameto la ventana "VistaReservHotel".
     *
     * @param v
     */
    public ControladorReservHotel(vistaReservHotel v) {
        this.vista = v;
        this.vista.btnAgendar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.txtBuscar.addActionListener(this);

        this.vista.btnAgendar.setEnabled(true);
        this.vista.btnActualizar.setEnabled(false);
        this.vista.btnCancelar.setEnabled(true);

        //Limpiar formulario y Listar contactos
        limpiarCampos(v);
        listar(vista.tblReservHotel);
    }

    /**
     * Este metodo se encarga de cargar los registros dentro de la tabla de
     * contactos.
     *
     * @param tabla
     */
    public void listarReservacion(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<ReservHotel> lista = (List<ReservHotel>) dao.listarReservacion(vista.txtBuscar.getText());
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdCedula();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getApellido();
            object[3] = lista.get(i).getNumeroReserva();
            object[4] = lista.get(i).getFechaEntrada();
            object[5] = lista.get(i).getFechaSalida();
            object[6] = lista.get(i).getNumeroHabitacion();
            modelo.addRow(object);
        }
        vista.tblReservHotel.setModel(modelo);
    }
    
    public final void listar(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        List<ReservHotel> lista = (List<ReservHotel>) dao.listar();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdCedula();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getApellido();
            object[3] = lista.get(i).getNumeroReserva();
            object[4] = lista.get(i).getFechaEntrada();
            object[5] = lista.get(i).getFechaSalida();
            object[6] = lista.get(i).getNumeroHabitacion();
            modelo.addRow(object);
        }
        vista.tblReservHotel.setModel(modelo);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * Este metodo se encarga de agregar una nueva Reservacion
     */
    public void agregar() {

        int r;

        int Cedula = Integer.parseInt(vista.txtCedulaID.getText());
        String Nombre = vista.txtNombre.getText();
        String Apellido = vista.txtApellido.getText();
        String NumeroReserva = vista.txtnumeroReservacion.getText();
        String FechaEntrada = vista.txtFechadeEntrada.getText();
        String FechaSalida = vista.txtFechadeEntrada.getText();
        String numeroHabitacion = vista.txtnumeroHabitacion.getText();

        c.setIdCedula(Cedula);
        c.setNombre(Nombre);
        c.setApellido(Apellido);
        c.setNumeroReserva(NumeroReserva);
        c.setFechaEntrada(FechaEntrada);
        c.setFechaSalida(FechaSalida);
        c.setNumeroHabitacion(numeroHabitacion);

        if (validarCampos(vista) > 0) {
            r = dao.agregar(c);
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Contacto agregado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                limpiarTabla();
                listar(vista.tblReservHotel);
                limpiarCampos(vista);
            } else {
                JOptionPane.showMessageDialog(vista, "Error: tratando de agregar contacto.", "Error!", JOptionPane.ERROR_MESSAGE);
                limpiarTabla();
                listar(vista.tblReservHotel);
                limpiarCampos(vista);
            }
        }
    }

    /**
     * Este metodo se encarga de actualizar el contacto seleccionado dentro de
     * la tabla.
     */
    public void actualizar() {
        int r;

        int fila = vista.tblReservHotel.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila para la actualizacion.", "Error!", JOptionPane.ERROR_MESSAGE);
            limpiarTabla();
            listar(vista.tblReservHotel);
            limpiarCampos(vista);
        } else {
            if (validarCampos(vista) > 0) {
                int Cedula = Integer.parseInt(vista.txtCedulaID.getText());
                String Nombre = vista.txtNombre.getText();
                String Apellido = vista.txtApellido.getText();
                String NumeroReserva = vista.txtnumeroReservacion.getText();
                String FechaEntrada = vista.txtFechadeEntrada.getText();
                String FechaSalida = vista.txtFechadeEntrada.getText();
                String numeroHabitacion = vista.txtnumeroHabitacion.getText();

                c.setIdCedula(Cedula);
                c.setNombre(Nombre);
                c.setApellido(Apellido);
                c.setNumeroReserva(NumeroReserva);
                c.setFechaEntrada(FechaEntrada);
                c.setFechaSalida(FechaSalida);
                c.setNumeroHabitacion(numeroHabitacion);

                r = dao.actualizar(c);
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Contacto actualizado con exito!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblReservHotel);
                    limpiarCampos(vista);
                } else {
                    JOptionPane.showMessageDialog(vista, "Error: tratando de actualizar contacto.", "Error!", JOptionPane.ERROR_MESSAGE);
                    limpiarTabla();
                    listar(vista.tblReservHotel);
                    limpiarCampos(vista);
                }
            }
        }
    }

    /**
     * Este metodo se encarga de limpiar los datos de la tabla antes de cargarla
     * al inicio o al refrescar los datos.
     */
    public void limpiarTabla() {
        for (int i = 0; i < vista.tblReservHotel.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    /**
     * Este metodo limpia los campos del formulario antes de ser utilizado.
     *
     * @param v
     */
    public final void limpiarCampos(vistaReservHotel v) {
        v.txtCedulaID.setText("");
        v.txtNombre.setText("");
        v.txtApellido.setText("");
        v.txtnumeroReservacion.setText("");
        v.txtFechadeEntrada.setText("");
        v.txtFechadeSalida.setText("");
        v.txtnumeroHabitacion.requestFocus();
    }

    /**
     * Este metodo valida los campos del formulario y devuelve si los campos han
     * sido validados.
     *
     * @param v
     * @return validacion
     */
    public int validarCampos(vistaReservHotel v) {

        int validacion = 1;

        if (v.txtCedulaID.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo ID-Cedula, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtCedulaID.requestFocus();
            validacion = 0;
        } else if (v.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo Nombre, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtNombre.requestFocus();
            validacion = 0;
        } else if (v.txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo Apellido, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtApellido.requestFocus();
            validacion = 0;
        } else if (v.txtnumeroReservacion.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo Numero de Reservacion, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtnumeroReservacion.requestFocus();
            validacion = 0;
        } else if (v.txtFechadeEntrada.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo Fecha de Entrada, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtFechadeEntrada.requestFocus();
            validacion = 0;
        } else if (v.txtFechadeSalida.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo Fecha de Salida, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtFechadeSalida.requestFocus();
            validacion = 0;
        } else if (v.txtnumeroHabitacion.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Favor verificar campo numero de habitacion, no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            v.txtnumeroHabitacion.requestFocus();
            validacion = 0;
        }

        return validacion;
    }

    /**
     * Este metodo verifica si se ha producido algun evento dentro del
     * formulario.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgendar) {
            agregar();
            listar(vista.tblReservHotel);
        }
        if (e.getSource() == vista.btnActualizar) {
            actualizar();
            this.vista.btnAgendar.setEnabled(true);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            limpiarTabla();
            listar(vista.tblReservHotel);
            vista.txtNombre.requestFocus();
        }
        if (e.getSource() == vista.btnCancelar) {
            this.vista.btnAgendar.setEnabled(true);
            this.vista.btnActualizar.setEnabled(false);
            this.vista.btnCancelar.setEnabled(false);
            vista.txtBuscar.setText("");
            limpiarCampos(vista);
            limpiarTabla();
            listar(vista.tblReservHotel);
        
        }
    }

}
