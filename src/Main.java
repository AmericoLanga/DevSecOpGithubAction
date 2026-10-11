import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        ServerSocket servidor = new ServerSocket(8082);
        System.out.println("Servidor DevSecOps ativo na porta 8082...");

        while (true) {
            Socket cliente = servidor.accept();
            OutputStream saida = cliente.getOutputStream();

            int velocidadeA = 15;
            int velocidadeB = 10;
            int posicaoA = 0;
            int posicaoB = 100;

            int tAlcance = (posicaoB - posicaoA) / (velocidadeA - velocidadeB);
            int encontro = velocidadeA * tAlcance;

            String cabecalho = "HTTP/1.1 200 OK\r\n" +
                               "Content-Type: text/html; charset=UTF-8\r\n" +
                               "Connection: close\r\n\r\n";

            String html = "<!DOCTYPE html>" +
                          "<html>" +
                          "<head>" +
                          "  <title>Resultado DevSecOps</title>" +
                          "  <style>body{font-family:Arial; text-align:center; margin-top:50px; background:#f4f6f9; color:#333;}</style>" +
                          "</head>" +
                          "<body>" +
                          "  <h1 style='color: #2c3e50;'>🚀 Pipeline DevSecOps: Sucesso!</h1>" +
                          "  <div style='background:white; padding:20px; display:inline-block; border-radius:8px; box-shadow: 0 4px 6px rgba(0,0,0,0.1);'>" +
                          "    <p><b>Tempo de Alcance de A a B:</b> " + tAlcance + " Segundos</p>" +
                          "    <p><b>Distância de Encontro E:</b> " + encontro + " Metros</p>" +
                          "  </div>" +
                          "</body>" +
                          "</html>";

            String respostaFinal = cabecalho + html;
            saida.write(respostaFinal.getBytes("UTF-8"));
            saida.flush();
            cliente.close();
        }
    }
}
