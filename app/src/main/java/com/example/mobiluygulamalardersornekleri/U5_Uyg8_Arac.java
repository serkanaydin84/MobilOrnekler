package com.example.mobiluygulamalardersornekleri;

public class U5_Uyg8_Arac {

    private Integer kapiSayisi;
    private Integer maksimumHiz;


    public Integer getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(Integer kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public Integer getMaksimumHiz() {
        return maksimumHiz;
    }

    public void setMaksimumHiz(Integer maksimumHiz) {
        this.maksimumHiz = maksimumHiz;
    }

    public String kapiSayisiniGoster() {
        return "Aracın kapı sayısı " + this.kapiSayisi.toString();
    }

    public String maksimumHizGoster() {
        return "Aracın maksimum hızı " + this.maksimumHiz.toString();
    }

    public String calistir() {
        return "Araç çalışıyor";
    }
}
