public class Conta {
    private int numeroDaConta;
    private String titular;
    private double saldo = 0.0;
    private boolean estaAtiva = true;

    public Conta() {}

//    public Conta(int numeroDaConta, String titular) {
//        this.numeroDaConta = numeroDaConta;
//        this.titular = titular;
//    }

    public Conta(int numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 0.0;
        this.estaAtiva = true;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public void sacar(double valorASerSacado) {
        saldo -= valorASerSacado;
        System.out.printf("Voce sacou %f reais", valorASerSacado);
    }

    public void depositar(double valorASerDepositado) {
        saldo += valorASerDepositado;
        System.out.printf("Voce depositou %f reais", valorASerDepositado);
    }

    public void statusDaConta() {
        System.out.println("Conta: " + this.numeroDaConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Ativa: " + this.estaAtiva);
    }

    public void desativarConta() {
        this.estaAtiva = false;
    }

    public void ativarConta() {
        this.estaAtiva = true;
    }

    // Adiciona nome do titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}
