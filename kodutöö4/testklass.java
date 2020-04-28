package com.company;

    public class testklass {
        public static void main(String[] args) {
            Aine OOP = new Aine("RT-016", "Java lisaõpe", 5);
            Aine oppeaine = new Aine("RT-9764", "MADIS", 12);
            Aine GAMER = new Aine("RT-5678", "GameOn", 3);

            Aine[] ained1 = {OOP, oppeaine, GAMER};

            Oppekava kava1 = new Oppekava("911", ained1);
            System.out.println(kava1.toString());
        }
    }
