package lab8.banco1;
/*
* Esta classe cria um programa para testar as classes do projeto banco.
* Ela cria um conjunto de clientes, com algumas contas,
* e gera um relatoorio do saldo atual em conta.
*/


public class TestaBanco {

  public static void main(String[] args) {
    Banco     banco = Banco.getBanco();
    Cliente cliente;
    Conta  conta;

    // Cria dois clientes e suas contas
    banco.adicionarCliente("Jane", "Simms");
    cliente = banco.getCliente(0);
    cliente.setConta(new ContaPoupanca(500.00, 0.05));
    cliente.setConta(new ContaCorrente(200.00, 500.00));
    banco.adicionarCliente("Owen", "Bryant");
    cliente = banco.getCliente(1);
    cliente.setConta(new ContaCorrente(200.00));

    // Testa  a conta corrente de Jane Simms (com cheque especial)
    cliente = banco.getCliente(0);
    conta = cliente.getConta(1);
    System.out.println("Cliente [" + cliente.getUltimoNome()
		       + ", " + cliente.getPrimeiroNome() + "]"
		       + " Tem um saldo em conta corrente de "
		       + conta.getSaldo()
			 + " Com cheque especial de  R$ 500.00.");
    try {
      System.out.println("Conta Corrente [Jane Simms] : Saque de R$ 150,00");
      conta.sacar(150.00);
      System.out.println("Conta Corrente [Jane Simms] : dep�sito de R$ 22,50");
      conta.depositar(22.50);
      System.out.println("Conta Corrente [Jane Simms] : Saque de R$ 147,62");
      conta.sacar(147.62);
      System.out.println("Conta Corrente [Jane Simms] : Saque de R$ 470,00");
      conta.sacar(470.00);
    } catch (ExcecaoChequeEspecial e1) {
      System.out.println("Exceção: " + e1.getMessage()
			 + "   Déficit: " + e1.getDeficit());
    } finally {
      System.out.println("Cliente [" + cliente.getUltimoNome()
			 + ", " + cliente.getPrimeiroNome() + "]"
			 + " Tem um saldo em conta corrente de "
			 + conta.getSaldo());
    }
    System.out.println();

    // Testa a conta corrente de Owen Bryant (sem cheque especial)
    cliente = banco.getCliente(1);
    conta = cliente.getConta(0);
    System.out.println("Cliente [" + cliente.getUltimoNome()
		       + ", " + cliente.getPrimeiroNome() + "]"
		       + " tem um saldo de "
		       + conta.getSaldo());
    try {
      System.out.println("Conta Corrente [Owen Bryant] : Saque de R$ 100,00");
      conta.sacar(100.00);
      System.out.println("Conta Corrente [Owen Bryant] : depósito de R$ 25,00");
      conta.depositar(25.00);
      System.out.println("Conta Corrente [Owen Bryant] : Saque de R$ 175,00");
      conta.sacar(175.00);
    } catch (ExcecaoChequeEspecial e1) {
      System.out.println("Exceção: " + e1.getMessage()
			 + "   Déficit: " + e1.getDeficit());
    } finally {
      System.out.println("Cliente [" + cliente.getUltimoNome()
			 + ", " + cliente.getPrimeiroNome() + "]"
			 + " Tem um saldo dem conta corrente de "
			 + conta.getSaldo());
    }
  }
}
