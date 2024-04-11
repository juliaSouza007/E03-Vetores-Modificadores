public class Conta {

    Cliente donoConta = new Cliente();

    private double saldo;
    private double limite;
    private int numero;
    private String agencia;
    public double valor;

    boolean depositar (double valor) {
        if (valor > 0.0 && (saldo+valor) <= limite) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    boolean sacar (double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    void imprimir () {
        System.out.println("Cliente:\n ");
        donoConta.imprimirDados();
        System.out.println("Numero da conta: " +numero);
        System.out.println("Saldo atual: " +saldo);
        System.out.println("Limite: " +limite);

        System.out.println();
    }

    //getters
    public double getSaldo() {
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public int getNumero(){
        return numero;
    }

    public String getAgencia(){
        return agencia;
    }

    //setters
    public void setLimite(double limite){
        this.limite = limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}
