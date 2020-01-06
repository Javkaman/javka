package samonauka.typyproste;

import java.util.Arrays;

public class Zadanioso {

    public static void main(String[] args) {

        srednia();

    }

    static void srednia(){

        int numberOfClasses = 3;
        int numberOfNotes =4;

        int[][] tabela = {{4, 3, 4, 2},{5,1,4,4},{6,6,3,6}};

        //System.out.println(tabela[0].length);
        //System.out.println(tabela.length);


        /**
        int[][] tabela = new int[numberOfClasses][numberOfNotes];

        tabela[0][0] = 4;
        tabela[0][1] = 3;
        tabela[0][2] = 4;
        tabela[0][3] = 2;
        tabela[1][0] = 5;
        tabela[1][1] = 1;
        tabela[1][2] = 4;
        tabela[1][3] = 4;
        tabela[2][0] = 6;
        tabela[2][1] = 6;
        tabela[2][2] = 3;
        tabela[2][3] = 6;
*/
/**


        int[] malaTabela = new int[3];
        for (int classIndex =0; classIndex<numberOfClasses;classIndex++) {

            System.out.println(Arrays.toString(tabela[classIndex]));
            //malaTabela[classIndex]++


            //System.out.println(Arrays.toString(tabela[classIndex]));

        for (int noteIndex = 0; noteIndex<numberOfNotes; noteIndex++) {

            //System.out.println(Arrays.toString(tabela[noteIndex]));
*/






//Rounding to nearest whole number.
        for(int i = 0; i < tabela.length; i++){
            int num = 0;
            //still assuming all arrays have the same amount of numbers
            for(int i2 = 0; i2 < tabela[0].length; i2++){
                num += tabela[i][i2];

                //System.out.println(num);
            }
            double average = num/(double)tabela[i].length;
            System.out.println(num);
            System.out.println(average);
            //result.push(Math.round(num / tabela.length));
        }

    }


    /**
     *
     * Teraz ćwiczenie dla Ciebie. Napisz program, który policzy średnią z kilku przedmiotów. Możemy założyć, że uczeń w
     * szkole ma 3 przedmioty i z każdego z nich dostał po 4 oceny.
     *
     *
     * Do wykonania tego zadania możesz potrzebować tablic wielowymiarowych i zagnieżdżonych pętli. Dla przypomnienia
     * możesz zajrzeć do artykułu o tablicach wielowymiarowych i pętlach w języku Java.
     *
     * Zagnieżdżona pętla to nic innego jak pętla umieszczona w ciele innej pętli. Dla przykładu pętle, które mogą pomóc
     * Ci wykonać zadanie mogą wyglądać tak:
     *
     * int numberOfClasses = 3;
     * int numberOfNotes = 4;
     * for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
     *     for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
     *         // zadanie ;)
     *     }
     * }
     */

}
