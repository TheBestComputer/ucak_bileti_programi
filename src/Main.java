
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double biletFiyati;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Mesafe (KM) giriniz : ");
        km = scanner.nextInt();
        
        System.out.print("Yasinizi giriniz : ");
        yas = scanner.nextInt();
        
        System.out.println("********************");
        System.out.println("Tek yon icin : 1\nGidis donus icin : 2");
        System.out.println("********************");
        System.out.print("Yolculuk tipini seciniz : ");
        yolculukTipi = scanner.nextInt();
        
        biletFiyati = km * 0.10;
        
        if(km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)){
            if(yas < 12){
                biletFiyati -= (biletFiyati * 0.5);
            }
            else if(yas >= 12 && yas <= 24){
                biletFiyati -= (biletFiyati * 0.1);
            }
            else if(yas > 65){
                biletFiyati -= (biletFiyati * 0.3);
            }
            if(yolculukTipi == 2){
                biletFiyati -= (biletFiyati * 0.2);
                System.out.println("Toplam Tutar : " + biletFiyati*2);
            }
            else{
                System.out.println("Toplam Tutar : " + biletFiyati);
            }
        }
        else{
            System.out.println("Hatali Veri Girdiniz !");
        }
    }
}
