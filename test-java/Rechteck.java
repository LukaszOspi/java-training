public class Rechteck {
    public double laenge;
    public double breite;

    Rechteck(){
        this.laenge = 0;
        this.breite = 0;
    }


    Rechteck(double l, double b){
        this.laenge = l;
        this.breite = b;
    }


    void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    void setBreite(double b) {
        this.breite = b;
    }
    void setSeiten (double l, double b) {
        laenge = l;
        breite = b;
    }
    double getLaenge() {
         return laenge;
    }
    double getBreite() {
        return breite;
    }
    double getLangeSeite() {
        if (breite > laenge) {
            return breite;
        } else {
            return laenge;
        }
    }
    double getKurzeSeite() {
        if (laenge > breite) {
            return breite;
        } else {
            return laenge;
        }
    }
    double getDiagonale() {
        return Math.sqrt(laenge*laenge + breite *breite);
        }
    double getFlaeche() {
        return laenge * breite;
    }
    double getUmfang() {
        return (laenge* 2 + breite * 2);
    }

    void laengeVergroessern(double l){
        this.laenge = l + this.laenge;
    }
    void breiteVergroessern(double b){
        this.breite = b + this.breite;
    }
    void laengeVerkleinern(double l){
        this.laenge = this.laenge - l;
    }
    void breiteVerkleinern(double b){
        this.breite = this.breite - b;
    }
}