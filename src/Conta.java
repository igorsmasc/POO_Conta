public class Conta {
    int numeroDaConta;
    String titular;
    double saldo;
    boolean estaAtiva;

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public void sacar() {
        System.out.println("Voce sacou dinheiro");
    }

    public void depositar() {
        System.out.println("Voce depositou dinheiro");
    }

    public void statusDaConta() {
        System.out.println("Conta: " + this.numeroDaConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Ativa: " + this.estaAtiva);
    }
}
