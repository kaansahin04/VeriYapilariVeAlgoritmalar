package algoritmalar;

import java.util.*;

public class GreedyIntervals {

    public static void main(String[] args) {
        List<Etkinlik> etkinlikler = Arrays.asList(
                new Etkinlik(1, 4),
                new Etkinlik(3, 9),
                new Etkinlik(3, 5),
                new Etkinlik(5, 7),
                new Etkinlik(0, 6)
        );

        List<Etkinlik> sıralıListe = çakışmama(etkinlikler);

        System.out.println("Seçilen aralıklar:");
        for (Etkinlik etkinlik : sıralıListe) {
            System.out.println("("+etkinlik.baş+", "+etkinlik.son+")");
        }
    }

    public static List<Etkinlik> çakışmama(List<Etkinlik> etkinlikler) {

        etkinlikler.sort(Comparator.comparingInt(etkinlik -> etkinlik.son));

        List<Etkinlik> sonuç = new ArrayList<>();
        int sonBitiş = 0;

        for (Etkinlik etkinlik : etkinlikler) {
            if (etkinlik.baş >= sonBitiş) {
                sonuç.add(etkinlik);
                sonBitiş = etkinlik.son;
            }
        }

        return sonuç;
    }

}

class Etkinlik {
    int baş;
    int son;

    public Etkinlik(int baş, int son) {
        this.baş = baş;
        this.son = son;
    }
}
