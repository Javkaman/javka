package samonauka.tablice;

import java.util.Arrays;

public class Tables2 {
    public static void main(String[] args) {


        int[][] irregularArray = new int[3][5];
        irregularArray[0] = new int[3];
        irregularArray[1] = new int[5];
        irregularArray[2] = new int[2];

        for (int i = 0; i <irregularArray.length; i++) {
            System.out.println(Arrays.toString(irregularArray[i]));
        }
    }
}
