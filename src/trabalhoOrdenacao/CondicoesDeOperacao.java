package trabalhoOrdenacao;

import java.util.Scanner;

public class CondicoesDeOperacao {
	public static void main(String[] args) {
        //Criando vari�veis do tipo double
        double n1, n2, soma, divisao, multiplicacao, subtracao;
        //Criando vari�vel do tipo inteiro
        int operacao;
        //Recebendo os valores
        Scanner nomeObjtValor = new Scanner(System.in);
        System.out.println("Minha calculadora Java");
        
        System.out.println("Digite um n�mero:");
        n1 = nomeObjtValor.nextDouble();
        System.out.println("Digite outro n�mero:");
        n2 = nomeObjtValor.nextDouble();
        
        System.out.println("Que opera��o deseja realizar"
                + " 1: Somar"
                + " 2: Subtrair"
                + " 3: Multiplicar"
                + " 4: Divis�o");
        
        System.out.println("Escolhar um n�mero: ");
        operacao = nomeObjtValor.nextInt();
        //Criando uma condi��o para o caso acima
        if(operacao == 1){
            soma = n1 + n2;
            System.out.println("A soma � " + soma);
        }else if(operacao == 2){
            subtracao = n1 - n2;
            System.out.println("A subtracao � " + subtracao);
        }else if(operacao == 3){
            multiplicacao = n1 * n2;
            System.out.println("A multiplicacao � " + multiplicacao);
        }else if(operacao == 4){
            divisao = n1 / n2;
            System.out.println("A divis�o � " + divisao);
        }else{
            System.out.println("Opera��o inv�lida!");
        }
    }
}
