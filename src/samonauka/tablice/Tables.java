package samonauka.tablice;

import java.util.Arrays;

public class Tables {
    public static void main(String[] args) {


        String[] daysOfWeek = new String[8];
        daysOfWeek[0] = "poniedziałek";
        daysOfWeek[1] = "wtorek";
        daysOfWeek[2] = "środa";
        daysOfWeek[3] = "czwartek";
        daysOfWeek[4] = "piątek";
        daysOfWeek[5] = "sobota";
        daysOfWeek[6] = "niedziela";
        daysOfWeek[7] = "nastepnyponiedzialek";

        for (int i=0; i<daysOfWeek.length; i++)
            System.out.println(daysOfWeek[i]);
            //daysOfWeek[i] = i +1;

        System.out.println(daysOfWeek[6]);

        int[][] ticTacToeBoard = new int[5][6];
        ticTacToeBoard[0] = new int[3];
        //System.out.println(ticTacToeBoard[0]);
        ticTacToeBoard[1] = new int[3];
        //System.out.println(ticTacToeBoard[1]);
        ticTacToeBoard[2] = new int[3];
        //System.out.println(ticTacToeBoard[2]);


        int nought = 1; // kółko
        int cross = 2; // krzyżyk

        ticTacToeBoard[1][1] = nought;
        ticTacToeBoard[2][2] = cross;
        ticTacToeBoard[0][0] = nought;
        ticTacToeBoard[1][2] = cross;
        ticTacToeBoard[0][2] = nought;
        ticTacToeBoard[0][1] = cross;
        ticTacToeBoard[3][5] = cross;

 for (int i=0; i<ticTacToeBoard.length; i++) {
     System.out.println(Arrays.toString(ticTacToeBoard[i]));
 }


    } }
