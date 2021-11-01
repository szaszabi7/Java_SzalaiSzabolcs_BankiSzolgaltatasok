package hu.petrik.bankiszolgaltatasok;

public class Main {

    public static void main(String[] args) {
        Bank b1 = new Bank(100);

	    Tulajdonos t1 = new Tulajdonos("Józsi");
	    Tulajdonos t2 = new Tulajdonos("Feri");
	    Tulajdonos t3 = new Tulajdonos("Béla");

        HitelSzamla h1 = new HitelSzamla(t1,100000);
        HitelSzamla h2 = new HitelSzamla(t2,500000);
        HitelSzamla h3 = new HitelSzamla(t3,10000000);

        MegtakaritasiSzamla m1 = new MegtakaritasiSzamla(t1);
        MegtakaritasiSzamla m2 = new MegtakaritasiSzamla(t1);
        MegtakaritasiSzamla m3 = new MegtakaritasiSzamla(t2);

        System.out.println(m1.getAktualisEgyenleg());
        System.out.println(m2.getAktualisEgyenleg());
        System.out.println(h1.getAktualisEgyenleg());

        m1.befizet(10000);
        m2.befizet(30000);
        h1.befizet(100000);

        System.out.println(m1.getAktualisEgyenleg());
        System.out.println(m2.getAktualisEgyenleg());
        System.out.println(h1.getAktualisEgyenleg());

        m1.kamatJovairas();
        m2.kamatJovairas();

        System.out.println(m1.getAktualisEgyenleg());
        System.out.println(m2.getAktualisEgyenleg());

        b1.szamlanyitas(t1, 0).befizet(100000);
        b1.szamlanyitas(t2, 0).befizet(10000);
        b1.szamlanyitas(t3, 0).befizet(400000);
        b1.szamlanyitas(t1, 10000).befizet(1000000);
        b1.szamlanyitas(t2, 20000).befizet(300000);
        b1.szamlanyitas(t3, 4000000).befizet(400000000);

        System.out.println(t1.getNev() +  " számláinak összege: " + b1.getOsszegyenleg(t1));
        System.out.println(t2.getNev() +  " számláinak összege: " + b1.getOsszegyenleg(t2));
        System.out.println(t3.getNev() +  " számláinak összege: " + b1.getOsszegyenleg(t3));

        System.out.println(t1.getNev() +  " legnagyobb számlájának összege: "
                + b1.getLegnygyobbEgyenleguSzamla(t1).getAktualisEgyenleg());
        System.out.println(t2.getNev() +  " legnagyobb számlájának összege: "
                + b1.getLegnygyobbEgyenleguSzamla(t2).getAktualisEgyenleg());
        System.out.println(t3.getNev() +  " legnagyobb számlájának összege: "
                + b1.getLegnygyobbEgyenleguSzamla(t3).getAktualisEgyenleg());

        //System.out.println(b1.getOsszHitelKeret());
    }
}
