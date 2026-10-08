import java.util.Scanner;


   public class Main{
    public static void main(String [] args){
	    Scanner ler = new Scanner(System.in);

    //tempo de alcanca
	    int velocidadeA = 15;
		int velocidadeB = 10;
		int posicaoA = 0;
		int posicaoB = 100;
		
	   int tAlcance = (posicaoB - posicaoA)/(velocidadeA - velocidadeB);
	   System.out.println("O temo de Alcane de veiculo A a B: " +tAlcance+ " Segundos");
	   
	   
	   //distancia de encontro
	  int dEncontro = velocidadeA * tAlcance;
	   System.out.println("A distancia de encontro E: " +dEncontro+ " Segundos");



	}

}
