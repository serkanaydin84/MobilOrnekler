package com.example.mobiluygulamalardersornekleri.unite5.uyg13;

public class Topcu extends Asker{
    private Integer atisSayisi;
    private boolean topIsindi = false;


    public Topcu(Integer atesGucu) {
        super(atesGucu, 7);
        atisSayisi = 0;
    }

    public Integer getAtisSayisi() {
        return atisSayisi;
    }

    public void setAtisSayisi(Integer atisSayisi) {
        this.atisSayisi = atisSayisi;
    }

    public Integer atesEt(Oyuncu dusman) {
        if (topIsindi) {
            topIsindi = false;
            atisSayisi = 0;
            return 0;
        }
        atisSayisi++;

        if (atisSayisi == 3) {
            topIsindi = true;
        }

        int isabet = super.atesEt(dusman);
        return isabet;
    }
}
