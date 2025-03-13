import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cenaBazowa = 40.0;
        double znizka = 0.0;

        System.out.println("Podaj miasto:");
        String miasto = sc.nextLine();

        System.out.println("Podaj wiek:");
        String wiek = sc.nextLine();
        sc.nextLine();

        String[] dniTygodnia = {"Poniedzialek","Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela"};

        while(true) {
            System.out.println("Podaj dzien tygodnia:");
            String dzien = sc.nextLine();
            dzien = dzien.substring(0,1).toUpperCase() + dzien.substring(1).toLowerCase();
            if(Arrays.asList(dniTygodnia).contains(dzien)) {
                break; //jesli dzien jest poprawny , wychodzimy w petli
            } else {
                System.out.println("Bledny dzien tygodnia! Sprobuj ponownie.!:");
            }
        }
        //Obliczanie znizki
        if (wiek < 10) {
            znizka = 100.0;
        } else if (wiek >= 10 && wiek < 18) {
            znizka += 50.0;
        }
        if (miasto.equalsIgnoreCase("Warszawa")) {
            znizka +=10.0;
        }
        if (dzien.equals("Czwartek")) {
            znizka = 100.0;

        }
        if (znizka >100.0) {
            znizka = 100.0;
        }
        double cenaKoncowa = cenaBazowa - (cenaBazowa *(znizka/100.0));

        System.out.println("Dane:" + miasto +", " + wiek + "lat," + dzien);
        System.out.println("Cena biletu: " + String.format("%.2f", cenaKoncowa)+ "PLN");
        System.out.println("Znizka: " + (int)znizka+ "%");
        sc.close();
    }
}