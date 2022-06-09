public class FrigiderSideBySide extends Frigider {
    public String culoare;

    @Override
    public int getPret() {
        return super.getPret();
    }

    public FrigiderSideBySide(int capacitate, String producator, int pret, int rafturi, String culoare) {
        super(capacitate, producator, pret, rafturi);
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "FrigiderSideBySide{" +
                "culoare='" + culoare + '\'' +
                ", rafturi=" + rafturi +
                ", capacitate=" + capacitate +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                '}';
    }
}
