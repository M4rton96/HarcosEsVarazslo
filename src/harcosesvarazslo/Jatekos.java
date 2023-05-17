/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harcosesvarazslo;

import java.util.Random;

public class Jatekos {

    public Jatekos(char monogram) {
        this.monogram = monogram;
    }
    char monogram;

    static Random random = new Random();

    int eletero = d6();
    
    int lep() {
        return random.nextInt(3);
    }
    
    int sebez() {
        return d6();
    }

    int d6() {
        return random.nextInt(6) + 1;
    }
}
