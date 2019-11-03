package samonauka.petle;

import java.util.Arrays;

import static java.lang.Integer.sum;

public class ZadaniaPetlowe {

public static void main(String[] args) {

    //twentyToTen();
    //tenToTwenty();
    //forLoop();
    //whileLoop();
    int[] board= new int[]{2,4,6,5,3};
    //tablica(board);
    int[][] board2 = new int[][]{{2,3},{4,6},{6,3},{3,3}};
    int[][] board3 = new int[][]{{2,3},{4,6}};
    tablicaDwuwymiarowa(board3);

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

/**
 *Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
 */

static void tablica(int[] tablicowo){

    int suma =0;
for (int i=0; i<tablicowo.length; i++){
    //System.out.println(Arrays.toString(new int[]{tablicowo[i]}));
    suma += tablicowo[i];
    System.out.println(suma);
}

}

/**
 * Przerób funkcję z zadania piątego tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][].
 */

static void tablicaDwuwymiarowa (int[][] tablicowo2){

    int suma =0;
    for (int[] othernumbers : tablicowo2){
        System.out.println(Arrays.toString(othernumbers));
        for (int number : othernumbers){
            suma += number;
            System.out.println(suma);
        }
    }

}

}
    /**private static int sumArray(int[][] numbers) {
        int sum = 0;
        for (int[] otherNumbers : numbers) {
            for (int number : otherNumbers) {
                sum += number;
            }
        }
        return sum;
    }
     */