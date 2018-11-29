package trabalhoOrdenacao;

import java.util.Scanner;

public class Vetor2 {
	public static void main(String[] args) {
        String [] nomes = new String[5];
        double [] notas = new double[5];
        //Criando uma instância para entrada de dados
        Scanner teclado = new Scanner(System.in); 
        for(int count = 0; count <= 4; count ++ ){
            System.out.println("Entre com o nome do aluno n " + (count + 1));
            nomes[count] = teclado.nextLine();
            System.out.println("Entre com a nota do aluno n" + (count + 1));
        }
        //Aqui há uma criação de fors para verificar se o aluno foi aprovado
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        double media = (soma/5);
        System.out.println("Média: " + media);
        for(int i =0; i < 5; i++){
            if(notas[i] >= media){
                System.out.println("Aluno aprovado!");
            }
        }
    }
}
