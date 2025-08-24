import java.util.Scanner;

public class donguler {

    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = inp.nextInt();

        int sum = 0, count = 0;


        for (int i = 0; i <= number; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                System.out.print(i + ", ");
                sum += i;
                count++;
            }
        }
        int avarage = sum / count;

        System.out.println("\nÜçe ve dörde tam bölünen sayıların ortalaması : " + avarage);
    }
}
