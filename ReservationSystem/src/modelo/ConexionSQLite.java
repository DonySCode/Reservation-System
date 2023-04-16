package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Conexion con SQLite.
 * @author samuel
 */
public class ConexionSQLite {
    /**
     * Creamos el objeto cn de la clase Connection.
     */
    Connection cn = null;

    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            cn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\donyc\\Documents\\NetBeansProjects\\ProyectoFinal\\src\\modelo\\basedeDatos\\Clientes.db");
            System.out.println("Estamos conectados con exito!");

        } catch (ClassNotFoundException | SQLException sqlex) {
            System.out.println("Error al tratar de conectar: " + sqlex);
        }
        return cn;
    }
}
