package SistemaBanco.Sistema.usuario;
import SistemaBanco.Sistema.dominio.Conta;
import SistemaBanco.Sistema.dominio.ContaCorrente;
import SistemaBanco.Sistema.dominio.ContaInvestimento;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta1 = null;
        int tipoConta;
        while (true) {
            System.out.println("Qual o tipo da sua conta?:");
            System.out.println("1. Corrente");
            System.out.println("2. Investimentos");
            if(scan.hasNextInt()) {
                tipoConta = scan.nextInt();

                if (tipoConta == 1) {
                    System.out.println("Conta Corrente criada!");
                    conta1 = new ContaCorrente();
                    break;
                } else if (tipoConta == 2) {
                    System.out.println("Conta Investimentos criada!");
                    conta1 = new ContaInvestimento();
                    break;
                } else {
                    System.out.println("Digite o numero correto");
                }
            } else {
                System.out.println("Entrada Invalida! Digite um numero");
                scan.next();
            }
        }
        scan.close();

        int saida = 0;
        while (saida == 0) {
            System.out.println("\n1.Consultar Saldo");
            System.out.println("2.Transferir valor");
            System.out.println("3.Sair");
            System.out.print("\nDigite sua escolha: ");
            int escolha = scan.nextInt();
            if (escolha == 1){
                System.out.println("\nSeu saldo é de: R$"+conta1.getSaldo());
            } else if (escolha == 2) {
                System.out.print("\nDigite o valor a transferir: ");
                float valor = scan.nextFloat();
                conta1.transferencia(valor);
            } else if (escolha == 3) {
                saida += 1;
            }
        }
    }
}
