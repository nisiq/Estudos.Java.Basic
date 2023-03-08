import java.util.Scanner;
public class D01 {
    //Conversão de Fahrenheit para Celsius
    //°C = (°F − 32) ÷ 1, 8
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Digite a temperatura em Fahrenheit: ");
        Scanner entrada = new Scanner(System.in);
        double t1;
        t1=entrada.nextFloat();

        double conv = ((t1-32)/1.8);

        System.out.println("=======CONVERTENDO FAHRENHEIT PARA CELSIUS=======");
            Thread.sleep(2000);

        System.out.printf("A temperatura em Celsius é: %2fºC", conv);
    }
}
