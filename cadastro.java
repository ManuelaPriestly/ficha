import java.util.Scanner;

class Cadastro {

    int idade;
    String nome;
    String sexo;
    String cidade;
    String estado;

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        cadastro.cadastrar();
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escreva seu nome:");
            nome = sc.nextLine();

            System.out.println("Escreva sua Idade:");
            idade = Integer.parseInt(sc.nextLine());

            while (true) {
                System.out.println("Escreva seu sexo (F ou M):");
                char inputSexo = sc.nextLine().toUpperCase().charAt(0);
                if (inputSexo == 'F' || inputSexo == 'M') {
                    sexo = String.valueOf(inputSexo);
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite F ou M.");
                }
            }

            System.out.println("Escreva sua Cidade:");
            cidade = sc.nextLine();

            System.out.println("Escreva seu Estado:");
            estado = sc.nextLine();

            exibirDados();

            System.out.println("Deseja fazer outro cadastro? (S/N)");
            String resposta = sc.nextLine().toUpperCase();
            if (resposta.equals("N")) {
                continuar = false;
            }
        }


    }

    public void exibirDados() {
        System.out.println("\n---- Dados cadastrados ----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Obrigada!");
    }
}