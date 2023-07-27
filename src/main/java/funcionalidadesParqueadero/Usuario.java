/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionalidadesParqueadero;

/**
 *
 * @author ANTONIO
 */
public class Usuario extends Auto{ //ejemplo de herencia
    private String primerNombre;
    private String apellido;
    private String correoElectronico;
    private String telefono;
    private String telefonoEmergencia;
    private String cedula;
    private String licencia;
    
    public Usuario (){ //constructor vacio
        super();
        this.primerNombre = "";
        this.apellido = "";
        this.correoElectronico = "";
        this.telefono = "";
    }
    
    public Usuario(String numeroPlaca, String marca, String modelo, String color, String primerNombre, String apellido, String telefono, String telefonoEmergencia){
        super(numeroPlaca, marca, modelo, color);
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.telefonoEmergencia = telefonoEmergencia;
        
        // Constructor para Alquiler en tarifa por minuto opcion modelo    
    }
    
    public Usuario(String numeroPlaca, String marca, int year, String color, String primerNombre, String apellido, String telefono, String telefonoEmergencia){
        super(numeroPlaca, marca, year, color);
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.telefonoEmergencia = telefonoEmergencia;
        // Constructor para Alquiler en tarifa por minuto opcion año
    }
    
    public Usuario(String placaMarcaModelo, int year , int opAuto, String telefono, String telefonoEmergenciaCorreoElectronico , int opUsuario){
        super(placaMarcaModelo, year, opAuto);
        this.telefono = telefono;
        switch (opUsuario) {
            case 1:
                this.telefonoEmergencia = telefonoEmergenciaCorreoElectronico;
                //Constructor para alquiler por dia opcion numero de placa   
                break;
            default:
                this.correoElectronico = telefonoEmergenciaCorreoElectronico;
                //Constructor para alquiler por dia opcion modelo
                break;
        }
        //Constructor para Alquiler por dia con año y la opcion telefono emergencia o correo
        //electronico
        
    }
    
    public Usuario(String placaMarcaModelo, int opAuto,String primerNombre, String apellido, String telefono, String telefonoEmergenciaCorreoElectronico , int opUsuario){
        super(placaMarcaModelo, opAuto);
        this.telefono = telefono;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        
        switch (opUsuario) {
            case 1:
                this.telefonoEmergencia = telefonoEmergenciaCorreoElectronico;
                //Constructor para alquiler por dia opcion numero de placa   
                break;
            default:
                this.correoElectronico = telefonoEmergenciaCorreoElectronico;
                //Constructor para alquiler por dia opcion modelo
                break;
        }
        //Constructor para Alquiler por dia con nombre Usuario y la opcion telefono emergencia o correo
        //electronico
        
    }
    
   public Usuario(String numeroPlaca, String marca, String modelo, int year,String registroVehicular, String seguro, String telefonoEmergencia, String correoElectronico, String licencia){
       super(numeroPlaca, marca, modelo, year, registroVehicular, seguro);
       this.telefonoEmergencia = telefonoEmergencia;
       this.correoElectronico = correoElectronico;
       this.licencia = licencia;
       //Constructor para alquiler por mes con la opcion año
   }
   
  public Usuario(String numeroPlaca, String marca, String modelo,String registroVehicular, String seguro, String primerNombre, String apellido, String telefonoEmergencia, String correoElectronico, String licencia){
       super(numeroPlaca, marca, modelo, registroVehicular, seguro);
       this.telefonoEmergencia = telefonoEmergencia;
       this.correoElectronico = correoElectronico;
       this.licencia = licencia;
       this.primerNombre = primerNombre;
       this.apellido = apellido;
       
       //Constructor para alquiler por mes con opcion nombre
   }
  
  public Usuario(String numeroPlaca, String marca, String modelo,String registroVehicular, String seguro, String telefono, String telefonoEmergencia, String correoElectronico, String licencia){
       super(numeroPlaca, marca, modelo, registroVehicular, seguro);
       this.telefonoEmergencia = telefonoEmergencia;
       this.correoElectronico = correoElectronico;
       this.licencia = licencia;
       this.telefono = telefono;
       
       //Constructor para alquiler por mes con opcion telefono
   }
   
 
    
    public String obtenerNombreCompleto(){
        return this.primerNombre + " " + this.apellido;
    }
    
    public String obtenerCorreoE(){
        return this.correoElectronico;
    }
    
    public String obtenerTelefono(){
        return this.telefono;
    }
    
   
    
}
