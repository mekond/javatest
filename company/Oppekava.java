package com.company;
import java.util.Arrays;

public class Oppekava {
    private String oppekavaKood;
    private Aine[] ained;

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public Aine[] getAined() {
        return ained;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }


    public void setAined(Aine[] ained) {
        this.ained = ained;
    }

    public String toString() {
        return "Oppekava{" +
                "oppekavaKood='" + oppekavaKood + '\'' + ", ained=" + Arrays.toString(ained);
    }

    public Oppekava(String oppekavaKood, Aine[] ained){
        this.oppekavaKood = oppekavaKood;
        this.ained = ained;
    }
}
