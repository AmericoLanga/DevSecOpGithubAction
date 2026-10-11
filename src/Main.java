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

// 1. Primeiro, envie os cabeçalhos HTTP obrigatórios (O navegador exige isso!)
String cabecalho = "HTTP/1.1 200 OK\r\n" +
                   "Content-Type: text/html; charset=UTF-8\r\n" +
                   "Connection: close\r\n\r\n";

// 2. Depois, envie o HTML simples que você quer mostrar na tela
String html = "<!DOCTYPE html>" +
              "<html>" +
              "<head><title>Meu App DevSecOps</title></head>" +
              "<body style='font-family: Arial; text-align: center; margin-top: 50px;'>" +
              "  <h1 style='color: #2c3e50;'>🚀 Sucesso Total!</h1>" +
              "  <p style='color: #7f8c8d; font-size: 18px;'>Meu programa Java foi testado pelo Trivy e publicado automaticamente no Ubuntu!</p>" +
              "</body>" +
              "</html>";

// 3. Junte tudo e envie para a rede (use o método de escrita do seu código)
String respostaFinal = cabecalho + html;
saida.write(respostaFinal.getBytes("UTF-8"));
out.flush();



	}

}
