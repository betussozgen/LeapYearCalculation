//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz.
        int year;

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan yıl bilgisini girmesini istiyoruz.
        System.out.print("Enter year: ");
        year = input.nextInt();


        if(year % 4 == 0){ // 4 rakamına tam bölünebilmeli
            if(year % 100 == 0){ // 100'ün katı olan yıllardan
                if(year % 400 == 0) // sadece 400' e kalansız bölünebilmeli
                    System.out.println("" + year + " IS A LEAP YEAR");
                else
                    System.out.println("" + year + " IS NOT A LEAP YEAR");
            }
            else
                System.out.println("" + year + " IS A LEAP YEAR");
        }
        else
            System.out.println("" + year + " IS NOT A LEAP YEAR");
    }
}