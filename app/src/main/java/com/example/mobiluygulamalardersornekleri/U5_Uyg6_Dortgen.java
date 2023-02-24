package com.example.mobiluygulamalardersornekleri;

public class U5_Uyg6_Dortgen {

    public Integer kisaKenar;
    public Integer uzunKenar;

    public Integer alaniBul(){
        Integer alan = kisaKenar * uzunKenar;
        return alan;
    }

    public U5_Uyg6_Dortgen(Integer kisaKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = kisaKenar;
    }

    public U5_Uyg6_Dortgen(Integer kisaKenar, Integer uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

}
