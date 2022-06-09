public class Frigider extends AparatFrigorific {
    public int rafturi;

    @Override
    public int getPret() {
        return super.getPret();
    }

    public Frigider(int capacitate, String producator, int pret, int rafturi) {
        super(capacitate, producator, pret);
        this.rafturi = rafturi;
    }

    @Override
    public String toString() {
        return "Frigider{" +
                "rafturi=" + rafturi +
                ", capacitate=" + capacitate +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                '}';
    }
}
