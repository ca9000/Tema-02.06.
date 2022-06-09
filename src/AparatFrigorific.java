public class AparatFrigorific {
    public int capacitate;
    public String producator;
    public int pret;

    public int getPret() {
        return pret;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public AparatFrigorific(int capacitate, String producator, int pret) {
        this.capacitate = capacitate;
        this.producator = producator;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "AparatFrigorific{" +
                "capacitate=" + capacitate +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                '}';
    }


}
