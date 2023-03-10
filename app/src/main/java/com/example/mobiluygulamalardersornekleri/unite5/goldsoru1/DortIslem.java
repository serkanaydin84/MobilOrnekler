package com.example.mobiluygulamalardersornekleri.unite5.goldsoru1;

public class DortIslem {

    public Integer sayi1;
    public Integer sayi2;
    public Integer sonuc;

    public Integer getSonuc() {
        return sonuc;
    }

    public void setSayi1(Integer sayi1) {
        this.sayi1 = sayi1;
    }

    public void setSayi2(Integer sayi2) {
        this.sayi2 = sayi2;
    }

    public void toplama() {
        sonuc = sayi1 + sayi2;
    }

    public void cikarma() {
        sonuc = sayi1 - sayi2;
    }

    public void carpma() {
        sonuc = sayi1 * sayi2;
    }

    public void bolme() {
        sonuc = sayi1 / sayi2;
    }
}
