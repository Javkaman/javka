package samonauka.typyproste;

public class TypyProste {

    public static void main(String[] args) {

        krotki();

    }

    static void krotki(){
        short overflow = (short) 1_111_11113;
        System.out.println(overflow);

    }

}
