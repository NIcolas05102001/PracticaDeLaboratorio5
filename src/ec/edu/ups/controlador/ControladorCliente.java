/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.*;
/**
 *
 * @author Usuario
 */
public class ControladorCliente {

//DAO
    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;

    //Modelo
    private Cliente cliente;
    private Vehiculo vehiculo;
    //vista
     private VentanaCliente ingresoC;

    public ControladorCliente( VentanaCliente ingresoC,IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
        this.ingresoC = ingresoC;
    }
    
    
    public ControladorCliente(ClienteDAO clienteDAO, VehiculoDAO vehiculoDAO) {
        this.clienteDAO = clienteDAO;
        this.vehiculoDAO = vehiculoDAO;
    }

    public void registrar(Cliente cliente){
        this.cliente = cliente;
        clienteDAO.create(cliente);
    }
    
    //
    public void verCliente(){
        
    }
    
    public void actualizar(){
        
    }
    
    public void eliminar(){
        
    }
    
    public void verClientes(){
        
    }
    
    //
    public void agregarVehiculo(String placa){
        vehiculo = vehiculoDAO.read(placa);
        cliente.agregarVehiculo(vehiculo);
        clienteDAO.update(cliente);
    }
    
    
}
