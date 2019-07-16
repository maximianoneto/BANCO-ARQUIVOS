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
public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, double protecao) {
        super(saldo);
        this.chequeEspecial = protecao;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(double valor) throws ExcecaoChequeEspecial {
        if (this.saldo >= valor && this.chequeEspecial > 0) {
            this.saldo -= valor;
        } else if(this.saldo >=valor){
            this.saldo -= valor;
        }else if((this.saldo + this.chequeEspecial) >= valor){
            this.chequeEspecial = (this.saldo + this.chequeEspecial) - valor;
            this.saldo = 0;
        }else if(this.saldo < valor && this.chequeEspecial == 0){
            throw new ExcecaoChequeEspecial(valor-this.saldo,"Não há cheque especial");
        }else{
            throw new ExcecaoChequeEspecial(valor-(this.saldo+this.chequeEspecial), "Saldo insuficiente no cheque especial");
        }
    }

    @Override
    public String toString() {
        String s = "";
        s += "\nLimite de Saldo com Cheque Especial: " + this.chequeEspecial + "\n";
        return s;
    }
}
