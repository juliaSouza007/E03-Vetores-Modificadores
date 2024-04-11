import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("Julia", "155866", "223-3", 123, 16, "rua das engracadinhas", 'f', 30000);
        Conta c2 = new Conta("Mariana", "266788", "445-5", 321, 16, "rua das princesas", 'f', 20000);
        Conta c3 = new Conta("Felipe", "388900", "667-7", 111, 2, "rua dos nenens", 'm', 2000);

        System.out.println("BANCO JMSZ _ IMPRIMINDO IMPORMACOES DOS CLIENTES");
        System.out.println("Conta 1");
        c1.imprimirDados();
        System.out.println("Conta 2");
        c2.imprimirDados();
        System.out.println("Conta 3");
        c3.imprimirDados();

        System.out.println("<<<REALIZANDO OPERACOES>>>");
        c1.depositar(2000);
        c2.depositar(5000);
        c3.depositar(200);

        c1.sacar(200);
        c2.sacar(500);
        c3.sacar(2000);

        System.out.println("Imprimindo extrato...");
        System.out.println("Conta 1");
        c1.extrato();
        System.out.println("Conta 2");
        c2.extrato();
        System.out.println("Conta 3");
        c3.extrato();

        System.out.println("\nImprimindo a media...");
        int media = Operacao.totalOperacoes/Conta.totalContas;

        System.out.println("Media: " +media);
    }
}