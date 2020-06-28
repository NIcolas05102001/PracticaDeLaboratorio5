/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
      
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Vehiculo> listaDeVehiculos;

    public Cliente(String cedula, String nombre, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente(String cedula, String nombre, String direccion, String telefono, List<Vehiculo> listaDeVehiculos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaDeVehiculos = listaDeVehiculos;
    }
    
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    //agregar el vehículo
    public void agregarVehiculo(Vehiculo vehiculo){
        listaDeVehiculos.add(vehiculo);
    }
    
    //eliminar el vehículo
    
    public void eliminarVehículo(Vehiculo vehiculo){
       if(listaDeVehiculos.contains(vehiculo)) {
           listaDeVehiculos.remove(vehiculo);
       }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", listaDeVehiculos=" + listaDeVehiculos + '}';
    }
    
}
