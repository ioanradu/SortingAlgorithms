import java.util.Arrays;

public class MyInsertSort {
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int aux = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > aux) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = aux;
            ArrayUtils.show(a);
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArrayUtils.show(a);
        sort(a);
        ArrayUtils.show(a);

    }
}
