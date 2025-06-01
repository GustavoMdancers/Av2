public class E8 {
    /*
    * Desenvolva um programa que permita inserir várias notas (de 0 a 10) de alunos.
    Requisitos:

    - Utilize um loop do..while para solicitar as notas;
    - Após cada inserção, pergunte se o usuário deseja continuar inserindo notas (por exemplo, "Deseja inserir outra nota? (s/n)");
    - Ao final, calcule e exiba a média das notas inseridas.
    * */

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double nota;
        double somaNotas = 0;
        int contadorNotas = 0;
        String continuar;

        do {
            System.out.print("Digite a nota (0 a 10): ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                contadorNotas++;
            } else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        if (contadorNotas > 0) {
            double media = somaNotas / contadorNotas;
            System.out.println("A média das notas inseridas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}
