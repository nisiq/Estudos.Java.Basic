import java.util.Scanner;

public class operacoes {
    public static void main(String[] args)
    {

        int num1 = 9;
        int num2 = 2;

        System.out.println(num1+num2); //Adição
        System.out.println(num1-num2); //Subtração
        System.out.println(num1*num2); //Multiplicação
        System.out.println(num1/num2); //Divisão
        System.out.println(num1%num2); //Resto da divisão

        //a função foi escrita de maneira a se preparar para receber um DOUBLE, caso contrário: error
        double raiz;
        raiz = Math.sqrt(4);
        System.out.println(raiz);

        double potencia;
        potencia = Math.pow(2,3);
        System.out.println(potencia);
    }
}
=================================================
  public class it {

    public static void main(String[] args)
    {
        //como ver o tipo

        var a = 10;
        var s = ((Object)a).getClass().getSimpleName();
        System.out.printf("A variavel tem o valor %d e ela é do tipo %s.", a, s);
        //último a) = convertendo para objeto
        //getClass retorna o nome da classe
        //getSimpleName retorna o tipo

    }
}
