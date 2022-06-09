import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<AparatFrigorific> aparatFrigorific = new ArrayList<>();
        aparatFrigorific.add(new Frigider(416, "Samsung", 2000, 5));
        aparatFrigorific.add(new Congelator(168, "Beko", 1799, -5));
        aparatFrigorific.add(new FrigiderSideBySide(562, "Gorenje", 6499, 5, "Negru"));
        aparatFrigorific.add(new LadaFrigorifica(194, "Candy", 829, -10, 105));

        int nrLaziFrigorifice = 0, nrFrigidere = 0;
        for(var a : aparatFrigorific){
            if (a instanceof Frigider){
                nrFrigidere++;
            } else if (a instanceof LadaFrigorifica) {
                nrLaziFrigorifice++;
            }
        }

        int pretMediu = 0;
        for(var a : aparatFrigorific){
            pretMediu += a.getPret();
        }

        int capFrigider = 0, capCongelator = 0, capFrigiderSideBySide = 0, capLadaFrigorifica =0;
        int nrFrigider = 0, nrCongelator = 0, nrFrigiderSideBySide = 0, nrLadaFrigorifica =0;
        for(var a : aparatFrigorific){
            if (a instanceof Frigider){
                capFrigider += a.capacitate;
                nrFrigider ++;
            }if (a instanceof Congelator){
                capCongelator += a.capacitate;
                nrCongelator++;
            }
            if (a instanceof FrigiderSideBySide){
                capFrigiderSideBySide += a.capacitate;
                nrFrigiderSideBySide++;
            }
            if (a instanceof LadaFrigorifica){
                capLadaFrigorifica += a.capacitate;
                nrLadaFrigorifica++;
            }
        }

        double mediePret = 1.0*pretMediu / aparatFrigorific.size();

        double mediecapFrigider = 1.0*capFrigider / nrFrigider;
        double mediecapCongelator = 1.0*capCongelator / nrCongelator;
        double mediecapFrigiderSideBySide = 1.0*capFrigiderSideBySide / nrFrigiderSideBySide;
        double mediecapLadaFrigorifica = 1.0*capLadaFrigorifica / nrLadaFrigorifica;

        System.out.println("Numarul de lazi frigorifice este de " + nrLaziFrigorifice + ", iar numarul de Frigidere este: " + nrFrigidere + ".");

        System.out.println("Pretul mediu al aparatelor frigorifice este: " + mediePret);
        System.out.println("Capacitatea medie a frigiederelor este: " + mediecapFrigider);
        System.out.println("Capacitatea medie a congelatoarelor este: " + mediecapCongelator);
        System.out.println("Capacitatea medie a frigiederelor Side By Side este: " + mediecapFrigiderSideBySide);
        System.out.println("Capacitatea medie a lazilor frigorifice este: " + mediecapLadaFrigorifica);

        Scanner tastatura = new Scanner(System.in);
        int min,max;
        System.out.println("Introduceti minimul si maximul preturilor: ");
        min = tastatura.nextInt();
        max = tastatura.nextInt();

        for(var a : aparatFrigorific){
            if(a.pret > min && a.pret < max ){
                System.out.println(a);
            }
        }

        for (var a : aparatFrigorific){
            if (a instanceof LadaFrigorifica){
                if (((LadaFrigorifica) a).putere > 95){
                    System.out.println("Lazile frigorifice cu puterea mai amre de 95W sunt:\n" + a);
                }
            }
        }
    }
}
