package com.company;

import java.text.DecimalFormat;

public class Banaan {
    private double kaal;
    private Integer kypsus;
    private String sort;
    private double hindPerKG;

    public Banaan(double kaal, Integer kypsus, String sort, double hindPerKG) {
        this.kaal = kaal;
        this.kypsus = kypsus;
        this.sort = sort;
        this.hindPerKG = hindPerKG;
    }

    public int getS2ilivus(){
        return 10-kypsus;
    }

    public String getHind(){
        DecimalFormat df = new DecimalFormat("#.##"); // pattern määrab kuju mis viisil näidatakse hinda
        if (Double.compare(kaal, 0.2) > 0){
            return df.format(kaal * hindPerKG * 0.95);
        }
        return df.format(kaal * hindPerKG);
    }

    @Override
    public String toString() {
        return "Banaan{" +
                "kaal=" + kaal +
                ", küpsus=" + kypsus +
                ", sort='" + sort + '\'' +
                ", hindPerKG=" + hindPerKG +
                ", säilivus=" + getS2ilivus() +
                ", hind=" + getHind() +
                '}';
    }

    public double getKaal() {
        return kaal;
    }

    public Integer getKypsus() {
        return kypsus;
    }

    public String getSort() {
        return sort;
    }

    public double getHindPerKG() {
        return hindPerKG;
    }
}