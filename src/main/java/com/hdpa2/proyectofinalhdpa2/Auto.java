/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hdpa2.proyectofinalhdpa2;

/**
 *
 * @author ANTONIO
 */
public class Auto {
    private String numeroPlaca;
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private String registroVehicular;
    private String seguro;
    
    public Auto(){ //constructor vacio
        this.numeroPlaca = "";
        this.marca = "";
        this.modelo = "";
        this.year = 0;
        this.color = "";
        this.registroVehicular = "";
        this.seguro = "";
    }
    
    public String obtenerNumeroPlaca(){
        return this.numeroPlaca;
    }
    
    public String obtenerMarca(){
        return this.marca;
    }
    
    public String obtenerModelo(){
        return this.modelo;
    }
    
    public int obtenerYear(){
        return this.year;
    }
    
    public String obtenerColor(){
        return this.color;
    }
    
    public String obtenerRegistroVehicular(){
        return this.registroVehicular;
    }
    
    public String obtenerSeguro(){
        return this.seguro;
    }
    
    public void asignarNumeroPlaca(String numeroPlaca){
        this.numeroPlaca = numeroPlaca;
    }
    
    public void asignarMarca(String marca){
        this.marca = marca;
    }
    
    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void asignarYear(int year){
        this.year = year;
    }  
    
    public void asignarColor(String color){
        this.color = color;
    }
    
    public void asignarRegistroVehicular(String registroVehicular){
        this.registroVehicular = registroVehicular;
    }
    
    public Auto(String numeroPlaca, String marca, String modelo, String color){
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        // Constructor para Alquiler en tarifa por minuto opcion modelo
    }
    
    public Auto(String numeroPlaca, String marca, int year, String color){
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.year = year;
        this.color = color;
        // Constructor para Alquiler en tarifa por minuto opcion año
    }
    
    
    
    public Auto(String placaMarcaModelo, int year , int op){
        this.year = year;
        switch (op) {
            case 1:
                this.numeroPlaca = placaMarcaModelo;
                //Constructor para alquiler por dia opcion numero de placa   
                break;
            case 2:
                this.marca = placaMarcaModelo;
                //Constructor para alquiler por dia opcion marca
                break;
            default:
                this.modelo = placaMarcaModelo;
                //Constructor para alquiler por dia opcion modelo
                break;
        }
    }
    
    public Auto(String placaMarcaModelo, int op){
        switch (op) {
            case 1:
                this.numeroPlaca = placaMarcaModelo;
                //Constructor para alquiler por dia opcion numero de placa   
                break;
            case 2:
                this.marca = placaMarcaModelo;
                //Constructor para alquiler por dia opcion marca
                break;
            default:
                this.modelo = placaMarcaModelo;
                //Constructor para alquiler por dia opcion modelo
                break;
        }
        
        //Costructor para alquiler por dia sin año para poder pedir solamente
        //el Nombre del usuario
    }
    
    public Auto(String numeroPlaca, String marca, String modelo, int year, String registroVehicular, String seguro){
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.registroVehicular = registroVehicular;
        this.seguro = seguro;
        //Constructor para alquiler por mes opcion año
    }
    
    public Auto(String numeroPlaca, String marca, String modelo, String registroVehicular, String seguro){
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.registroVehicular = registroVehicular;
        this.seguro = seguro;
        //Constructor para alquiler por mes opcion sin año
    }
    
  
}
