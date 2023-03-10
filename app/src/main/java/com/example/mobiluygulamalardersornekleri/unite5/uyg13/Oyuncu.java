package com.example.mobiluygulamalardersornekleri.unite5.uyg13;

public class Oyuncu {

    private String isim;
    private Integer can;
    private Integer topcuAG;
    private Integer tankciAG;

    public Oyuncu(String isim, Integer can) {
        this.isim = isim;
        this.can = can;
    }

    public String getIsim() {
        return isim;
}

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setTopcuAG(Integer topcuAG) {
        this.topcuAG = topcuAG;
    }

    public void setTankciAG(Integer tankciAG) {
        this.tankciAG = tankciAG;
    }

    public Integer getCan() {
        return can;
    }

    public void setCan(Integer can) {
        this.can = can;
    }

    public Asker tankci = new Tankci(tankciAG);
    public Asker topcu = new Topcu(topcuAG);
}
