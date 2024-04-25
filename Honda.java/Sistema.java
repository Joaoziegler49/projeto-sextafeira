import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void buscarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                System.out.println("funcionario encontrado:" + funcionario.getNome());
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }