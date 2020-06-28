/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.*;
import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.*;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorTicket {
    //DAO
    private ITicketDAO ticketDAO;

    //Modelo
    private Ticket ticket;
    
    //ventana
    
    
    public ControladorTicket(TicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }

    public void registrar(Ticket ticket){
        this.ticket = ticket;
        ticketDAO.create(ticket);
    }

    public void verCliente(){

    }

    public void actualizar(){

    }

    public void eliminar(){

    }

    public void verTickets(){
        List<Ticket> tickets;
        tickets = ticketDAO.findAll();

    }
    
    
    
    
}
