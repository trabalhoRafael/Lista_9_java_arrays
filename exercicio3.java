package Lista_Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;
public class exercicio3 {
    public static void main(String[] args) {
        /*Maior
e menor número: Preencha um vetor com 5 números e exiba o maior e o
menor número armazenado.*/
        Scanner ler = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int[] vecna = new int[5];
        for (int i=0;i<5;i++){
            System.out.println("digite um valor?");
            vecna[i]= ler.nextInt();
            if(vecna[i] < menor) menor =vecna[i];
            if (vecna[i]> maior) maior =vecna[i];


        }
        System.out.println("o maior è:" + maior);
        System.out.println("o menor é:"+ menor);
        System.out.println(Arrays.toString(vecna));


    }

}
