package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.LoginDAO;
import modelo.Login;
import vistas.vistaLogin;
import vistas.vistaMenu;
/**
 *
 * @author donyc
 */
public class ControladorLogin implements ActionListener{
        LoginDAO dao = new LoginDAO();
    Login l = new Login();
    vistaLogin loginv = new vistaLogin();

    public ControladorLogin(vistaLogin l) {
        this.loginv = l;
        this.loginv.btnLogin.addActionListener(this);
        //Limpiar campos
        limpiarCampos(l);
    }
    
    private void limpiarCampos(vistaLogin l) {
        l.txtUsuario.setText("");
        l.pswClave.setText("");
        l.txtUsuario.requestFocus();
    }    
    
    private boolean validarCampos(vistaLogin l) {
        if (l.txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "El campo de usuario no debe estar vacio!", "Advertencia", JOptionPane.ERROR_MESSAGE);
            l.txtUsuario.requestFocus();
            return false;
        }
            if (String.valueOf(l.pswClave.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "El campo de clave no debe estar vacio!", "Advertencia", JOptionPane.ERROR_MESSAGE);
            l.pswClave.requestFocus();
            return false;
        }
        return true;
    }
    
    /**
     * Este metodo se encarga de validar los datos del login de usuario.
     *
     * @param Usuario
     * @param Clave
     * @param login
     * @return boolean
     */
    public boolean AccionarLogin(String Usuario, String Clave, vistaLogin login) {
        if (validarCampos(login)) {
            System.out.println("campos del formulario validados que no esten vacios!");
            try {
                System.out.println("verificando si los datos existen!");
                if (dao.realizarLogin(Usuario, Clave)) {
                    JOptionPane.showMessageDialog(loginv, "Ingresado con exito!", "!", JOptionPane.INFORMATION_MESSAGE);
                    login.setVisible(false);
                    System.out.println("ingresando al menu!");
                    vistaMenu v = new vistaMenu();
                    v.setVisible(true);
                    v.setLocationRelativeTo(null);
                    return true;
                } else{
                    JOptionPane.showMessageDialog(login,"El usuario o la clave estan incorrectos!", "Advertencia",JOptionPane.ERROR_MESSAGE);
                    limpiarCampos(login);
                    return false;
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(loginv, "Error al tratar de ingresar: " + e, "Advertencia", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Validando si se presiono la tecla de ingreso
        if (e.getSource() == loginv.btnLogin) {
            String usuario = loginv.txtUsuario.getText();
            String clave   = String.valueOf(loginv.pswClave.getPassword());
            AccionarLogin(usuario, clave, loginv);
        }
    }    
}
