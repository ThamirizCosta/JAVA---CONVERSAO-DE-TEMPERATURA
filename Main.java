import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public class ConversaoTemperatura {

    }
        public static void main(String[] args) {

            double c, f;

            Scanner teclado = new Scanner(System.in);
            DecimalFormat formatador = new DecimalFormat("#0.0");

            System.out.println("Conversao de Temperatura! ");
            System.out.println("Digite a temperatura em fahrenheit: ");
            f = teclado.nextDouble();
            c = (5 * (f - 32)) / 9;

            System.out.println("Temperatura em Celsius: " + formatador.format(c) + "ºC");

        }
    }