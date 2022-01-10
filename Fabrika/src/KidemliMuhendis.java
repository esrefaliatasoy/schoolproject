public class KidemliMuhendis extends Muhendis
{

    public void projeduzenle()
    {
        Projeler proje=null;
        System.out.println("hangi projenin özelliğini değiştirmek istersiniz");
        String projeismi = Fabrika.input.nextLine();

        int j=0;


        while(j<Projeler.projeList.size())
        {
            if(projeismi.equals(Projeler.projeList.get(j).getProjeismi()))
            {
                proje=Projeler.projeList.get(j);
                break;
            }
            j++;
        }

        System.out.println("projenin hangi özelliğini değiştirmek istersiniz");
        String ozellik= Fabrika.input.nextLine();
        switch (ozellik)
        {
            case "projeismi":
                System.out.println("Yeni proje ismi giriniz");
                String yeniprojeismi= Fabrika.input.nextLine();
                proje.setProjeismi(yeniprojeismi);
                break;
            case "tarih":
                System.out.println("yeni tarih giriniz");
                String yenitarih=Fabrika.input.nextLine();
                proje.setTarih(yenitarih);
                break;
            case "tasarimofisi":
                System.out.println("yeni tasarim ofisi ismi");
                String yeniofis=Fabrika.input.nextLine();
                proje.setTasarimofisi(yeniofis);
                break;
            case "modelismi":
                System.out.println("yeni modeli ismi");
                String yenimodelismi=Fabrika.input.nextLine();
                proje.setModelismi(yenimodelismi);
                break;
            case "modelturu":
                System.out.println("yeni model turu");
                String yenimodelturu=Fabrika.input.nextLine();
                proje.setModelturu(yenimodelturu);
                break;
            case "calisansayisi":
                System.out.println("yeni calisan sayısı");
                String yenicalisansayisi=Fabrika.input.nextLine();
                proje.setCalisansayisi(yenicalisansayisi);
                break;
        }
    }



}