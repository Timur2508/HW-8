import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 8");

        System.out.println("Задание № 1, 2");

        int[] weight = new int[]{1, 2, 3};
        String str = Arrays.toString(weight);
        System.out.println(Arrays.toString(weight) + " ,");

        double[] weight2 = {1.57, 7.654, 9.986};
        String str2 = Arrays.toString(weight2);
        System.out.println(Arrays.toString(weight2));

        Long[] weight3 = new Long[]{200000000L, 300000000L};
        String str3 = Arrays.toString(weight3);
        System.out.println(Arrays.toString(weight3));

        System.out.println("Задание № 3");
        System.out.println("1 способ - целочисленные ");
        int[] Weight = new int[]{1, 2, 3};
        for (int i = Weight.length - 1; i >= 0; i--) {
            System.out.print(Weight[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("2 способ - целочисленные ");
        int[] Weight2 = new int[]{1, 2, 3};
        int[] reverse = new int[Weight2.length];
        for (int i = 0; i < Weight2.length; i++) {
            reverse[i] = Weight2[Weight2.length - i - 1];
        }
        System.out.println(Arrays.toString(reverse));
        System.out.println(" ");
        System.out.println("1 способ - дробные ");
        double[] Weight_2 = new double[]{1.57d, 7.654d, 9.986d};
        for (int i = Weight_2.length - 1; i >= 0; i--) {
            System.out.print(Weight_2[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("2 способ - дробные");
        double[] Weight__2 = new double[]{1.57d, 7.654d, 9.986d};
        double[] reverse2 = new double[Weight__2.length];
        for (int i = 0; i < Weight__2.length; i++) {
            reverse2[i] = Weight__2[Weight__2.length - i - 1];
        }
        System.out.println(Arrays.toString(reverse2));
        System.out.println(" ");
        System.out.println("1 способ - большие числа ");
        Long[] Weight3 = new Long[]{200000000L, 300000000L};
        for (int i = Weight3.length - 1; i >= 0; i--) {
            System.out.print(Weight3[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("2 способ - большие числа ");
        Long[] Weight_3 = new Long[]{200000000L, 300000000L};
        Long[] reverse_3 = new Long[Weight_3.length];
        for (int i = 0; i < Weight_3.length; i++) {
            reverse_3[i] = Weight_3[Weight_3.length - i - 1];
        }
        System.out.println(Arrays.toString(reverse_3));
        System.out.println(" ");
        System.out.println("Задание № 4");
        int[] weight1 = new int[]{1, 2, 3};
        for (int i = 0; i <= weight1.length - 1; i++) {
            weight1[i] = weight1[i] + 1;
            System.out.print(weight1[i] + " ");

        }
    }
}