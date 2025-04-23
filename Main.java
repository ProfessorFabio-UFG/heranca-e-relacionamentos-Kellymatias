public class Main {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja();

        Funcionario joao = new Funcionario("João Silva", "Rua A, 123", "9999-0000",
                                           "123.456.789-00", 'M', 1,
                                           1001, 2500.00, "Vendedor");
        Cliente maria = new Cliente("Maria Souza", "Av. B, 456", "9888-1111",
                                    "987.654.321-00", 'F', 2,
                                    3500.00, "Eletrônicos", "Engenheira");
        Fornecedor acme = new Fornecedor("ACME Ltda.", "Rod. C, Km 10", "3777-2222",
                                         "12.345.678/0001-99", "ACME Comércio", "Parafusos, Porcas");

        minhaLoja.empregar(joao);
        minhaLoja.cadastrarCliente(maria);
        minhaLoja.cadastrarFornecedor(acme);

        minhaLoja.listarFuncionarios();
        minhaLoja.listarClientes();
        minhaLoja.listarFornecedores();

        minhaLoja.demitirPorMatricula(1001);
        minhaLoja.listarFuncionarios();
    }
}