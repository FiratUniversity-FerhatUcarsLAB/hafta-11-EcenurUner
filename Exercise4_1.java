/**
* Ad Soyad:Ecenur Üner
* Numara:250541078
* Tarih:28.11.2025
    */


import java.util.Scanner;
public class Exercise4_1 {

    private static String getMonthName(int month){
        return switch (month) {
            case 1 -> "Ocak";
            case 2 -> "Şubat";
            case 3 -> "Mart";
            case 4 -> "Nisan";
            case 5 -> "Mayıs";
            case 6 -> "Haziran";
            case 7 -> "Temmuz";
            case 8 -> "Ağustos";
            case 9 -> "Eylül";
            case 10 -> "Ekim";
            case 11 -> "Kasım ";
            case 12 -> "Aralık";
            default -> "HATA_AY";
        };
    }
    
    public static void printAmerican(int day, int month, int year, String haftaninGunu) {
        // TODO
         if((day > 0 && month >0 && year > 0) && (day < 31 && month < 12 && year < 2025)){
           String ayAdi = getMonthName(month);

            System.out.printf("%s, %d %d, %d\n",haftaninGunu, month, day, year);
        }else{
            System.out.println("Lütfen geçerli bir tarih giriniz!");
        }
    }
    

    public static void printEuropean(int d, int m, int y, String day_name) {
        // TODO
        if((d > 0 && m > 0 && y > 0) && (d < 31 && m < 12 && y < 2025)){
           String ayAdi = getMonthName(m);

            System.out.printf("%d%d%d %s\n", d, m, y, day_name);
        }else{
            System.out.println("Lütfen geçerli bir tarih giriniz!");
        }
}
    

    public static void main(String[] args) {
        // TODO: test methods
        canner keyboard = new Scanner(System.in);
    int gun, ay, yil;
    String gunAdi;

    System.out.println("Gün: ");
    gun =  keyboard.nextInt();
    System.out.println("Ay: ");
    ay =  keyboard.nextInt();
    System.out.println("Yil: ");
    yil =  keyboard.nextInt();
    System.out.println("Günün Adı (Örn. Salı, Cuma vb.): ");
    gunAdi = keyboard.next();

    printEuropean(gun, ay, yil, gunAdi);
    printAmerican(gun, ay, yil, gunAdi);

    keyboard.close();
    }
}
