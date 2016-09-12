/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Camilo_Escobar
 */
public class ComplejosDivisionCeroException extends Exception{
    public ComplejosDivisionCeroException(){
        super("No se permite en una división que en el segundo"
                + " número complejo alguno de sus componentes sea 0");
    }
}
