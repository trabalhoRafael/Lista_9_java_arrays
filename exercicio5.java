package Lista_Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class exercicio5 {
    public static void main(String[] args) {
        /*Inversão do vetor: Crie um vetor de cinco números e exiba-os na ordem inversa.*/
        Random random = new Random();
        int[] vetor =new int[5];
        for (int i=0;i< vetor.length;i++){
            vetor[i] = random.nextInt(100);
        }
        System.out.println("Ordem original: " + Arrays.toString(vetor));
        System.out.print("Ordem inversa: ");
        for (int i= vetor.length-1;i>=0;i--){

            System.out.print(vetor[i]+" ");

        }



    }
}
