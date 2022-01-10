import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Fabrika
{

    //3 ile başlayan kullanıcı admin, 2 ile başlayan kullanıcılar Baş Mühendis, 1 ile başlayan kullanıcılar Kıdemli Mühendis
    //0 ile başlayan kullanıcılar Mühendis
    static ArrayList<String> idList = new ArrayList<String>(Arrays.asList("0","1","2","3","0adm234","008uy79","1ylfha","2aoıe23","22234","144897"));

    static ArrayList<String> sifreList  = new ArrayList<String>(Arrays.asList("0","1","2","3","619849","0591879","0062148","50497","069841","059156"));

    static Scanner input = new Scanner(System.in);

    public static void main(String[] Args)
    {
        Projeler.projeList.add(new Projeler("abc", "1999-2000", "paris", "fiesta", "spor", "400"));
        Projeler.projeList.add(new Projeler("bcd", "1988-2005", "fransa", "hilux", "arazi", "9000"));
        Projeler.projeList.add(new Projeler("dba","2004-2008", "Palermo", "HyperSport", "a", "12"));


        System.out.println("Merhaba");
        System.out.println("Giriş yapmak için lütfen kullanıcı adı ve şifre giriniz ");


        // Kullanıcı tespit komutları
        String mevki="Admin";

        {

            System.out.println("Kullanıcı adı ?");
            String id = input.nextLine();

            int i = 0;

            while (i < idList.size())
            {
                if (id.equals(idList.get(i)))
                    break;
                i++;
            }

            if (i >= idList.size())
            {
                System.out.println("Kullanıcı bulunamadı");
                return;
            }


            System.out.println("Şifreyi giriniz 3 hakkınız var");
            String sifre = input.nextLine();

            int sifresayacı = 3;

            while (!sifre.equals(sifreList.get(i)))
            {
                if (sifresayacı == 1)
                {
                    System.out.println("Tüm şifre giriş haklarınızı doldurdunuz");
                    return;
                }

                sifresayacı--;
                System.out.println("Şifre yanlış tekrar giriniz");
                System.out.printf("%d Hakkınız kaldı \n", sifresayacı);

                sifre = input.nextLine();
            }




            {
                if (idList.get(i).charAt(0)== '0')
                    mevki = "Mühendis";
                if (idList.get(i).charAt(0) == '1')
                    mevki = "Kidemli Mühendis";
                if (idList.get(i).charAt(0) == '2')
                    mevki = "Baş Mühendis";
            }

            if (sifre.equals(sifreList.get(i)) )
                System.out.printf("Sisteme hosgeldiniz \nMevkiniz  %s ", mevki);

        }




        //Adminin komut satırları
        if(mevki.equals("Admin"))
        {
            System.out.println("komutlar ; \n'kullanici ekle' : kullanici eklemek için \n'kullanici silme' : kullanici silme için.");

            while (true)
            {
                System.out.println("Ne işlemi yapmak istersiniz ?");
                String islem = input.nextLine();

                switch (islem.toLowerCase(Locale.ROOT))
                {
                    case "kullanici ekle":
                        boolean kullaniciekleme = kullaniciEkle();
                        if (kullaniciekleme)
                            System.out.println("basarıyla eklendi ");
                        break;
                    case  "kullanici silme"  :
                        boolean kullanicisilme = kullaniciSil();
                        if (kullanicisilme)
                            break;
                    default:
                        System.out.println("Bilinmeyen komut");
                }
                System.out.println("yeniden islem yapmak ister misin ?");
                String kontrol = input.nextLine();

                if(kontrol.equals("hayır"))
                    return;

            }

        }

        //Mühendisin komut satırları
        if (mevki.equals("Mühendis"))
        {
            Muhendis muhendis = new Muhendis();
            System.out.println("Görüntülemek istediğiniz proje detayları");
            String projeismi= input.nextLine();
            muhendis.projegoruntule(projeismi);
        }

        //Kıdemli Mühendisin komut satırları
        if(mevki.equals("Kidemli Mühendis")) {
            KidemliMuhendis kidemlimuhendis = new KidemliMuhendis();
            while (true)
            {
                System.out.println("Ne işlemi yapmak istersiniz ?");
                System.out.println("Komutlar \n Proje görüntülemek için :'proje görüntüle' \n Proje düzenlemek için:'proje düzenle'");
                String islem = input.nextLine();

                switch (islem.toLowerCase(Locale.ROOT)) {
                    case "proje görüntüle" -> {
                        System.out.println("proje ismi?");
                        String projeismi = input.nextLine();
                        kidemlimuhendis.projegoruntule(projeismi);
                    }
                    case "proje düzenle" -> kidemlimuhendis.projeduzenle();
                    default -> System.out.println("Bilinmeyen komut");
                }

                System.out.println("Başka islem yapmak ister misiniz ? \n İstemiyor iseniz hayır yazınız.");
                String kontrol = input.nextLine();

                if(kontrol.equals("hayır"))
                    return;
            }
        }

        //Baş Mühendisin komut satırları
        if (mevki.equals("Baş Mühendis"))
        {
            BasMuhendis basMuhendis = new BasMuhendis();

            while (true)
            {
                System.out.println("Ne işlemi yapmak istersiniz ?");
                System.out.println("Komutlar \n Proje görüntülemek için :'proje görüntüle' \n Proje düzenlemek için:'proje düzenle'\n Proje eklemek için:'proje ekle'");
                String islem = input.nextLine();

                switch (islem.toLowerCase(Locale.ROOT)) {
                    case "proje görüntüle":
                        System.out.println("proje ismi?");
                        String projeismi = input.nextLine();
                        basMuhendis.projegoruntule(projeismi);
                        break;
                    case "proje düzenle":
                        basMuhendis.projeduzenle();
                        break;
                    case "proje ekle":
                        basMuhendis.projeekle();
                        break;
                    default:
                        System.out.println("Bilinmeyen komut");
                }

                System.out.println("Yeniden islem yapmak ister misiniz ?");
                String check = input.nextLine();


                if(check.equals("hayır"))
                    return;
            }
        }
    }





    public static boolean kullaniciEkle()
    {
        System.out.println("Kullanıcı adı giriniz, yeni oluşturulacak kullanıcının mevkisine göre kullanıcı adının ilk hanesini düzenleyiniz \n Baş Mühendis için : 2 , Kıdemli Mühendis için :1 , Mühendis için : 0");
        String kullaniciadi = input.nextLine();
        idList.add(kullaniciadi);
        System.out.println("Bu kullanıcının şifresini giriniz");
        String sifre = input.nextLine();
        sifreList.add(sifre);
        System.out.println("Kullanıcı başarı ile eklendi \nKullanıcı adı ve şifre :");
        System.out.println(idList.get(idList.size()-1));
        System.out.println(sifreList.get(sifreList.size()-1));
        return true;

    }
    public static boolean kullaniciSil()
    {
        System.out.println("Silinecek kullanıcının kullanıcı adı ?");
        String kullaniciadi = input.nextLine();
        idList.indexOf(kullaniciadi);
        int index=idList.indexOf(kullaniciadi);
        if (index==-1)
        {
            System.out.println("kullanıcı bulunamadı");
            return false;
        }
        idList.remove(kullaniciadi);
        sifreList.remove(index);
        System.out.println("Kullanıcı başarı ile silindi");
        return true;
    }



}
