package com.example.mobiluygulamalardersornekleri.unite5.uyg13;

import java.util.Random;

public class Asker {
    private Integer atesGucu;
    private Integer sans;

    public Asker(Integer atesGucu, Integer sans) {
        this.atesGucu = atesGucu;
        this.sans = sans;
    }

    public Integer getAtesGucu() {
        return atesGucu;
    }

    public void setAtesGucu(Integer atesGucu) {
        this.atesGucu = atesGucu;
    }

    public Integer getSans() {
        return sans;
    }

    public void setSans(Integer sans) {
        this.sans = sans;
    }

    public Integer atesEt(Oyuncu dusman) {
        Random random = new Random();
        int isabet = random.nextInt(sans) * atesGucu;
        dusman.setCan(dusman.getCan() - isabet);
        return isabet;
    }
}
