/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionalidadesParqueadero;

/**
 *
 * @author ANTONIO
 */
public class Estacionamiento {
    
    private boolean ocupado;
    private byte columna;
    private char fila;
    private String categoria;
    
    public Estacionamiento(){
        ocupado = false;
    }
    
    public boolean obtenerOcupado(){
        return this.ocupado;
    }
    
    public byte obtenerColumna(){
        return columna;
    }
    
    public char obtenerFila(){
        return this.fila;
    }
    
    public String obtenerCategoria(){
        return this.categoria;
    }
    
    public void asignarOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }
    
    public void asignarColumna(byte columna){
        this.columna = columna;
    }
    
    public void asignarFila(char fila){
        this.fila = fila;
    }
    
    public void asignarCategoria(String categoria){
        this.categoria = categoria;
    }
}
