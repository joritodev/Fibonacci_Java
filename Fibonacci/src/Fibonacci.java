import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int primeiroValor = 0;
        int segundoValor = 1;
        boolean ehValorDaSequencia = false;

        while(primeiroValor<=valor){
            if(primeiroValor == valor){
                ehValorDaSequencia = true;
                break;
            }

            int temp = primeiroValor + segundoValor;
            primeiroValor = segundoValor;
            segundoValor = temp;
        }


        if(ehValorDaSequencia) {
            System.out.println(valor + " pertence a sequencia de Fibonacci");
        }
        else {
            System.out.println(valor + " nao pertence a sequencia de Fibonacci");
        }

    }
}
