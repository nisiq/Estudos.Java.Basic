import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a table number: ");
        int number = sc.nextInt();

        //declara o vetor: tipo/nome = cria e quantidade
        int[] table = new int[11];

        for(int i=0;i<=table.length-1;i++){
            table[i] = number*i;
            System.out.println(number+" x "+i+" = "+table[i]);
        }
    }
}
