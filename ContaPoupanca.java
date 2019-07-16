/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.banco1;





/**
 *
 * @author 2016.1.08.034
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo, double taxa){
        super(saldo);
        this.taxaJuros = taxa;
    }
    private double taxaJuros;
    
    
    
}
