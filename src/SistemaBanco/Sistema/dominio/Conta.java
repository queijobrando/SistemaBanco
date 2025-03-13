package SistemaBanco.Sistema.dominio;

public class Conta {
    private String nomeCliente;
    private float saldo = 1250.50F;

    public float getSaldo(){
        return saldo;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nome){
        nomeCliente = nome;
    }

    //protected = apenas subclasses
    protected void alterarSaldo(float novoSaldo) {
        if (this instanceof ContaCorrente) { // Verifica se a classe chamadora é ContaCorrente
            saldo = novoSaldo;
        } else {
            throw new UnsupportedOperationException("Apenas ContaCorrente pode alterar o saldo!");
            //da esse erro no console se outra subclasse tentar chamar
        }
    }

}


