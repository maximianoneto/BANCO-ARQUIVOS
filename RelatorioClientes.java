package lab8.banco1;


import java.text.NumberFormat;
import java.util.*;

public class RelatorioClientes {

  public void geraRelatorio() {
    NumberFormat formatoMonetario = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    
    Banco banco = Banco.getBanco();
    Cliente cliente = null;

    System.out.println("\t\t\tRelatório de Clientes");
    System.out.println("\t\t\t================");
    
    Iterator i = cliente.getContas();
    Iterator j = banco.getClientes();
    int indiceCliente = 0;
    int indiceConta = 0;   
    while(j.hasNext()){
    
      cliente = banco.getCliente(indiceCliente);
      indiceCliente ++;
      System.out.println();
      System.out.println("Cliente: "
			 + cliente.getUltimoNome() + ", "
			 + cliente.getPrimeiroNome());

      while(i.hasNext()){
     
	Conta conta = cliente.getConta(indiceConta);
        indiceConta ++;
	String  tipoConta = "";

	// Determina o tipo de conta
	if ( conta instanceof ContaPoupanca ) {
	  tipoConta = "Conta Poupanca";
	} else if ( conta instanceof ContaCorrente ) {
	  tipoConta = "Conta Corrente";
	} else {
	  tipoConta = "Tipo desconhecido de conta";
	}

	// Exibe os saldos da conta
	System.out.println("    " + tipoConta + ": Saldo atual de "
			 + formatoMonetario.format(conta.getSaldo()));
      }
    }
  }


}

