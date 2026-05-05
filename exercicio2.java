package Lista_Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
                /*Soma dos elementos: Crie um vetor de inteiros
                e exiba a soma de seus elementos
                */
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int n,resultado=0;
        System.out.println("digite quantos valores deseja somar: " );
        n = sc.nextInt();
        int[] vect=new int[n];


        for (int i=0;i<n;i++) {
            System.out.println("digite um valor:");
            vect[i]= sc.nextInt();
            resultado=resultado+vect[i];


        }


        System.out.println(Arrays.toString(vect));
        System.out.println("resultado dos valores somados : "+resultado);
        sc.close();



    }
}
