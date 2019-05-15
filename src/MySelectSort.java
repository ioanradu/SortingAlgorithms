public class MySelectSort {// Shiftam elementele mai mari spre dreapta
    public static void sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < a[minIndex]){ // > ordine descrescatoare
                    minIndex = j;
                }
            }
            int aux = a[i];
            a[i] = a[minIndex];
            a[minIndex] = aux;
            ArrayUtils.show(a);
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 8, 1, 2, 4, 5, 7, 3, 9};
        ArrayUtils.show(a);
        //Arrays.sort(a);
        sort(a);

        ArrayUtils.show(a);
    }
}
