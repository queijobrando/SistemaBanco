package SistemaBanco.Sistema.dominio;

public class ContaCorrente extends Conta {

    public float transferencia(float valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo Insuficiente");
        } else {
            alterarSaldo(getSaldo() - valor);
            System.out.println("Transferência realizada. Seu saldo agora é de R$" + getSaldo());
        }
        return getSaldo();
    }

}
