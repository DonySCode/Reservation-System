package modelo;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import vistas.vistaReservHotel;
/**
 * Mantenimiento para las Reservaciones para Hoteles.
 * @author donyc
 */
public class ReservHotelDAO {
    
    ConexionSQLite    conectar = new ConexionSQLite();
    Connection        con;
    PreparedStatement ps;
    ResultSet         rs;    
    
    /**
     * Este metodo se encarga de listar una reservacion.El mismo devuelve un objeto tipo arrayList.
     * @param valorBuscar
     * @return datos
     */  
    public List listarReservacion(String valorBuscar){
        
        String sql = "select * from Clientes "+
                     "where cédulaID||Nombre||Apellido||numeroReservacion||fechaEntrada||fechaSalida||numeroHabitacion like '%"+valorBuscar+"%'";
        
        List<ReservHotel>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                ReservHotel r = new ReservHotel();
                r.setIdCedula(rs.getInt(1));
                r.setNombre(rs.getString(2));
                r.setApellido(rs.getString(3));
                r.setNumeroReserva(rs.getString(4));
                r.setFechaEntrada(rs.getString(5));
                r.setFechaSalida(rs.getString(6));
                r.setNumeroHabitacion(rs.getString(7));
                datos.add(r);
            }
        }catch(SQLException ex){
            System.out.println("Error al listar los contactos: " + ex);
        }
        return datos;
    }

    public List listar(){
        String sql = "select * from Clientes";
        List<ReservHotel>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                ReservHotel r = new ReservHotel();
                r.setIdCedula(rs.getInt(1));
                r.setNombre(rs.getString(2));
                r.setApellido(rs.getString(3));
                r.setNumeroReserva(rs.getString(4));
                r.setFechaEntrada(rs.getString(5));
                r.setFechaSalida(rs.getString(6));
                r.setNumeroHabitacion(rs.getString(7));
                datos.add(r);
            }
        }catch(SQLException ex){
            System.out.println("Error al listar los contactos: " + ex);
        }
        return datos;
    }
   /**
     * Este metodo se encarga de registrar un nuevo contacto.
     * Devuelve un 1 si se ha realizado con exito la insercion.
     * @param r
     * @return 1
     */
    public int agregar(ReservHotel r){
        
        String sql = "insert into Clientes (cédulaID,Nombre,Apellido,numeroReservacion,fechaEntrada,fechaSalida,numeroHabitacion) values (?,?,?,?,?,?,?)";
        
        try {
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            ps.setInt(1, r.getIdCedula());
            ps.setString(2, r.getNombre());
            ps.setString(3, r.getApellido());
            ps.setString(4, r.getNumeroReserva());
            ps.setString(5, r.getFechaEntrada());
            ps.setString(6, r.getFechaSalida());
            ps.setString(7, r.getNumeroHabitacion());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }
        return 1;
    }
    
    /**
     * Este metodo se encarga de actualizar los datos de una reservacion,
     * devuelve el numero de registros afectados.
     * @param r
     * @return c
     */
    public int actualizar(ReservHotel r){
        
        int c = 0;
        
        String sql = "update Clientes set Nombre = ?,Apellido = ?,numeroReservacion = ?,fechaEntrada = ?,fechSalida = ?, numeroHabitacion where cédulaID=?";
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            ps.setString(1, r.getNombre());
            ps.setString(2, r.getApellido());
            ps.setString(3, r.getNumeroReserva());
            ps.setString(4, r.getFechaEntrada());
            ps.setString(5, r.getFechaSalida());
            ps.setString(6, r.getNumeroHabitacion());
            ps.setInt(7, r.getIdCedula());
            c = ps.executeUpdate();
            
            if(c == 1){
                return 1;
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al tratar de actualizar datos: " + e);
        }
        return c;
    }
    
    /**
     * Este metodo se encarga de eliminar ela reservacion seleccionado.
     * El mismo devuelve el numero de registros afectados.
     * @param id
     * @return c
     */
    public int eliminar(int id){
        
        int c = 0;
        
        String sql = "delete from Clientes where cédulaID="+id;
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            c   = ps.executeUpdate();
            if(c == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al tratar de borrar datos: " + e);
        }
        return c;
    }    
}
