import java.util.Scanner;

public class D02 {
    //Conversão de Celsius para Fahrenheit
    //°F = °C × 1, 8 + 32
    // c= celsius

    public static void main(String[] args) throws InterruptedException {
        System.out.print("Digite a temperatura em Celsius: ");
        Scanner entrada = new Scanner(System.in);
        double c;
        c=entrada.nextFloat();

        double conv = ((c*1.8+32));

        System.out.println("======= CONVERTENDO CELSIUS PARA FAHRENHEIT =======");
        Thread.sleep(2000);

        System.out.printf("A temperatura em fahrenheit é: %2fºC", conv);
    }
}
