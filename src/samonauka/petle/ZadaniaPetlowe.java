package samonauka.petle;

public class ZadaniaPetlowe {

/**


 Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
 Przerób funkcję z zadania piątego tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][].
*/

public static void main(String[] args) {

    //twentyToTen();
    //tenToTwenty();
    //forLoop();
    //whileLoop();

}


/**
 Poza poznanym dzisiaj operatorem ++ istnieje też jego odpowiednik zmniejszający wartość zmiennej o 1. Jest nim --.
 Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.*/

static void twentyToTen(){

    int number = 10;
    for (int i=20; i>=number; i--){
        System.out.println(i);
    }
}

/**
 Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.*/

static void tenToTwenty(){

    int initial = 10;
    while (true) {
        System.out.println(initial);
        initial ++;
        if (initial>20){
            break;
        }
    }
}


/**
 *Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
 */

static void forLoop(){

    for (int i=-10; i<41; i++){
        if (i%2!=0){
            System.out.println(i);
        }
    }


}

/**
 *Przerób pętlę z zadania trzeciego na pętlę while.
 */

static void whileLoop(){
    int liczbaStartowa = -10;
    while (liczbaStartowa<41){
        if (liczbaStartowa%2!=0){
            System.out.println(liczbaStartowa);
        }
        liczbaStartowa ++;
    }


}

}
