package trabalhoOrdenacao;

import java.util.Scanner;

public class SwitchDiaSemana {
	public static void main(String[] args) {
        
        System.out.println("Escolha um dia da semana");
        System.out.println("------------------------");
        System.out.println("1: Domingo "
                + "2: Segunda-feira "
                + "3: Ter�a-feira "
                + "4: Quarta-feira "
                + "5: Quinta-feira "
                + "6: Sexta-feita "
                + "7: S�bado ");
        //Criando um vari�vel do tipo Scanner
        Scanner entrada = new Scanner(System.in);
           int diaSemana = entrada.nextInt();//Recebendo o valor
    //Criando um escolha caso
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Ter�a-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("S�bado");
                break;

            default:
                System.out.println("Dia inv�lido!");
        }
    }
}
