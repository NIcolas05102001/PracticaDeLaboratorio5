/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Ticket {
    
    
    private int numero;
    private Date ingreso;
    private Date salida;
    private double total;

    public Ticket(int numero, Date ingreso) {
        this.numero = numero;
        this.ingreso = ingreso;
    }

 
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numero;
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
        final Ticket other = (Ticket) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    public double obtenerTotal() {
        while (salida.getMinutes() != 0) {
            if(salida.getMinutes() - ingreso.getMinutes() > 9){
                total += 0.25;
                salida.setMinutes(salida.getMinutes()-10);
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", ingreso=" + ingreso + ", salida=" + salida + ", total=" + total + '}';
    }
    
}
