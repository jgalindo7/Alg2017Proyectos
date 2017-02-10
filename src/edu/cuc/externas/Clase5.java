/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.externas;

import edu.cuc.pruebas.Clase1;

/**
 *
 * @author alexisdelahoz
 */
public class Clase5 extends Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase5 objeto3 = new Clase5();
        System.out.println(""+objeto3.edad);
        objeto3.edad = 45;
        Clase5 objeto4 = new Clase5();
        System.out.println("Obj4.Edad: "+objeto4.edad);
        System.out.println("Obj3.Edad: "+objeto3.edad);
       
        }
    }
