/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *DTO
 * @author samuel
 */
public class ReservHotel {
    int            IdCedula;
    String         Nombre;
    String         Apellido;
    String         NumeroReserva;
    String         FechaEntrada;
    String         FechaSalida;
    String         numeroHabitacion;
    
    
    public ReservHotel(){       
 }
    
    public ReservHotel(int IdCedula, String Nombre, String Apellido,String NumeroReserva, String FechaEntrada, String FechaSalida){
        this.IdCedula        = IdCedula;
        this.Nombre          = Nombre;
        this.Apellido        = Apellido;
        this.NumeroReserva   = NumeroReserva;
        this.FechaEntrada    = FechaEntrada;
        this.FechaSalida     = FechaSalida;
    }

    public int getIdCedula() {
        return IdCedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNumeroReserva() {
        return NumeroReserva;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setIdCedula(int IdCedula) {
        this.IdCedula = IdCedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNumeroReserva(String NumeroReserva) {
        this.NumeroReserva = NumeroReserva;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    
}
