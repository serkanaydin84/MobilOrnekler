package com.example.mobiluygulamalardersornekleri;

public class U5_Uyg5_ElektrikliCihaz {
    public String cihazAdi;
    public int cihazKW;
    public int gunlukSaatKullanim;
    public int aylikTuketim() {
        int aylikKullanim = cihazKW * gunlukSaatKullanim * 30;
        return aylikKullanim;
    }
}
