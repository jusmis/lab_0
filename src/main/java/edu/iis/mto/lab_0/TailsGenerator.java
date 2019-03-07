package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null)
            return new ArrayList<>();
        ArrayList<String> wynik = new ArrayList<>(value.length());
        wynik.add(value);
        for (int x = 1; x < value.length(); x++)
            wynik.add(value.substring(x, value.length()).toUpperCase());
        wynik.add("");
        return wynik;
    }

}
