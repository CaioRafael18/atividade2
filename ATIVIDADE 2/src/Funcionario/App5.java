package Funcionario;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        // Criando o objeto funcionario
        Funcionario funcionario = new Funcionario(1, "Caio Rafael", "275.548.654-09", "Rua heronides, 98", "9999-9999", 19, 2000.00f);
        
        // Mostrando os dados iniciais do funcionário
        System.out.println(funcionario.toString());
        
        // Alterando o salário do funcionário com um valor digitado pelo usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o novo salário do funcionário: ");
        float novoSalario = sc.nextFloat();
        funcionario.setSalario(novoSalario);
        
        // Mostrando os dados atualizados do funcionário, incluindo o salário líquido
        System.out.println(funcionario.toString());
        System.out.println("Salário líquido");
    }
}