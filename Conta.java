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
public class Conta {

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {

        this.saldo += valor;
        return true;
    }

    public void sacar(double valor) throws ExcecaoChequeEspecial {

        if (this.saldo >= valor ) {
            this.saldo -= valor;
        } else {
            throw new ExcecaoChequeEspecial(this.saldo-valor, "Saldo insuficiente");
        }
    }

    Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    @Override
    public String toString(){
        String s = "";
        return s;
    }
}
