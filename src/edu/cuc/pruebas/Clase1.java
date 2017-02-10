package edu.cuc.pruebas;

/**
 *
 * @author alexisdelahoz
 */
public class Clase1 {
    //Declaracion de atributos
    //modificadores tipoDato identificador = valorInicial;
    //Permisos
    protected int edad = 18;
    public int contador;
    private double peso;
    private String nombreCompleto;
    
    /*modificadores tipoRetorno identificador( argumentos) {
    .... cuerpo del metodo
    }*/
    public int  sumar(int numero1, int numero2) {
        if (numero1 == 0) {
            return 0;
        } else {
            return 1;
        }
    }    
   
    public boolean verificarEdad(int edad) {
     return true;   
    }
    
    
    
}


