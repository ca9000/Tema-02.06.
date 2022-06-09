public class LadaFrigorifica extends Congelator {
    public int putere;

    @Override
    public int getPret() {
        return super.getPret();
    }

    public LadaFrigorifica(int capacitate, String producator, int pret, int tempMin, int putere) {
        super(capacitate, producator, pret, tempMin);
        this.putere = putere;
    }

    @Override
    public String toString() {
        return "LadaFrigorifica{" +
                "putere=" + putere +
                ", tempMin=" + tempMin +
                ", capacitate=" + capacitate +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                '}';
    }
}
