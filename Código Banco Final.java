import java.util.Scanner;

class ContaBancaria {
    private String numeroConta;
    private String nomeCliente;
    private int saldo;

    public ContaBancaria(String numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(int valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaBancaria contaAlexandre =
                new ContaBancaria("12345", "Alexandre");

        System.out.println("Conta de: " +
                contaAlexandre.getNomeCliente());

        System.out.print("Digite o valor do depósito: ");
        int deposito = entrada.nextInt();
        contaAlexandre.depositar(deposito);

        System.out.print("Digite o valor do saque: ");
        int saque = entrada.nextInt();
        contaAlexandre.sacar(saque);

        System.out.println("Saldo atual: " +
                contaAlexandre.getSaldo());

    }
}