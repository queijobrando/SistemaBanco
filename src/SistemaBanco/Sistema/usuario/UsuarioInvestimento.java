package SistemaBanco.Sistema.usuario;
import SistemaBanco.Sistema.dominio.Conta;
import SistemaBanco.Sistema.dominio.ContaCorrente;
import SistemaBanco.Sistema.dominio.ContaInvestimento;

import java.util.Scanner;

public class UsuarioInvestimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaInvestimento conta1 = new ContaInvestimento();

        conta1.setNomeCliente("Claudio");

        System.out.println("Seu saldo inicial é de: R$"+conta1.getSaldo());
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
