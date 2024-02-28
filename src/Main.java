import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcı veri girişi
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int n = inp.nextInt();

        int[] arr = {15,12,788,1,-1,-778,2,0}; //
        Arrays.sort(arr); // Diziyi sıralıyoruz

        int i = 0;
        int small = 0;
        int large = 0;

        // Verilen sayıdan küçük en büyük sayıyı buluyoruz
        while (i < arr.length && arr[i] < n) {
            small = arr[i];
            i++;
        }
        // Verilen sayıdan büyük en küçük sayıyı buluyoruz
        if (i < arr.length) {
            large = arr[i];
        } else {
            // Dizi tarandıktan sonra hala büyük bir sayı bulunmadıysa, dizinin en büyük elemanını alıyoruz
            large = arr[arr.length - 1];
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + small);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + large);
    }
}
