package trabalhoOrdenacao;

public class Vetor1 {
	public static void main(String[] args) {
        int n [] = {9, 2000,8,1008,45,478,708};
        System.out.println("Total de casas de N � " + n.length);//length tamanho de vetor
        //For estrutura de repeti��o para qualquer tamanho
        for(int c =0; c<=n.length -1; c++){
            //Imprimi a mensagem com resultado
            System.out.println("Na posi��o " + c + "temos o valor " + n[c]);
            
        }
    }
}
