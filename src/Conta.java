import java.util.Arrays;

public class Conta {
    private Cliente donoConta = new Cliente();
    private Operacao[] operacoes = new Operacao[1000];

    private double saldo = 15000;

    public static int totalContas = 0;

    private int contador = 0;

    Conta(String nome, String cpf, String agencia, int numero, int idade, String endereco, char sexo, double limite){
        this.donoConta.setNome(nome);
        this.donoConta.setCpf(cpf);
        this.donoConta.setIdade(idade);
        this.donoConta.setEndereco(endereco);
        this.donoConta.setSexo(sexo);
        this.donoConta.setAgencia(agencia);
        this.donoConta.setNumero(numero);
        this.donoConta.setLimite(limite);
        totalContas++;
    }

    void imprimirDados(){
        System.out.println("Nome: " +donoConta.getNome());
        System.out.println("CPF: " +donoConta.getCpf());
        System.out.println("Endereco: " +donoConta.getEndereco());
        System.out.println("Idade: " +donoConta.getIdade());
        System.out.println("Sexo: " +donoConta.getSexo()+ "\n");
    }

    boolean depositar (double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
            this.operacoes[contador] = new Operacao('d', valor);
            contador++;
            return true;
        } else {
            return false;
        }
    }

    boolean sacar (double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            this.operacoes[contador] = new Operacao('s', valor);
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public void extrato(){
        for(int i = 0; i < contador; i++){
            System.out.println(operacoes[i].getTipo()+" "+operacoes[i].getValor()+" "+operacoes[i].getData());
        }
    }

    //getters
    public double getSaldo() {
        return saldo;
    }

    public Cliente getDonoConta(){
        return this.donoConta;
    }

    public Operacao[] getOperacoes(){
        return this.operacoes;
    }

    //setters
    public void setDonoConta(Cliente donoConta) {
        this.donoConta = donoConta;
    }

}
