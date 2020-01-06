package samonauka.firstprogram;

import java.util.concurrent.LinkedTransferQueue;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        String message = "To jest mój pierwszy łańcuch znaków! Potocznie \"string\".";

        System.out.println(message);

        IntStream kokos = message.chars();
        System.out.println(kokos);

        boolean grubas = message.endsWith(".");
        System.out.println(grubas);

        message.endsWith("konicziwa");
        System.out.println(message);
        String zmiana = message.replace("To","gunwo");
        System.out.println(message);
        System.out.println(zmiana);
        String go = message.concat("kolejny raz");
        System.out.println(go);

        String e = "oj zła pogoda";
        String f = "średnia pogoda";
        String g = "dobra pogoda";
        System.out.println((dodawaj(e,f,g)));
        System.out.println((dodawaj(e,f,g).length()));

    }


     static String dodawaj(String a, String b, String c){

        String d = a.concat(b).concat(c);
                return d;
    }
}
