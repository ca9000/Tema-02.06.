public class Congelator extends AparatFrigorific{
    public int tempMin;

    @Override
    public int getPret() {
        return super.getPret();
    }

    public Congelator(int capacitate, String producator, int pret, int tempMin) {
        super(capacitate, producator, pret);
        this.tempMin = tempMin;
    }

    @Override
    public String toString() {
        return "Congelator{" +
                "tempMin=" + tempMin +
                ", capacitate=" + capacitate +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                '}';
    }
}
