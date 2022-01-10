import java.util.ArrayList;

public class Muhendis
{

    public void projegoruntule (String projeismi)
    {
        int j=0;
        while(j<Projeler.projeList.size())
        {
            if(projeismi.equals(Projeler.projeList.get(j).getProjeismi()))
            {
                Projeler a=Projeler.projeList.get(j);
                System.out.println(a.getProjeismi());
                System.out.println(a.getTarih());
                System.out.println(a.getTasarimofisi());
                System.out.println(a.getModelismi());
                System.out.println(a.getModelturu());
                System.out.println(a.getCalisansayisi());
                return;
            }

            j++;
        }
        System.out.println("proje bulunamadı");
    }

}