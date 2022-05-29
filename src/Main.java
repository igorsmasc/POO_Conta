public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numeroDaConta = 1;
        c1.titular = "Paula";
        c1.saldo = 100.0;
        c1.estaAtiva = true;

        Conta c2 = new Conta();
        c2.numeroDaConta = 2;
        c2.titular = "Pedro";
        c2.saldo = 150.0;
        c2.estaAtiva = true;

        Conta c3 = new Conta();
        c3.numeroDaConta = 3;
        c3.titular = "Maria";
        c3.saldo = 200.0;
        c3.estaAtiva = false;
    }
}
