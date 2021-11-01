package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    public static double alapKamat = 7;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg) {
        boolean sikeres = false;

        if (getAktualisEgyenleg() - osszeg > 0) {
            aktualisEgyenleg -= osszeg;
            sikeres = true;
        }

        return sikeres;
    }

    public void kamatJovairas() {
        aktualisEgyenleg = (int)(aktualisEgyenleg * (1 + (kamat/100)));
    }
}
