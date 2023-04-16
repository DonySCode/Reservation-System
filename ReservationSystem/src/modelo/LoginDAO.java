package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author donyc
 */
public class LoginDAO {
    
    ConexionSQLite conectar = new ConexionSQLite();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
        public boolean realizarLogin(String usuariof, String clavef) {
        con = conectar.conectar();

        String sql = "select * from TablaAcceso where usuario = ? and clave = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usuariof);
            ps.setString(2, clavef);

            rs = ps.executeQuery();

            while (rs.next()) {
                con.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }    
}
