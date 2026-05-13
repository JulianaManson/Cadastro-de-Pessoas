package cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroPessoas cadastro = new CadastroPessoas();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite a idade do cliente:");
        int idadeCliente = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha
        Cliente c1 = new Cliente(nomeCliente, idadeCliente);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = sc.nextLine();
        System.out.println("Digite a idade do funcionário:");
        int idadeFuncionario = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o setor do funcionário:");
        String setorFuncionario = sc.nextLine();
        Funcionario f1 = new Funcionario(nomeFuncionario, idadeFuncionario, setorFuncionario);

        cadastro.adicionarPessoa(c1);
        cadastro.adicionarPessoa(f1);

        System.out.println("\n--- Lista de Pessoas ---");
        cadastro.listarPessoas();

        System.out.println("\nDigite um nome para buscar:");
        String busca = sc.nextLine();
        Pessoa encontrada = cadastro.buscarPessoa(busca);
        if (encontrada != null) {
            System.out.println("Pessoa encontrada: " + encontrada);
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        sc.close();
    }
}
