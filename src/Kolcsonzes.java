public class Kolcsonzes {
    private String nev;
    private char jarmu;
    private int elvitelOra;
    private int elvitelPerc;
    private int visszaOra;
    private int visszaPerc;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public char getJarmu() {
        return jarmu;
    }

    public void setJarmu(char jarmu) {
        this.jarmu = jarmu;
    }

    public int getElvitelOra() {
        return elvitelOra;
    }

    public void setElvitelOra(int elvitelOra) {
        this.elvitelOra = elvitelOra;
    }

    public int getElvitelPerc() {
        return elvitelPerc;
    }

    public void setElvitelPerc(int elvitelPerc) {
        this.elvitelPerc = elvitelPerc;
    }

    public int getVisszaOra() {
        return visszaOra;
    }

    public void setVisszaOra(int visszaOra) {
        this.visszaOra = visszaOra;
    }

    public int getVisszaPerc() {
        return visszaPerc;
    }

    public void setVisszaPerc(int visszaPerc) {
        this.visszaPerc = visszaPerc;
    }

    public Kolcsonzes() {
        // TODO - test field usage
    }

    public Kolcsonzes(String nev, char jarmu, int elvitelOra, int elvitelPerc, int visszaOra, int visszaPerc){
        setNev(nev);
        setJarmu(jarmu);
        setElvitelOra(elvitelOra);
        setElvitelPerc(elvitelPerc);
        setVisszaOra(visszaOra);
        setVisszaPerc(visszaPerc);
    }

    public Kolcsonzes(String fileLine) {
        // TODO - parse read line
    }
}