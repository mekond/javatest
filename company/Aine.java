package com.company;

public class Aine {
    private String kood;
    private String nimetus;
    private int ainepunktidearv;

    public int akadeem_tunde(){
        return 8 * ainepunktidearv;
    }

    public int getAinepunktidearv(){
        return ainepunktidearv;
    }

    public String getNimetus(){
        return nimetus;
    }

    public String getKood(){
        return kood;
    }

    public void setAinepunktidearv(int ainepunktidearv){
        this.ainepunktidearv = ainepunktidearv;
    }

    public void setNimetus(String nimetus){
        this.nimetus = nimetus;
    }

    public void setKood(String kood){
        this.kood = kood;
    }

    public Aine(String kood, String nimetus, int ainepunktidearv){
        this.kood = kood;
        this.nimetus = nimetus;
        this.ainepunktidearv = ainepunktidearv;
    }

    public String toString(){
        return String.format("\nAine: \"%s\"\nKood: %s\nAinepunktide arv: %d", nimetus, kood, ainepunktidearv);
    }
}
