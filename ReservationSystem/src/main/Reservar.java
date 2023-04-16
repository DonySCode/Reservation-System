package main;

import controlador.ControladorLogin;
import vistas.vistaLogin;
import modelo.ReservHotelDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author donyc
 */
public class Reservar {

    public static void main(String args[]) {
        ReservHotelDAO r = new ReservHotelDAO();
        vistaLogin lv = new vistaLogin();
        ControladorLogin cl = new ControladorLogin(lv);
        lv.setVisible(true);
        lv.setLocationRelativeTo(null);
    }
}

