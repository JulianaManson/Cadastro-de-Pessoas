package cadastro;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        for (Pessoa p : pessoas) {
            p.exibirDados(); // Polimorfismo em ação
            System.out.println();
        }
    }
}


Cadastro de pessoas (gerenciamento de objetos)