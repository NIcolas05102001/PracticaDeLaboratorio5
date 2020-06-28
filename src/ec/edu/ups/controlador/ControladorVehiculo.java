/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.VentanaCliente;

/**
 *
 * @author Usuario
 */
public class ControladorVehiculo {
    
    
    //DAO
    private IVehiculoDAO vehiculoDAO;
    private ITicketDAO ticketDAO;

    //Modelo
    private Vehiculo vehiculo;
    private Ticket ticket;
    
    //vista
     private VentanaCliente ingresov;

    public ControladorVehiculo(VentanaCliente ingresov,IVehiculoDAO vehiculoDAO) {
        this.vehiculoDAO = vehiculoDAO;
        this.ingresov = ingresov;
    }
     

    public ControladorVehiculo(VehiculoDAO vehiculoDAO, TicketDAO ticketDAO) {
        this.vehiculoDAO = vehiculoDAO;
        this.ticketDAO = ticketDAO;
    }

    public void registrar(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        vehiculoDAO.create(vehiculo);
    }

    public void verCliente(){

    }

    public void actualizar(){

    }

    public void eliminar(){

    }

    public void verClientes(){

    }

    public void agregarTicket(int numero){
        ticket = ticketDAO.read(numero);
        vehiculo.setTicket(ticket);
        vehiculoDAO.update(vehiculo);
    }
    
    
    
}
