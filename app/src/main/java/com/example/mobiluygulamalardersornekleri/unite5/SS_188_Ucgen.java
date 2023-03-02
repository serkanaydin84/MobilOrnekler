package com.example.mobiluygulamalardersornekleri.unite5;

public class SS_188_Ucgen {
    public Integer kenar1;
    public Integer kenar2;
    public Integer kenar3;

    public Integer cevreHesapla(){
        Integer cevre = kenar1 + kenar2 + kenar3;
        return cevre;
    }



    public SS_188_Ucgen(Integer kenar1) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar1;
        this.kenar3 = kenar1;
    }

    public SS_188_Ucgen(Integer kenar1, Integer kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar1;
        this.kenar3 = kenar2;
    }

    public SS_188_Ucgen(Integer kenar1, Integer kenar2, Integer kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }
}
