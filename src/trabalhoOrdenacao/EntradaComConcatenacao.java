package trabalhoOrdenacao;

import java.util.Scanner;

public class EntradaComConcatenacao {
	   public static void main(String[] args) {
	        //Declara��o de uma classe tipo Scanner para captar entradas de dados
	        Scanner entrada = new Scanner(System.in);
	        float valor = 0;//Criando uma vari�vel do tipo float
	        System.out.println("Quanto custa algo em uma loja de R$ 1,99 ?");
	        valor = entrada.nextFloat();//Recebendo o valor 
	        System.out.println("Este � o valor nesta loja " + valor );
	    }
}
