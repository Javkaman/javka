package samonauka.tablice;

import java.util.Arrays;

public class Zadanie {

    int a;
    int b;
    int c;

    public Zadanie(int a, int b, int c) {
    }

    public static void main(String[] args) {

        int[] sumaLiczb = new int[]{1,2,4,5,7};
        int[] najwiekszy = new int[]{22,33,18,55,38,55,56};
        int[][] planszaSudoku = new int[9][9];




        /** tutaj serce funkcji
         * Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących
         * do przechowywania sudoku i uzupełnij ją przykładową planszą.
         *
         * Jak przechowałbyś stan gry w szachy? Napisz program, który stworzy instancje tablic służące
         * do przechowywania stanu gry w szachy. Potrafiłbyś zachować w nim ostatni stan partii Kasparowa z Deep Blue?
         * */
// Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę
        //suma(sumaLiczb);
// Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.
        //najwiekszaLiczba(najwiekszy);
/** tutaj serce funkcji
 * Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących
 * do przechowywania sudoku i uzupełnij ją przykładową planszą.*/
        sudoku(planszaSudoku);

    }

    static void suma(int[] a){
        int wynik =0;
        for (int i=0;  i<a.length; i++){
            wynik += a[i];
            System.out.println(wynik);

    }
}

static void najwiekszaLiczba(int[] a){

        int naj = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] > naj){
                System.out.println(a[i]);
                naj = a[i];
            }
            else {
                System.out.println("ta liczba jest nie wieksza od najwiekszej = " + (a[i]));
            }
        }
}

static void sudoku(int a[][]){


        int jeden = 1;
        int dwa = 2;
        int trzy = 3;
        int cztery = 4;
        int piec = 5;
        int szesc = 6;
        int siedem = 7;
        int osiem = 8;
        int dziewiec = 9;
        a[0][0] = cztery;
        a[0][1] = siedem;
        a[5][3] = piec;
    System.out.println(a.length);
    for (int i = 0; i <a.length; i++) {
        System.out.println(Arrays.toString(a[i]));
    }
    }
}
