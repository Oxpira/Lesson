package ru.sbrf;

public class Animal {
    String zvuk;
    String move;
    String eda;
    String lazat;
    String voda;

    void set(String z, String m, String e, String l, String v) {
        zvuk = z;
        move = m;
        eda = e;
        lazat = l;
        voda = v;
    }

    String Text() {
        String result = ("Звук " + zvuk + "\n" +
                "Двигаться " + move + "\n" +
                "Ест " + eda + "\n" +
                "По деревьям " + lazat + "\n" +
                "По воде " + voda);
        return result;
    }
}
