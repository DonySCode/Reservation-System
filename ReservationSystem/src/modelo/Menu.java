/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samuel
 */
public class Menu {
    int        Id;
    String     Hotel;
    String     Habitacion;
    String     Restaurantes;
    
    public Menu(){
        
}
    
    public Menu(int Id, String Hotel, String Habitacion, String Restaurante){
        this.Id            = Id;
        this.Hotel         = Hotel;
        this.Habitacion    = Habitacion;
        this.Restaurantes  = Restaurantes;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getHotel() {
        return Hotel;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public String getRestaurantes() {
        return Restaurantes;
    }

    public void setHotel(String Hotel) {
        this.Hotel = Hotel;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public void setRestaurantes(String Restaurantes) {
        this.Restaurantes = Restaurantes;
    }
       
}
