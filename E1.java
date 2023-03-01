public class p1 {
    public static void main(String[] args) {
        int idade = 18;
        int idade2 = 18;

        double somaidades = idade + idade2;

        System.out.printf("A soma das duas idades é "+somaidades);


    }
}
=======================================================
public class Main {
    public static void main(String[] args) {
        int raio = 5;
        final double pi = 3.141;
        double areaCirculo = pi * raio * raio;

        System.out.printf("A área do circulo é " + areaCirculo);
    }
===========SOBRE VARIAVEIS==============
import java.util.function.DoubleFunction;

public class p2 {
public class p1 {
    public static void main(String[] args) {
        int idade = 18;
        int idade2 = 18;

        double somaidades = idade + idade2;

        System.out.printf("A soma das duas idades é "+somaidades);


    }
}
=======================================================
public class Main {
    public static void main(String[] args) {
        int raio = 5;
        final double pi = 3.141;
        double areaCirculo = pi * raio * raio;

        System.out.printf("A área do circulo é " + areaCirculo);
    }
===========SOBRE VARIAVEIS==============


import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class p2 {
    public static void main(String[] args) {

        System.out.println(">>>>>>>>>>Tipos de variáveis inteiros<<<");
        byte meuByte = 127;
        System.out.printf("Tamanho do Byte: %d\n",meuByte);

        short meuShort = 32767;
        System.out.printf("Tamanho do Short: %d\n",meuShort);

        int meuInt = 2_147_483_647;
        System.out.printf("Tamanho do Int: %d\n",meuInt);

        long meuLong = 9_223_372_036_854_775_807L;
        System.out.printf("Tamanho do Long: %d\n",meuLong);
        System.out.println("                                          ");

        System.out.println(">>>>>>>>>>Tipos de dados reais<<<<<<<<<<");

        float meuFloat = 3.4e+38F;
        System.out.printf("Valor do Float: %f\n",meuFloat);

        double meuDouble = 1.7e+308;
        System.out.printf("Valor do Double: %f\n",meuDouble);

        System.out.println("                                          ");

        System.out.println(">>>>>>>>>>Tipos de variáveis caracter<<<");

        char meuChar = 'N';
        System.out.printf("Meu char: é %c\n", meuChar);

        boolean meuBoolean = true; //ou falso
        System.out.printf("Meu booleano é: %b\n",meuBoolean);

        String minhaString = "Hello World!";
        System.out.println("Minha string é: "+minhaString);

        System.out.println("                                          ");
        System.out.println("                                          ");



        String palavra;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palavra = entrada.nextLine();
        System.out.println("A palavra que você digitou foi "+palavra);
        entrada.close();

    }
}

    }
}
