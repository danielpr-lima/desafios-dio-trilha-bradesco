import java.util.Scanner;

public class Contador {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = input.nextInt();
        input.nextLine();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = input.nextInt();
        ;

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException erro) {
            System.out.println("Erro:" + erro.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção11
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O numero 2 tem que ser maior que o numero 1");
        
        int contagem = parametroDois - parametroUm;

        for (int i = 1; contagem >= i; i++) {
            // realizar o for para imprimir os números com base na variável contagem
            System.out.println(i);
        }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
}
