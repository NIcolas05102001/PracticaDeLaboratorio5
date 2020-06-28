/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class VehiculoDAO implements IVehiculoDAO{
    
     private List<Vehiculo> listaVehiculo;

     //constructor
    public VehiculoDAO(){
        listaVehiculo = new ArrayList<>();
    }

    @Override
    public void create(Vehiculo vehiculo) {
        listaVehiculo.add(vehiculo);
    }

    @Override
    public Vehiculo read(String placa) {
         for (Vehiculo vehiculo : listaVehiculo) {
            if(vehiculo.getPlaca().equalsIgnoreCase(placa)){
                return vehiculo;
            }
        }
        return null;
    }

    @Override
    public void update(Vehiculo vehiculo) {
          for (int i = 0; i < listaVehiculo.size(); i++) {
            Vehiculo v = listaVehiculo.get(i);
            if(v.getPlaca().equalsIgnoreCase(vehiculo.getPlaca())){
                listaVehiculo.set(i, vehiculo);
                break;
            }
        }
    }

    @Override
    public void delete(Vehiculo vehiculo) {
         Iterator<Vehiculo> it = listaVehiculo.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            if(v.getPlaca().equalsIgnoreCase(vehiculo.getPlaca())){
                it.remove();
                break;
            }
        }
    }

    @Override
    public ArrayList<Vehiculo> findAll() {
     return (ArrayList<Vehiculo>) listaVehiculo;
    }
    
    
    
    
}
