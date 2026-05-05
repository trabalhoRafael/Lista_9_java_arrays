package Lista_Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {

        /*
        e exibição: Declare um vetor de cinco
        números inteiros e exiba seus valores
        */
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double[] vect=new double[5];
        for (int i=0;i<5;i++){
            System.out.println("digite um valor : ");
            vect[i]= sc.nextDouble();
        }
        System.out.println("total de valores:");
        System.out.println(Arrays.toString(vect));

        /*metodo de loop
        for (int i=0; i<5; i++) {
            System.out.println(Arrays.toString(vect));
        }*/




    }
}
