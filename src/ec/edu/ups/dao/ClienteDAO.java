/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ClienteDAO implements IClienteDAO {

     //constructor
     private List<Cliente> listaCliente;

    public ClienteDAO(){
        listaCliente = new ArrayList<>();
    }
    
    
    @Override
    public void create(Cliente cliente) {
        
         listaCliente.add(cliente);
      
    }

    @Override
    public Cliente read(String cedula) {
       for (Cliente cliente : listaCliente) {
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente c = listaCliente.get(i);
            if(c.getCedula().equalsIgnoreCase(cliente.getCedula())){
                listaCliente.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Iterator<Cliente> it = listaCliente.iterator();
        while(it.hasNext()){
            Cliente c = it.next();
            if(c.getCedula().equalsIgnoreCase(cliente.getCedula())){
                it.remove();
                break;
            }
        }
    }

    @Override
    public ArrayList<Cliente> findAll() {
         return (ArrayList<Cliente>) listaCliente;
    }
    
    
    
}
