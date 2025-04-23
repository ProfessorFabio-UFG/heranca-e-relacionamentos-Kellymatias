import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes         = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    // Empregar funcionário (adiciona à lista)
    public void empregar(Funcionario f) {
        funcionarios.add(f);
        System.out.println("Empregado: " + f.getNome());
    }

    // Demitir funcionário (remove da lista pelo objeto ou matrícula)
    public boolean demitir(Funcionario f) {
        boolean removed = funcionarios.remove(f);
        if (removed) {
            System.out.println("Demitido: " + f.getNome());
        }
        return removed;
    }

    public boolean demitirPorMatricula(int matricula) {
        return funcionarios.removeIf(f -> f.getMatricula() == matricula);
    }

    // Cadastrar cliente
    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente cadastrado: " + c.getNome());
    }

    // Cadastrar fornecedor
    public void cadastrarFornecedor(Fornecedor f) {
        fornecedores.add(f);
        System.out.println("Fornecedor cadastrado: " + f.getNome());
    }

    // Listar clientes
    public void listarClientes() {
        System.out.println("=== Clientes ===");
        clientes.forEach(c -> System.out.println(c));
    }

    // Listar funcionários
    public void listarFuncionarios() {
        System.out.println("=== Funcionários ===");
        funcionarios.forEach(f -> System.out.println(f));
    }

    // Listar fornecedores
    public void listarFornecedores() {
        System.out.println("=== Fornecedores ===");
        fornecedores.forEach(f -> System.out.println(f));
    }
}