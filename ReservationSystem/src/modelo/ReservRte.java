/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *DTO
 * @author samuel
 */
public class ReservRte {
    int        Id;
    String     NumeroReservacion;
    String     CodigoRestaurante;
    String     FechaReservacion;
    String     CantidadPersonas;
    
    public ReservRte(){
        
    }
    
    public ReservRte(int Id, String NumeroReservacion, String CodigoRestaurante, String FechaReservacion, String CantidadPersonas){
     this.Id                     = Id;
     this.NumeroReservacion      = NumeroReservacion;
     this.CodigoRestaurante      = CodigoRestaurante;
     this.FechaReservacion       = FechaReservacion;
     this.CantidadPersonas       = CantidadPersonas;
    
}

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNumeroReservacion() {
        return NumeroReservacion;
    }

    public String getCodigoRestaurante() {
        return CodigoRestaurante;
    }

    public String getFechaReservacion() {
        return FechaReservacion;
    }

    public String getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setNumeroReservacion(String NumeroReservacion) {
        this.NumeroReservacion = NumeroReservacion;
    }

    public void setCodigoRestaurante(String CodigoRestaurante) {
        this.CodigoRestaurante = CodigoRestaurante;
    }

    public void setFechaReservacion(String FechaReservacion) {
        this.FechaReservacion = FechaReservacion;
    }

    public void setCantidadPersonas(String CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

}