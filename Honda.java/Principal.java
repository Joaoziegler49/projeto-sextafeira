import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu ");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Buscar funcionário");
            System.out.println("3. Excluir funcionário");
            System.out.println("4. Listar funcionários");
            System.out.println("5. Excluir todos os funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner);
                    break;
                case 2:
                    buscarFuncionario(scanner);
                    break;
                case 3:
                    excluirFuncionario(scanner);
                    break;
                case 4:
                    listarFuncionarios();
                    break;
                case 5:
                    excluirTodosFuncionarios();
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }

    private static void cadastrarFuncionario(Scanner scanner) {
        System.out.print("ID do funcionário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("CPF do funcionário: ");
        String cpf = scanner.nextLine();

        System.out.print("Salário do funcionário: ");
        double salario = scanner.nextDouble();
        Sistema.cadastrarFuncionario(new Funcionario(id, nome, cpf, salario));
    }

    private static void buscarFuncionario(Scanner scanner) {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();
        Sistema.buscarFuncionario(nome);
    }

    private static void excluirFuncionario(Scanner scanner) {
        System.out.print("Nome do funcionário a ser excluído: ");
        String nome = scanner.nextLine();
        Sistema.excluirFuncionario(nome);
    }

    private static void listarFuncionarios() {
        Sistema.listarFuncionarios();
    }

    private static void excluirTodosFuncionarios() {
        Sistema.excluirTodosFuncionarios();
    }
}


