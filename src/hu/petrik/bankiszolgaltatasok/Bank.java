package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamla;

    public Bank(int szamlakSzama) {
        this.szamla = new ArrayList<>(szamlakSzama);
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla sz;

        if (hitelKeret == 0) {
            sz = new MegtakaritasiSzamla(tulajdonos);
        } else {
            sz = new HitelSzamla(tulajdonos, hitelKeret);
        }

        szamla.add(sz);

        return sz;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int osszeg = 0;

        for (Szamla value : szamla) {
            if (value.getTulajdonos() == tulajdonos) {
                osszeg += value.getAktualisEgyenleg();
            }
        }

        return osszeg;
    }

    public Szamla getLegnygyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        Szamla maxSz = null;

        for (Szamla value : szamla) {
            if (value.getTulajdonos() == tulajdonos) {
                if (value.getAktualisEgyenleg() > maxSz.getAktualisEgyenleg()) {
                    maxSz = value;
                }
            }
        }

        return maxSz;
    }

    public long getOsszHitelKeret() {
        int osszeg = 0;

        /*for (int i = 0; i < szamla.size(); i++) {

        }*/

        return osszeg;
    }
}
