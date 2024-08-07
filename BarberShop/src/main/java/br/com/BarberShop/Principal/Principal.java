package br.com.BarberShop.Principal;

import java.util.Scanner;
import br.com.BarberShop.Models.Cliente;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    public void exibeMenu(){
        System.out.println("""
                Barber Shop

                Olá qual o seu nome?

                """);
        var nome = leitura.nextLine();

        System.out.println("Qual seu número de telefone? ");
        var telefone = leitura.nextLine();
    
        Cliente cliente = new Cliente(nome, telefone);

        var opcao = -1;
        while (opcao != 0) {
        var menu = """
                Bem-vindo
                Qual serviço gostaria de fazer?

                1- Barba
                2- Corte de cabelo
                3- Barba e corte de cabelo

                """;
        System.out.println(menu);
        opcao = leitura.nextInt();
        leitura.nextLine();

        switch (opcao) {
            case 1:
                cortarCabelo();
                break;
            case 2:
                cortarBarba();
                break;
            case 3:
                cortarCabeloEBarba();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
            }
        }   
    }

    private void cortarCabeloEBarba() {
        System.out.println("Barba e cabelo");
    }

    private void cortarBarba() {
        System.out.println("Barba");
    }

    private void cortarCabelo() {
        System.out.println("cabelo");
 }
}
