package Funcionario;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;

    // Construtor da classe Funcionario
    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    // Métodos para acessar e modificar os valores de cada atributo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Método para retornar o estado do objeto
    public String toString() {
        return "Funcionário:\nCódigo: " + codigo + "\nNome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nIdade: " + idade + "\nSalário: " + salario;
    }

    // Método para calcular o salário líquido do funcionário
    public float calculaSalarioLiquido() {
        float inss = salario * 0.11f;
        float salarioLiquido = salario - inss;
        return salarioLiquido;
    }
}