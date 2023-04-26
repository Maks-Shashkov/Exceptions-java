import java.util.ArrayList;

public class HomeWork1 {

    public static ArrayList<Integer> arrsub(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов не равна");
        } else {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < arr2.length; i++) {
                int num = arr1[i] + arr2[i];
                numbers.add(num);
            }
            return numbers;
        }
    }


    public static ArrayList<Float> divarr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов не равна");

        } else {
            ArrayList<Float> numbers = new ArrayList<>();
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("Делить на ноль нельзя");
                } else {
                    Float num = (float) arr1[i] / arr2[i];
                    numbers.add(num);
                }
            }
            return numbers;
        }
    }


    public static void main(String[] args) {
        int[] num1 = new int[] { 1, 2, 3, 5 };
        int[] num2 = new int[] { 1, 2, 5, 7 };
        System.out.println(arrsub(num1,num2));
        System.out.println(divarr(num1,num2));
    }
}

