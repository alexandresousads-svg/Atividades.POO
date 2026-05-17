class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    int velocidade;

    void ligar() {
        System.out.println("Carro ligado");
    }

    void acelerar(int valor) {
        velocidade += valor;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    void frear(int valor) {
        velocidade -= valor;

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println("Freou para " + velocidade + " km/h");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.marca = "Hyundai";
        carro1.modelo = "HB20S";
        carro1.cor = "Prata";
        carro1.ano = 2019;

        carro1.ligar();
        carro1.acelerar(60);

        carro1.mostrarDados();

        System.out.println("-----");

        Carro carro2 = new Carro();

        carro2.marca = "Toyota";
        carro2.modelo = "Hilux";
        carro2.cor = "Branca";
        carro2.ano = 2016;

        carro2.ligar();
        carro2.acelerar(80);
        carro2.frear(20);

        carro2.mostrarDados();
    }
}