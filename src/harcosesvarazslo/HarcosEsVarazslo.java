/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harcosesvarazslo;

import java.util.Random;

public class HarcosEsVarazslo {

    static Random random = new Random();

    public static int d6() {
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int harcosEletero = d6() + 3;
        int varazsloEletero = d6() + 3;

        System.out.println("H_V --> H:" + harcosEletero + ", V:" + varazsloEletero);

        while (harcosEletero > 0 && varazsloEletero > 0) {
            int harcosLepes = random.nextInt(3);
            int varazsloLepes = random.nextInt(3);

            if (harcosLepes == varazsloLepes) {
                StringBuilder harcAllas = new StringBuilder("___");
                harcAllas.setCharAt(harcosLepes, 'X');
                
                int harcosSebzes = d6();
                int varazsloSebzes = d6();
                
                harcosEletero -= varazsloSebzes;
                varazsloEletero -= harcosSebzes;
                
                System.out.println(harcAllas + " harc: --> H:" + harcosEletero + ", V:" + varazsloEletero);
            } else {
                StringBuilder allas = new StringBuilder("___");
                
                allas.setCharAt(harcosLepes, 'H');
                allas.setCharAt(varazsloLepes, 'V');

                System.out.println(allas + " --> H:" + harcosEletero + ", V:" + varazsloEletero);
            }
        }
    }

}
