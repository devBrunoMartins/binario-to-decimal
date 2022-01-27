import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        BinToDec conv = new BinToDec();

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter monitor = new BufferedWriter(new PrintWriter(System.out));
        monitor.write("\n --- Bin2Dec Converter --- ");
        monitor.write("\n A entrada válida é um conjunto de 1s e/ou 0s. Digite qualquer outra tecla para interromper.");
        monitor.flush();
        String binario;

        while(true){
            monitor.write("\n Número binário: ");
            monitor.flush();
            binario = teclado.readLine();
            monitor.write(conv.converter(binario));
            monitor.flush();
            if(conv.getEstado().equals("erro")){
                monitor.write("Sistema encerrado!");
                monitor.flush();
                break;
            }
        }
        monitor.close();
        teclado.close();

    }
}
