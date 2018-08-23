package lt.baltictalents.pizzeria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class GerimuMeniu {

    Gerimai alus = new Gerimai("LabasRytas", 10.5, 2.50);
    Gerimai limonadas = new Gerimai("Burbilinadas", 0.0, 1.00);
    Gerimai sultys = new Gerimai("BurokeliuFreshas", 1.5, 2.50);
    Gerimai karstasGerimas = new Gerimai("Week no sleep Kava", 3.00, 8.00);


    public void printGerimai() {
        System.out.println("Gerimai");
        System.out.println("=================================");
        System.out.println("Pavadinimas / Stiprumas (%) / Kaina (Eur)");
        System.out.println(alus.getPavadinimas() + " - " + alus.getAlkoholioProcentas() + "%" + " / " + alus.getKaina() + " Eur");
        System.out.println(limonadas.getPavadinimas() + " - " + limonadas.getAlkoholioProcentas() + "%" + " / " + limonadas.getKaina() + " Eur");
        System.out.println(sultys.getPavadinimas() + " - " + sultys.getAlkoholioProcentas() + "%" + " / " + sultys.getKaina() + " Eur");
        System.out.println(karstasGerimas.getPavadinimas() + " - " + karstasGerimas.getAlkoholioProcentas() + "%" + " / " + karstasGerimas.getKaina() + " Eur");
        System.out.println("=================================\n");
    }
}
