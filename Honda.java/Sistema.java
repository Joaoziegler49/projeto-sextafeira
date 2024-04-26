import java.util.ArrayList;

public class Sistema {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void buscarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                System.out.println("Funcionário encontrado: " + funcionario.getNome());
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public static void excluirFuncionario(String nome) {
        funcionarios.removeIf(f -> f.getNome().equals(nome));
        System.out.println("Funcionário removido: " + nome);
    }

    public static void listarFuncionarios() {
        System.out.println("Lista de funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() + ", Salário: " + funcionario.getSalario());
        }
    }

    public static void excluirTodosFuncionarios() {
        funcionarios.clear();
        System.out.println("Todos os funcionários removidos.");
    }
}
