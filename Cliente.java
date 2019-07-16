/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.banco1;

import java.util.*;








/**
 *
 * @author 2016.1.08.034
 */
public class Cliente {
    
    private List<Conta> conta;
    private final String primeiroNome;
    private final String ultimoNome;


    Cliente(String pN, String uN){
        this.primeiroNome = pN;
        this.ultimoNome = uN;
        conta= new ArrayList<Conta>();
    }
    public Conta getConta(int i) {
        return conta.get(i);
    }

    public void setConta(Conta conta) {
        Conta contas = conta;
        this.conta.add(contas);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }
    
    public void adicionarConta(Conta conta){
        this.conta.add(conta); 
    }
    
    public int getNumeroDeContas(){
        return conta.size();
    }
    
    public Iterator getContas(){
        return conta.iterator();
    }

    
    
    
    
    
    
}
