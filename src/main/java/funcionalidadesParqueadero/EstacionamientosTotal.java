/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionalidadesParqueadero;

/**
 *
 * @author ANTONIO
 */
public class EstacionamientosTotal {
    private Estacionamiento[][] estacionamientos;
    /*
    Declaramos unas constates para las filas en caso de que sea necesario
    cambiar como se les llama y así no tener que ir parte por parte buscando
    donde debemos cambiarlo
    */
    public final char FILA_UNO = 'A';
    public final char FILA_DOS = 'B';
    public final char FILA_TRES = 'C';
    public final char FILA_CUATRO = 'D';
    public final char FILA_CINCO = 'E';
    
    public EstacionamientosTotal(){
        /*
        El constructor crea una matriz de 5 filas y 7 columnas
        cada espacio inicializa un estacionamiento y le asigna un numero
        para la fila y la letra correspondiente para la columna
        */
        
        this.estacionamientos = new Estacionamiento[5][7];
        for (Estacionamiento[] estacionamiento : estacionamientos) {
            for (int j = 0; j<estacionamientos[0].length; j++) {
                estacionamiento[j] = new Estacionamiento();
            }
        }
        
        for(byte i = 0;i<estacionamientos.length;i++){
            for(int j =  0;j<estacionamientos[0].length; j++ ){
                 estacionamientos[i][j].asignarColumna((byte)(j+1));
                 switch(i){
                     case 0 -> estacionamientos[i][j].asignarFila(FILA_UNO);
                     case 1 -> estacionamientos[i][j].asignarFila(FILA_DOS);
                     case 2 -> estacionamientos[i][j].asignarFila(FILA_TRES);
                     case 3 -> estacionamientos[i][j].asignarFila(FILA_CUATRO);
                     case 4 -> estacionamientos[i][j].asignarFila(FILA_CINCO);
                }
            }
            
        }
        
    }
    
    public void asginarCategoriaPorColumna(byte columna, String tipo){
        /*Esta ciclo recorrre cada fila hasta encontrar la columna indicada
        En dicha columna a cada estacionamiento le asigna si es Premium o VIP*/
        for(int i = 0; i<estacionamientos.length;i++){
            estacionamientos[i][columna].asignarCategoria(tipo);
        }
    }
    
    public String mostrarCategoriaPorColumna(byte columna){
            //Debido a que toda la columna es igual, solamente elegimos una 
            //y mostramos sus categoria
            return estacionamientos[4][columna].obtenerCategoria();
    }
    
    public void asignarCategoriaIndividualEStacionamiento(char fila, byte columna, String tipo){
        /*Metodo que nos permite en caso de que los VIP y premiums estén llenos
        asignar un estacionamiento especifico a la opcion por minuto*/
        estacionamientos[fila][columna].asignarCategoria(tipo);
    }
    
    /*En la matriz de disponibilidad necesitamos la Fila, columna, ocupacion
    y para los que no son por minuto la categoria*/
    public String obtenerCategoriaIndividualEstacionamiento(char fila,byte columna){
        //Al momento de tener que mostrar cada categoria
        return estacionamientos[fila][columna].obtenerCategoria();
    }
    
    public String obtenerFIlaColumnaIndividual(char fila, byte columna){
        return estacionamientos[fila][columna].obtenerFila() +  String.valueOf(estacionamientos[fila][columna].obtenerColumna()) ;
        /*toma como parametro la fila y la columna de la matriz para retornar la letra y el numero asignado
        como deseamoss usar estos valores como cadenas de texto, realizamos la conversion necesaria*/
    }
    
    public Estacionamiento[][] getEstacionamientos() {
        return estacionamientos;
    }
    
}
