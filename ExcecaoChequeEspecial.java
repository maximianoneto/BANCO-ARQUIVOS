/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.banco1;


/**
 *
 * @author patri
 */
public class ExcecaoChequeEspecial extends Exception {

    public ExcecaoChequeEspecial(double deficit, String string) {
        super(string);
        this.deficit = deficit;
    }

    private double deficit;

    public double getDeficit() {
        return deficit;
    }
    
    

}
