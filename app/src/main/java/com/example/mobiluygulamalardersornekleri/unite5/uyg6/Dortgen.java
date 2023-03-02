package com.example.mobiluygulamalardersornekleri.unite5.uyg6;

public class Dortgen {

    public Integer kisaKenar;
    public Integer uzunKenar;

    public Integer alaniBul(){
        Integer alan = kisaKenar * uzunKenar;
        return alan;
    }

    public Dortgen(Integer kisaKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = kisaKenar;
    }

    public Dortgen(Integer kisaKenar, Integer uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

}
