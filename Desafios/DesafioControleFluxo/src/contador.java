import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int parametroDois = scanner.nextInt();

        try{
            //chamando o metodo contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo paramentro deve ser maior que o primeiro");
        }

        for (int contagem = parametroUm; contagem <= parametroDois; contagem++) {
            System.out.println(contagem);
        }
        //realizar o for para imprimir os numeros com base na variavel contagem
    }
}
