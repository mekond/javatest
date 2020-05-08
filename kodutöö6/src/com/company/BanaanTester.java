package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BanaanTester {
    public static void main(String[] args) {

        int count = 0;

        Banaan banaan1 = new Banaan(0.1, 4, "Cavendish", 4.9);
        Banaan banaan2 = new Banaan(0.13, 5, "Dwarf Cavendish", 1.4);
        Banaan banaan3 = new Banaan(4.1, 7, "Giant Cavendish", 10.2);
        IndiaBanaan valebanaan1 = new IndiaBanaan(6.3, 2, "SpecialIndia", 1, 1);
        IndiaBanaan valebanaan2 = new IndiaBanaan(6.66, 6, "Brownye", 23, 32);
        IndiaBanaan valebanaan3 = new IndiaBanaan(0.01, 4, "Smallboi", 5, 9);
        IndiaBanaan valebanaan4 = new IndiaBanaan(2.22, 3, "JungelBanana", 0.1, 21);
        IndiaBanaan valebanaan5 = new IndiaBanaan(1.11, 10, "ReadyAction", 2.7, 54);
        IndiaBanaan valebanaan6 = new IndiaBanaan(0.03, 2, "CrazyApe", 1.3, 14);
        IndiaBanaan valebanaan7 = new IndiaBanaan(2.41, 10, "TheHotOne", 1.2, 69);

        List<Banaan> banaaanid = new ArrayList<>(Arrays.asList(banaan1, banaan2, banaan3, valebanaan1, valebanaan2,
                valebanaan3, valebanaan4, valebanaan5, valebanaan6, valebanaan7));

        for (Banaan ban : banaaanid) {
            System.out.print(count++ + ": ");
            System.out.println(ban.toString());
        }

    }
}