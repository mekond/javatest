package com.company;

public class IndiaBanaan extends Banaan {

    private double curvature;

    public IndiaBanaan(double kaal, Integer kypsus, String sort, double hindPerKG, double curvature) {
        super(kaal, kypsus, sort, hindPerKG);
        this.curvature = curvature;
    }

    @Override
    public int getS2ilivus(){
        return super.getS2ilivus() / 2;
    }

    @Override
    public String toString() {
        return "IndiaBanaan{" +
                "kaal=" + getKaal() +
                ", küpsus=" + getKypsus() +
                ", sort='" + getSort() + '\'' +
                ", hindPerKG=" + getHindPerKG() +
                ", säilivus=" + getS2ilivus() +
                ", hind=" + getHind() +
                ", curvature=" + curvature +
                '}';
    }
}