package Model;

import Interface.NumbersInterface;

public class NumbersList implements NumbersInterface {

    @Override
    public void compareList(double average1, double average2) {
        if (average1 == average2) {
            System.out.println("Среднее значение массивов равны");
        } else if (average1 > average2) {
            System.out.println("Первый список больше второго");
        } else {
            System.out.println("Второй список больше первого");
        }
    }

    @Override
    public double averageList(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = Math.round(sum / array.length);
        System.out.println("Среднее значение списка = " + average);
        return average;
    }
}
