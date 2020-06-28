/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface IClienteDAO {
    
      public void create(Cliente cliente);
    public Cliente read(String cedula);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
    public ArrayList <Cliente> findAll();
    
    
    
}
