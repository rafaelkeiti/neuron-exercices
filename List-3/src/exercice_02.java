import java.util.Objects;
import java.util.Scanner;

public class exercice_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName;
        String password;

        System.out.println("Digite seu nome de login:");
        userName = input.nextLine();

        System.out.println("Digite sua senha:");
        password = input.nextLine();

        while (Objects.equals(userName, password)) {
            System.out.println("O nome de usuário e a senha não podem ser iguais. Preencha Novamente!");

            System.out.println("Digite seu nome de login:");
            userName = input.nextLine();

            System.out.println("Digite sua senha:");
            password = input.nextLine();
        }
        System.out.println("Processando dados...");
    }
}
