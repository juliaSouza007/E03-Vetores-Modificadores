import java.util.Scanner;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private int idade;
    private char sexo;
    private double limite;
    private int numero;
    private String agencia;

    public static int totalDeContas;

    Scanner input = new Scanner(System.in);

    //getters
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
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
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

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



