package edu.cuc.pruebas;

/**
 *
 * @author alexisdelahoz
 */
public class Clase1 {

    //Declaracion de atributos
    //modificadores tipoDato identificador = valorInicial;
    //Permisos
    protected int edad = 16;
    public int contador;
    private double peso;
    private String nombreCompleto;

    /*modificadores tipoRetorno identificador( argumentos) {
     .... cuerpo del metodo
     }*/
    public int sumar(int numero1, int numero2) {
        if (numero1 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean verificarEdad(int edad) {
        return true;
    }

    public Clase1() {

    }

    public Clase1(int edad) {
        this.edad = edad;
    }

    public Clase1(double peso, String nombreCompleto) {
        this.peso = peso;
        this.nombreCompleto = nombreCompleto;
    }

    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        Clase1 obj2 = new Clase1(45);
        Clase1 obj3 = new Clase1(50, "luchooooo");

        System.out.println("La edad es " + obj1.edad);
        System.out.println("La edad es " + obj2.edad);
        System.out.println("El peso es " + obj3.peso +"Su nombre es " + obj3.nombreCompleto);

    }

}
