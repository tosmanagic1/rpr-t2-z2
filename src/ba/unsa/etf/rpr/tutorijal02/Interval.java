package ba.unsa.etf.rpr.tutorijal02;

public class Interval {

    private double pocetnaTacka, krajnjaTacka;
    private boolean pocetnaNaIntervalu, krajnjaNaIntervalu;

    public Interval (double pocetnaTacka, double krajnjaTacka, boolean pocetnaNaIntervalu, boolean krajnjaNaIntervalu) {
        if ( pocetnaTacka > krajnjaTacka) throw new IllegalArgumentException ("Pocetna tacka veca od krajnje tacke.");
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.pocetnaNaIntervalu = pocetnaNaIntervalu;
        this.krajnjaNaIntervalu = krajnjaNaIntervalu;
    }

    public Interval () {
        pocetnaTacka = 0;
        krajnjaTacka = 0;
        krajnjaNaIntervalu = null;
        pocetnaNaIntervalu = null;
    }

    public boolean isNull () {
        if ( pocetnaTacka == 0 && krajnjaTacka == 0 ) return true;
        return false;
    }

    public boolean isIn (double tacka) {

        if (tacka >= pocetnaTacka && tacka <= krajnjaTacka) return true;
        return false;

    }
    public Interval intersect (Interval interval) {

    }
    public static Interval intersect (Interval interval1, Interval interval2) {

    }
}
