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
public class Banco {
    
    private Banco(){
        cliente = new ArrayList<Cliente>();
    }
    
    public static Banco getBanco(){
        return Banco.banco;
    }
    
    public static Banco banco = new Banco();
    private List<Cliente> cliente;
    
    public void adicionarCliente(String p, String u){
       Cliente clientes = new Cliente(p, u);
       cliente.add(clientes);
    }
    
    public Cliente getCliente(int indice){
        return cliente.get(indice);
    }
    public int getNumeroDeClientes(){
        return cliente.size();
    }
    
    public Iterator getClientes(){
        return cliente.iterator();
    }

}
