import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 8");

        System.out.println("Задание № 1");

        int[] weight = new int[]{1, 2, 3};
        double[] arr = {1.57, 7.654, 9.986};
        String[] seasons = {"Winter", "String", "Summer", "Autumn"};

        System.out.println("Задание № 2");

        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.println(arr1[i]);
                break;
            }
            System.out.println(arr1[i] + ",");
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.println(arr2[i] + ",");
        }
        String[] seasons1 = {"Winter", "String", "Summer", "Autumn"};
        for (int i = 0; i < seasons1.length; i++) {
            if (i == seasons1.length - 1) {
                System.out.println(seasons1[i]);
                break;
            }
            System.out.print(seasons1[i] + ",");
        }

        System.out.println("Задача №3");
        int[] arr3 = {1, 2, 3};
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == arr3.length - 3) {
                System.out.println(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ",");
        }
        double[] arr4 = {1.57, 7.654, 9.986};
        for (int i = arr4.length - 1; i >= 0; i--) {
            if (i == arr4.length - 3) {
                System.out.println(arr4[i]);
                break;
            }
            System.out.print(arr2[i] + ",");
        }


        String[] seasons2 = {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = seasons2.length - 1; i >= 0; i--) {
            if (i == seasons2.length - 4) {
                System.out.println(seasons2[i]);
                break;
            }
            System.out.print(seasons2[i] + ",");
        }
        System.out.println("Задача №4");
        int[] arr5 = {1, 2, 3};
        for (int i = 0; i < 3; i++)
            if (arr5[i] % 2 != 0) {
                arr5[i] += 1;
            }
        System.out.print(Arrays.toString(arr5));
    }
}
