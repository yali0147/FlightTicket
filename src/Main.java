import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Flight Ticket Program ");

        Scanner imp = new Scanner(System.in);

        double mesafe, seyehatTipi, age ,toplamTutar, tutar;
        double yasIndirimi,yasIndirimOrani=0,seyehatTipiIndirimOrani=0,indirimTutari;
        boolean isError = false;
        System.out.print("Uçuş mesafesini giriniz : ");
        mesafe = imp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = imp.nextInt();
        System.out.print("Seyehat türünüzü giriniz (Tek yön-> 1 Gidiş-Dönüş-> 2) :");
        seyehatTipi= imp.nextInt();

        if ((seyehatTipi ==1) || (seyehatTipi ==2)&&(age>0)&&(mesafe>0)) {
            if (seyehatTipi == 1) {
                seyehatTipiIndirimOrani=0;
            } else {
                seyehatTipiIndirimOrani = 0.20;
            }
            if (age <= 12) {
                yasIndirimOrani = 0.50;
            } else if ((age <= 24)) {
                yasIndirimOrani = 0.10;
            } else if ((age < 65)) {
                yasIndirimOrani = 0;
            } else {
                yasIndirimOrani = 0.30;
            }
        } else {
            isError = true ;
        }
        if (seyehatTipi==1){
           tutar=mesafe*0.10;
        } else {
            tutar=2*mesafe*0.10;
        }
        yasIndirimi=(tutar*yasIndirimOrani);
        indirimTutari=(yasIndirimi+((tutar-yasIndirimi)*seyehatTipiIndirimOrani));
        toplamTutar=(tutar-indirimTutari);

        if (isError) {
            System.out.print("Hatalı bir işlem girdiniz.Bilgilerinizi kontrol ediniz. ");
        }else {
            System.out.println("Tutar : " + tutar);
            System.out.println("İndirim tutarı : " + indirimTutari);
            System.out.println("Toplam tutar : " + toplamTutar);
        }
    }
}
