import java.util.Scanner;

public class Contador {
public static void main(String[] args) {

    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();

    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
        
        if (parametroUm > parametroDois) {
            System.out.println(" ====================================================");
            throw new ParametrosInvalidosException("  O Segundo Parâmetro deve ser Maior que o Primeiro!  \n ====================================================");
            
        }
       contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
        System.out.println(exception.getMessage());
    } finally {
        terminal.close();
    }
}

static void contar(int parametroUm, int parametroDois) {
    int cont = 0;
    for (int p2 = parametroDois; p2 > parametroUm; p2--) {
        cont = cont + 1;
        System.out.println("Imprimindo o número " + cont);
    }
}
}