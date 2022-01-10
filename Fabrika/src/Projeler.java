import java.util.ArrayList;

public class Projeler
{
    private String projeismi;
    private String tarih;
    private String tasarimofisi;
    private String modelismi;
    private String modelturu;
    private String calisansayisi;

    public static ArrayList<Projeler> projeList = new ArrayList<Projeler>();


    public Projeler (String projeismi,String tarih, String tasarimofisi, String modelismi,String modelturu,String calisansayisi)
    {
        this.projeismi=projeismi;
        this.tarih = tarih;
        this.tasarimofisi=tasarimofisi;
        this.modelismi=modelismi;
        this.modelturu=modelturu;
        this.calisansayisi=calisansayisi;
    }



    public String getProjeismi() {
        return projeismi;
    }

    public void setProjeismi(String projeismi) {
        this.projeismi = projeismi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTasarimofisi() {
        return tasarimofisi;
    }

    public void setTasarimofisi(String tasarimofisi) {
        this.tasarimofisi = tasarimofisi;
    }

    public String getModelismi() {
        return modelismi;
    }

    public void setModelismi(String modelismi) {
        this.modelismi = modelismi;
    }

    public String getModelturu() {
        return modelturu;
    }

    public void setModelturu(String modelturu) {
        this.modelturu = modelturu;
    }

    public String getCalisansayisi() {
        return calisansayisi;
    }

    public void setCalisansayisi(String calisansayisi) {
        this.calisansayisi = calisansayisi;
    }


}