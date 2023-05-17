/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harcosesvarazslo;

public class HarcosEsVarazslo {
    
    static String eleterok(Harcos harcos, Varazslo varazslo) {
        return harcos.monogram + ":" + harcos.eletero + ", " + varazslo.monogram + ":" + varazslo.eletero;
    }

    public static void main(String[] args) {

        Harcos harcos = new Harcos('H');
        Varazslo varazslo = new Varazslo('V');

        String alapAllas = harcos.monogram + "_" + varazslo.monogram;

        System.out.println(alapAllas + " --> " + eleterok(harcos, varazslo));

        while (harcos.eletero > 0 && varazslo.eletero > 0) {
            StringBuilder allas = new StringBuilder("___");

            int harcosLepes = harcos.lep();
            int varazsloLepes = varazslo.lep();

            if (harcosLepes == varazsloLepes) {
                allas.setCharAt(harcosLepes, 'X');

                harcos.eletero -= varazslo.sebez();
                varazslo.eletero -= harcos.sebez();

                System.out.println(allas + " --> harc: " + eleterok(harcos, varazslo));
            } else {

                allas.setCharAt(harcosLepes, harcos.monogram);
                allas.setCharAt(varazsloLepes, varazslo.monogram);

                System.out.println(allas + " --> " + eleterok(harcos, varazslo));
            }
        }
    }

}
