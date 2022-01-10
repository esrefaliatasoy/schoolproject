public class BasMuhendis extends KidemliMuhendis
{

    public void projeekle()
    {

        System.out.println("projenin ismi");
        String prjeismi = Fabrika.input.nextLine();
        System.out.println("tarih");
        String tarih = Fabrika.input.nextLine();
        System.out.println("tasarımofisi");
        String tsrmofisi = Fabrika.input.nextLine();
        System.out.println("modelismi");
        String modelismi = Fabrika.input.nextLine();
        System.out.println("modelturu");
        String modelturu = Fabrika.input.nextLine();
        System.out.println("calisansayısı");
        String calisansayisi = Fabrika.input.nextLine();


        Projeler proje3=new Projeler(prjeismi,tarih,tsrmofisi,modelismi,modelturu,calisansayisi);
        Projeler.projeList.add(proje3);


        System.out.println(proje3.getProjeismi());
        System.out.println(proje3.getTarih());
        System.out.println(proje3.getTasarimofisi());
        System.out.println(proje3.getModelismi());
        System.out.println(proje3.getModelturu());
        System.out.println(proje3.getCalisansayisi());


    }

}
