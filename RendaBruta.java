import java.util.ArrayList;
import java.util.Scanner;

abstract class Contribuinte {
    String nome;
    double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();
}

class PessoaFisica extends Contribuinte {

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        if (rendaBruta <= 1400) {
            return 0;
        } else if (rendaBruta <= 2100) {
            return (rendaBruta * 0.10) - 100;
        } else if (rendaBruta <= 2800) {
            return (rendaBruta * 0.15) - 270;
        } else if (rendaBruta <= 3600) {
            return (rendaBruta * 0.25) - 500;
        } else {
            return (rendaBruta * 0.30) - 700;
        }
    }
}

class PessoaJuridica extends Contribuinte {

    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return rendaBruta * 0.10;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contribuinte> lista = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {

            System.out.println("\nContribuinte " + i);
            System.out.print("PF ou PJ? ");
            String tipo = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Renda Bruta: ");
            double renda = sc.nextDouble();
            sc.nextLine();

            if (tipo.equalsIgnoreCase("PF")) {
                lista.add(new PessoaFisica(nome, renda));
            } else {
                lista.add(new PessoaJuridica(nome, renda));
            }
        }

        System.out.println("\n--- RESULTADOS ---");

        for (Contribuinte c : lista) {
            System.out.println("Nome: " + c.nome);
            System.out.println("Renda: R$ " + c.rendaBruta);
            System.out.println("Imposto: R$ " + c.calcularImposto());
            System.out.println();
        }

        sc.close();
    }
}