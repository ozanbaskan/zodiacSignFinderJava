import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int month, day;
        int error = 0;
        String astro_sign = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz(1-12): ");
        month = s.nextInt();

        System.out.print("Doğduğunuz günü giriniz(1-31): ");
        day = s.nextInt();

        if (month == 1){

            if (day < 22 && day > 0)
                astro_sign = "Oğlak";
            else if (day < 32 && day > 0)
                astro_sign ="Kova";
            else
                error = 1;
        }

        else if (month == 2){
            if (day < 20 && day > 0)
                astro_sign = "Kova";
            else if (day < 29 && day > 0)
                astro_sign = "Balık";
            else
                error = 1;
        }

        else if (month == 3){
            if (day < 21 && day > 0)
                astro_sign = "Balık";
            else if (day < 32 && day > 0)
                astro_sign = "Koç";
            else
                error = 1;

        }

        else if(month == 4){
            if (day < 22 && day > 0)
                astro_sign = "Koç";
            else if (day < 31 && day > 0)
                astro_sign = "Boğa";
            else
                error = 1;
        }
        else if (month == 5){
            if (day < 22 && day > 0)
                astro_sign = "Boğa";
            else if (day < 32 && day > 0)
                astro_sign = "İkizler";
            else
                error = 1;
        }

        else if (month == 6){
            if (day < 23 && day > 0)
                astro_sign = "İkizler";
            else if (day < 31 && day > 0)
                astro_sign = "Yengeç";
            else
                error = 1;
        }

        else if( month == 7){
            if (day < 23 && day > 0)
                astro_sign = "Yengeç";
            else if (day < 32 && day > 0)
                astro_sign = "Aslan";
            else
                error = 1;
        }

        else if (month == 8){
            if (day < 23 && day > 0)
                astro_sign = "Aslan";
            else if (day < 32 && day > 0)
                astro_sign = "Başak";
            else
                error = 1;
        }

        else if( month == 9){
            if (day < 23 && day > 0)
                astro_sign = "Başak";
            else if (day < 31 && day > 0)
                astro_sign = "Terazi";
            else
                error = 1;
        }

        else if (month == 10){
            if (day < 23 && day > 0)
                astro_sign = "Terazi";
            else if (day < 32 && day > 0)
                astro_sign = "Akrep";
            else
                error = 1;
        }

        else if (month == 11){
            if (day < 23 && day > 0)
                astro_sign = "Akrep";
            else if (day < 31 && day > 0)
                astro_sign = "Yay";
            else
                error = 1;
        }

        else if (month == 12){
            if (day < 22 && day > 0)
                astro_sign = "Yay";
            else if (day < 32 && day > 0)
                astro_sign = "Oğlak";
            else
                error = 1;
        }
        else
        {
            error = 1;
        }

        if (error == 1)
            System.out.print("Hatalı giriş!");
        else
            System.out.print("Burcunuz: " + astro_sign);


    }
}
