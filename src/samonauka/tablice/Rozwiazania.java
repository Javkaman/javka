package samonauka.tablice;

public class Rozwiazania {

    public int sum(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        Rozwiazania exercise1 = new Rozwiazania();
        int[] numbers1 = {3, 4};
        System.out.println(exercise1.sum(numbers1));

        Rozwiazania exercise2 = new Rozwiazania();
        int[] numbers2 = new int[]{1, 3, -5};
        System.out.println(exercise2.biggest(numbers2));
        System.out.println(exercise2.biggestWithoutIf(numbers2));

    }

    public int biggest(int[] numbers) {
        int biggest = numbers[0];
        if (numbers[1] > biggest) {
            biggest = numbers[1];
        }
        if (numbers[2] > biggest) {
            biggest = numbers[2];
        }
        return biggest;
    }

    public int biggestWithoutIf(int[] numbers) {
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }
}
