import java.util.Scanner;

public class ComputeFare {
    public static void main(String[] args) {
        // Declarar uma variável inteira para idade
        int age;

        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a idade
        System.out.print("Digite a sua idade: ");
        age = scanner.nextInt();

        // Declarar uma variável para a tarifa
        int tarifa;

        // Calcular a tarifa com base na idade usando if encadeado
        if (age < 11) {
            tarifa = 3;
        } else if (age >= 11 && age < 65) {
            tarifa = 5;
        } else {
            tarifa = 3;
        }

        // Exibir a tarifa calculada
        System.out.println("A tarifa é: US$ " + tarifa);

        // Fechar o scanner
        scanner.close();
    }
}