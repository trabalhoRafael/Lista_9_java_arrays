package Lista_Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class exercicio4 {
    public static void main(String[] args) {
        /*Buscar o vetor: Pergunte ao usuário um número e verifique se ele está
        presente no vetor.*/
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int num,cont;
        cont=0;

        int []vetor=new int[10];
        for (int i=0;i< vetor.length;i++){
            vetor[i] = random.nextInt(100);

        }
        System.out.println("digite um valor: ");
        num=sc.nextInt();

        boolean valor=false;
        for (int i=0;i<vetor.length;i++){
            if (vetor[i] == num) {
                valor = true;
                System.out.println("Valor " + num + " encontrado na posição " + i);
                break;
            }
        if (!valor) {
                System.out.println("O valor " + num + " não está no vetor.");
                break;
            }

            sc.close();
        }






        System.out.println(Arrays.toString(vetor));

    }
}
