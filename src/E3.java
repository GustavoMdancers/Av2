public class E3 {
    /*
    * Crie um programa que solicite a senha para acesso ao sistema.
    Requisitos:

    - Defina uma senha fixa (por exemplo, “1234”);
    - Utilize um loop while para solicitar a senha enquanto o usuário errar;
    - Em cada iteração, se a senha estiver incorreta, exiba a mensagem "Senha incorreta, tente novamente.";
    - Ao acertar, exiba "Acesso concedido" e encerre o programa.
    *
    * */

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String password = "gustavoav2";
        String inputPassword;

        do {
            System.out.print("Digite a senha: ");
            inputPassword = scanner.nextLine();

            if (!inputPassword.equals(password)) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (!inputPassword.equals(password));

        System.out.println("Acesso concedido.");
    }

}
